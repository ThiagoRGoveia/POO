package Model.Explosions;

import Model.Explosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Position.Position;

public abstract class LastExplosion extends Explosion {
    public LastExplosion (Animator animator, EventBus eventBus, Position position) {
        super(animator, eventBus, position);
    }
}
