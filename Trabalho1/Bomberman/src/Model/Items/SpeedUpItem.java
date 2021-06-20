package Model.Items;


import Model.Element;
import Model.Hero;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class SpeedUpItem extends Item {

    protected SpeedUpItem(EventBus<Element> eventBus, Position position) {
        super(eventBus, position);
        this.setAnimatorName("speed-up-item");
        eventBus.emit("create-animator", this);
    }

    public SpeedUpItem(EventBus<Element> eventBus, int row, int column) {
        this(eventBus, new Position(row, column));
    }

    public void pickUp(Hero hero) {
        hero.setSpeed(hero.getSpeed() - 1);
        die();
    }
}
