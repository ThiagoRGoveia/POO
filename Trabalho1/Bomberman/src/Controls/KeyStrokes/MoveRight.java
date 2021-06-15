package Controls.KeyStrokes;

import Model.Hero;

public class MoveRight implements KeyStroke {
    public void execute(Hero hero) {
        hero.moveRight();
    }
}
