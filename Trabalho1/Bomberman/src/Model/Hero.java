package Model;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import Model.Enemies.Enemy;

import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.KeyEvent;

import Tools.Events.EventBus;
import Tools.Position.Column;
import Tools.Position.Coordinate;
import Tools.Position.HeroHitBox;
import Tools.Position.Position;
import Tools.Position.Row;
import Tools.Image.Animator;
import Tools.Image.LoadImage;
import Tools.Image.Boundaries.Boundaries;
public class Hero extends MovableElement {
    private int speed;
    private Timer timer;

    public Hero(EventBus<Element>eventBus, Position position, Timer timer) {
        super(eventBus, position);
        this.setTraversable(true);
        this.speed = 10;
        this.timer = timer;
        this.setHitBox(new HeroHitBox(this.position));
    }

    public Hero(EventBus<Element>eventBus, int row, int column, Timer timer) {
        this(eventBus, new Position(row, column), timer);
    }

    public void resetToLastPosition(){
        this.position.reset();
    }

    public void placeBomb() {
        Bomb bomb = new Bomb(
            this.eventBus,
            5,
            new Position(
                new Row(
                    new Coordinate(
                        this.position.getRow().getCoordinate().value
                    )
                ),
                new Column(
                    new Coordinate(
                        this.position.getColumn().getCoordinate().value
                    )
                )
            )
        );

        this.eventBus.emit("create-element", bomb);
    }

    public void interact(Hero hero) {}

    public void interact(Enemy enemy) {}

    public void interact(Explosion explosion) {}

    public void die() {}

    public void pickup(){}

    public void moveUp() {
        if (movementDirection != "up") {
            changeAnimatorAndKillMovement(upAnimator, "up");
            this.movementTimer = new TimerTask() {
                public void run() {
                    nextPosition = position.getMovementUp();
                    processMovement();
                }
            };
            this.move(this.speed);
        }
    }

    public void moveDown() {
        if (movementDirection != "down") {
            changeAnimatorAndKillMovement(downAnimator, "down");
            this.movementTimer = new TimerTask() {
                public void run() {
                    nextPosition = position.getMovementDown();
                    processMovement();
                }
            };
            this.move(this.speed);
        }
    }

    public void moveRight() {
        if (movementDirection != "right") {
            changeAnimatorAndKillMovement(rightAnimator, "right");
            this.movementTimer = new TimerTask() {
                public void run() {
                    nextPosition = position.getMovementRight();
                    processMovement();
                }
            };
            this.move(this.speed);
        }
    }

    public void moveLeft() {
        if (movementDirection != "left") {
            changeAnimatorAndKillMovement(leftAnimator, "left");
            movementTimer = new TimerTask() {
                public void run() {
                    nextPosition = position.getMovementLeft();
                    processMovement();
                }
            };
            this.move(this.speed);
        }
    }

    public void processMovement() {
        if (!Position.isPositionOutOfBoundaries(this.nextPosition)) {
            this.setHitBox(
                new HeroHitBox(this.nextPosition)
            );
            this.eventBus.emit("verify-element-interaction", this);
            if (this.interactingElement != null && this.interactingElement != this) {
                this.interactingElement.interact(this);
                if (this.interactingElement.isTraversable()) {
                    this.position.setPosition(this.nextPosition);
                }
            } else {
                this.position.setPosition(this.nextPosition);
            }
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
            this.setStopedAnimator();
            movementDirection = "stoped";
        }

    }

    private void changeAnimatorAndKillMovement(Animator animator, String direction) {
        keysDown++;
        this.movementDirection = direction;
        this.activeAnimator.stop();
        this.activeAnimator = animator;
        activeAnimator.start();
        if (this.movementTimer != null) {
            this.movementTimer.cancel();
        }
    }

    public void setDownAnimator() {
        ArrayList<ImageIcon> images = new ArrayList<ImageIcon>(2);
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(56, 45, 16, 24)));
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(87, 45, 16, 24)));
        this.downAnimator = new Animator(true, 300, images, timer);
    }

    public void setLeftAnimator() {
        ArrayList<ImageIcon> images = new ArrayList<ImageIcon>(2);
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(19, 45, 16, 24)));
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(35, 45, 16, 24)));
        this.leftAnimator = new Animator(true, 300, images, timer);
    }

    public void setRightAnimator() {
        ArrayList<ImageIcon> images = new ArrayList<ImageIcon>(2);
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(122, 47, 16, 24)));
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(138, 47, 16, 24)));
        this.rightAnimator = new Animator(true, 300, images, timer);
    }

    public void setUpAnimator() {
        ArrayList<ImageIcon> images = new ArrayList<ImageIcon>(2);
        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(57, 20, 16, 24)));

        images.add(LoadImage.loadImageFromFile("heros.png", new Boundaries(89, 20, 16, 24)));
        this.upAnimator = new Animator(true, 300, images, timer);
    }

    public void setStopedAnimator() {
        Animator animator;
        if (this.movementDirection == "right") {
            animator = stopedAnimatorList.get(3);
        }
        else if (this.movementDirection == "left") {
            animator = stopedAnimatorList.get(2);
        }
        else if (this.movementDirection == "up") {
            animator = stopedAnimatorList.get(1);
        }
        else {
            animator = stopedAnimatorList.get(0);
        }
        this.activeAnimator = animator;
    }

    public void setStopedAnimatorList() {
        stopedAnimatorList = new ArrayList<Animator>();
        stopedAnimatorList.add(new Animator(LoadImage.loadImageFromFile("heros.png", new Boundaries(71, 45, 16, 24)))); // DOWN
        stopedAnimatorList.add(new Animator(LoadImage.loadImageFromFile("heros.png", new Boundaries(73, 20, 16, 24)))); // UP
        stopedAnimatorList.add(new Animator(LoadImage.loadImageFromFile("heros.png", new Boundaries(3, 45, 16, 24)))); // LEFT
        stopedAnimatorList.add(new Animator(LoadImage.loadImageFromFile("heros.png", new Boundaries(106, 47, 16, 24)))); // RIGHT
    }


}
