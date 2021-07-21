package Controls.KeyStrokes;

import Controls.GameManager;
import Controls.Screen;

public class LoadGame implements KeyStroke {

    public void execute(Screen screen) {
        GameManager gameManager = screen.getGameManager();
        try {
            gameManager.loadScreen();
            gameManager.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
