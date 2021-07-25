package Controls;

import java.io.Serializable;

import Tools.Drawer;

public class GameManager implements Serializable {
    private GameSaver gameSaver;
    private GameLoader gameLoader;
    private Screen screen;

    public GameManager() {
        this.gameLoader = new GameLoader();
    }

    public void saveScreen() {
        gameSaver.save();
    }

    public void setGameSaver(GameSaver gameSaver) {
        this.gameSaver = gameSaver;
    }

    public void loadScreen() throws Exception {
        try {
            Screen screen = gameLoader.load();
            setGameSaver(new GameSaver(screen));
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Unable to load Game");
        }
    }

    public void newScreen() {
        screen = new Screen(
            new Drawer(),
            this
        );
        setGameSaver(new GameSaver(screen));
    }

    public void start() {
        newScreen();
        screen.setVisible(true);
        screen.createBufferStrategy(2);
        screen.go();
    }
}
