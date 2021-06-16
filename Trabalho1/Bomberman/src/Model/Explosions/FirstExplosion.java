package Model.Explosions;

import Model.Element;
import Model.Explosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class FirstExplosion extends Explosion implements Propagable {
    public FirstExplosion (EventBus<Element>eventBus, int intensity, Position position) {
        super(eventBus, position, intensity);
        this.setAnimatorName("first-explosion");
        eventBus.emit("create-animator", this);
    }


    public void propagateExplosion(int intensity) {
        propagateUp(intensity);
        propagateDown(intensity);
        propagateLeft(intensity);
        propagateRight(intensity);
    }
}
