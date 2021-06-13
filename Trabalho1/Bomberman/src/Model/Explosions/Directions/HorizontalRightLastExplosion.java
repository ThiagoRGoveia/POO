package Model.Explosions.Directions;

import Model.Explosions.LastExplosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Image.Boundaries;

public class HorizontalRightLastExplosion extends LastExplosion {

    public HorizontalRightLastExplosion(EventBus eventBus) {
        super(
            new Animator(
                "all.png",
                5,
                HorizontalRightLastExplosion.bombSpritesBoundaries()
            ),
            eventBus
        );
    }

    private static Boundaries[] bombSpritesBoundaries() {
        Boundaries[] boundaries = {
            new Boundaries(305, 117, 16, 16),
            new Boundaries(305, 100, 16, 16),
            new Boundaries(271, 134, 16, 16),
            new Boundaries(271, 117, 16, 16),
            new Boundaries(271, 100, 16, 16)
        };
        return boundaries;
    }
}
