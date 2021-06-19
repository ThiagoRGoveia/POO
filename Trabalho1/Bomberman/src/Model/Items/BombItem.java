package Model.Items;

import javax.swing.ImageIcon;

import Model.Element;
import Model.Hero;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class BombItem extends Item  {

    protected BombItem(EventBus<Element> eventBus, Position position) {
        super(eventBus, position);
        this.setAnimatorName("bomb-item");
        eventBus.emit("create-animator", this);
    }

    public BombItem(EventBus<Element> eventBus, int row, int column) {
        this(eventBus, new Position(row, column));
    }

    public ImageIcon getImage() {
        return null;
    }

    public void pickUp(Hero hero) {
        hero.incrementMaxNumberOfBombs();
    }

}
