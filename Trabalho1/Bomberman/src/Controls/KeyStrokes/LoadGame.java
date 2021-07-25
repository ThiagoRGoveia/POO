package Controls.KeyStrokes;

import Controls.Screen;
import Model.Enemies.Enemy;

public class LoadGame implements KeyStroke {

    public void execute(Screen screen) {
        try {
            screen.getGameManager().loadGame();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
