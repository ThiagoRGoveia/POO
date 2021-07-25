package Model.Explosions.Directions;

import Model.Element;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class HorizontalLeftMiddleExplosion extends HorizontalMiddleExplosion {

    public HorizontalLeftMiddleExplosion(EventBus eventBus, int intensity, Position position) {
        super(eventBus, intensity, position);
    }

    public void propagateExplosion(int intensity) {
        propagateLeft(intensity);
    }

    public void changeToLastExplosion() {
        this.animator.stop();
        this.setAnimatorName("horizontal-left-last-explosion");
        eventBus.emit("create-animator", this);
        super.changeToLastExplosion();
    }

}
