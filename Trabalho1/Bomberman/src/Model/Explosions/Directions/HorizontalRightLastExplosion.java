package Model.Explosions.Directions;

import Model.Explosions.LastExplosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Image.Boundaries;
import Tools.Position.Position;

public class HorizontalRightLastExplosion extends LastExplosion {

    public HorizontalRightLastExplosion(EventBus eventBus, Position position) {
        super(
            new Animator(
                "all.png",
                5,
                false,
                50,
                HorizontalRightLastExplosion.bombSpritesBoundaries()
            ),
            eventBus,
            position
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
