package Controls.KeyStrokes;

import Controls.Screen;

public class SaveGame implements KeyStroke {

    public void execute(Screen screen) {
        screen.getGameManager().saveScreen();
    }

}
