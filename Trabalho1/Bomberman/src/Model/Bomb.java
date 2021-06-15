package Model;

import java.util.Timer;
import java.util.TimerTask;

import Model.Enemies.Enemy;
import Model.Explosions.FirstExplosion;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class Bomb extends AnimatedElement {
    private Timer traversableCancelationTimer;
    private Timer explosionTimer;
    private int intensity;

    public Bomb (EventBus eventBus, int intensity, Position position) {
        super(eventBus,position);
        this.traversable = true;
        this.intensity = intensity;
        this.setAnimatorName("bomb");
        eventBus.emit("create-animator", this);
        scheduleTraversableChange();
        setExplosionTimer();
    }

    public Bomb(EventBus eventBus, int intensity, int row, int column) {
        this(eventBus, intensity, new Position(row, column));
    }

    private void turnBlockable() {
        this.traversable = false;
    }

    private void scheduleTraversableChange() {
        TimerTask task = new TimerTask() {
            public void run() {
                turnBlockable();
            }
        };
        this.traversableCancelationTimer = new Timer();
        this.traversableCancelationTimer.schedule(task, 500);
    }

    private void setExplosionTimer() {
        TimerTask task = new TimerTask() {
            public void run() {
                explode();
            }
        };
        this.explosionTimer = new Timer();
        this.explosionTimer.schedule(task, 5000);
    }

    private void explode() {
        this.eventBus.emit("remove-element", this);
        FirstExplosion firstExplosion = new FirstExplosion(eventBus, intensity, this.getPosition());
        this.eventBus.emit("create-explosion", firstExplosion);
    }

    public void interact(Hero hero) {
        this.traversableCancelationTimer.cancel();
        scheduleTraversableChange();
    }

    public void interact(Enemy enemy) {}

    public void interact(Explosion explosion) {
        this.explosionTimer.cancel();
        this.explode();
    }


}
