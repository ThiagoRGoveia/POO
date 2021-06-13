package Tools.Events;

import Controls.Screen;
import Model.Element;
import Tools.InteractionMap;

public class CreateElementsEvent implements Event {

    public void fire(Screen screen, Element... elements) {
        for (Element element: elements) {
            InteractionMap interactionMap = screen.getInteractionMap();
            if (interactionMap.get(element.getPosition()) == null) { // Somente criar o elemento se posição estiver vazia
                System.out.println("ADD");
                screen.addElement(element);
                interactionMap.insert(element.getPosition(), element);
            }
        }
    }
}
