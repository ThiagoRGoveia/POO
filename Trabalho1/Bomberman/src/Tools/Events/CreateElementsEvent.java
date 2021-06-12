package Tools.Events;

import Controls.Screen;
import Model.Element;

public class CreateElementsEvent implements Event {

    public void fire(Screen screen, Element... elements) {
        for (Element element: elements) {
            screen.addElement(element);
        }
    }
}
