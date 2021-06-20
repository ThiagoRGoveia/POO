package Controls.KeyStrokes;

import Controls.Screen;

public class NextLevel implements KeyStroke{

    public void execute(Screen screen) {
        screen.nextLevel();
    }

}
