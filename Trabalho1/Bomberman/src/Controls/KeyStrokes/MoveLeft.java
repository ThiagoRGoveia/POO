package Controls.KeyStrokes;

import Model.Hero;

public class MoveLeft implements KeyStroke {
    public void execute(Hero hero) {
        hero.moveLeft();
    }
}
