package Controls;

import Tools.Image.AnimatorFactory;
import Tools.Image.ImageFactory;

public abstract class GameLevel {
    protected ImageFactory imageFactory;
    protected Screen screen;

    public GameLevel(Screen screen) {
        this.screen = screen;
    }

    public abstract void draw();

    public void begin() {
        screen.setAnimatorFactory(
            new AnimatorFactory(imageFactory, screen.getTimer())
        );
        draw();
    }

    public ImageFactory getImageFactory() {
        return imageFactory;
    }

    public void setImageFactory(ImageFactory imageFactory) {
        this.imageFactory = imageFactory;
    }
}
