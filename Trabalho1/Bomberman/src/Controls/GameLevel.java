package Controls;

import Tools.Events.EventBus;
import Tools.Image.AnimatorFactory;
import Tools.Image.ImageFactory;
import Model.Element;

public abstract class GameLevel {
    protected ImageFactory imageFactory;
    protected Screen screen;
    protected EventBus<Element> eventBus;

    public GameLevel(Screen screen) {
        this.screen = screen;
        this.eventBus = screen.getEventBus();
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
