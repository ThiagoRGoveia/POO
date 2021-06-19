package Model.Items;

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
}
