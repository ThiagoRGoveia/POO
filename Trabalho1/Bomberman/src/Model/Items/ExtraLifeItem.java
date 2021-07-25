package Model.Items;

import Model.Element;
import Model.Hero;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class ExtraLifeItem extends Item {

    protected ExtraLifeItem(EventBus eventBus, Position position) {
        super(eventBus, position);
        this.setAnimatorName("extra-life-item");
        eventBus.emit("create-animator", this);
    }

    public ExtraLifeItem(EventBus eventBus, int row, int column) {
        this(eventBus, new Position(row, column));
    }

    public void pickUp(Hero hero) {
        hero.incrementNumberOfLives();
        die();
    }

}
