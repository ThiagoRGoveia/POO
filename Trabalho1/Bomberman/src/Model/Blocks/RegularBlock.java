package Model.Blocks;

import java.util.Random;
import java.util.TimerTask;

import Model.AnimatedElement;
import Model.Element;
import Model.Explosion;
import Model.Hero;
import Model.Enemies.Enemy;
import Model.Items.ItemFactory;
import Tools.Schedule;
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

    private Schedule sheduleItemDrop() {
        RegularBlock block = this;
        return new Schedule(
             new TimerTask(){
                 public void run() {
                    ItemFactory.dropItem(eventBus, block);
                 }
             },
             350
         );
     }

    public void die() {
        super.die();
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        boolean willItDropAnItem = 250 < randomNumber && randomNumber <= 500;
        if (willItDropAnItem) {
            this.createScheduledTask(
                sheduleItemDrop()
            );
            this.eventBus.emit("create-schedule", this);
        }
    }

}
