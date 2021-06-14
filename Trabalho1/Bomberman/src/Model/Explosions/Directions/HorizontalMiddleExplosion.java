package Model.Explosions.Directions;

import Model.Explosions.MiddleExplosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Image.Boundaries;
import Tools.Position.Position;

public abstract class HorizontalMiddleExplosion extends MiddleExplosion {

    public HorizontalMiddleExplosion(EventBus eventBus, int intensity, Position position) {
        super(
            new Animator(
                "all.png",
                5,
                false,
                50,
                HorizontalMiddleExplosion.bombSpritesBoundaries()
            ),
            eventBus,
            position
        );
        this.intensity = intensity;
    }

    private static Boundaries[] bombSpritesBoundaries() {
        Boundaries[] boundaries = {
            new Boundaries(288, 117, 16, 16),
            new Boundaries(288, 100, 16, 16),
            new Boundaries(254, 134, 16, 16),
            new Boundaries(254, 117, 16, 16),
            new Boundaries(254, 100, 16, 16)
        };
        return boundaries;
    }
}
