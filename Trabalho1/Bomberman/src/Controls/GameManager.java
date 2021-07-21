package Controls;

public class GameManager {
    private GameSaver saveGame;
    private GameLoader loadGame;

    public GameManager(Screen screen) {
        this.saveGame = new GameSaver(screen);
        this.loadGame = new GameLoader();
    }

    public void save() {
        saveGame.save();
    }

    public Screen load() throws Exception {
        try {
            return loadGame.load();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Unable to load Game");
        }
    }
}
