package Tools.Image;

import Model.*;
import Model.Explosions.*;
import Model.Explosions.Directions.*;
import Tools.Image.Boundaries.BoundaryFactory;

public class AnimatorFactory {
    private BoundaryFactory boundaryFactory;
    private Animator HorizontalMiddleExplosion;
    private Animator VerticalMiddleExplosion;
    private Animator HoriziontalLeftLastExplosion;
    private Animator HorizontalRightLastExplosion;
    private Animator VerticalDownLastExplosion;
    private Animator VerticalUpLastExplosion;
    private Animator FirstExplosion;
    private Animator Bomb;

    public AnimatorFactory(BoundaryFactory boundaryFactory) {
        this.boundaryFactory = boundaryFactory;
        setBomb();
        setFirstExplosion();
        setHoriziontalLeftLastExplosion();
        setHorizontalMiddleExplosion();
        setHorizontalRightLastExplosion();
        setVerticalDownLastExplosion();
        setVerticalMiddleExplosion();
        setVerticalUpLastExplosion();
    }

    public void setBomb() {
        Bomb = new Animator(
            "all.png",
            3,
            true,
            500,
            boundaryFactory.getBombBoundaries()
        );
    }

    public void setFirstExplosion() {
        FirstExplosion = new Animator(
            "all.png",
            5,
            false,
            50,
            boundaryFactory.getFirstExplosionBoundaries()
        );
    }

    public void setHoriziontalLeftLastExplosion() {
        HoriziontalLeftLastExplosion = new Animator(
            "all.png",
            5,
            false,
            50,
            boundaryFactory.getHoriziontalLeftLastExplosionBoundaries()
        );
    }

    public void setHorizontalMiddleExplosion() {
        HorizontalMiddleExplosion = new Animator(
            "all.png",
            5,
            false,
            50,
            boundaryFactory.getHorizontalMiddleExplosionsionBoundaries()
        );
    }

    public void setHorizontalRightLastExplosion() {
        HorizontalRightLastExplosion = new Animator(
            "all.png",
            5,
            false,
            50,
            boundaryFactory.getHorizontalRightLastExplosionBoundaries()
        );
    }

    public void setVerticalDownLastExplosion() {
        VerticalDownLastExplosion = new Animator(
            "all.png",
            5,
            false,
            50,
            boundaryFactory.getVerticalDownLastExplosionsionBoundaries()
        );
    }

    public void setVerticalMiddleExplosion() {
        VerticalMiddleExplosion = new Animator(
            "all.png",
            5,
            false,
            50,
            boundaryFactory.getVerticalMiddleExplosionsionBoundaries()
        );
    }

    public void setVerticalUpLastExplosion() {
        VerticalUpLastExplosion = new Animator(
            "all.png",
            5,
            false,
            50,
            boundaryFactory.getVerticalUpLastExplosionsionBoundaries()
        );
    }

    public Animator getAnimator(Bomb bomb) {
        return Bomb;
    }

    public Animator getAnimator(FirstExplosion firstExplosion) {
        return FirstExplosion;
    }

    public Animator getAnimator(HoriziontalLeftLastExplosion horiziontalLeftLastExplosion) {
        return HoriziontalLeftLastExplosion;
    }

    public Animator getAnimator(HorizontalRightLastExplosion horizontalRightLastExplosion) {
        return HorizontalRightLastExplosion;
    }

    public Animator getAnimator(HorizontalMiddleExplosion horizontalMiddleExplosion) {
        return HorizontalMiddleExplosion;
    }

    public Animator getAnimator(VerticalDownLastExplosion verticalDownLastExplosion) {
        return VerticalDownLastExplosion;
    }

    public Animator getAnimator(VerticalMiddleExplosion verticalMiddleExplosion) {
        return VerticalMiddleExplosion;
    }

    public Animator getAnimator(VerticalUpLastExplosion verticalUpLastExplosion) {
        return VerticalUpLastExplosion;
    }
}
