package Controls.KeyStrokes;

import Model.Hero;

public class MoveUp implements KeyStroke {
    public boolean execute(Hero hero) {
        return hero.moveUp();
    }
}
