package Tools.Events;

import Controls.Screen;
import Model.Element;
import Model.Hero;

public class SetHeroLivesEvent implements Event<Element> {

    public void fire(Screen screen, Element element) {
        Hero hero = (Hero) element;
        screen.setTitle(
            String.format("Vidas: %d", hero.getNumberOfLives())
        );
    }

}
