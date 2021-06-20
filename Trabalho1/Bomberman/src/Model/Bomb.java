package Model;

import java.util.TimerTask;

import Model.Enemies.Enemy;
import Model.Explosions.FirstExplosion;
import Tools.Schedule;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class Bomb extends AnimatedElement {
    private TimerTask explosionTimer;
    private int intensity;
    private Hero hero;

    public Bomb (EventBus<Element> eventBus, int intensity, Position position, Hero hero) {
        super(eventBus,position);
        this.traversable = true;
        this.intensity = intensity;
        this.setAnimatorName("bomb");
        eventBus.emit("create-animator", this);
        setTraversable(true);
        setExplosionTimer();
        this.hero = hero;
    }

    public Bomb(EventBus<Element> eventBus, int intensity, int row, int column, Hero hero) {
        this(eventBus, intensity, new Position(row, column), hero);
    }

    private void setExplosionTimer() {
        explosionTimer = new TimerTask() {
            public void run() {
                explode();
            }
        };
        this.createScheduledTask(
            new Schedule(explosionTimer, 5000)
        );
        this.eventBus.emit("create-schedule", this);
    }

    private void explode() {
        this.hero.decrementNumberOfBombsPlaced();
        this.eventBus.emit("remove-element", this);
        FirstExplosion firstExplosion = new FirstExplosion(eventBus, intensity, this.getPosition());
        this.eventBus.emit("create-explosion", firstExplosion);
    }

    public void interact(Hero hero) {
        if (!this.position.equals(hero.position) && this.isTraversable()) {
            this.setTraversable(false);
        }
    }

    public void interact(Enemy enemy) {
        enemy.changeDirection();
    }

    // Se uma bomba for atingiida por outra ela deve explodir imediatamente
    public void interact(Explosion explosion) {
        this.explosionTimer.cancel();
        this.explode();
    }

    public void die() {
        hero.decrementNumberOfBombsPlaced();
        explosionTimer.cancel();
    }


}
