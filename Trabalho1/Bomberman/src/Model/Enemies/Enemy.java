package Model.Enemies;

import java.util.Random;
import java.util.TimerTask;

import Model.Element;
import Model.Explosion;
import Model.Hero;
import Model.MovableElement;
import Tools.Events.EventBus;
import Tools.Position.HitBox;
import Tools.Position.Position;

public abstract class Enemy extends MovableElement {
    protected static String[] directions = {"up", "down", "right", "left"};

    protected Enemy(EventBus<Element>eventBus, Position position) {
        super(eventBus, position, 35);
    }

    public void interact(Hero hero) {
        hero.die();
    }

    public void interact(Enemy enemy) {
        enemy.changeDirection();
    }

    public void interact(Explosion explosion) {
        die();
    }

    public void processMovement() {
        if (!Position.isPositionByTheBoundaries(this.nextPosition)) {
            this.setHitBox(
                new HitBox(this.nextPosition)
            );
            this.eventBus.emit("verify-element-interaction", this);
            if (this.interactingElement != null && this.interactingElement != this) {
                this.interactingElement.interact(this);
                if (this.interactingElement.isTraversable()) {
                    this.updatePosition();
                } else {
                    this.changeDirection();
                }
            } else {
                this.updatePosition();
            }
        } else {
            this.changeDirection();
        }
    }

    public void changeDirection() {
        Random random = new Random();
        int nextDirection = random.nextInt(4);
        while (this.movementDirection == directions[nextDirection]) {
            nextDirection = random.nextInt(4);
        }
        this.movementDirection = directions[nextDirection];
        move();
    }

    protected void move() {
        if (this.movementDirection == "up") {
            this.moveUp();
        } else if (this.movementDirection == "down") {
            this.moveDown();
        } else if (this.movementDirection == "left") {
            this.moveLeft();
        } else if (this.movementDirection == "right") {
            this.moveRight();
        }
    }

    public void moveUp() {
        changeAnimatorAndKillMovement(upAnimator, "up");
        this.movementTimer = new TimerTask() {
            public void run() {
                nextPosition = position.getMovementUp();
                processMovement();
            }
        };
        this.move(this.speed);
    }

    public void moveDown() {
        changeAnimatorAndKillMovement(downAnimator, "down");
        this.movementTimer = new TimerTask() {
            public void run() {
                nextPosition = position.getMovementDown();
                processMovement();
            }
        };
        this.move(this.speed);
    }

    public void moveRight() {
        changeAnimatorAndKillMovement(rightAnimator, "right");
        this.movementTimer = new TimerTask() {
            public void run() {
                nextPosition = position.getMovementRight();
                processMovement();
            }
        };
        this.move(this.speed);
    }

    public void moveLeft() {
        changeAnimatorAndKillMovement(leftAnimator, "left");
        movementTimer = new TimerTask() {
            public void run() {
                nextPosition = position.getMovementLeft();
                processMovement();
            }
        };
        this.move(this.speed);
    }

    public void updatePosition() {
        eventBus.emit("move-element-on-map", this);
        this.position.setPosition(this.nextPosition);
    }

    public void die() {
        this.movementTimer.cancel();
        eventBus.emit("remove-enemy", this);
    }

}
