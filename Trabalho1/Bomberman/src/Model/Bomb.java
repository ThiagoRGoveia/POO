package Model;

import java.util.Timer;
import java.util.TimerTask;
import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Image.Boundaries;

public class Bomb extends AnimatedElement {
    Timer traversableCancelation;
    public Bomb (EventBus eventBus) {
        super(
            new Animator(
                "all.png",
                4,
                Bomb.bombSpritesBoundaries()
            ),
            eventBus
        );
        this.traversable = true;

        schedulePropertyChange();
    }

    private void turnBlockable() {
        this.traversable = false;
    }

    private void schedulePropertyChange() {
        TimerTask task = new TimerTask() {
            public void run() {
                turnBlockable();
            }
        };
        Timer time = new Timer();
        time.schedule(task, 2000);
    }

    private static Boundaries[] bombSpritesBoundaries() {
        Boundaries[] boundaries = {
            new Boundaries(356, 151, 16, 16),
            new Boundaries(373, 151, 16, 16),
            new Boundaries(390, 151, 16, 16),
            new Boundaries(373, 151, 16, 16),
        };
        return boundaries;
    }

    public void interact(Hero hero) {}

    public void interact(Enemy enemy) {}

    public void interact(Explosion explosion) {}


}
