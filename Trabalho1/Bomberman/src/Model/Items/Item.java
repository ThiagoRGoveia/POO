package Model.Items;


import Model.AnimatedElement;
import Model.Element;
import Model.Explosion;
import Model.Hero;
import Model.Enemies.Enemy;
import Tools.Events.EventBus;
import Tools.Position.Position;

public abstract class Item extends AnimatedElement implements Pickable {
    protected Item(EventBus<Element> eventBus, Position position) {
        super(eventBus, position);
    }

    public void interact(Hero hero) {
        this.pickUp(hero);
    }

    public void interact(Enemy enemy) {
        enemy.changeDirection();

    }

    public void interact(Explosion explosion) {
        this.die();

    }

}
