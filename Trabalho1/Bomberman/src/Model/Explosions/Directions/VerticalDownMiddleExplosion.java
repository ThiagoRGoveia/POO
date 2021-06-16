package Model.Explosions.Directions;

import Model.Element;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class VerticalDownMiddleExplosion  extends VerticalMiddleExplosion {

    public VerticalDownMiddleExplosion(EventBus<Element>eventBus, int intensity, Position position) {
        super(eventBus, intensity, position);
    }

    public void propagateExplosion(int intensity) {
        propagateDown(intensity);
    }

}
