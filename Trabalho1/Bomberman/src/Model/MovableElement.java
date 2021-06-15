package Model;

import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

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

    public void moveUp() {
        if (movementDirection != "up") {
            keysDown++;
            this.movementDirection = "up";
            this.activeAnimator.stop();
            this.activeAnimator = upAnimator;
            activeAnimator.start();

            if (this.movementTimer != null) {
                this.movementTimer.cancel();
            }
            TimerTask task = new TimerTask() {
                public void run() {
                    position.moveUp();
                }
            };
            this.movementTimer = new Timer();
            this.movementTimer.schedule(task, 0, 10);
        }
    }

    public void moveDown() {
        if (movementDirection != "down") {
            keysDown++;
            this.movementDirection = "down";
            this.activeAnimator.stop();
            this.activeAnimator = downAnimator;
            this.activeAnimator.start();

            if (this.movementTimer != null) {
                this.movementTimer.cancel();
            }
            TimerTask task = new TimerTask() {
                public void run() {
                    position.moveDown();
                }
            };
            this.movementTimer = new Timer();
            this.movementTimer.schedule(task, 0, 10);
        }
    }

    public void moveRight() {
        if (movementDirection != "right") {
            keysDown++;
            this.movementDirection = "right";
            this.activeAnimator.stop();
            this.activeAnimator = rightAnimator;
            this.activeAnimator.start();

            if (this.movementTimer != null) {
                this.movementTimer.cancel();
            }
            TimerTask task = new TimerTask() {
                public void run() {
                    position.moveRight();
                }
            };
            this.movementTimer = new Timer();
            this.movementTimer.schedule(task, 0, 10);
        }
    }

    public void moveLeft() {
        if (movementDirection != "left") {
            keysDown++;
            this.movementDirection = "left";
            this.activeAnimator.stop();
            this.activeAnimator = leftAnimator;
            this.activeAnimator.start();

            if (this.movementTimer != null) {
                this.movementTimer.cancel();
            }
            TimerTask task = new TimerTask() {
                public void run() {
                    position.moveLeft();
                }
            };
            this.movementTimer = new Timer();
            this.movementTimer.schedule(task, 0, 10);
        }
    }

    public void stop(int key) {
        if (
            (KeyEvent.VK_UP == key && this.movementDirection == "up") ||
            (KeyEvent.VK_DOWN == key && this.movementDirection == "down") ||
            (KeyEvent.VK_LEFT == key && this.movementDirection == "left") ||
            (KeyEvent.VK_RIGHT == key && this.movementDirection == "right")
        ){
            this.activeAnimator.stop();
            this.movementTimer.cancel();
        }
        if (
            KeyEvent.VK_UP == key ||
            KeyEvent.VK_DOWN == key ||
            KeyEvent.VK_LEFT == key ||
            KeyEvent.VK_RIGHT == key
        ) {
            keysDown--;
        }
        if (keysDown <= 0) {
            keysDown = 0;
            movementDirection = "stoped";
            this.activeAnimator = this.stopedAnimator;
        }

    }

    public abstract void setDownAnimator();
    public abstract void setLeftAnimator();
    public abstract void setRightAnimator();
    public abstract void setUpAnimator();
    public abstract void setStopedAnimator();
}
