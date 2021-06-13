package Model.Explosions.Directions;

import Tools.Events.EventBus;

public class VerticalDownMiddleExplosion  extends VerticalMiddleExplosion {

    public VerticalDownMiddleExplosion(EventBus eventBus, int intensity) {
        super(eventBus, intensity);
    }

    public void propagateExplosion() {
        propagateDown();
    }

}
