package Model.Blocks;

import java.util.Random;
import Controls.SerializableTimerTask;

import Model.AnimatedElement;
import Model.Element;
import Model.Explosion;
import Model.Hero;
import Model.Enemies.Enemy;
import Model.Items.ItemFactory;
import Tools.Schedule;
import Tools.Events.EventBus;
import Tools.Position.Position;

// Esse elemento substituirá um block recém destruído
public class ExplodingBlock extends AnimatedElement {

    protected ExplodingBlock(EventBus eventBus, Position position) {
        super(eventBus, position);
        this.setAnimatorName("floor-obstacle-destruction");
        eventBus.emit("create-animator", this);
        this.setTraversable(true);
        this.setImmortal(false);
        this.createScheduledTask(
            getTerminationSchedule()
        );
        this.eventBus.emit("create-schedule", this);
    }

    public ExplodingBlock(EventBus eventBus, int row, int column) {
        this(eventBus, new Position(row, column));
    }

    public void interact(Hero hero) {
    }

    public void interact(Enemy enemy) {
    }

    public void interact(Explosion explosion) {
    }
    // Programa fim da explosão do bloco
    private Schedule getTerminationSchedule() {
        return new Schedule(
            new SerializableTimerTask(){
                public void run() {
                    die();
                }
            },
            400
        );
    }
    // Programa drop do item
    private Schedule sheduleItemDrop() {
        final ExplodingBlock block = this;
        return new Schedule(
             new SerializableTimerTask(){
                 public void run() {
                    ItemFactory.dropItem(eventBus, block);
                 }
             },
             100
         );
     }
    // Ao morrer decida se ira dropar um item
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
