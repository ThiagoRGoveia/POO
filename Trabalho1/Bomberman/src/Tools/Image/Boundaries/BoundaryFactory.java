package Tools.Image.Boundaries;

public abstract class BoundaryFactory {
    public abstract Boundaries[] getBombBoundaries();
    public abstract Boundaries[] getFirstExplosionBoundaries();
    public abstract Boundaries[] getHoriziontalLeftLastExplosionBoundaries();
    public abstract Boundaries[] getHorizontalMiddleExplosionsionBoundaries();
    public abstract Boundaries[] getHorizontalRightLastExplosionBoundaries();
    public abstract Boundaries[] getVerticalDownLastExplosionsionBoundaries();
    public abstract Boundaries[] getVerticalMiddleExplosionsionBoundaries();
    public abstract Boundaries[] getVerticalUpLastExplosionsionBoundaries();
}
