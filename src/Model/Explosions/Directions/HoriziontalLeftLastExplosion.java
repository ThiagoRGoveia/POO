package Model.Explosions.Directions;

import Model.Explosions.LastExplosion;
import Tools.Position.Position;
import Controls.AnimatorSingleton;

public class HoriziontalLeftLastExplosion extends LastExplosion {

    public HoriziontalLeftLastExplosion(Position position) {
        super(position);
        this.animator = AnimatorSingleton.getAnimator("horizontal-left-last-explosion");
    }

    public void propagateExplosion(int intensity) {}

}
