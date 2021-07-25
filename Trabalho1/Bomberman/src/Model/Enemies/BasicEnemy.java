package Model.Enemies;

import java.util.ArrayList;
import Tools.RandomSingleton;
import Tools.Position.Position;
import Tools.Image.Animator;
import Controls.AnimatorSingleton;

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
        this.downAnimator = AnimatorSingleton.getAnimator("enemy-vertical-down-movement");
    }

    public void setLeftAnimator() {
        this.leftAnimator = AnimatorSingleton.getAnimator("enemy-horizontal-left-movement");
    }

    public void setRightAnimator() {
        this.rightAnimator = AnimatorSingleton.getAnimator("enemy-horizontal-right-movement");
    }

    public void setUpAnimator() {
        this.upAnimator = AnimatorSingleton.getAnimator("enemy-vertical-up-movement");
    }

    public void setStopedAnimatorList() {
        stopedAnimatorList = new ArrayList<Animator>(4);
        stopedAnimatorList.add(this.downAnimator);
        stopedAnimatorList.add(this.upAnimator);
        stopedAnimatorList.add(this.leftAnimator);
        stopedAnimatorList.add(this.rightAnimator);
    }

}
