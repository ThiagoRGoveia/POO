package Model.Explosions.Directions;

import Model.Explosions.LastExplosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class VerticalUpLastExplosion extends LastExplosion {

    public VerticalUpLastExplosion(Position position) {
        super(position);
        this.setAnimatorName("vertical-up-last-explosion");
        EventBus.getInstance().emit("create-animator", this);
    }

    public void propagateExplosion(int intensity) {}

}
