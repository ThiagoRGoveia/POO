package Model.Explosions;

import java.util.Timer;
import java.util.TimerTask;

import Model.Explosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;

public class FirstExplosion extends Explosion {
    private Timer propagationTimer;

    public FirstExplosion (Animator animator, EventBus eventBus, int intensity) {
        super(animator, eventBus);
        this.intensity = intensity;
        propagateExplosion();
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

    private void propagateExplosion() {
        propagateUp();
        propagateDown();
        propagateLeft();
        propagateright();
    }
}
