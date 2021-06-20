package Controls.KeyStrokes;

import Controls.Screen;
import Model.Hero;

public class PlaceBomb implements KeyStroke {

    public void execute(Screen screen) {
        Hero hero = screen.getHero();
        hero.placeBomb();
    }

}
