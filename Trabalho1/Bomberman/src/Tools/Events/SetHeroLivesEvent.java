package Tools.Events;

import Controls.Screen;
import Model.Element;
import Model.Hero;

// Permite setar o numero de vidas do herói no título da janela
public class SetHeroLivesEvent implements Event {

    public void fire(Screen screen, Element element) {
        Hero hero = (Hero) element;
        screen.setTitle(
            String.format("Vidas: %d", hero.getNumberOfLives())
        );
    }

}
