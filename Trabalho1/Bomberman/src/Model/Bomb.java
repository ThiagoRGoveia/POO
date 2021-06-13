package Model;

import java.util.Timer;
import java.util.TimerTask;
import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Image.Boundaries;

public class Bomb extends AnimatedElement {
    Timer traversableCancelationTimer;
    Timer explosionTimer;
    int intensiy;
    public Bomb (EventBus eventBus, int intensity) {
        super(
            new Animator(
                "all.png",
                4,
                true,
                500,
                Bomb.bombSpritesBoundaries()
            ),
            eventBus
        );
        this.traversable = true;

        scheduleTraversableChange();
        setExplosionTimer();
    }

    private void turnBlockable() {
        this.traversable = false;
    }

    private void scheduleTraversableChange() {
        TimerTask task = new TimerTask() {
            public void run() {
                turnBlockable();
            }
        };
        traversableCancelationTimer = new Timer();
        traversableCancelationTimer.schedule(task, 500);
    }

    private void setExplosionTimer() {
        TimerTask task = new TimerTask() {
            public void run() {
                explode();
            }
        };
        explosionTimer = new Timer();
        explosionTimer.schedule(task, 5000);
    }

    private void explode() {
        System.out.println("BUM");
    }

    private static Boundaries[] bombSpritesBoundaries() {
        Boundaries[] boundaries = {
            new Boundaries(356, 151, 16, 16),
            new Boundaries(373, 151, 16, 16),
            new Boundaries(390, 151, 16, 16),
            new Boundaries(373, 151, 16, 16)
        };
        return boundaries;
    }

    public void interact(Hero hero) {
        this.traversableCancelationTimer.cancel();
        scheduleTraversableChange();
    }

    public void interact(Enemy enemy) {}

    public void interact(Explosion explosion) {}


}
