package Model.Explosions.Directions;

import Model.Explosions.MiddleExplosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public abstract class VerticalMiddleExplosion extends MiddleExplosion {

    public VerticalMiddleExplosion(int intensity, Position position) {
        super(intensity, position);
        this.setAnimatorName("vertical-middle-explosion");
        EventBus.getInstance().emit("create-animator", this);
    }
}
