package Model.Explosions;

import Model.Explosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public abstract class MiddleExplosion extends Explosion implements Propagable {
    public MiddleExplosion (EventBus eventBus, int intensity, Position position) {
        super(eventBus, position, intensity);
    }
}
