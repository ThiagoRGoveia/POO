package Model.Items;

import javax.swing.ImageIcon;

import Model.Element;
import Model.Hero;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class ExtraLifeItem extends Item {

    protected ExtraLifeItem(EventBus<Element> eventBus, Position position) {
        super(eventBus, position);
    }

    @Override
    public void pickUp(Hero hero) {
        hero.incrementNumberOfLives();
    }

    @Override
    public ImageIcon getImage() {
        return null;
    }

}
