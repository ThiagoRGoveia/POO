package Model.Explosions;

import Model.Explosion;
import Tools.Position.Position;
import Controls.AnimatorSingleton;

public class FirstExplosion extends Explosion implements Propagable {
    public FirstExplosion (int intensity, Position position) {
        super(position, intensity);
        this.animator = AnimatorSingleton.getAnimator("first-explosion");
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
