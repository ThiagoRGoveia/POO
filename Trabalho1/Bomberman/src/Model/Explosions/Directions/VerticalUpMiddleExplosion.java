package Model.Explosions.Directions;

import Model.Element;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class VerticalUpMiddleExplosion  extends VerticalMiddleExplosion {

    public VerticalUpMiddleExplosion(EventBus eventBus, int intensity, Position position) {
        super(eventBus, intensity, position);
    }

    public void propagateExplosion(int intensity) {
        propagateUp(intensity);
    }

    public void changeToLastExplosion() {
        this.animator.stop();
        this.setAnimatorName("vertical-up-last-explosion");
        eventBus.emit("create-animator", this);
        super.changeToLastExplosion();
    }

}
