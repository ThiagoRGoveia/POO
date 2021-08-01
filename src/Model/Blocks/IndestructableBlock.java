package Model.Blocks;

import Model.AnimatedElement;
import Model.Explosion;
import Model.Hero;
import Model.Enemies.Enemy;
import Tools.Position.Position;
import Controls.AnimatorSingleton;

// Esta classe define um bloco indestrutível
public class IndestructableBlock extends AnimatedElement {
    protected IndestructableBlock(Position position) {
        super(position);
        this.setAnimatorName("indestructable-obstacle");
        this.animator = AnimatorSingleton.getAnimator("indestructable-obstacle");
        this.setImmortal(true);
        this.setTraversable(false);
    }

    public IndestructableBlock(int row, int column) {
        this(new Position(row, column));
    }

    public void interact(Hero hero) {
    }

    public void interact(Enemy enemy) {
        enemy.changeDirection();
    }

    public void interact(Explosion explosion) {
    }

    public void die() {
    }

}
