package Controls.KeyStrokes;

import Model.Hero;

public class MoveRight implements KeyStroke {
    public boolean execute(Hero hero) {
        return hero.moveRight();
    }
}
