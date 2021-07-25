package Tools.Events;

import Controls.GameManager;
import Model.Element;
import Tools.InteractionMap;

// Permite criar um elemento no mapa e inseri-lo no mapa de interação
public class CreateElementsEvent implements Event {

    public void fire(GameManager gameManager, Element element) {
        InteractionMap interactionMap = gameManager.getInteractionMap();
        if (interactionMap.get(element.getPosition()) == null) { // Somente criar o elemento se posição estiver vazia
            gameManager.addElement(element);
            interactionMap.insert(element.getPosition(), element);
        } else {
            element.die();
        }
    }
}
