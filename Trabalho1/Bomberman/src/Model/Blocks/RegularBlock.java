package Model.Blocks;

import Model.AnimatedElement;
import Model.Element;
import Model.Explosion;
import Model.Hero;
import Model.Enemies.Enemy;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class RegularBlock extends AnimatedElement {

    protected RegularBlock(EventBus<Element> eventBus, Position position) {
        super(eventBus, position);
    }

    public void interact(Hero hero) {
    }

    public void interact(Enemy enemy) {
        enemy.changeDirection();
    }

    public void interact(Explosion explosion) {
        this.die();
    }

}
