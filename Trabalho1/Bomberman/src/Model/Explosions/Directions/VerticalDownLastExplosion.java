package Model.Explosions.Directions;

import Model.Explosions.LastExplosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Image.Boundaries;

public class VerticalDownLastExplosion extends LastExplosion {

    public VerticalDownLastExplosion(EventBus eventBus) {
        super(
            new Animator(
                "all.png",
                5,
                VerticalDownLastExplosion.bombSpritesBoundaries()
            ),
            eventBus
        );
    }

    private static Boundaries[] bombSpritesBoundaries() {
        Boundaries[] boundaries = {
            new Boundaries(305, 82, 16, 16),
            new Boundaries(321, 134, 16, 16),
            new Boundaries(373, 134, 16, 16),
            new Boundaries(356, 134, 16, 16),
            new Boundaries(339, 134, 16, 16)
        };
        return boundaries;
    }

}
