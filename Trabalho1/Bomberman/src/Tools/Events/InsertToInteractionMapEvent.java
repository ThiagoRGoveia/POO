package Tools.Events;

import Controls.Screen;
import Model.Element;
import Tools.InteractionMap;

// Permite inserir um elemento no mapa de interação
public class InsertToInteractionMapEvent implements Event{

    public void fire(Screen screen, Element element) {
        InteractionMap interactionMap = screen.getInteractionMap();
        interactionMap.insert(element.getPosition(), element);
    }

}
