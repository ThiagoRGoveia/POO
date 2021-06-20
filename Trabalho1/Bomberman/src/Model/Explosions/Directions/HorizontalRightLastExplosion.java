package Model.Explosions.Directions;

import Model.Element;
import Model.Explosions.LastExplosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class HorizontalRightLastExplosion extends LastExplosion {

    public HorizontalRightLastExplosion(EventBus<Element>eventBus, Position position) {
        super(eventBus,position);
        this.setAnimatorName("horizontal-right-last-explosion");
        eventBus.emit("create-animator", this);
        setExplosionFinishTimer();
    }

    public void propagateExplosion(int intensity) {}

}