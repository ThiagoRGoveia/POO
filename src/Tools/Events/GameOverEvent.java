package Tools.Events;

import Controls.GameManager;
import Model.Element;

// Permite finalziar o jogo
public class GameOverEvent implements Event {

    public void fire(GameManager gameManager, Element t) {
        gameManager.gameOver();
    }

}
