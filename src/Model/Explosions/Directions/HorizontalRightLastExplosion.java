package Model.Explosions.Directions;

import Model.Explosions.LastExplosion;
import Tools.Position.Position;
import Controls.AnimatorSingleton;

public class HorizontalRightLastExplosion extends LastExplosion {

    public HorizontalRightLastExplosion(Position position) {
        super(position);
        this.animator = AnimatorSingleton.getAnimator("horizontal-right-last-explosion");
    }

    public void propagateExplosion(int intensity) {}

}