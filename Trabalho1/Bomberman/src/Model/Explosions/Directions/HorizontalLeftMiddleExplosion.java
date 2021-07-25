package Model.Explosions.Directions;

import Tools.Events.EventBus;
import Tools.Position.Position;

public class HorizontalLeftMiddleExplosion extends HorizontalMiddleExplosion {

    public HorizontalLeftMiddleExplosion(int intensity, Position position) {
        super(intensity, position);
    }

    public void propagateExplosion(int intensity) {
        propagateLeft(intensity);
    }

    public void changeToLastExplosion() {
        this.animator.stop();
        this.setAnimatorName("horizontal-left-last-explosion");
        EventBus.getInstance().emit("create-animator", this);
    }

}
