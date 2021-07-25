package Controls.KeyStrokes;

import Controls.Screen;

// Atalho que permite pular um nível para fins de avaliação
public class NextLevel implements KeyStroke{

    public void execute(Screen screen) {
        screen.getGameManager(). nextLevel();
    }

}
