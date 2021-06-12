package Tools.Events;

import Controls.Screen;
import Model.Element;

public class RemoveElementEvent implements Event {
    public void fire(Screen screen, Element... elements) {
        for (Element element: elements) {
            screen.removeElement(element);
        }
    }

}
