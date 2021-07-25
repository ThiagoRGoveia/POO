package Controls;

import Tools.Image.Animator;
import Tools.Image.AnimatorFactory;
import Tools.Image.ImageFactory;
import Tools.Image.Boundaries.BoundariesFactoryLevel1;

public class AnimatorSingleton {
    private static AnimatorSingleton instance;
    private final AnimatorFactory animatorFactory;

    private AnimatorSingleton() {
        animatorFactory = new AnimatorFactory(
            new ImageFactory(
                new BoundariesFactoryLevel1()
            )
        );
    }

    public static AnimatorSingleton getInstance() {
        if (instance == null) {
            instance = new AnimatorSingleton();
        }
        return instance;
    }

    public static void setImageFactory(ImageFactory imageFactory) {
        getInstance().animatorFactory.setImageFactory(imageFactory);
    }

    public static Animator getAnimator(String name) {
        return getInstance().animatorFactory.getAnimator(name);
    }

}
