package Model.Explosions.Directions;

import Model.Explosions.MiddleExplosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public abstract class HorizontalMiddleExplosion extends MiddleExplosion {

    public HorizontalMiddleExplosion(int intensity, Position position) {
        super(intensity, position);
        this.setAnimatorName("horizontal-middle-explosion");
        EventBus.getInstance().emit("create-animator", this);
    }
}
