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

    public Bomb (int intensity, Position position, Hero hero) {
        super(position);
        this.traversable = true;
        this.intensity = intensity;
        this.setAnimatorName("bomb");
        EventBus.getInstance().emit("create-animator", this); // pedir animador
        setTraversable(true);
        this.hero = hero;
    }

    public Bomb(int intensity, int row, int column, Hero hero) {
        this(intensity, new Position(row, column), hero);
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
        EventBus.getInstance().emit("create-schedule", this);
    }

    private void explode() {
        this.hero.decrementNumberOfBombsPlaced();
        EventBus.getInstance().emit("remove-element", this);
        FirstExplosion firstExplosion = new FirstExplosion(intensity, this.getPosition());
        EventBus.getInstance().emit("create-explosion", firstExplosion);
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

    public void start() {
        setExplosionTimer(); // iniciar timer
        super.start();
    }


}
