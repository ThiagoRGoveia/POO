package Model;
import javax.swing.ImageIcon;

import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Position.Position;

public abstract class AnimatedElement extends Element {
    protected Animator animator;

    protected AnimatedElement(Animator animator, EventBus eventBus, Position position) {
        super(eventBus, position);
        this.animator = animator;

    }

    public ImageIcon getImage() {
        return animator.getImage();
    }
}
