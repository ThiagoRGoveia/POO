package Tools.Image.Boundaries;


public class BoundariesFactoryLevel2 extends BoundaryFactory {
    public Boundaries[] getBombBoundaries() {
        Boundaries[] b = {
            new Boundaries(407, 117, 16, 16),
            new Boundaries(424, 117, 16, 16),
            new Boundaries(441, 117, 16, 16),
            new Boundaries(424, 117, 16, 16)
        };
        return b;
    }

    public Boundaries[] getFirstExplosionBoundaries() {
        Boundaries[] b = {
            new Boundaries(407, 151, 16, 16),
            new Boundaries(526, 134, 16, 16),
            new Boundaries(509, 134, 16, 16),
            new Boundaries(492, 134, 16, 16),
            new Boundaries(475, 134, 16, 16)
        };
        return b;
    }

    public Boundaries[] getHoriziontalLeftLastExplosionBoundaries() {
        Boundaries[] b = {
            new Boundaries(407, 100, 16, 16),
            new Boundaries(424, 100, 16, 16),
            new Boundaries(441, 100, 16, 16),
            new Boundaries(458, 100, 16, 16),
            new Boundaries(475, 100, 16, 16)
        };
        return b;
    }

    public Boundaries[] getHorizontalMiddleExplosionsionBoundaries() {
        Boundaries[] b = {
            new Boundaries(441, 151, 16, 16),
            new Boundaries(441, 134, 16, 16),
            new Boundaries(407, 168, 16, 16),
            new Boundaries(407, 151, 16, 16),
            new Boundaries(407, 134, 16, 16)
        };
        return b;
    }

    public Boundaries[] getHorizontalRightLastExplosionBoundaries() {
        Boundaries[] b = {
            new Boundaries(458, 151, 16, 16),
            new Boundaries(458, 134, 16, 16),
            new Boundaries(424, 168, 16, 16),
            new Boundaries(424, 151, 16, 16),
            new Boundaries(424, 134, 16, 16)
        };
        return b;
    }

    public Boundaries[] getVerticalDownLastExplosionsionBoundaries() {
        Boundaries[] b = {
            new Boundaries(458, 117, 16, 16),
            new Boundaries(475, 168, 16, 16),
            new Boundaries(526, 168, 16, 16),
            new Boundaries(509, 168, 16, 16),
            new Boundaries(492, 168, 16, 16)
        };
        return b;
    }

    public Boundaries[] getVerticalMiddleExplosionsionBoundaries() {
        Boundaries[] b = {
            new Boundaries(458, 168, 16, 16),
            new Boundaries(441, 168, 16, 16),
            new Boundaries(526, 151, 16, 16),
            new Boundaries(509, 151, 16, 16),
            new Boundaries(492, 151, 16, 16)
        };
        return b;
    }

    public Boundaries[] getVerticalUpLastExplosionsionBoundaries() {
        Boundaries[] b = {
            new Boundaries(475, 117, 16, 16),
            new Boundaries(492, 117, 16, 16),
            new Boundaries(509, 117, 16, 16),
            new Boundaries(526, 117, 16, 16),
            new Boundaries(526, 100, 16, 16)
        };
        return b;
    }

    public Boundaries[] getEnemyVerticalUpMovementBoundaries() {
        Boundaries[] b = {
            new Boundaries(128, 28, 16, 16),
            new Boundaries(146, 28, 16, 16),
            new Boundaries(128, 28, 16, 16),
            new Boundaries(146, 28, 16, 16)
        };
        return b;
    }

    public Boundaries[] getEnemyVerticalDownMovementBoundaries() {
        Boundaries[] b = {
            new Boundaries(92, 28, 16, 16),
            new Boundaries(110, 28, 16, 16),
            new Boundaries(92, 28, 16, 16),
            new Boundaries(110, 28, 16, 16)
        };
        return b;
    }

    public Boundaries[] getEnemyHorizontalLeftMovementBoundaries() {
        Boundaries[] b = {
            new Boundaries(56, 28, 16, 16),
            new Boundaries(74, 28, 16, 16),
            new Boundaries(56, 28, 16, 16),
            new Boundaries(74, 28, 16, 16)
        };
        return b;
    }

    public Boundaries[] getEnemyHorizontalRightMovementBoundaries() {
        Boundaries[] b = {
            new Boundaries(303, 340, 16, 16),
            new Boundaries(321, 340, 16, 16),
            new Boundaries(303, 340, 16, 16),
            new Boundaries(321, 340, 16, 16)
        };
        return b;
    }

    public Boundaries[] getFloorStaticBoundaries() {
        Boundaries[] b = {
            new Boundaries(458, 49, 16, 16)
        };
        return b;
    }

    public Boundaries[] getFloorObstacleBoundaries() {
        Boundaries[] b = {
            new Boundaries(441, 32, 16, 16),
            new Boundaries(441, 32, 16, 16),
            new Boundaries(441, 32, 16, 16),
            new Boundaries(441, 32, 16, 16)
        };
        return b;
    }

    public Boundaries[] getFloorObstacleDestructionBoundaries() {
        Boundaries[] b = {
            new Boundaries(407, 185, 16, 16),
            new Boundaries(424, 185, 16, 16),
            new Boundaries(441, 185, 16, 16),
            new Boundaries(458, 185, 16, 16),
            new Boundaries(475, 185, 16, 16),
            new Boundaries(492, 185, 16, 16)
        };
        return b;
    }

    public Boundaries[] getIndestructableObstacleBoundaries() {
        Boundaries[] b = {
            new Boundaries(475, 32, 16, 16)
        };
        return b;
    }
}
