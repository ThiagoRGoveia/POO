package Model.Explosions.Directions;

import Model.Explosions.MiddleExplosion;
import Tools.Position.Position;
import Controls.AnimatorSingleton;

public abstract class HorizontalMiddleExplosion extends MiddleExplosion {

    public HorizontalMiddleExplosion(int intensity, Position position) {
        super(intensity, position);
        this.animator = AnimatorSingleton.getAnimator("horizontal-middle-explosion");
    }
}
