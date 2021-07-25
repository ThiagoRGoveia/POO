package Model.Explosions.Directions;

import Model.Element;
import Model.Explosions.LastExplosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class HoriziontalLeftLastExplosion extends LastExplosion {

    public HoriziontalLeftLastExplosion(EventBus eventBus, Position position) {
        super(eventBus,position);
        this.setAnimatorName("horizontal-left-last-explosion");
        eventBus.emit("create-animator", this);
        setExplosionFinishTimer();
    }

    public void propagateExplosion(int intensity) {}

}
