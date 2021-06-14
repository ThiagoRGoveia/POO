package Model.Explosions.Directions;

import Tools.Events.EventBus;
import Tools.Position.Position;

public class HorizontalRightMiddleExplosion extends HorizontalMiddleExplosion {

    public HorizontalRightMiddleExplosion(EventBus eventBus, int intensity, Position position) {
        super(eventBus, intensity, position);
    }

    public void propagateExplosion() {
        propagateRight();
    }

}
