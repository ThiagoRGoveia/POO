package Model;

import java.io.Serializable;

import Tools.Interactable;
import Tools.Events.EventBus;
import Tools.Image.Drawable;
import Tools.Position.Position;

public abstract class Element implements Serializable, Drawable, Interactable {
    protected Position position;
    protected boolean canBePassedThrough; /*Pode passar por cima?*/
    protected boolean killOnTouch;       /*Se encostar, morre?*/
    protected EventBus eventBus;

    protected Element(EventBus eventBus) {
        position = new Position(1, 1);
        this.eventBus = eventBus;
    }

    public Position getPosition() {
        return position;
    }

    public boolean canBePassedThrough() {
        return canBePassedThrough;
    }

    public void setCanBePassedThrough(boolean canBePassedThrough) {
        this.canBePassedThrough = canBePassedThrough;
    }

    public boolean setPosition(int row, int column) {
        return position.setPosition(row, column);
    }

    public boolean setPosition(Position position) {
        return this.position.setPosition(position);
    }

    public boolean moveUp() {
        return this.position.moveUp();
    }

    public boolean moveDown() {
        return this.position.moveDown();
    }

    public boolean moveRight() {
        return this.position.moveRight();
    }

    public boolean moveLeft() {
        return this.position.moveLeft();
    }

}
