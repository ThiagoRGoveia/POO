package Model.Explosions;

import java.util.Timer;
import java.util.TimerTask;

import Model.Explosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;

public class LastExplosion extends Explosion {
    private Timer propagationTimer;

    public LastExplosion (Animator animator, EventBus eventBus) {
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

    private void propagateExplosion() {
    }
}
