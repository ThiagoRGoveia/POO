package Tools.Events;

import Controls.Screen;
import Model.AnimatedElement;
import Model.Element;
import Tools.Image.Animator;

public class CreateAnimatorEvent implements Event {
    public void fire(Screen screen, Element... elements) {
       AnimatedElement element = (AnimatedElement) elements[0];
       Animator animator = screen.getAnimator(element.getAnimatorName());
       if (animator != null) {
           element.setAnimator(animator);
       }

    }

}
