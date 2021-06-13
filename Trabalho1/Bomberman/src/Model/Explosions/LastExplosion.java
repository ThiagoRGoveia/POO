package Model.Explosions;

import Model.Explosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;

public abstract class LastExplosion extends Explosion {
    public LastExplosion (Animator animator, EventBus eventBus) {
        super(animator, eventBus);
    }
}
