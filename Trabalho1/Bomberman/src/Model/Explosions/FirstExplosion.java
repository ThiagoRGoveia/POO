package Model.Explosions;

import Model.Explosion;
import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Image.Boundaries;
import Tools.Position.Position;

public class FirstExplosion extends Explosion implements Propagable {
    public FirstExplosion (EventBus eventBus, int intensity, Position position) {
        super(
            new Animator(
                "all.png",
                5,
                false,
                50,
                FirstExplosion.bombSpritesBoundaries()
            ),
            eventBus,
            position
        );
        this.intensity = intensity;
        propagateExplosion();
    }

    private static Boundaries[] bombSpritesBoundaries() {
        Boundaries[] boundaries = {
            new Boundaries(322, 117, 16, 16),
            new Boundaries(373, 100, 16, 16),
            new Boundaries(356, 100, 16, 16),
            new Boundaries(339, 100, 16, 16),
            new Boundaries(322, 100, 16, 16)
        };
        return boundaries;
    }

    public void propagateExplosion() {
        propagateUp();
        propagateDown();
        propagateLeft();
        propagateRight();
    }
}
