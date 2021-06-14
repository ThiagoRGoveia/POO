package Model.Explosions.Directions;

import Tools.Events.EventBus;
import Tools.Position.Position;

public class VerticalUpMiddleExplosion  extends VerticalMiddleExplosion {

    public VerticalUpMiddleExplosion(EventBus eventBus, int intensity, Position position) {
        super(eventBus, intensity, position);
    }

    public void propagateExplosion() {
        propagateUp();
    }

}
