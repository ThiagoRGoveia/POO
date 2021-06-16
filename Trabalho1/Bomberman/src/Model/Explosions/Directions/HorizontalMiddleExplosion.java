package Model.Explosions.Directions;

import Model.Element;
import Model.Explosions.MiddleExplosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public abstract class HorizontalMiddleExplosion extends MiddleExplosion {

    public HorizontalMiddleExplosion(EventBus<Element>eventBus, int intensity, Position position) {
        super(eventBus, intensity, position);
        this.setAnimatorName("horizontal-middle-explosion");
        eventBus.emit("create-animator", this);
    }
}
