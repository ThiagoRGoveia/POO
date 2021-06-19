package Tools.Events;

import Controls.Screen;
import Model.Element;
import Tools.InteractionMap;

public class CreateElementsEvent implements Event<Element> {

    public void fire(Screen screen, Element element) {
        InteractionMap interactionMap = screen.getInteractionMap();
        if (interactionMap.get(element.getPosition()) == null) { // Somente criar o elemento se posição estiver vazia
            screen.addElement(element);
            interactionMap.insert(element.getPosition(), element);
        } else {
            element.die();
        }
    }
}
