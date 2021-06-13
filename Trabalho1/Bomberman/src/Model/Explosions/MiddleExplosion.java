package Model.Explosions;

import Model.Explosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;

public abstract class MiddleExplosion extends Explosion implements Propagable {
    public MiddleExplosion (Animator animator, EventBus eventBus) {
        super(animator, eventBus);
        propagateExplosion();
    }
}
