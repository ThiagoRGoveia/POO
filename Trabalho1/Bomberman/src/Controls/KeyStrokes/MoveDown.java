package Controls.KeyStrokes;

import Model.Hero;

public class MoveDown implements KeyStroke {
    public void execute(Hero hero) {
        hero.moveDown();
    }
}
