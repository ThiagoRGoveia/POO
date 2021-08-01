package Controls;

import java.io.Serializable;

public class LevelState implements Serializable {
    private int levelIndex;

    public LevelState(int levelIndex) {
        this.levelIndex = levelIndex;
    }

    public int getLevelIndex() {
        return levelIndex;
    }

    public void setLevelIndex(int levelIndex) {
        this.levelIndex = levelIndex;
    }

}
