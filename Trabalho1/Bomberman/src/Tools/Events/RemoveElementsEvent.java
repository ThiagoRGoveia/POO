package Tools.Events;

import Controls.Screen;
import Model.Element;

public class RemoveElementsEvent implements Event<Element> {
    public void fire(Screen screen, Element element) {
        screen.getInteractionMap().remove(element.getPosition());
        screen.removeElement(element);
    }

}
