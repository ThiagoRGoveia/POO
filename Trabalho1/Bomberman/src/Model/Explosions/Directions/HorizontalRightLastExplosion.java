package Model.Explosions.Directions;

import Model.Explosions.LastExplosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class HorizontalRightLastExplosion extends LastExplosion {

    public HorizontalRightLastExplosion(Position position) {
        super(position);
        this.setAnimatorName("horizontal-right-last-explosion");
        EventBus.getInstance().emit("create-animator", this);
    }

    public void propagateExplosion(int intensity) {}

}