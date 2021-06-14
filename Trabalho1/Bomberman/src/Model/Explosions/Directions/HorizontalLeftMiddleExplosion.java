package Model.Explosions.Directions;

import Tools.Events.EventBus;
import Tools.Position.Position;

public class HorizontalLeftMiddleExplosion extends HorizontalMiddleExplosion {

    public HorizontalLeftMiddleExplosion(EventBus eventBus, int intensity, Position position) {
        super(eventBus, intensity, position);
    }

    public void propagateExplosion() {
        propagateLeft();
    }

}
