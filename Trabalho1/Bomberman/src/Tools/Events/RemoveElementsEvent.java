package Tools.Events;

import Controls.GameManager;
import Model.Element;

//Permite remover um elemento da tela.
public class RemoveElementsEvent implements Event {
    public void fire(GameManager gameManager, Element element) {
        gameManager.getInteractionMap().remove(element.getPosition());
        gameManager.removeElement(element);
    }

}
