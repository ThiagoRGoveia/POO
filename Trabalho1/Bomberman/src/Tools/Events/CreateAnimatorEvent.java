package Tools.Events;

import Controls.Screen;
import Model.AnimatedElement;
import Model.Element;
import Tools.Image.Animator;

// Permite que o elemento peça um animador específico,
// varios animadores podem ser obtidos ao disparar esse evento
// sequencialmente, bastando que os animadores resultantes sejam
// salvos em outra propriedade entre cada chamada
public class CreateAnimatorEvent implements Event {
    public void fire(Screen screen, Element element) {
       AnimatedElement animatedElement = (AnimatedElement) element;
       Animator animator = screen.getAnimator(animatedElement.getAnimatorName());
       if (animator != null) {
           animator.start();
           animatedElement.setAnimator(animator);
       }
    }

}
