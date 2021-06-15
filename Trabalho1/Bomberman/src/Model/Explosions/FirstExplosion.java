package Model.Explosions;

import Model.Explosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class FirstExplosion extends Explosion implements Propagable {
    public FirstExplosion (EventBus eventBus, int intensity, Position position) {
        super(eventBus,position);
        this.setAnimatorName("first-explosion");
        eventBus.emit("create-animator", this);
        propagateExplosion(intensity);
    }


    public void propagateExplosion(int intensity) {
        propagateUp(intensity);
        propagateDown(intensity);
        propagateLeft(intensity);
        propagateRight(intensity);
    }
}
