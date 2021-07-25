package Model.Explosions.Directions;

import Model.Explosions.LastExplosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class HoriziontalLeftLastExplosion extends LastExplosion {

    public HoriziontalLeftLastExplosion(Position position) {
        super(position);
        this.setAnimatorName("horizontal-left-last-explosion");
        EventBus.getInstance().emit("create-animator", this);
        setExplosionFinishTimer();
    }

    public void propagateExplosion(int intensity) {}

}
