package Model;

import java.io.Serializable;
import java.util.TimerTask;

import Tools.Interactable;
import Tools.Events.EventBus;
import Tools.Image.Drawable;
import Tools.Position.Position;

public abstract class Element implements Serializable, Drawable, Interactable {
    protected Position position;
    protected boolean traversable; /*Pode passar por cima?*/
    protected boolean killOnTouch;       /*Se encostar, morre?*/
    protected EventBus<Element> eventBus;
    protected TimerTask scheduledTask;

    protected Element(EventBus<Element> eventBus, Position position) {
        this.eventBus = eventBus;
        this.position = position;
    }

    protected Element(EventBus<Element> eventBus) {
        this.position = new Position(0, 0);
        this.eventBus = eventBus;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isTraversable() {
        return traversable;
    }

    public void setTraversable(boolean traversable) {
        this.traversable = traversable;
    }

    public boolean setPosition(int row, int column) {
        return position.setPosition(row, column);
    }

    public boolean setPosition(Position position) {
        return this.position.setPosition(position);
    }

    public TimerTask getScheduledTask() {
        return scheduledTask;
    }

    public void setScheduledTask(TimerTask scheduledTask) {
        this.scheduledTask = scheduledTask;
    }
}
