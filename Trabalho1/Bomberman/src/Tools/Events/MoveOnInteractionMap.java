package Tools.Events;

import Controls.GameManager;
import Model.Element;
import Model.MovableElement;
import Tools.InteractionMap;

// Permite mover um elemento no mapa de interação
public class MoveOnInteractionMap implements Event{

    public void fire(GameManager gameManager, Element element) {
        MovableElement movableElement = (MovableElement) element;
        InteractionMap interactionMap = gameManager.getInteractionMap();
        interactionMap.remove(movableElement.getPosition());
        interactionMap.insert(movableElement.getNextPosition(), movableElement);
    }

}
