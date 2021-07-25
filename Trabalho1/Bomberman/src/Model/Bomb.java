package Model;

import Controls.SerializableTimerTask;

import Model.Enemies.Enemy;
import Model.Explosions.FirstExplosion;
import Tools.Schedule;
import Tools.Events.EventBus;
import Tools.Position.Position;


// Esta classe define uma bomba
public class Bomb extends AnimatedElement {
    private SerializableTimerTask explosionTimer;
    private int intensity;
    private Hero hero;

    public Bomb (EventBus eventBus, int intensity, Position position, Hero hero) {
        super(eventBus,position);
        this.traversable = true;
        this.intensity = intensity;
        this.setAnimatorName("bomb");
        eventBus.emit("create-animator", this); // pedir animador
        setTraversable(true);
        setExplosionTimer(); // iniciar timer
        this.hero = hero;
    }

    public Bomb(EventBus eventBus, int intensity, int row, int column, Hero hero) {
        this(eventBus, intensity, new Position(row, column), hero);
    }

    private void setExplosionTimer() {
        explosionTimer = new SerializableTimerTask() {
            public void run() {
                explode();
            }
        };
        this.createScheduledTask(
            new Schedule(explosionTimer, 4000) // Explodir depois de 4 segundos
        );
        this.eventBus.emit("create-schedule", this);
    }

    private void explode() {
        this.hero.decrementNumberOfBombsPlaced();
        this.eventBus.emit("remove-element", this);
        FirstExplosion firstExplosion = new FirstExplosion(eventBus, intensity, this.getPosition());
        this.eventBus.emit("create-explosion", firstExplosion);
    }
    // Se tornar intranponível após o heoi sair de cima da bomba
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
