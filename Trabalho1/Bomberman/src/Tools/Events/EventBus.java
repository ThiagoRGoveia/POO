package Tools.Events;
import java.io.Serializable;
import java.util.LinkedHashMap;
import Controls.Screen;

// Esta classe é responsável guardar as instancias dos eventos e
// injetar a instancia de Screen na execução do evento. Esta abstração
// permite desacoblar a lógica que envolve manipulação das classes Element e Screen
public class EventBus<T> implements Serializable {
    private LinkedHashMap<String,Event<T>> eventMap;
    private Screen screen;

    public EventBus(Screen screen, int size) {
        eventMap = new LinkedHashMap<String,Event<T>>(size);
        this.screen = screen;
    }

    public void on(String name, Event<T> event) { // Permite registrar um evento
        eventMap.put(name, event);
    }

    public void off(String name) { // Permite desregistrar um evento
        eventMap.remove(name);
    }

    public void emit(String name, T t) { // Permite disparar um evento
        Event<T> event = eventMap.get(name);
        if (event != null) {
            event.fire(this.screen, t);
        }
    }
}
