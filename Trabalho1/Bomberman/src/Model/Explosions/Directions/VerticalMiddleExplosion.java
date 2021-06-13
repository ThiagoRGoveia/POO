package Model.Explosions.Directions;

import Model.Explosions.MiddleExplosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Image.Boundaries;

public abstract class VerticalMiddleExplosion extends MiddleExplosion {

    public VerticalMiddleExplosion(EventBus eventBus, int intensity) {
        super(
            new Animator(
                "all.png",
                5,
                false,
                50,
                VerticalMiddleExplosion.bombSpritesBoundaries()
            ),
            eventBus
        );
        this.intensity = intensity;
    }

    private static Boundaries[] bombSpritesBoundaries() {
        Boundaries[] boundaries = {
            new Boundaries(304, 134, 16, 16),
            new Boundaries(287, 134, 16, 16),
            new Boundaries(373, 117, 16, 16),
            new Boundaries(356, 117, 16, 16),
            new Boundaries(339, 117, 16, 16)
        };
        return boundaries;
    }
}
