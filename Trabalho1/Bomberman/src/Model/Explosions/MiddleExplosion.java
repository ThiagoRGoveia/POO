package Model.Explosions;

import java.util.Timer;
import java.util.TimerTask;

import Model.Explosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;

public abstract class MiddleExplosion extends Explosion implements Propagable {
    private Timer propagationTimer;

    public MiddleExplosion (Animator animator, EventBus eventBus) {
        super(animator, eventBus);
    }

    public void setPropagationTimer() {
        TimerTask task = new TimerTask() {
            public void run() {
                propagateExplosion();
            }
        };
        propagationTimer = new Timer();
        propagationTimer.schedule(task, 50);
    }
}
