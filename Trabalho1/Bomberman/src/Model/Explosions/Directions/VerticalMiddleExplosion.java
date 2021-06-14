package Model.Explosions.Directions;

import Model.Explosions.MiddleExplosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public abstract class VerticalMiddleExplosion extends MiddleExplosion {

    public VerticalMiddleExplosion(EventBus eventBus, int intensity, Position position) {
        super(eventBus,position);
        this.setAnimatorName("vertical-middle-explosion");
        eventBus.emit("create-animator", this);
        this.intensity = intensity;
    }
}
