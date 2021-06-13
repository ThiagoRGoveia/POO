package Model;

import Model.Explosions.Directions.HoriziontalLeftLastExplosion;
import Model.Explosions.Directions.HorizontalMiddleExplosion;
import Model.Explosions.Directions.HorizontalRightLastExplosion;
import Model.Explosions.Directions.VerticalDownLastExplosion;
import Model.Explosions.Directions.VerticalMiddleExplosion;
import Model.Explosions.Directions.VerticalUpLastExplosion;
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
            explodeUp = new VerticalUpLastExplosion();
        } else {
            explodeUp = new VerticalMiddleExplosion(intensity - 1);
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
            explodeDown = new VerticalDownLastExplosion();
        } else {
            explodeDown = new VerticalMiddleExplosion(intensity - 1);
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
            explodeLeft = new HoriziontalLeftLastExplosion();
        } else {
            explodeLeft = new HorizontalMiddleExplosion(intensity - 1);
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
            explodeRight = new HorizontalRightLastExplosion();
        } else {
            explodeRight = new HorizontalMiddleExplosion(intensity - 1);
        }
        explodeRight.setPosition(
            position.getRow().getCoordinate().value ,
            position.getColumn().getCoordinate().value + 1
        );
        this.eventBus.emit("create-explosion", explodeRight);

    }

}
