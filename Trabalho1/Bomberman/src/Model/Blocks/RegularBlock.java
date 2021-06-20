package Model.Blocks;

import java.util.Random;

import Model.AnimatedElement;
import Model.Element;
import Model.Explosion;
import Model.Hero;
import Model.Enemies.Enemy;
import Model.Items.Item;
import Model.Items.ItemFactory;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class RegularBlock extends AnimatedElement {

    protected RegularBlock(EventBus<Element> eventBus, Position position) {
        super(eventBus, position);
        this.setAnimatorName("floor-obstacle");
        eventBus.emit("create-animator", this);
        this.setImmortal(false);
        this.setTraversable(false);
    }

    public RegularBlock(EventBus<Element> eventBus, int row, int column) {
        this(eventBus, new Position(row, column));
    }

    public void interact(Hero hero) {
    }

    public void interact(Enemy enemy) {
        enemy.changeDirection();
    }

    public void interact(Explosion explosion) {
        this.die();
    }

    public void die() {
        super.die();
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        boolean willItDroAnItem = 250 < randomNumber && randomNumber <= 500;
        if (willItDroAnItem) {
            int itemNumber = random.nextInt(4);
            Item item = ItemFactory.createItem(eventBus, position, itemNumber);
            eventBus.emit("create-element", item);
        }
    }

}
