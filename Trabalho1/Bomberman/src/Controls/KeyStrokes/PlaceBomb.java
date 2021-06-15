package Controls.KeyStrokes;

import Model.Hero;

public class PlaceBomb implements KeyStroke {

    public void execute(Hero hero) {
        hero.placeBomb();
    }

}
