package Model.Items;

import Model.Hero;
import Tools.Position.Position;
import Controls.AnimatorSingleton;

public class BombIntensityItem extends Item {

    protected BombIntensityItem(Position position) {
        super(position);
        this.animator = AnimatorSingleton.getAnimator("bomb-intensity-item");

    }

    public BombIntensityItem(int row, int column) {
        this(new Position(row, column));
    }

    public void pickUp(Hero hero) {
        hero.incrementBombIntensity();
        die();
    }

}
