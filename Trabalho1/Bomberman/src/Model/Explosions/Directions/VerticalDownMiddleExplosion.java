package Model.Explosions.Directions;

import Tools.Events.EventBus;
import Tools.Position.Position;

public class VerticalDownMiddleExplosion  extends VerticalMiddleExplosion {

    public VerticalDownMiddleExplosion(EventBus eventBus, int intensity, Position position) {
        super(eventBus, intensity, position);
    }

    public void propagateExplosion(int intensity) {
        propagateDown(intensity);
    }

}
