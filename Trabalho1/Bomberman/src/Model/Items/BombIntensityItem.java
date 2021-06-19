package Model.Items;

import javax.swing.ImageIcon;

import Model.Element;
import Model.Hero;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class BombIntensityItem extends Item {

    protected BombIntensityItem(EventBus<Element> eventBus, Position position) {
        super(eventBus, position);
    }

    public ImageIcon getImage() {
        return null;
    }

    public void pickUp(Hero hero) {
        hero.incrementBombIntensity();
    }

}
