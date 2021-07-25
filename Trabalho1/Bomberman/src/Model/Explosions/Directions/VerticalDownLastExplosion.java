package Model.Explosions.Directions;

import Model.Element;
import Model.Explosions.LastExplosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class VerticalDownLastExplosion extends LastExplosion {

    public VerticalDownLastExplosion(EventBus eventBus, Position position) {
        super(eventBus,position);
        this.setAnimatorName("vertical-down-last-explosion");
        eventBus.emit("create-animator", this);
        setExplosionFinishTimer();
    }

    public void propagateExplosion(int intensity) {}
}
