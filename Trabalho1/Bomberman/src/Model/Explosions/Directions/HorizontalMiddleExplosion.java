package Model.Explosions.Directions;

import Model.Explosions.MiddleExplosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public abstract class HorizontalMiddleExplosion extends MiddleExplosion {

    public HorizontalMiddleExplosion(EventBus eventBus, int intensity, Position position) {
        super(eventBus,position);
        this.setAnimatorName("horizontal-middle-explosion");
        eventBus.emit("create-animator", this);
    }
}
