package Model.Explosions;

import Model.Explosion;
import Tools.Position.Position;

public abstract class LastExplosion extends Explosion {
    protected int intensity = 0;
    public LastExplosion (Position position) {
        super(position, 0);
    }
}
