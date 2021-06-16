package Model.Explosions;

import Model.Element;
import Model.Explosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public abstract class LastExplosion extends Explosion {
    protected int intensity = 0;
    public LastExplosion (EventBus<Element>eventBus, Position position) {
        super(eventBus, position, 0);
    }
}
