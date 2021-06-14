package Tools.Image;

import java.util.LinkedHashMap;

public class AnimatorFactory {
    private LinkedHashMap<String,Creatable> animatorMap;
    private ImageFactory imageLoader;

    public AnimatorFactory(ImageFactory imageLoader) {
        animatorMap = new LinkedHashMap<String,Creatable>(8);
        this.imageLoader = imageLoader;

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
                imageLoader.getImageList("bomb")
              );
            }
    }

    class FirstExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("first-explosion")
         );
}
    }

    class HoriziontalLeftLastExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("horizontal-left-last-explosion")
         );
}
    }

    class HorizontalMiddleExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("horizontal-middle-explosion")
         );
}
    }

    class HorizontalRightLastExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("horizontal-right-last-explosion")
         );
}
    }

    class VerticalDownLastExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("vertical-down-last-explosion")
         );
}
    }

    class VerticalMiddleExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("vertical-middle-explosion")
         );
}
    }

    class VerticalUpLastExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("vertical-up-last-explosion")
         );
}
    }

    public Animator getAnimatorFactory(String name) {
        return animatorMap.get(name).create();
    }
}

