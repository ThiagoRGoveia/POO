package Model.Explosions.Directions;

import Model.Explosions.MiddleExplosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Image.Boundaries;
import Tools.Position.Position;

public abstract class VerticalMiddleExplosion extends MiddleExplosion {

    public VerticalMiddleExplosion(EventBus eventBus, int intensity, Position position) {
        super(
            new Animator(
                "all.png",
                5,
                false,
                50,
                VerticalMiddleExplosion.bombSpritesBoundaries()
            ),
            eventBus,
            position
        );
        this.intensity = intensity;
    }

    private static Boundaries[] bombSpritesBoundaries() {
        Boundaries[] boundaries = {
            new Boundaries(305, 134, 16, 16),
            new Boundaries(288, 134, 16, 16),
            new Boundaries(373, 117, 16, 16),
            new Boundaries(356, 117, 16, 16),
            new Boundaries(339, 117, 16, 16)
        };
        return boundaries;
    }
}
