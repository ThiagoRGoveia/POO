package Model.Explosions.Directions;

import Model.Explosions.MiddleExplosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Image.Boundaries;

public abstract class HorizontalMiddleExplosion extends MiddleExplosion {

    public HorizontalMiddleExplosion(EventBus eventBus, int intensity) {
        super(
            new Animator(
                "all.png",
                5,
                HorizontalMiddleExplosion.bombSpritesBoundaries()
            ),
            eventBus
        );
        this.intensity = intensity;
    }

    private static Boundaries[] bombSpritesBoundaries() {
        Boundaries[] boundaries = {
            new Boundaries(288, 117, 16, 16),
            new Boundaries(288, 100, 16, 16),
            new Boundaries(254, 134, 16, 16),
            new Boundaries(254, 116, 16, 16),
            new Boundaries(254, 99, 16, 16)
        };
        return boundaries;
    }
}
