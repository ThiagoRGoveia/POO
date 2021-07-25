package Model.Blocks;

import Controls.SerializableTimerTask;

import Model.AnimatedElement;
import Model.Explosion;
import Model.Hero;
import Model.Enemies.Enemy;
import Model.Items.ItemFactory;
import Tools.RandomSingleton;
import Tools.Schedule;
import Tools.Events.EventBus;
import Tools.Position.Position;

// Esse elemento substituirá um block recém destruído
public class ExplodingBlock extends AnimatedElement {

    protected ExplodingBlock(Position position) {
        super(position);
        this.setAnimatorName("floor-obstacle-destruction");
        EventBus.getInstance().emit("create-animator", this);
        this.setTraversable(true);
        this.setImmortal(false);
    }

    public ExplodingBlock(int row, int column) {
        this(new Position(row, column));
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
                    ItemFactory.dropItem(block);
                 }
             },
             100
         );
     }
    // Ao morrer decida se ira dropar um item
    public void die() {
        super.die();
        int randomNumber = RandomSingleton.getInstance().nextInt(1000);
        boolean willItDropAnItem = 250 < randomNumber && randomNumber <= 500;
        if (willItDropAnItem) {
            this.createScheduledTask(
                sheduleItemDrop()
            );
            EventBus.getInstance().emit("create-schedule", this);
        }
    }

    public void start() {
        this.createScheduledTask(
            getTerminationSchedule()
        );
        EventBus.getInstance().emit("create-schedule", this);
        super.start();
    }

}
