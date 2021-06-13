package Model.Explosions.Directions;

import Tools.Events.EventBus;

public class HorizontalLeftMiddleExplosion extends HorizontalMiddleExplosion {

    public HorizontalLeftMiddleExplosion(EventBus eventBus, int intensity) {
        super(eventBus, intensity);
    }

    public void propagateExplosion() {
        propagateLeft();
    }

}
