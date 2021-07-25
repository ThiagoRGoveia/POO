package Controls;

import Tools.Events.EventBus;
import Tools.Image.AnimatorFactory;
import Tools.Image.ImageFactory;

import java.io.Serializable;

import Model.Element;

// Esta classe define as fases do jogo, cada uma de suas filhas sera composta
// por uma classe BoundariesFactoryLevelX que determina as imagens a serem carregadas
public abstract class GameLevel implements Serializable {
    protected ImageFactory imageFactory;
    protected Screen screen;
    protected EventBus eventBus;

    public GameLevel(Screen screen) {
        this.screen = screen;
        this.eventBus = screen.getEventBus();
    }

    public abstract void draw();

    public void begin() {
        screen.setAnimatorFactory(
            new AnimatorFactory(imageFactory)
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
