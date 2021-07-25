package Model.Explosions.Directions;

import Tools.Events.EventBus;
import Tools.Position.Position;

public class VerticalUpMiddleExplosion  extends VerticalMiddleExplosion {

    public VerticalUpMiddleExplosion(int intensity, Position position) {
        super(intensity, position);
    }

    public void propagateExplosion(int intensity) {
        propagateUp(intensity);
    }

    public void changeToLastExplosion() {
        this.animator.stop();
        this.setAnimatorName("vertical-up-last-explosion");
        EventBus.getInstance().emit("create-animator", this);
    }

}
