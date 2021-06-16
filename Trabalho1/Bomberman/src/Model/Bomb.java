package Model;

import java.util.TimerTask;

import Model.Enemies.Enemy;
import Model.Explosions.FirstExplosion;
import Tools.Schedule;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class Bomb extends AnimatedElement {
    private TimerTask traversableCancelationTimer;
    private TimerTask explosionTimer;
    private int intensity;

    public Bomb (EventBus<Element> eventBus, int intensity, Position position) {
        super(eventBus,position);
        this.traversable = true;
        this.intensity = intensity;
        this.setAnimatorName("bomb");
        eventBus.emit("create-animator", this);
        scheduleTraversableChange();
        setExplosionTimer();
    }

    public Bomb(EventBus<Element> eventBus, int intensity, int row, int column) {
        this(eventBus, intensity, new Position(row, column));
    }

    private void turnBlockable() {
        this.traversable = false;
    }

    private void scheduleTraversableChange() {
        traversableCancelationTimer = new TimerTask() {
            public void run() {
                turnBlockable();
            }
        };
        this.createScheduledTask(
            new Schedule(traversableCancelationTimer, 500)
        );
        this.eventBus.emit("create-schedule", this);
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
        this.eventBus.emit("remove-element", this);
        FirstExplosion firstExplosion = new FirstExplosion(eventBus, intensity, this.getPosition());
        this.eventBus.emit("create-explosion", firstExplosion);
    }

    public void interact(Hero hero) {
        if (this.traversableCancelationTimer != null) {
            this.traversableCancelationTimer.cancel();
            this.traversableCancelationTimer = null;
        }
        scheduleTraversableChange();
    }

    public void interact(Enemy enemy) {}

    public void interact(Explosion explosion) {
        this.explosionTimer.cancel();
        this.explode();
    }


}
