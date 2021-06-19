package Tools.Image.Boundaries;


public class BoundariesFactoryLevel1 extends BoundaryFactory {
    public Boundaries[] getBombBoundaries() {
        Boundaries[] b = {
            new Boundaries(356, 151, 16, 16),
            new Boundaries(373, 151, 16, 16),
            new Boundaries(390, 151, 16, 16),
            new Boundaries(373, 151, 16, 16)
        };
        return b;
    }

    public Boundaries[] getFirstExplosionBoundaries() {
        Boundaries[] b = {
            new Boundaries(322, 117, 16, 16),
            new Boundaries(373, 100, 16, 16),
            new Boundaries(356, 100, 16, 16),
            new Boundaries(339, 100, 16, 16),
            new Boundaries(322, 100, 16, 16)
        };
        return b;
    }

    public Boundaries[] getHoriziontalLeftLastExplosionBoundaries() {
        Boundaries[] b = {
            new Boundaries(254, 66, 16, 16),
            new Boundaries(271, 66, 16, 16),
            new Boundaries(288, 66, 16, 16),
            new Boundaries(305, 66, 16, 16),
            new Boundaries(322, 66, 16, 16)
        };
        return b;
    }

    public Boundaries[] getHorizontalMiddleExplosionsionBoundaries() {
        Boundaries[] b = {
            new Boundaries(288, 117, 16, 16),
            new Boundaries(288, 100, 16, 16),
            new Boundaries(254, 134, 16, 16),
            new Boundaries(254, 117, 16, 16),
            new Boundaries(254, 100, 16, 16)
        };
        return b;
    }

    public Boundaries[] getHorizontalRightLastExplosionBoundaries() {
        Boundaries[] b = {
            new Boundaries(305, 117, 16, 16),
            new Boundaries(305, 100, 16, 16),
            new Boundaries(271, 134, 16, 16),
            new Boundaries(271, 117, 16, 16),
            new Boundaries(271, 100, 16, 16)
        };
        return b;
    }

    public Boundaries[] getVerticalDownLastExplosionsionBoundaries() {
        Boundaries[] b = {
            new Boundaries(305, 83, 16, 16),
            new Boundaries(322, 134, 16, 16),
            new Boundaries(373, 134, 16, 16),
            new Boundaries(356, 134, 16, 16),
            new Boundaries(339, 134, 16, 16)
        };
        return b;
    }

    public Boundaries[] getVerticalMiddleExplosionsionBoundaries() {
        Boundaries[] b = {
            new Boundaries(305, 134, 16, 16),
            new Boundaries(288, 134, 16, 16),
            new Boundaries(373, 117, 16, 16),
            new Boundaries(356, 117, 16, 16),
            new Boundaries(339, 117, 16, 16)
        };
        return b;
    }

    public Boundaries[] getVerticalUpLastExplosionsionBoundaries() {
        Boundaries[] b = {
            new Boundaries(322, 83, 16, 16),
            new Boundaries(339, 83, 16, 16),
            new Boundaries(356, 83, 16, 16),
            new Boundaries(373, 83, 16, 16),
            new Boundaries(373, 66, 16, 16)
        };
        return b;
    }

    public Boundaries[] getEnemyVerticalUpMovementBoundaries() {
        Boundaries[] b = {
            new Boundaries(74, 2, 16, 16),
            new Boundaries(92, 2, 16, 16),
            new Boundaries(110, 2, 16, 16),
            new Boundaries(128, 2, 16, 16)
        };
        return b;
    }

    public Boundaries[] getEnemyVerticalDownMovementBoundaries() {
        Boundaries[] b = {
            new Boundaries(2, 2, 16, 16),
            new Boundaries(20, 2, 16, 16),
            new Boundaries(38, 2, 16, 16),
            new Boundaries(56, 2, 16, 16)
        };
        return b;
    }

    public Boundaries[] getEnemyHorizontalLeftMovementBoundaries() {
        Boundaries[] b = {
            new Boundaries(146, 2, 16, 16),
            new Boundaries(164, 2, 16, 16),
            new Boundaries(182, 2, 16, 16),
            new Boundaries(200, 2, 16, 16)
        };
        return b;
    }

    public Boundaries[] getEnemyHorizontalRightMovementBoundaries() {
        Boundaries[] b = {
            new Boundaries(228, 2, 16, 16),
            new Boundaries(246, 2, 16, 16),
            new Boundaries(264, 2, 16, 16),
            new Boundaries(282, 2, 16, 16)
        };
        return b;
    }

    public Boundaries[] getFloorStaticBoundaries() {
        Boundaries[] b = {
            new Boundaries(305, 32, 16, 16)
        };
        return b;
    }

    public Boundaries[] getFloorObstacleBoundaries() {
        Boundaries[] b = {
            new Boundaries(322, 15, 16, 16),
            new Boundaries(339, 15, 16, 16),
            new Boundaries(356, 15, 16, 16),
            new Boundaries(373, 15, 16, 16)
        };
        return b;
    }

    public Boundaries[] getFloorObstacleDestructionBoundaries() {
        Boundaries[] b = {
            new Boundaries(254, 151, 16, 16),
            new Boundaries(271, 151, 16, 16),
            new Boundaries(288, 151, 16, 16),
            new Boundaries(305, 151, 16, 16),
            new Boundaries(322, 151, 16, 16),
            new Boundaries(339, 151, 16, 16)
        };
        return b;
    }

    public Boundaries[] getIndestructableObstacleBoundaries() {
        Boundaries[] b = {
            new Boundaries(288, 32, 16, 16)
        };
        return b;
    }

}
