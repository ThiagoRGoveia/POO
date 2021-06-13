package Model.Explosions;

import Model.Explosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;

public class FirstExplosion extends Explosion implements Propagable {
    public FirstExplosion (Animator animator, EventBus eventBus, int intensity) {
        super(animator, eventBus);
        this.intensity = intensity;
        propagateExplosion();
    }

    public void propagateExplosion() {
        propagateUp();
        propagateDown();
        propagateLeft();
        propagateRight();
    }
}
