package Model;

import javax.swing.ImageIcon;

import Tools.Events.EventBus;
import Tools.Position.Position;

public abstract class StaticElement extends Element {
    private ImageIcon image;

    protected StaticElement(EventBus<Element>eventBus, ImageIcon image, Position position) {
        super(eventBus, position);
        this.image = image;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

}
