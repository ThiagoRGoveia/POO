
package Tools.Image.Boundaries;


public class BoundariesFactoryLevel3 extends BoundaryFactory {//atualizado
    public Boundaries[] getBombBoundaries() {
        Boundaries[] b = {
            new Boundaries(317, 408, 16, 16),
            new Boundaries(334, 408, 16, 16),
            new Boundaries(351, 408, 16, 16),
            new Boundaries(334, 408, 16, 16)
        };
        return b;
    }

    public Boundaries[] getFirstExplosionBoundaries() {//atualizado
        Boundaries[] b = {
            new Boundaries(215, 391, 16, 16),
            new Boundaries(334, 357, 16, 16),
            new Boundaries(317, 357, 16, 16),
            new Boundaries(300, 357, 16, 16),
            new Boundaries(283, 357, 16, 16)
        };
        return b;
    }

    public Boundaries[] getHoriziontalLeftLastExplosionBoundaries() {//atualizado
        Boundaries[] b = {
            new Boundaries(215, 323, 16, 16),
            new Boundaries(232, 323, 16, 16),
            new Boundaries(249, 323, 16, 16),
            new Boundaries(266, 323, 16, 16),
            new Boundaries(283, 323, 16, 16)
        };
        return b;
    }

    public Boundaries[] getHorizontalMiddleExplosionsionBoundaries() {//atualizado
        Boundaries[] b = {
            new Boundaries(249, 374, 16, 16),
            new Boundaries(249, 357, 16, 16),
            new Boundaries(215, 391, 16, 16),
            new Boundaries(215, 374, 16, 16),
            new Boundaries(215, 357, 16, 16)
        };
        return b;
    }

    public Boundaries[] getHorizontalRightLastExplosionBoundaries() {//atualizado
        Boundaries[] b = {
            new Boundaries(266, 374, 16, 16),
            new Boundaries(266, 357, 16, 16),
            new Boundaries(232, 391, 16, 16),
            new Boundaries(232, 374, 16, 16),
            new Boundaries(232, 357, 16, 16)
        };
        return b;
    }

    public Boundaries[] getVerticalDownLastExplosionsionBoundaries() {//atualizado
        Boundaries[] b = {
            new Boundaries(266, 340, 16, 16),
            new Boundaries(283, 391, 16, 16),
            new Boundaries(334, 391, 16, 16),
            new Boundaries(317, 391, 16, 16),
            new Boundaries(300, 391, 16, 16)
        };
        return b;
    }

    public Boundaries[] getVerticalMiddleExplosionsionBoundaries() {//atualizado
        Boundaries[] b = {
            new Boundaries(266, 391, 16, 16),
            new Boundaries(249, 391, 16, 16),
            new Boundaries(334, 374, 16, 16),
            new Boundaries(317, 374, 16, 16),
            new Boundaries(300, 374, 16, 16)
        };
        return b;
    }

    public Boundaries[] getVerticalUpLastExplosionsionBoundaries() {//atualizado
        Boundaries[] b = {
            new Boundaries(283, 340, 16, 16),
            new Boundaries(300, 340, 16, 16),
            new Boundaries(317, 340, 16, 16),
            new Boundaries(334, 340, 16, 16),
            new Boundaries(334, 323, 16, 16)
        };
        return b;
    }

    public Boundaries[] getEnemyVerticalUpMovementBoundaries() {//atualizado!!
        Boundaries[] b = {
            new Boundaries(2, 194, 16, 16),
            new Boundaries(20, 194, 16, 16),
            new Boundaries(38, 194, 16, 16),
            new Boundaries(56, 194, 16, 16)
        };
        return b;
    }

    public Boundaries[] getEnemyVerticalDownMovementBoundaries() {//atualizado!!
        Boundaries[] b = {
            new Boundaries(2, 176, 16, 16),
            new Boundaries(56, 176, 16, 16),
            new Boundaries(110, 176, 16, 16),
            new Boundaries(164, 176, 16, 16)
        };
        return b;
    }

    public Boundaries[] getEnemyHorizontalLeftMovementBoundaries() {//atualizado!!
        Boundaries[] b = {
            new Boundaries(74, 194, 16, 16),
            new Boundaries(110, 194, 16, 16),
            new Boundaries(146, 194, 16, 16),
            new Boundaries(164, 194, 16, 16)
        };
        return b;
    }

    public Boundaries[] getEnemyHorizontalRightMovementBoundaries() {//atualizado!!
        Boundaries[] b = {
            new Boundaries(279, 193, 16, 16),
            new Boundaries(261, 193, 16, 16),
            new Boundaries(225, 193, 16, 16),
            new Boundaries(189, 193, 16, 16)
        };
        return b;
    }

    public Boundaries[] getFloorStaticBoundaries() {//atualizado
        Boundaries[] b = {
            new Boundaries(283, 255, 16, 16)
        };
        return b;
    }

    public Boundaries[] getFloorObstacleBoundaries() {//atualizado
        Boundaries[] b = {
            new Boundaries(215, 289, 16, 16),
            new Boundaries(266, 289, 16, 16),
            new Boundaries(215, 306, 16, 16),
            new Boundaries(283, 306, 16, 16)
        };
        return b;
    }

    public Boundaries[] getFloorObstacleDestructionBoundaries() {//atualizado
        Boundaries[] b = {
            new Boundaries(215, 408, 16, 16),
            new Boundaries(232, 408, 16, 16),
            new Boundaries(249, 408, 16, 16),
            new Boundaries(266, 408, 16, 16),
            new Boundaries(283, 408, 16, 16),
            new Boundaries(300, 408, 16, 16)
        };
        return b;
    }

    public Boundaries[] getIndestructableObstacleBoundaries() {//atualizado
        Boundaries[] b = {
            new Boundaries(266, 255, 16, 16)
        };
        return b;
    }
}
