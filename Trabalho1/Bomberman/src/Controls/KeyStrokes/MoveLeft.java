package Controls.KeyStrokes;

import Model.Hero;

public class MoveLeft implements KeyStroke {
    public boolean execute(Hero hero) {
        return hero.moveLeft();
    }
}
