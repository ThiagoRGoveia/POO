package Model.Items;

import java.util.Random;

import Model.Element;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class ItemFactory {
    public static Item createItem(EventBus<Element> eventBus, Position position, int itemNumber) {
        switch (itemNumber) {
            case 0:
                return new BombItem(eventBus, position);
            case 1:
                return new ExtraLifeItem(eventBus, position);
            case 2:
                return new SpeedUpItem(eventBus, position);
            case 3:
                return new BombIntensityItem(eventBus, position);
        }
        return null;
    }

    public static void dropItem(EventBus<Element> eventBus, Element element) {
        Random random = new Random();
        int itemNumber = random.nextInt(4);
        Item item = ItemFactory.createItem(eventBus, element.getPosition(), itemNumber);
        eventBus.emit("create-element", item);
    }
}
