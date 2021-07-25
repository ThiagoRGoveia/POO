package Model.Explosions.Directions;

import Tools.Position.Position;
import Controls.AnimatorSingleton;

public class HorizontalRightMiddleExplosion extends HorizontalMiddleExplosion {

    public HorizontalRightMiddleExplosion(int intensity, Position position) {
        super(intensity, position);
    }

    public void propagateExplosion(int intensity) {
        propagateRight(intensity);
    }

    public void changeToLastExplosion() {
        this.animator.stop();
        this.animator = AnimatorSingleton.getAnimator("horizontal-right-last-explosion");
    }

}
