package Model.Explosions;

import Model.Explosion;
import Tools.Position.Position;

public abstract class MiddleExplosion extends Explosion implements Propagable {
    public MiddleExplosion (int intensity, Position position) {
        super(position, intensity);
    }
}
