package Model.Enemies;

import java.util.ArrayList;
import Tools.RandomSingleton;
import Tools.Events.EventBus;
import Tools.Position.Position;
import Tools.Image.Animator;

// Define animações dos inimigos
public class BasicEnemy extends Enemy {

    protected BasicEnemy(Position position) {
        super(position);
        int nextDirection = RandomSingleton.getInstance().nextInt(4);
        this.movementDirection = Enemy.directions[nextDirection];
    }

    public BasicEnemy(int row, int column) {
        this(new Position(row, column));
    }


    public void setDownAnimator() {
        this.setAnimatorName("enemy-vertical-down-movement");
        EventBus.getInstance().emit("create-animator", this);
        this.downAnimator = this.animator;
    }

    public void setLeftAnimator() {
        this.setAnimatorName("enemy-horizontal-left-movement");
        EventBus.getInstance().emit("create-animator", this);
        this.leftAnimator = this.animator;
    }

    public void setRightAnimator() {
        this.setAnimatorName("enemy-horizontal-right-movement");
        EventBus.getInstance().emit("create-animator", this);
        this.rightAnimator = this.animator;
    }

    public void setUpAnimator() {
        this.setAnimatorName("enemy-vertical-up-movement");
        EventBus.getInstance().emit("create-animator", this);
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
