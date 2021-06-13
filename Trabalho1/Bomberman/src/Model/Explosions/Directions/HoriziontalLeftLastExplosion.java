package Model.Explosions.Directions;

import Model.Explosions.LastExplosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Image.Boundaries;

public class HoriziontalLeftLastExplosion extends LastExplosion {

    public HoriziontalLeftLastExplosion(EventBus eventBus) {
        super(
            new Animator(
                "all.png",
                5,
                false,
                50,
                HoriziontalLeftLastExplosion.bombSpritesBoundaries()
            ),
            eventBus
        );
    }

    private static Boundaries[] bombSpritesBoundaries() {
        Boundaries[] boundaries = {
            new Boundaries(254, 66, 16, 16),
            new Boundaries(270, 66, 16, 16),
            new Boundaries(288, 66, 16, 16),
            new Boundaries(305, 66, 16, 16),
            new Boundaries(322, 66, 16, 16)
        };
        return boundaries;
    }

}
