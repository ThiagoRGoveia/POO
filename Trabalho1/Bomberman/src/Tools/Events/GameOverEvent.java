package Tools.Events;

import Controls.Screen;
import Model.Element;

public class GameOverEvent implements Event<Element> {

    public void fire(Screen screen, Element t) {
        screen.gameOver();
    }

}
