package Controls.KeyStrokes;

import Controls.Screen;
import Model.Hero;

public class MoveRight implements KeyStroke {
    public void execute(Screen screen) {
        Hero hero = screen.getGameManager().getHero();
        hero.moveRight();
    }
}
