package Tools.Events;

import Controls.GameManager;
import Model.Element;
import Model.Hero;

// Permite setar o numero de vidas do herói no título da janela
public class SetHeroLivesEvent implements Event {

    public void fire(GameManager gameManager, Element element) {
        Hero hero = (Hero) element;
        gameManager.getScreen().setTitle(
            String.format("Vidas: %d", hero.getNumberOfLives())
        );
    }

}
