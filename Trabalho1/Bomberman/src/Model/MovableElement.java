package Model;


import javax.swing.ImageIcon;

import Model.Enemies.Enemy;

import java.util.TimerTask;

import Tools.Schedule;
import Tools.Events.EventBus;
import Tools.Image.Animator;

import Tools.Position.Position;

public abstract class MovableElement extends Element {
    protected String movementDirection;
    protected Animator leftAnimator;
    protected Animator rightAnimator;
    protected Animator upAnimator;
    protected Animator downAnimator;
    protected Animator activeAnimator;
    protected Animator stopedAnimator;
    protected TimerTask movementTimer;
    protected int keysDown;
    protected Element interactingElement;
    protected Position nextPosition;


    protected MovableElement(EventBus<Element>eventBus, Position position) {
        super(eventBus, position);
        this.keysDown = 0;
        setDownAnimator();
        setLeftAnimator();
        setRightAnimator();
        setUpAnimator();
        setStopedAnimator();
        this.activeAnimator = this.stopedAnimator;
        activeAnimator.start();
    }

    public ImageIcon getImage() {
        return activeAnimator.getImage();
    }

    public void move(int speed) {
        this.createScheduledTask(
                new Schedule(this.movementTimer, 0, speed)
            );
        this.eventBus.emit("create-schedule-loop", this);
    }

    public void interact(Hero hero) {
    }

    public void interact(Enemy enemy) {
    }

    public void interact(Explosion explosion) {
    }

    public void setInteractingElement(Element interactingElement) {
        this.interactingElement = interactingElement;
    }

    public Element getInteractingElement() {
        return interactingElement;
    }

    public void setNextPosition(Position nextPosition) {
        this.nextPosition = nextPosition;
    }

    public Position getNextPosition() {
        return nextPosition;
    }

    public abstract void setDownAnimator();
    public abstract void setLeftAnimator();
    public abstract void setRightAnimator();
    public abstract void setUpAnimator();
    public abstract void setStopedAnimator();
    public abstract void processMovement();
    public abstract void moveUp();
    public abstract void moveDown();
    public abstract void moveLeft();
    public abstract void moveRight();

}
