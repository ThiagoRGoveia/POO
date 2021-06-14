package Model.Explosions;

import Model.Explosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public abstract class LastExplosion extends Explosion {
    public LastExplosion (EventBus eventBus, Position position) {
        super(eventBus, position);
    }
}
