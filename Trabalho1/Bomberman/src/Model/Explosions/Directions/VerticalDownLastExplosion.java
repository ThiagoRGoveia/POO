package Model.Explosions.Directions;

import Model.Explosions.LastExplosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Image.Boundaries;
import Tools.Position.Position;

public class VerticalDownLastExplosion extends LastExplosion {

    public VerticalDownLastExplosion(EventBus eventBus, Position position) {
        super(
            new Animator(
                "all.png",
                5,
                false,
                50,
                VerticalDownLastExplosion.bombSpritesBoundaries()
            ),
            eventBus,
            position
        );
    }

    private static Boundaries[] bombSpritesBoundaries() {
        Boundaries[] boundaries = {
            new Boundaries(305, 83, 16, 16),
            new Boundaries(322, 134, 16, 16),
            new Boundaries(373, 134, 16, 16),
            new Boundaries(356, 134, 16, 16),
            new Boundaries(339, 134, 16, 16)
        };
        return boundaries;
    }

}
