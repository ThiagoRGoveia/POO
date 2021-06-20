package Model.Items;

import Model.Element;
import Model.Hero;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class BombIntensityItem extends Item {

    protected BombIntensityItem(EventBus<Element> eventBus, Position position) {
        super(eventBus, position);
        this.setAnimatorName("bomb-intensity-item");
        eventBus.emit("create-animator", this);
    }

    public BombIntensityItem(EventBus<Element> eventBus, int row, int column) {
        this(eventBus, new Position(row, column));
    }

    public void pickUp(Hero hero) {
        hero.incrementBombIntensity();
        die();
    }

}
