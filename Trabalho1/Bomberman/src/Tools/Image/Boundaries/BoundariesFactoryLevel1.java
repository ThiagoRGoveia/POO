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
            new Boundaries(305, 117, 16, 16),
            new Boundaries(305, 100, 16, 16),
            new Boundaries(271, 134, 16, 16),
            new Boundaries(271, 117, 16, 16),
            new Boundaries(271, 100, 16, 16)
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
}
