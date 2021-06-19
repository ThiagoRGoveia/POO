package Controls;

import Model.Element;
import Model.Blocks.IndestructableBlock;
import Model.Blocks.RegularBlock;
import Model.Enemies.Enemy;
import Tools.Events.EventBus;

public class Level1 {
    private EventBus<Element> eventBus;
    public Level1( EventBus<Element> eventBus) {
        this.eventBus = eventBus;
    }

    public void drawGround() {

    }

    public void drawElements() {
        RegularBlock block;
        IndestructableBlock indestructableBlock;
        Enemy enemy;
        block = new RegularBlock(eventBus, 0, 0);
        eventBus.emit("create-element", block);
        block = new RegularBlock(eventBus, 0, 1);

        // eventBus.emit("create-enemy", enemy); // Vou criar esse evento depois

    }
}
