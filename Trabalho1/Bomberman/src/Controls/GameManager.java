package Controls;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import Tools.Events.*;
import Tools.Position.Position;
import Tools.*;
import Model.*;
import Model.Enemies.*;

public class GameManager implements Serializable {
    private GameSaver gameSaver;
    public GameState state;
    private Screen screen;
    private GameLevel[] levels;
    private GameLevel currentLevel;

    public GameManager() {
        levels = new GameLevel[4];
        TimerSingleton.getInstance();
    }


    public void saveGame() {
        gameSaver.save();
    }

    public void saveGame(String fileName) {
        gameSaver.save(fileName);
    }

    public void loadGame(String fileName) throws Exception {
        try {
            state = GameLoader.load(fileName);
            gameSaver = new GameSaver(state);
            setupScreen();
            setupLevels();
            setupEventBus();
            setupHeroLivesDisplay();
            currentLevel = levels[state.getLevelState().getLevelIndex()];
            currentLevel.begin();
            startElements();
            screen.go();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Unable to load Game");
        }
    }

    public void setGameSaver(GameSaver gameSaver) {
        this.gameSaver = gameSaver;
    }

    public Screen getScreen() {
        return screen;
    }

    public void newGame() {
        state = new GameState();
        state.setElements(new ArrayList<Element>(400));
        state.setEnemies(new ArrayList<Enemy>(20));

        // Cria herói
        Hero hero = new Hero(1, 1);
        this.addElement(hero);
        state.setHero(hero);

        // Inicia mapa de interação
        state.setInteractionMap(new InteractionMap());

        // Inicia primeira fase
        state.setLevelState(new LevelState(0));

        setupScreen();
        setupLevels();
        setupEventBus();
        setupHeroLivesDisplay();
        setupCurrentLevel();
        screen.go();
    }

    public void setupScreen() {
        screen = new Screen(this);
        setGameSaver(new GameSaver(state));

    }

    private void setupHeroLivesDisplay() {
        EventBus.getInstance().emit("set-hero-lives", state.getHero());
    }

    private void setupCurrentLevel() {
        currentLevel = levels[state.getLevelState().getLevelIndex()];
        currentLevel.begin();
        currentLevel.draw();
    }

    private void setupLevels() {
        levels[0] = new Level1(screen);
        levels[1] = new Level2(screen);
        levels[2] = new Level3(screen);
        levels[3] = new Level4(screen);
    }

    public void setupEventBus() {
        EventBus.setInstance(this, 14);
        EventBus eventBus = EventBus.getInstance();
        eventBus.on("create-element", new CreateElementsEvent());
        eventBus.on("remove-element", new RemoveElementsEvent());
        eventBus.on("create-explosion", new CreateExplosionEvent());
        eventBus.on("create-schedule", new CreateScheduleEvent());
        eventBus.on("create-schedule-loop", new CreateScheduleEventLoop());
        eventBus.on("verify-element-interaction", new VerifyElementInteractionEvent());
        eventBus.on("insert-element-to-map", new InsertToInteractionMapEvent());
        eventBus.on("remove-element-from-map", new RemoveFromInteractionMapEvent());
        eventBus.on("move-element-on-map", new MoveOnInteractionMap());
        eventBus.on("game-over", new GameOverEvent());
        eventBus.on("create-enemy", new CreateEnemyEvent());
        eventBus.on("remove-enemy", new RemoveEnemyEvent());
        eventBus.on("set-hero-lives", new SetHeroLivesEvent());
    }
    public void addElement(Element element) {
        state.getElements().add(element);
    }

    public void removeElement(Element element) {
        state.getElements().remove(element);
    }

    public void addEnemy(Enemy enemy) {
        state.getEnemies().add(enemy);
    }

    public void removeEnemy(Enemy enemy) {
        state.getEnemies().remove(enemy);
    }

    public InteractionMap getInteractionMap() {
        return state.getInteractionMap();
    }

    public void gameOver() {
        System.out.println("GAME OVER");
        System.exit(0);
    }

    public void nextLevel() {
        LevelState levelState = state.getLevelState();
        Hero hero = (Hero) state.getElements().get(0); // Reservar herói
        state.getElements().clear(); // Limpar elementos a renderizar
        for (Enemy enemy: state.getEnemies()) { // Parar inimigos
            enemy.stop();
        }
        state.getEnemies().clear(); // Remover inimigos
        state.getInteractionMap().clear(); // Limpar mapa de interação
        hero.setPosition( // Resetar posição do herói
            new Position(1, 1)
        );
        state.getElements().add(hero); // Adicionar herói À lista de elementos à renderizar
        levels[levelState.getLevelIndex()] = null; // Remover nível atual da memória
        levelState.setLevelIndex(
            levelState.getLevelIndex() + 1
        ); // Incrementar nível atual
        if (levelState.getLevelIndex() >= 4) { // Se for o ultimo nível declarar vitória e sair
            victory();
            System.exit(0);
        } else {
            currentLevel = levels[levelState.getLevelIndex()];
            currentLevel.begin(); // Iniciar próximo nível
            currentLevel.draw(); // Renderizar o próximo nível
        }
    }

    public void victory() {
        System.out.println("CONGRATULATIONS YOU WON");
        System.exit(0);
    }

    public Hero getHero() {
        return state.getHero();
    }

    public ArrayList<Element> getElements() {
        return state.getElements();
    }

    public ArrayList<Enemy> getEnemies() {
        return state.getEnemies();
    }

    public LevelState getLevelState() {
        return state.getLevelState();
    }

    public GameLevel getCurrentLevel() {
        return currentLevel;
    }

    public void startElements() {
        for (Element element: state.getElements()) {
            element.start();
        }
        for (Enemy enemy: state.getEnemies()) {
            enemy.start();
        }
    }

    public void autoSave() {
        (new Timer()).schedule(new TimerTask() {

            @Override
            public void run() {
                gameSaver.save("recover.dat");
            }

        }, 0 ,5000);
    }

    public void recoverGame() throws Exception {
        loadGame("recover.dat");
    }

}
