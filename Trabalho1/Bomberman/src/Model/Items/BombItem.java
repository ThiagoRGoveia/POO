package Model.Items;

import Model.Hero;
import Tools.Position.Position;
import Controls.AnimatorSingleton;

public class BombItem extends Item  {

    protected BombItem(Position position) {
        super(position);
        this.animator = AnimatorSingleton.getAnimator("bomb-item");
    }

    public BombItem(int row, int column) {
        this(new Position(row, column));
    }

    public void pickUp(Hero hero) {
        hero.incrementMaxNumberOfBombs();
        die();
    }

}
