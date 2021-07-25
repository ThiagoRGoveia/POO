package Model.Explosions.Directions;

import Tools.Position.Position;
import Controls.AnimatorSingleton;

public class HorizontalLeftMiddleExplosion extends HorizontalMiddleExplosion {

    public HorizontalLeftMiddleExplosion(int intensity, Position position) {
        super(intensity, position);
    }

    public void propagateExplosion(int intensity) {
        propagateLeft(intensity);
    }

    public void changeToLastExplosion() {
        this.animator.stop();
        this.animator = AnimatorSingleton.getAnimator("horizontal-left-last-explosion");
    }

}
