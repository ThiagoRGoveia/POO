package Model.Explosions.Directions;

import Tools.Events.EventBus;

public class VerticalUpMiddleExplosion  extends VerticalMiddleExplosion {

    public VerticalUpMiddleExplosion(EventBus eventBus, int intensity) {
        super(eventBus, intensity);
    }

    public void propagateExplosion() {
        propagateUp();
    }

}
