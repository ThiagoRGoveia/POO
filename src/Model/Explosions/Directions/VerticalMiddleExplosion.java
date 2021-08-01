package Model.Explosions.Directions;

import Model.Explosions.MiddleExplosion;
import Tools.Position.Position;
import Controls.AnimatorSingleton;

public abstract class VerticalMiddleExplosion extends MiddleExplosion {

    public VerticalMiddleExplosion(int intensity, Position position) {
        super(intensity, position);
        this.animator = AnimatorSingleton.getAnimator("vertical-middle-explosion");
    }
}
