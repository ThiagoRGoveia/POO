package Model.Enemies;

import java.util.ArrayList;
import java.util.Random;

import Model.Element;
import Tools.Events.EventBus;
import Tools.Position.Position;
import Tools.Image.Animator;

// Define animações dos inimigos
public class BasicEnemy extends Enemy {

    protected BasicEnemy(EventBus eventBus, Position position) {
        super(eventBus, position);
        Random random = new Random();
        int nextDirection = random.nextInt(4);
        this.movementDirection = Enemy.directions[nextDirection];
        this.makeMovement();
    }

    public BasicEnemy(EventBus eventBus, int row, int column) {
        this(eventBus, new Position(row, column));
    }


    public void setDownAnimator() {
        this.setAnimatorName("enemy-vertical-down-movement");
        eventBus.emit("create-animator", this);
        this.downAnimator = this.animator;
    }

    public void setLeftAnimator() {
        this.setAnimatorName("enemy-horizontal-left-movement");
        eventBus.emit("create-animator", this);
        this.leftAnimator = this.animator;
    }

    public void setRightAnimator() {
        this.setAnimatorName("enemy-horizontal-right-movement");
        eventBus.emit("create-animator", this);
        this.rightAnimator = this.animator;
    }

    public void setUpAnimator() {
        this.setAnimatorName("enemy-vertical-up-movement");
        eventBus.emit("create-animator", this);
        this.upAnimator = this.animator;
    }

    public void setStopedAnimatorList() {
        stopedAnimatorList = new ArrayList<Animator>(4);
        stopedAnimatorList.add(this.downAnimator);
        stopedAnimatorList.add(this.upAnimator);
        stopedAnimatorList.add(this.leftAnimator);
        stopedAnimatorList.add(this.rightAnimator);
    }

}
