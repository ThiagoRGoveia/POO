package Model.Explosions.Directions;

import Model.Explosions.LastExplosion;
import Tools.Position.Position;
import Controls.AnimatorSingleton;

public class VerticalUpLastExplosion extends LastExplosion {

    public VerticalUpLastExplosion(Position position) {
        super(position);
        this.animator = AnimatorSingleton.getAnimator("vertical-up-last-explosion");
    }

    public void propagateExplosion(int intensity) {}

}
