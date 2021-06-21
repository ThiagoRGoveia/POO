package Model.Blocks;

import Model.AnimatedElement;
import Model.Element;
import Model.Explosion;
import Model.Hero;
import Model.Enemies.Enemy;
import Tools.Events.EventBus;
import Tools.Position.Position;

// Esta classe define um bloco indestrutível
public class IndestructableBlock extends AnimatedElement {
    protected IndestructableBlock(EventBus<Element> eventBus, Position position) {
        super(eventBus, position);
        this.setAnimatorName("indestructable-obstacle");
        eventBus.emit("create-animator", this);
        this.setImmortal(true);
        this.setTraversable(false);
    }

    public IndestructableBlock(EventBus<Element> eventBus, int row, int column) {
        this(eventBus, new Position(row, column));
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
