package Model.Enemies;

import java.util.Timer;
import java.util.TimerTask;

import Model.MovableElement;
import Tools.Events.EventBus;
import Tools.Position.Position;

public abstract class Enemy extends MovableElement {
    private int speed;
    protected Enemy(EventBus eventBus, Position position) {
        super(eventBus, position);
        this.speed = 20;
    }

    public void moveUp() {
        this.activeAnimator.stop();
        this.activeAnimator = upAnimator;
        activeAnimator.start();

        if (this.movementTimer != null) {
            this.movementTimer.cancel();
        }
        TimerTask task = new TimerTask() {
            public void run() {
                boolean move = position.moveUp();
                if(!move) {
                    moveDown();
                }
            }
        };
        this.movementTimer = new Timer();
        this.movementTimer.schedule(task, 0, this.speed);
    }

    public void moveDown() {
        this.activeAnimator.stop();
        this.activeAnimator = downAnimator;
        this.activeAnimator.start();

        if (this.movementTimer != null) {
            this.movementTimer.cancel();
        }
        TimerTask task = new TimerTask() {
            public void run() {
                boolean move = position.moveDown();
                if(!move) {
                    moveUp();
                }
            }
        };
        this.movementTimer = new Timer();
        this.movementTimer.schedule(task, 0, this.speed);
    }

    public void moveRight() {
        this.activeAnimator.stop();
        this.activeAnimator = rightAnimator;
        this.activeAnimator.start();

        if (this.movementTimer != null) {
            this.movementTimer.cancel();
        }
        TimerTask task = new TimerTask() {
            public void run() {
                boolean move = position.moveRight();
                if(!move) {
                    moveLeft();
                }
            }
        };
        this.movementTimer = new Timer();
        this.movementTimer.schedule(task, 0, this.speed);
    }

    public void moveLeft() {
        this.activeAnimator.stop();
        this.activeAnimator = leftAnimator;
        this.activeAnimator.start();

        if (this.movementTimer != null) {
            this.movementTimer.cancel();
        }
        TimerTask task = new TimerTask() {
            public void run() {
                boolean move = position.moveLeft();
                if(!move) {
                    moveRight();
                }
            }
        };
        this.movementTimer = new Timer();
        this.movementTimer.schedule(task, 0, this.speed);
    }


}
