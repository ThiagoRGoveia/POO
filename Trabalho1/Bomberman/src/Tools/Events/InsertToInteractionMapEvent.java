package Tools.Events;

import Controls.GameManager;
import Model.Element;
import Tools.InteractionMap;

// Permite inserir um elemento no mapa de interação
public class InsertToInteractionMapEvent implements Event{

    public void fire(GameManager gameManager, Element element) {
        InteractionMap interactionMap = gameManager.getInteractionMap();
        interactionMap.insert(element.getPosition(), element);
    }

}
