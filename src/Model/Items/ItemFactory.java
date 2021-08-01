package Model.Items;

import Model.Element;
import Tools.RandomSingleton;
import Tools.Events.EventBus;
import Tools.Position.Position;

// Esta classe cria itens aleatóriamente
public class ItemFactory {
    public static Item createItem(Position position, int itemNumber) {
        switch (itemNumber) {
            case 0:
                return new BombItem(position);
            case 1:
                return new ExtraLifeItem(position);
            case 2:
                return new SpeedUpItem(position);
            case 3:
                return new BombIntensityItem(position);
        }
        return null;
    }

    public static void dropItem(Element element) {
        int itemNumber = RandomSingleton.getInstance().nextInt(4);
        Item item = ItemFactory.createItem(element.getPosition(), itemNumber);
        EventBus.getInstance().emit("create-element", item);
    }
}
