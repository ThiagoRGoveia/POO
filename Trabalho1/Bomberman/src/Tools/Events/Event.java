package Tools.Events;

import Controls.Screen;
import Model.Element;

public interface Event {
    public void fire(Screen screen, Element... elements);
}
