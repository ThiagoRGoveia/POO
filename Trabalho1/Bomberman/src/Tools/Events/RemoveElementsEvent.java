package Tools.Events;

import Controls.Screen;
import Model.Element;

public class RemoveElementsEvent implements Event {
    public void fire(Screen screen, Element... elements) {
        for (Element element: elements) {
            screen.getInteractionMap().remove(element.getPosition());
            screen.removeElement(element);
        }
    }

}
