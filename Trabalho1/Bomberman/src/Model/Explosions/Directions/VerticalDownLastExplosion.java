package Model.Explosions.Directions;

import Model.Explosions.LastExplosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class VerticalDownLastExplosion extends LastExplosion {

    public VerticalDownLastExplosion(Position position) {
        super(position);
        this.setAnimatorName("vertical-down-last-explosion");
        EventBus.getInstance().emit("create-animator", this);
        setExplosionFinishTimer();
    }

    public void propagateExplosion(int intensity) {}
}
