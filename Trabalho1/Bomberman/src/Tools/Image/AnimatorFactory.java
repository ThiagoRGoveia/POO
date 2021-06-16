package Tools.Image;

import java.util.LinkedHashMap;
import java.util.Timer;

public class AnimatorFactory {
    private LinkedHashMap<String,Creatable> animatorMap;
    private ImageFactory imageLoader;
    private Timer timer;

    public AnimatorFactory(ImageFactory imageLoader, Timer timer) {
        animatorMap = new LinkedHashMap<String,Creatable>(8);
        this.imageLoader = imageLoader;
        this.timer = timer;

        animatorMap.put("bomb", new BombAnimator());
        animatorMap.put("first-explosion", new FirstExplosionAnimator());
        animatorMap.put("horizontal-left-last-explosion", new HoriziontalLeftLastExplosionAnimator());
        animatorMap.put("horizontal-right-last-explosion", new HorizontalRightLastExplosionAnimator());
        animatorMap.put("vertical-up-last-explosion", new VerticalUpLastExplosionAnimator());
        animatorMap.put("vertical-down-last-explosion", new VerticalDownLastExplosionAnimator());
        animatorMap.put("horizontal-middle-explosion", new HorizontalMiddleExplosionAnimator());
        animatorMap.put("vertical-middle-explosion", new VerticalMiddleExplosionAnimator());
    }

    class BombAnimator implements Creatable {
        public Animator create() {
            return new Animator(
                true,
                500,
                imageLoader.getImageList("bomb"),
                timer
              );
            }
    }

    class FirstExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("first-explosion"),
                timer
         );
}
    }

    class HoriziontalLeftLastExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("horizontal-left-last-explosion"),
                timer
         );
}
    }

    class HorizontalMiddleExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("horizontal-middle-explosion"),
                timer
         );
}
    }

    class HorizontalRightLastExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("horizontal-right-last-explosion"),
                timer
         );
}
    }

    class VerticalDownLastExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("vertical-down-last-explosion"),
                timer
         );
}
    }

    class VerticalMiddleExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("vertical-middle-explosion"),
                timer
         );
}
    }

    class VerticalUpLastExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("vertical-up-last-explosion"),
                timer
         );
}
    }

    public Animator getAnimator(String name) {
        return animatorMap.get(name).create();
    }
}

