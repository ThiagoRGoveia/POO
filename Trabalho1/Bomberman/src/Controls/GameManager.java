package Controls;

import java.io.Serializable;

import Tools.Drawer;

public class GameManager implements Serializable {
    private GameSaver gameSaver;
    private GameLoader gameLoader;
    public GameState state;
    private Screen screen;

    public GameManager() {
        this.gameLoader = new GameLoader();
        this.state = new GameState();
    }

    public void saveGame() {
        gameSaver.save();
    }

    public void setGameSaver(GameSaver gameSaver) {
        this.gameSaver = gameSaver;
    }

    public void loadScreen() throws Exception {
        try {
            state = gameLoader.load();
            setGameSaver(new GameSaver(state));
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Unable to load Game");
        }
    }

    public void createNewScreen() {
        screen = new Screen(
            new Drawer(),
            this
        );
        setGameSaver(new GameSaver(state));
    }

    public void start() {
        createNewScreen();
        screen.setVisible(true);
        screen.createBufferStrategy(2);
        screen.go();
    }
}
