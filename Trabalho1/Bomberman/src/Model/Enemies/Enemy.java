package Model.Enemies;

import java.util.Timer;
import java.util.TimerTask;

import Model.Element;
import Model.Explosion;
import Model.Hero;
import Model.MovableElement;
import Tools.Events.EventBus;
import Tools.Position.Position;

public abstract class Enemy extends MovableElement {
    protected Enemy(EventBus<Element>eventBus, Position position) {
        super(eventBus, position, 20);
    }

    public void die() {}

    public void interact(Hero hero) {
        hero.die();
    }

    public void interact(Enemy enemy) {
        // Turn back
    }

    public void interact(Explosion explosion) {
        die();
    }


}
