package Model.Blocks;


import Model.AnimatedElement;
import Model.Explosion;
import Model.Hero;
import Model.Enemies.Enemy;
import Tools.Events.EventBus;
import Tools.Position.Position;

// Esta classe define um bloco regular
public class RegularBlock extends AnimatedElement {
    protected RegularBlock(Position position) {
        super(position);
        this.setAnimatorName("floor-obstacle");
        EventBus.getInstance().emit("create-animator", this);
        this.setImmortal(false);
        this.setTraversable(false);
    }

    public RegularBlock(int row, int column) {
        this(new Position(row, column));
    }

    public void interact(Hero hero) {
    }

    public void interact(Enemy enemy) {
        enemy.changeDirection();
    }

    public void interact(Explosion explosion) {
        this.die();
    }

    private void createBlockExplosion() {
        EventBus.getInstance().emit(
            "create-element",
            new ExplodingBlock(this.position)
        );
     }

    public void die() {
        super.die();
        createBlockExplosion();
    }

}
