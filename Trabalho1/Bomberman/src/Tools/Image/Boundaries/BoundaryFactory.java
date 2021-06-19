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

    public Boundaries[] getBombItemBoundaries() {
        Boundaries[] b = {
            new Boundaries(188, 32, 16, 16),
            new Boundaries(188, 48, 16, 16),
        };
        return b;
    }

    public Boundaries[] getBombIntensityItemBoundaries() {
        Boundaries[] b = {
            new Boundaries(204, 32, 16, 16),
            new Boundaries(204, 48, 16, 16),
        };
        return b;
    }

    public Boundaries[] getSpeedUpItemBoundaries() {
        Boundaries[] b = {
            new Boundaries(204, 64, 16, 16),
            new Boundaries(204, 80, 16, 16),
        };
        return b;
    }

    public Boundaries[] getExtraLifeItemBoundaries() {
        Boundaries[] b = {
            new Boundaries(188, 96, 16, 16),
            new Boundaries(188, 112, 16, 16),
        };
        return b;
    }
}
