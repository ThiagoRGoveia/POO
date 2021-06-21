package Tools.Events;

import Controls.Screen;
import Model.Element;
import Tools.InteractionMap;

//Permite remover um elemento do mapa de interação
public class RemoveFromInteractionMapEvent implements Event<Element>{

    public void fire(Screen screen, Element element) {
        InteractionMap interactionMap = screen.getInteractionMap();
        interactionMap.remove(element.getPosition());
    }

}
