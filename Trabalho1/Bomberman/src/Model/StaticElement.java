package Model;

import javax.swing.ImageIcon;

import Tools.Events.EventBus;

public abstract class StaticElement extends Element {
    private ImageIcon image;

    protected StaticElement(EventBus eventBus, ImageIcon image) {
        super(eventBus);
        this.image = image;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

}
