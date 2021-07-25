package Model.Items;

import Model.Hero;
import Tools.Position.Position;
import Controls.AnimatorSingleton;

public class ExtraLifeItem extends Item {

    protected ExtraLifeItem(Position position) {
        super(position);
        this.animator = AnimatorSingleton.getAnimator("extra-life-item");
    }

    public ExtraLifeItem(int row, int column) {
        this(new Position(row, column));
    }

    public void pickUp(Hero hero) {
        hero.incrementNumberOfLives();
        die();
    }

}
