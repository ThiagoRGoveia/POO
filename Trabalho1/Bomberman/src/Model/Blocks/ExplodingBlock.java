package Model.Blocks;

import Model.AnimatedElement;
import Model.Element;
import Model.Explosion;
import Model.Hero;
import Model.Enemies.Enemy;
import Tools.Events.EventBus;
import Tools.Position.Position;

// Esse elemento substituirá um block recém destruído
public class ExplodingBlock extends AnimatedElement {

    protected ExplodingBlock(EventBus<Element> eventBus, Position position) {
        super(eventBus, position);
    }

    public void interact(Hero hero) {
    }

    public void interact(Enemy enemy) {
    }

    public void interact(Explosion explosion) {
    }

}
