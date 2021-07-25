package Tools.Events;

import Controls.Screen;
import Model.Element;

//Permite remover um elemento da tela.
public class RemoveElementsEvent implements Event {
    public void fire(Screen screen, Element element) {
        screen.getInteractionMap().remove(element.getPosition());
        screen.removeElement(element);
    }

}
