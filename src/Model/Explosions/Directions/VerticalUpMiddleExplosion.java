package Model.Explosions.Directions;

import Tools.Position.Position;
import Controls.AnimatorSingleton;

public class VerticalUpMiddleExplosion  extends VerticalMiddleExplosion {

    public VerticalUpMiddleExplosion(int intensity, Position position) {
        super(intensity, position);
    }

    public void propagateExplosion(int intensity) {
        propagateUp(intensity);
    }

    public void changeToLastExplosion() {
        this.animator.stop();
        this.animator = AnimatorSingleton.getAnimator("vertical-up-last-explosion");
    }

}
