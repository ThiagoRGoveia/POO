package Tools.Events;
import java.util.LinkedHashMap;

import Controls.Screen;
import Model.Element;

public class EventBus {
    private LinkedHashMap<String,Event> eventMap;
    private Screen screen;

    public EventBus(Screen screen) {
        eventMap = new LinkedHashMap<String,Event>(50);
        this.screen = screen;
    }

    public void on(String name, Event event) {
        eventMap.put(name, event);
    }

    public void emit(String name, Element... elements) {
        Event event = eventMap.get(name);
        if (event != null) {
            event.fire(this.screen, elements);
        }
    }
}
