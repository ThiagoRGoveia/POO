package Model;
import javax.swing.ImageIcon;

import Tools.Events.EventBus;
import Tools.Image.Animator;

public class AnimatedElement extends Element {
    protected Animator animator;

    protected AnimatedElement(Animator animator, EventBus eventBus) {
        super(eventBus);
        this.animator = animator;

    }

    public ImageIcon getImage() {
        return animator.getImage();
    }
}
