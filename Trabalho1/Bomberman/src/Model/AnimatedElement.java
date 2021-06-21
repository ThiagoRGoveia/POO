package Model;
import javax.swing.ImageIcon;

import Tools.Events.EventBus;
import Tools.Image.Animator;
import Tools.Position.Position;


// Esta classe define um elemento animado
public abstract class AnimatedElement extends Element {
    protected Animator animator;
    protected String animatorName;

    protected AnimatedElement(EventBus<Element>eventBus, Position position) {
        super(eventBus, position);

    }

    public void setAnimator(Animator animator) {
        this.animator = animator;
    }

    public void setAnimatorName(String animatorName) {
        this.animatorName = animatorName;
    }

    public Animator getAnimator() {
        return animator;
    }

    public ImageIcon getImage() {
        return animator.getImage();
    }

    public String getAnimatorName() {
        return animatorName;
    }
}
