package Controls.KeyStrokes;

import Model.Hero;

public class MoveUp implements KeyStroke {
    public void execute(Hero hero) {
         hero.moveUp();
    }
}
