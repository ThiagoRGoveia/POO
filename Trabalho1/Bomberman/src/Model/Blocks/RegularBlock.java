package Model.Blocks;


import Model.AnimatedElement;
import Model.Element;
import Model.Explosion;
import Model.Hero;
import Model.Enemies.Enemy;
import Tools.Events.EventBus;
import Tools.Position.Position;

// Esta classe define um bloco regular
public class RegularBlock extends AnimatedElement {
    protected RegularBlock(EventBus<Element> eventBus, Position position) {
        super(eventBus, position);
        this.setAnimatorName("floor-obstacle");
        eventBus.emit("create-animator", this);
        this.setImmortal(false);
        this.setTraversable(false);
    }

    public RegularBlock(EventBus<Element> eventBus, int row, int column) {
        this(eventBus, new Position(row, column));
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
        eventBus.emit(
            "create-element",
            new ExplodingBlock(eventBus, this.position)
        );
     }

    public void die() {
        super.die();
        createBlockExplosion();
    }

}
