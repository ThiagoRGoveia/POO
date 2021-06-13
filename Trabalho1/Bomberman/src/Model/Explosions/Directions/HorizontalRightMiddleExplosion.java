package Model.Explosions.Directions;

import Tools.Events.EventBus;

public class HorizontalRightMiddleExplosion extends HorizontalMiddleExplosion {

    public HorizontalRightMiddleExplosion(EventBus eventBus, int intensity) {
        super(eventBus, intensity);
    }

    public void propagateExplosion() {
        propagateRight();
    }

}
