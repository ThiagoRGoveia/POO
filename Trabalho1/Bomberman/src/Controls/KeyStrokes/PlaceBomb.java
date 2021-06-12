package Controls.KeyStrokes;

import Model.Hero;

public class PlaceBomb implements KeyStroke {

    public boolean execute(Hero hero) {
        return hero.placeBomb();
    }

}
