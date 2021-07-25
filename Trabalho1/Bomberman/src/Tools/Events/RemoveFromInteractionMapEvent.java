package Tools.Events;

import Controls.GameManager;
import Model.Element;
import Tools.InteractionMap;

//Permite remover um elemento do mapa de interação
public class RemoveFromInteractionMapEvent implements Event{

    public void fire(GameManager gameManager, Element element) {
        InteractionMap interactionMap = gameManager.getInteractionMap();
        interactionMap.remove(element.getPosition());
    }

}
