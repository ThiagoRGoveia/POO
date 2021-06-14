package Model.Explosions.Directions;

import Model.Explosions.LastExplosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Image.Boundaries;
import Tools.Position.Position;

public class VerticalUpLastExplosion extends LastExplosion {

    public VerticalUpLastExplosion(EventBus eventBus, Position position) {
        super(
            new Animator(
                "all.png",
                5,
                false,
                50,
                VerticalUpLastExplosion.bombSpritesBoundaries()
            ),
            eventBus,
            position
        );
    }

    private static Boundaries[] bombSpritesBoundaries() {
        Boundaries[] boundaries = {
            new Boundaries(322, 83, 16, 16),
            new Boundaries(340, 83, 16, 16),
            new Boundaries(356, 83, 16, 16),
            new Boundaries(373, 83, 16, 16),
            new Boundaries(373, 66, 16, 16)
        };
        return boundaries;
    }

}
