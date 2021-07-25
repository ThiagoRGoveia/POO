package Model.Explosions.Directions;

import Tools.Events.EventBus;
import Tools.Position.Position;

public class VerticalDownMiddleExplosion  extends VerticalMiddleExplosion {

    public VerticalDownMiddleExplosion(int intensity, Position position) {
        super(intensity, position);
    }

    public void propagateExplosion(int intensity) {
        propagateDown(intensity);
    }

    public void changeToLastExplosion() {
        this.animator.stop();
        this.setAnimatorName("vertical-down-last-explosion");
        EventBus.getInstance().emit("create-animator", this);
    }

}
