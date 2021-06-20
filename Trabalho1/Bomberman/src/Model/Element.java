package Model;

import java.io.Serializable;

import Tools.Interactable;
import Tools.Schedule;
import Tools.Events.EventBus;
import Tools.Image.Drawable;
import Tools.Position.Position;

public abstract class Element implements Serializable, Drawable, Interactable {
    protected Position position;
    protected boolean traversable; /*Pode passar por cima?*/
    protected boolean killOnTouch;       /*Se encostar, morre?*/
    protected EventBus<Element> eventBus;
    protected Schedule scheduledTask;
    protected boolean isImmortal;

    protected Element(EventBus<Element> eventBus, Position position) {
        this.eventBus = eventBus;
        this.position = position;
        isImmortal = false;
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

    public Schedule getScheduledTask() {
        return scheduledTask;
    }

    public void createScheduledTask(Schedule scheduledTask) {
        this.scheduledTask = scheduledTask;
    }

    public void cancelSchedule() {
        if (scheduledTask != null) {
            scheduledTask.timerTask.cancel();
        }
    }

    public void die() {
        if (!isImmortal) {
            eventBus.emit("remove-element", this);
        }
    }

    public void setImmortal(boolean isImmortal) {
        this.isImmortal = isImmortal;
    }

    public boolean isImmortal() {
        return isImmortal;
    }
}
