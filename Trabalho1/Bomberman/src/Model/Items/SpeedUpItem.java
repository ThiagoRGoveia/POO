package Model.Items;


import Model.Hero;
import Tools.Position.Position;
import Controls.AnimatorSingleton;

public class SpeedUpItem extends Item {

    protected SpeedUpItem(Position position) {
        super(position);
        this.animator = AnimatorSingleton.getAnimator("speed-up-item");
    }

    public SpeedUpItem(int row, int column) {
        this(new Position(row, column));
    }

    public void pickUp(Hero hero) {
        hero.increaseSpeed();
        die();
    }
}
