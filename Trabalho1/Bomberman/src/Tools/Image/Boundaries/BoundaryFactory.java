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
    public abstract Boundaries[] getEnemyVerticalUpMovementBoundaries();
    public abstract Boundaries[] getEnemyVerticalDownMovementBoundaries();
    public abstract Boundaries[] getEnemyHorizontalLeftMovementBoundaries();
    public abstract Boundaries[] getEnemyHorizontalRightMovementBoundaries();
    public abstract Boundaries[] getFloorStaticBoundaries();
    public abstract Boundaries[] getFloorObstacleBoundaries();
    public abstract Boundaries[] getFloorObstacleDestructionBoundaries();
    public abstract Boundaries[] getIndestructableObstacleBoundaries();
}
