package Model.Explosions;

import Model.Explosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class FirstExplosion extends Explosion implements Propagable {
    public FirstExplosion (EventBus eventBus, int intensity, Position position) {
        super(eventBus,position);
        this.intensity = intensity;
        this.setAnimatorName("first-explosion");
        eventBus.emit("create-animator", this);
        propagateExplosion();
    }


    public void propagateExplosion() {
        propagateUp();
        propagateDown();
        propagateLeft();
        propagateRight();
    }
}
