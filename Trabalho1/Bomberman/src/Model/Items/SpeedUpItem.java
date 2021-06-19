package Model.Items;

import javax.swing.ImageIcon;

import Model.Element;
import Model.Hero;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class SpeedUpItem extends Item {

    protected SpeedUpItem(EventBus<Element> eventBus, Position position) {
        super(eventBus, position);
    }

    public void pickUp(Hero hero) {
        hero.setSpeed(hero.getSpeed() - 5);
    }

    public ImageIcon getImage() {
        return null;
    }

}
