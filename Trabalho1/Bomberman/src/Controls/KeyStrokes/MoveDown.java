package Controls.KeyStrokes;

import Model.Hero;

public class MoveDown implements KeyStroke {
    public boolean execute(Hero hero) {
        return hero.moveDown();
    }
}
