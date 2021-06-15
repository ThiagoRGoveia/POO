package Model;


import javax.swing.ImageIcon;

import Model.Enemies.Enemy;

import java.util.Timer;

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
    protected Timer movementTimer;
    protected int keysDown;

    protected MovableElement(EventBus eventBus, Position position) {
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

    public void interact(Hero hero) {
    }

    public void interact(Enemy enemy) {
    }

    public void interact(Explosion explosion) {
    }



    public abstract void setDownAnimator();
    public abstract void setLeftAnimator();
    public abstract void setRightAnimator();
    public abstract void setUpAnimator();
    public abstract void setStopedAnimator();
}
