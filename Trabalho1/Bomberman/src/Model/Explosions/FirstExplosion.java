package Model.Explosions;

import Model.Explosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class FirstExplosion extends Explosion implements Propagable {
    public FirstExplosion (int intensity, Position position) {
        super(position, intensity);
        this.setAnimatorName("first-explosion");
        EventBus.getInstance().emit("create-animator", this);
    }

    // Propaga explosão nas 4 direções
    public void propagateExplosion(int intensity) {
        propagateUp(intensity);
        propagateDown(intensity);
        propagateLeft(intensity);
        propagateRight(intensity);
    }

    public void changeToLastExplosion() {}
}
