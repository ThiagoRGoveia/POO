package Controls;

import Tools.Drawer;

public class GameManager {
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
        Screen screen = new Screen(
            new Drawer(),
            this
        );
        setGameSaver(new GameSaver(screen));
    }

    public void start() {
        screen.setVisible(true);
        screen.createBufferStrategy(2);
        screen.go();
    }
}
