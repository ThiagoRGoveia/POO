package Model;

import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Position.Position;

public abstract class Explosion extends AnimatedElement {
    protected int intensity;

    protected Explosion(Animator animator, EventBus eventBus) {
        super(animator, eventBus);
        //TODO Auto-generated constructor stub
    }


    public void interact(Hero hero) {
    }

    public void interact(Enemy enemy) {
    }

    public void interact(Explosion explosion) {
    }

    protected void propagateUp() {
        Position position = this.getPosition();
        Explosion explodeUp;
        if (intensity == 0) {
            explodeUp = new LastExplosion();
        } else {
            explodeUp = new MiddleExplosion();
        }
        explodeUp.setPosition(
            position.getRow().getCoordinate().value - 1,
            position.getColumn().getCoordinate().value
        );
        this.eventBus.emit("create-explosion", explodeUp);

    }
    protected void propagateDown() {
        Position position = this.getPosition();
        Explosion explodeDown;
        if (intensity == 0) {
            explodeDown = new LastExplosion();
        } else {
            explodeDown = new MiddleExplosion();
        }
        explodeDown.setPosition(
            position.getRow().getCoordinate().value + 1,
            position.getColumn().getCoordinate().value
        );
        this.eventBus.emit("create-explosion", explodeDown);

    }
    protected void propagateLeft() {
        Position position = this.getPosition();
        Explosion explodeLeft;
        if (intensity == 0) {
            explodeLeft = new LastExplosion();
        } else {
            explodeLeft = new MiddleExplosion();
        }
        explodeLeft.setPosition(
            position.getRow().getCoordinate().value,
            position.getColumn().getCoordinate().value - 1
        );
        this.eventBus.emit("create-explosion",explodeLeft);

    }
    protected void propagateright() {
        Position position = this.getPosition();
        Explosion explodeRight;
        if (intensity == 0) {
            explodeRight = new LastExplosion();
        } else {
            explodeRight = new MiddleExplosion();
        }
        explodeRight.setPosition(
            position.getRow().getCoordinate().value ,
            position.getColumn().getCoordinate().value + 1
        );
        this.eventBus.emit("create-explosion", explodeRight);

    }

}
