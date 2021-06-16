package Tools.Events;

import Controls.Screen;
import Model.AnimatedElement;
import Model.Element;
import Tools.Image.Animator;

public class CreateAnimatorEvent implements Event<Element> {
    public void fire(Screen screen, Element element) {
       AnimatedElement animatedElement = (AnimatedElement) element;
       Animator animator = screen.getAnimator(animatedElement.getAnimatorName());
       if (animator != null) {
           animator.start();
           animatedElement.setAnimator(animator);
       }
    }

}
