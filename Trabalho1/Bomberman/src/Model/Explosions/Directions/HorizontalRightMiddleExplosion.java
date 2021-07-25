package Model.Explosions.Directions;

import Tools.Events.EventBus;
import Tools.Position.Position;

public class HorizontalRightMiddleExplosion extends HorizontalMiddleExplosion {

    public HorizontalRightMiddleExplosion(int intensity, Position position) {
        super(intensity, position);
    }

    public void propagateExplosion(int intensity) {
        propagateRight(intensity);
    }

    public void changeToLastExplosion() {
        this.animator.stop();
        this.setAnimatorName("horizontal-right-last-explosion");
        EventBus.getInstance().emit("create-animator", this);
        super.changeToLastExplosion();
    }

}
