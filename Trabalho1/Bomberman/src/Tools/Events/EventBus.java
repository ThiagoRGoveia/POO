package Tools.Events;
import java.util.LinkedHashMap;
import Controls.Screen;

public class EventBus<T> {
    private LinkedHashMap<String,Event<T>> eventMap;
    private Screen screen;

    public EventBus(Screen screen, int size) {
        eventMap = new LinkedHashMap<String,Event<T>>(size);
        this.screen = screen;
    }

    public void on(String name, Event<T> event) {
        eventMap.put(name, event);
    }

    public void off(String name) {
        eventMap.remove(name);
    }

    public void emit(String name, T t) {
        Event<T> event = eventMap.get(name);
        if (event != null) {
            event.fire(this.screen, t);
        }
    }
}
