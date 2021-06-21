package Model;

import java.util.TimerTask;

import Model.Enemies.Enemy;
import Model.Explosions.Directions.*;
import Tools.Schedule;
import Tools.Events.EventBus;
import Tools.Position.Position;

// Esta classe define a explosão de uma bomba
public abstract class Explosion extends AnimatedElement {
    protected int intensity;

    protected Explosion(EventBus<Element> eventBus, Position position, int intensity) {
        super(eventBus, position);
        this.intensity = intensity;
        this.setTraversable(true);
    }

    public abstract void propagateExplosion(int intensity); // Toda explosão que não for a final devera se propagar
    public void changeToLastExplosion() {
        setExplosionFinishTimer();
    }


    public void interact(Hero hero) { // Quando um herói interage com uma explosão ele morre
        hero.die();
    }

    public void interact(Enemy enemy) { // A interação de inimigos com uma explosão é feita na classe Enemy
    }

    public void interact(Explosion explosion) {
    }

    // Explosões podem ser propagadas nas quatro direções
    // dependendo da interação com o mapa
    protected void propagateUp(int intensity) {
        Explosion explodeUp;
        Position newPosition = new Position(
            this.position.getRow().getCoordinate().value - 1,
            this.position.getColumn().getCoordinate().value
        );
        if (!Position.isPositionOutOfBoundaries(newPosition)) {
            if (intensity == 0) {
                explodeUp = new VerticalUpLastExplosion(eventBus, newPosition);
            } else {
                explodeUp = new VerticalUpMiddleExplosion(eventBus, intensity - 1, newPosition);
            }
            this.eventBus.emit("create-explosion", explodeUp);
        }
        setExplosionFinishTimer();
    }
    protected void propagateDown(int intensity) {
        Explosion explodeDown;
        Position newPosition = new Position(
            this.position.getRow().getCoordinate().value + 1,
            this.position.getColumn().getCoordinate().value
        );
        if (!Position.isPositionOutOfBoundaries(newPosition)) {
                if (intensity == 0) {
                explodeDown = new VerticalDownLastExplosion(eventBus, newPosition);
            } else {
                explodeDown = new VerticalDownMiddleExplosion(eventBus, intensity - 1, newPosition);
            }
            explodeDown.setPosition(
                position.getRow().getCoordinate().value + 1,
                position.getColumn().getCoordinate().value
            );
            this.eventBus.emit("create-explosion", explodeDown);
        }
        setExplosionFinishTimer();
    }
    protected void propagateLeft(int intensity) {
        Explosion explodeLeft;
        Position newPosition = new Position(
            this.position.getRow().getCoordinate().value,
            this.position.getColumn().getCoordinate().value - 1
        );
        if (!Position.isPositionOutOfBoundaries(newPosition)) {
            if (intensity == 0) {
                explodeLeft = new HoriziontalLeftLastExplosion(eventBus, newPosition);
            } else {
                explodeLeft = new HorizontalLeftMiddleExplosion(eventBus, intensity - 1, newPosition);
            }
            this.eventBus.emit("create-explosion", explodeLeft);
        }
        setExplosionFinishTimer();
    }
    protected void propagateRight(int intensity) {
        Explosion explodeRight;
        Position newPosition = new Position(
            this.position.getRow().getCoordinate().value,
            this.position.getColumn().getCoordinate().value + 1
        );
        if (!Position.isPositionOutOfBoundaries(newPosition)) {
            if (intensity == 0) {
                explodeRight = new HorizontalRightLastExplosion(eventBus, newPosition);
            } else {
                explodeRight = new HorizontalRightMiddleExplosion(eventBus, intensity - 1, newPosition);
            }
            this.eventBus.emit("create-explosion", explodeRight);
        }
        setExplosionFinishTimer();
    }

    // Remove explosão da tela e do mapa de interação
    private void finishExplosion() {
        this.eventBus.emit("remove-element", this);
        this.eventBus.emit("remove-element-from-map", this);
    }

    // Programa final da explosão
    protected void setExplosionFinishTimer() {
        TimerTask task = new TimerTask() {
            public void run() {
                finishExplosion();
            }
        };
        this.createScheduledTask(
            new Schedule(task, 260)
        );
        this.eventBus.emit("create-schedule", this);
    }

    public int getIntensity(){
        return this.intensity;
    }

    public void die() {}
}
