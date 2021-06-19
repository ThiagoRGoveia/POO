package Model.Items;

import javax.swing.ImageIcon;

import Model.Element;
import Model.Hero;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class ExtraLifeItem extends Item {

    protected ExtraLifeItem(EventBus<Element> eventBus, Position position) {
        super(eventBus, position);
        this.setAnimatorName("extra-life-item");
        eventBus.emit("create-animator", this);
    }

    public ExtraLifeItem(EventBus<Element> eventBus, int row, int column) {
        this(eventBus, new Position(row, column));
    }

    public void pickUp(Hero hero) {
        hero.incrementNumberOfLives();
    }

    public ImageIcon getImage() {
        return null;
    }

}
