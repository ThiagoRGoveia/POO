package Model;

import Model.Explosions.Directions.*;
import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Position.Position;

public abstract class Explosion extends AnimatedElement {
    protected int intensity;

    protected Explosion(Animator animator, EventBus eventBus) {
        super(animator, eventBus);
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
            explodeUp = new VerticalUpLastExplosion(eventBus);
        } else {
            explodeUp = new VerticalUpMiddleExplosion(eventBus, intensity - 1);
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
            explodeDown = new VerticalDownLastExplosion(eventBus);
        } else {
            explodeDown = new VerticalDownMiddleExplosion(eventBus, intensity - 1);
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
            explodeLeft = new HoriziontalLeftLastExplosion(eventBus);
        } else {
            explodeLeft = new HorizontalLeftMiddleExplosion(eventBus, intensity - 1);
        }
        explodeLeft.setPosition(
            position.getRow().getCoordinate().value,
            position.getColumn().getCoordinate().value - 1
        );
        this.eventBus.emit("create-explosion",explodeLeft);

    }
    protected void propagateRight() {
        Position position = this.getPosition();
        Explosion explodeRight;
        if (intensity == 0) {
            explodeRight = new HorizontalRightLastExplosion(eventBus);
        } else {
            explodeRight = new HorizontalRightMiddleExplosion(eventBus, intensity - 1);
        }
        explodeRight.setPosition(
            position.getRow().getCoordinate().value ,
            position.getColumn().getCoordinate().value + 1
        );
        this.eventBus.emit("create-explosion", explodeRight);
    }
}
