package Model.Blocks;

import javax.swing.ImageIcon;

import Model.Element;
import Model.Explosion;
import Model.Hero;
import Model.StaticElement;
import Model.Enemies.Enemy;
import Tools.Events.EventBus;
import Tools.Position.Position;


public class IndestructableBlock extends StaticElement {

    protected IndestructableBlock(EventBus<Element> eventBus, ImageIcon image, Position position) {
        super(eventBus, image, position);
    }

    public void interact(Hero hero) {
    }

    public void interact(Enemy enemy) {
        enemy.changeDirection();
    }

    public void interact(Explosion explosion) {
    }

}
