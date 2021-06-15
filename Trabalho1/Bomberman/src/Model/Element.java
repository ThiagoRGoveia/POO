package Model;

import java.io.Serializable;

import Tools.Interactable;
import Tools.Events.EventBus;
import Tools.Image.Drawable;
import Tools.Position.Position;

public abstract class Element implements Serializable, Drawable, Interactable {
    protected Position position;
    protected boolean traversable; /*Pode passar por cima?*/
    protected boolean killOnTouch;       /*Se encostar, morre?*/
    protected EventBus eventBus;

    protected Element(EventBus eventBus, Position position) {
        this.eventBus = eventBus;
        this.position = position;
    }

    protected Element(EventBus eventBus) {
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
}
