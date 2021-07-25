package Tools.Events;

import Controls.Screen;
import Model.Element;

// Permite finalziar o jogo
public class GameOverEvent implements Event {

    public void fire(Screen screen, Element t) {
        screen.gameOver();
    }

}
