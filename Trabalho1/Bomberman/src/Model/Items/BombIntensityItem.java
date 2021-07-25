package Model.Items;

import Model.Hero;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class BombIntensityItem extends Item {

    protected BombIntensityItem(Position position) {
        super(position);
        this.setAnimatorName("bomb-intensity-item");
        EventBus.getInstance().emit("create-animator", this);
    }

    public BombIntensityItem(int row, int column) {
        this(new Position(row, column));
    }

    public void pickUp(Hero hero) {
        hero.incrementBombIntensity();
        die();
    }

}
