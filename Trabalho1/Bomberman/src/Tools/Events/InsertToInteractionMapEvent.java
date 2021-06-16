package Tools.Events;

import Controls.Screen;
import Model.Element;
import Tools.InteractionMap;

public class InsertToInteractionMapEvent implements Event<Element>{

    public void fire(Screen screen, Element element) {
        InteractionMap interactionMap = screen.getInteractionMap();
        interactionMap.insert(element.getPosition(), element);
    }

}
