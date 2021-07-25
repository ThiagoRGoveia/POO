package Model.Items;

import Model.Hero;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class ExtraLifeItem extends Item {

    protected ExtraLifeItem(Position position) {
        super(position);
        this.setAnimatorName("extra-life-item");
        EventBus.getInstance().emit("create-animator", this);
    }

    public ExtraLifeItem(int row, int column) {
        this(new Position(row, column));
    }

    public void pickUp(Hero hero) {
        hero.incrementNumberOfLives();
        die();
    }

}
