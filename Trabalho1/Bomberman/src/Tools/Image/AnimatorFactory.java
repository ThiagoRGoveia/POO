package Tools.Image;

import java.util.LinkedHashMap;

import Model.*;
import Model.Explosions.*;
import Model.Explosions.Directions.*;
import Tools.Image.Boundaries.BoundaryFactory;

public class AnimatorFactory {
    private BoundaryFactory boundaryFactory;
    private LinkedHashMap<String,Animator> animatorMap;

    public AnimatorFactory(BoundaryFactory boundaryFactory) {
        this.boundaryFactory = boundaryFactory;
        animatorMap = new LinkedHashMap<String,Animator>(8);

        animatorMap.put("bomb", setBomb());
        animatorMap.put("first-explosion", setFirstExplosion());
        animatorMap.put("horizontal-left-last-explosion", setHoriziontalLeftLastExplosion());
        animatorMap.put("horizontal-right-last-explosion", setHorizontalRightLastExplosion());
        animatorMap.put("vertical-up-last-explosion", setVerticalUpLastExplosion());
        animatorMap.put("vertical-down-last-explosion", setVerticalDownLastExplosion());
        animatorMap.put("horizontal-middle-explosion", setHorizontalMiddleExplosion());
        animatorMap.put("vertical-middle-explosion", setVerticalMiddleExplosion());
    }

    public Animator setBomb() {
        return new Animator(
            "all.png",
            3,
            true,
            500,
            boundaryFactory.getBombBoundaries()
        );
    }

    public Animator setFirstExplosion() {
        return new Animator(
            "all.png",
            5,
            false,
            50,
            boundaryFactory.getFirstExplosionBoundaries()
        );
    }

    public Animator setHoriziontalLeftLastExplosion() {
        return new Animator(
            "all.png",
            5,
            false,
            50,
            boundaryFactory.getHoriziontalLeftLastExplosionBoundaries()
        );
    }

    public Animator setHorizontalMiddleExplosion() {
        return new Animator(
            "all.png",
            5,
            false,
            50,
            boundaryFactory.getHorizontalMiddleExplosionsionBoundaries()
        );
    }

    public Animator setHorizontalRightLastExplosion() {
        return new Animator(
            "all.png",
            5,
            false,
            50,
            boundaryFactory.getHorizontalRightLastExplosionBoundaries()
        );
    }

    public Animator setVerticalDownLastExplosion() {
        return new Animator(
            "all.png",
            5,
            false,
            50,
            boundaryFactory.getVerticalDownLastExplosionsionBoundaries()
        );
    }

    public Animator setVerticalMiddleExplosion() {
        return new Animator(
            "all.png",
            5,
            false,
            50,
            boundaryFactory.getVerticalMiddleExplosionsionBoundaries()
        );
    }

    public Animator setVerticalUpLastExplosion() {
        return new Animator(
            "all.png",
            5,
            false,
            50,
            boundaryFactory.getVerticalUpLastExplosionsionBoundaries()
        );
    }

    public Animator getAnimator(String name) {
        return animatorMap.get(name);
    }
}
