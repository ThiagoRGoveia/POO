package Model.Explosions.Directions;

import Model.Explosions.LastExplosion;
import Tools.Position.Position;
import Controls.AnimatorSingleton;

public class VerticalDownLastExplosion extends LastExplosion {

    public VerticalDownLastExplosion(Position position) {
        super(position);
        this.animator = AnimatorSingleton.getAnimator("vertical-down-last-explosion");
    }

    public void propagateExplosion(int intensity) {}
}
