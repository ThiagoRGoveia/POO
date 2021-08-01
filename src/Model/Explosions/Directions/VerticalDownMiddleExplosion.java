package Model.Explosions.Directions;

import Tools.Position.Position;
import Controls.AnimatorSingleton;

public class VerticalDownMiddleExplosion  extends VerticalMiddleExplosion {

    public VerticalDownMiddleExplosion(int intensity, Position position) {
        super(intensity, position);
    }

    public void propagateExplosion(int intensity) {
        propagateDown(intensity);
    }

    public void changeToLastExplosion() {
        this.animator.stop();
        this.animator = AnimatorSingleton.getAnimator("vertical-down-last-explosion");
    }

}
