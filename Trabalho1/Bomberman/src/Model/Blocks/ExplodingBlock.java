package Model.Blocks;

import java.util.TimerTask;

import Model.AnimatedElement;
import Model.Element;
import Model.Explosion;
import Model.Hero;
import Model.Enemies.Enemy;
import Tools.Schedule;
import Tools.Events.EventBus;
import Tools.Position.Position;

// Esse elemento substituirá um block recém destruído
public class ExplodingBlock extends AnimatedElement {

    protected ExplodingBlock(EventBus<Element> eventBus, Position position) {
        super(eventBus, position);
        this.setAnimatorName("floor-obstacle-destruction");
        eventBus.emit("create-animator", this);
        this.setTraversable(true);
        this.createScheduledTask(
            getTerminationSchedule()
        );
    }

    public void interact(Hero hero) {
    }

    public void interact(Enemy enemy) {
    }

    public void interact(Explosion explosion) {
    }

    private Schedule getTerminationSchedule() {
       return new Schedule(
            new TimerTask(){
                public void run() {
                    die();
                }
            },
            500
        );
    }

}
