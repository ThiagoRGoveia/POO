
package Tools.Image.Boundaries;


public class BoundariesFactoryLevel4 extends BoundaryFactory { // atualizado
    public Boundaries[] getBombBoundaries() {
        Boundaries[] b = {
            new Boundaries(822, 66, 16, 16),
            new Boundaries(839, 66, 16, 16),
            new Boundaries(856, 66, 16, 16),
            new Boundaries(839, 66, 16, 16)
        };
        return b;
    }

    public Boundaries[] getFirstExplosionBoundaries() { // atualizado
        Boundaries[] b = {
            new Boundaries(754, 134, 16, 16),
            new Boundaries(873, 117, 16, 16),
            new Boundaries(856, 117, 16, 16),
            new Boundaries(839, 117, 16, 16),
            new Boundaries(822, 117, 16, 16)
        };
        return b;
    }

    public Boundaries[] getHoriziontalLeftLastExplosionBoundaries() { // atualizado
        Boundaries[] b = {
            new Boundaries(754, 83, 16, 16),
            new Boundaries(771, 83, 16, 16),
            new Boundaries(788, 83, 16, 16),
            new Boundaries(805, 83, 16, 16),
            new Boundaries(822, 83, 16, 16)
        };
        return b;
    }

    public Boundaries[] getHorizontalMiddleExplosionsionBoundaries() { // atualizado
        Boundaries[] b = {
            new Boundaries(788, 134, 16, 16),
            new Boundaries(788, 117, 16, 16),
            new Boundaries(754, 151, 16, 16),
            new Boundaries(754, 134, 16, 16),
            new Boundaries(754, 117, 16, 16)
        };
        return b;
    }

    public Boundaries[] getHorizontalRightLastExplosionBoundaries() { // atualizado
        Boundaries[] b = {
            new Boundaries(805, 134, 16, 16),
            new Boundaries(805, 117, 16, 16),
            new Boundaries(771, 151, 16, 16),
            new Boundaries(771, 134, 16, 16),
            new Boundaries(771, 117, 16, 16)
        };
        return b;
    }

    public Boundaries[] getVerticalDownLastExplosionsionBoundaries() { // atualizado
        Boundaries[] b = {
            new Boundaries(805, 100, 16, 16),
            new Boundaries(822, 151, 16, 16),
            new Boundaries(839, 151, 16, 16),
            new Boundaries(856, 151, 16, 16),
            new Boundaries(873, 151, 16, 16)
        };
        return b;
    }

    public Boundaries[] getVerticalMiddleExplosionsionBoundaries() { // atualizado
        Boundaries[] b = {
            new Boundaries(805, 151, 16, 16),
            new Boundaries(788, 151, 16, 16),
            new Boundaries(873, 134, 16, 16),
            new Boundaries(856, 134, 16, 16),
            new Boundaries(839, 134, 16, 16)
        };
        return b;
    }

    public Boundaries[] getVerticalUpLastExplosionsionBoundaries() { // atualizado
        Boundaries[] b = {
            new Boundaries(822, 100, 16, 16),
            new Boundaries(839, 100, 16, 16),
            new Boundaries(856, 100, 16, 16),
            new Boundaries(873, 100, 16, 16),
            new Boundaries(873, 83, 16, 16)
        };
        return b;
    }

    public Boundaries[] getEnemyVerticalUpMovementBoundaries() { // atualizado
        Boundaries[] b = {
            new Boundaries(3, 246, 16, 16),
            new Boundaries(21, 246, 16, 16),
            new Boundaries(39, 246, 16, 16),
            new Boundaries(57, 246, 16, 16)
        };
        return b;
    }

    public Boundaries[] getEnemyVerticalDownMovementBoundaries() { // atualizado
        Boundaries[] b = {
            new Boundaries(3, 228, 16, 16),
            new Boundaries(57, 228, 16, 16),
            new Boundaries(111, 228, 16, 16),
            new Boundaries(165, 228, 16, 16)
        };
        return b;
    }

    public Boundaries[] getEnemyHorizontalLeftMovementBoundaries() { // atualizado
        Boundaries[] b = {
            new Boundaries(75, 246, 16, 16),
            new Boundaries(111, 246, 16, 16),
            new Boundaries(147, 246, 16, 16),
            new Boundaries(165, 246, 16, 16)
        };
        return b;
    }

    public Boundaries[] getEnemyHorizontalRightMovementBoundaries() { // atualizado
        Boundaries[] b = {
            new Boundaries(190, 245, 16, 16),
            new Boundaries(226, 245, 16, 16),
            new Boundaries(262, 245, 16, 16),
            new Boundaries(280, 245, 16, 16)
        };
        return b;
    }

    public Boundaries[] getFloorStaticBoundaries() { // atualizado
        Boundaries[] b = {
            new Boundaries(788, 49, 16, 16)
        };
        return b;
    }

    public Boundaries[] getFloorObstacleBoundaries() { // atualizado
        Boundaries[] b = {
            new Boundaries(788, 32, 16, 16),
            new Boundaries(788, 32, 16, 16),
            new Boundaries(788, 32, 16, 16),
            new Boundaries(788, 32, 16, 16)
        };
        return b;
    }

    public Boundaries[] getFloorObstacleDestructionBoundaries() { // atualizado
        Boundaries[] b = {
            new Boundaries(754, 168, 16, 16),
            new Boundaries(771, 168, 16, 16),
            new Boundaries(788, 168, 16, 16),
            new Boundaries(805, 168, 16, 16),
            new Boundaries(822, 168, 16, 16),
            new Boundaries(839, 168, 16, 16)
        };
        return b;
    }

    public Boundaries[] getIndestructableObstacleBoundaries() { // atualizado
        Boundaries[] b = {
            new Boundaries(805, 32, 16, 16)
        };
        return b;
    }
}
