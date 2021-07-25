package Controls;

import Model.Element;
import Model.Hero;
import Model.Enemies.Enemy;
import Tools.*;
import Tools.Events.*;
import Tools.Image.Animator;
import Tools.Image.AnimatorFactory;
import Tools.Position.Position;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import Controls.KeyStrokes.Movements;

// Esta classe centraliza o controle do jogo, ela é responsável por manter todos os objetos em uso
public class Screen extends javax.swing.JFrame implements MouseListener, KeyListener {
    public Drawer drawer;
    private Controller controller = new Controller(this);
    private Graphics graphics;
    private Movements movements;
    private AnimatorFactory animatorFactory;
    private SerializableTimer timer;
    private GameLevel[] levels;
    private GameLevel currentLevel;
    private GameManager gameManager;

    public Screen(Drawer drawer, GameManager gameManager){
        timer = new SerializableTimer(); // Instancia timer que contrlará redesenhos e movimentos
        this.drawer = drawer;
        this.gameManager = gameManager;
        drawer.setScreen(this);

        gameManager.state.setElements(new ArrayList<Element>(400));
        gameManager.state.setEnemies(new ArrayList<Enemy>(20));

        this.addMouseListener(this); /*mouse*/
        this.addKeyListener(this);  /*teclado*/

        // Seta tamanho da janela
        // Por algum motivo a janela calculada era 30px menor do que deveria
        // tivemos que adicionar esse valor à conta pois não encontramos o motivo.
        this.setSize(
            (
                (Consts.RES * Consts.CELL_SIDE) +
                (getInsets().left + getInsets().right)
            ),
            (
                (Consts.RES * Consts.CELL_SIDE) +
                (getInsets().top +  getInsets().bottom) + 30
            )
        );

        // Instancia EventBus e registra eventos
        EventBus.setInstance(this, 15);
        EventBus eventBus = EventBus.getInstance();
        eventBus.on("create-element", new CreateElementsEvent());
        eventBus.on("remove-element", new RemoveElementsEvent());
        eventBus.on("create-explosion", new CreateExplosionEvent());
        eventBus.on("create-animator", new CreateAnimatorEvent());
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

        // Cria herói
        Hero hero = new Hero(1, 1);
        this.addElement(hero);
        gameManager.state.setHero(hero);
        eventBus.emit("set-hero-lives", hero);

        movements = new Movements();
        gameManager.state.setInteractionMap(new InteractionMap());

        // Instancia fases
        levels = new GameLevel[4];
        levels[0] = new Level1(this);
        levels[1] = new Level2(this);
        levels[2] = new Level3(this);
        levels[3] = new Level4(this);

        // Inicia primeira fase
        gameManager.state.setLevelState(new LevelState(0));
        currentLevel = levels[gameManager.state.getLevelState().getLevelIndex()];

        currentLevel.begin();

    }

    public void addElement(Element element) {
        gameManager.state.getElements().add(element);
    }

    public void removeElement(Element element) {
        gameManager.state.getElements().remove(element);
    }

    public void addEnemy(Enemy enemy) {
        gameManager.state.getEnemies().add(enemy);
    }

    public void removeEnemy(Enemy enemy) {
        gameManager.state.getEnemies().remove(enemy);
    }

    public Graphics getGraphicsBuffer(){
        return graphics;
    }

    public InteractionMap getInteractionMap() {
        return gameManager.state.getInteractionMap();
    }

    public Timer getTimer() {
        return timer;
    }

    public Animator getAnimator(String animatorName) {
        return animatorFactory.getAnimator(animatorName);
    }

    public void setAnimatorFactory(AnimatorFactory animatorFactory) {
        this.animatorFactory = animatorFactory;
    }

    public void gameOver() {
        System.out.println("GAME OVER");
        System.exit(0);
    }

    public void nextLevel() {
        LevelState levelState = gameManager.state.getLevelState();
        Hero hero = (Hero) gameManager.state.getElements().get(0); // Reservar herói
        gameManager.state.getElements().clear(); // Limpar elementos a renderizar
        for (Enemy enemy: gameManager.state.getEnemies()) { // Parar inimigos
            enemy.stop();
        }
        gameManager.state.getEnemies().clear(); // Remover inimigos
        gameManager.state.getInteractionMap().clear(); // Limpar mapa de interação
        hero.setPosition( // Resetar posição do herói
            new Position(1, 1)
        );
        gameManager.state.getElements().add(hero); // Adicionar herói À lista de elementos à renderizar
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
        }
    }

    public void victory() {
        System.out.println("CONGRATULATIONS YOU WON");
        System.exit(0);
    }

    public Hero getHero() {
        return gameManager.state.getHero();
    }

    public ArrayList<Element> getElements() {
        return gameManager.state.getElements();
    }

    public ArrayList<Enemy> getEnemies() {
        return gameManager.state.getEnemies();
    }

    public LevelState getLevelState() {
        return gameManager.state.getLevelState();
    }

    public GameManager getGameManager() {
        return gameManager;
    }

    /*Este metodo eh executado a cada Consts.FRAME_INTERVAL milissegundos*/
    public void paint(Graphics oldGraphics) {
        Graphics newGraphics = this.getBufferStrategy().getDrawGraphics();
        /*Criamos um contexto gráfico*/
        graphics = newGraphics.create(getInsets().left, getInsets().top, getWidth() - getInsets().right, getHeight() - getInsets().top);

        /*Desenha cenário*/
        for (int i = 0; i < Consts.RES; i++) {
            for (int j = 0; j < Consts.RES; j++) {
                    currentLevel.getImageFactory().getImageList("floor-static").get(0).paintIcon(
                    this,
                    this.getGraphicsBuffer(),
                    j * Consts.CELL_SIDE,
                    i * Consts.CELL_SIDE
                );
            }
        }

        /*Aqui podem ser inseridos novos processamentos de controle*/
        if (!this.gameManager.state.getElements().isEmpty()) {
            this.controller.draw(gameManager.state.getElements(), gameManager.state.getEnemies());
            this.controller.process(gameManager.state.getHero());
            boolean victory = this.controller.checkVitory(gameManager.state.getEnemies());
            if (victory) {
                this.nextLevel();
            }
        }

        newGraphics.dispose();
        graphics.dispose();
        if (!getBufferStrategy().contentsLost()) {
            getBufferStrategy().show();
        }
    }

    public void go() {
        SerializableTimerTask redesenhar = new SerializableTimerTask() {
            public void run() {
                repaint(); /*(executa o metodo paint)*/
            }
        };

        /*Redesenha (executa o metodo paint) tudo a cada Consts.FRAME_INTERVAL milissegundos*/
        timer.schedule(redesenhar, 0, Consts.FRAME_INTERVAL);
    }

    public void stop() {
        setVisible(false);
        getBufferStrategy().dispose();
        timer.cancel();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initElements
    private void initElements() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POO2021");
        setAutoRequestFocus(false);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initElements
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void keyReleased(KeyEvent e) {
        gameManager.state.getHero().stop(e.getKeyCode());
    }

    public void keyPressed(KeyEvent e) {
        movements.makeMovement(e, this); // Procurar tecla no objeto de handlers
    }

}
