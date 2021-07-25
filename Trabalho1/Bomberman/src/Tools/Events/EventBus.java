package Tools.Events;
import java.io.Serializable;
import java.util.LinkedHashMap;
import Controls.Screen;
import Model.Element;

// Esta classe é responsável guardar as instancias dos eventos e
// injetar a instancia de Screen na execução do evento. Esta abstração
// permite desacoblar a lógica que envolve manipulação das classes Element e Screen
public class EventBus implements Serializable {
    private LinkedHashMap<String,Event> eventMap;
    private Screen screen;
    private static EventBus instance;

    public EventBus() throws Exception {
        throw new Exception("EventBus não pode ser instanciado diretamente");
    }

    private EventBus(Screen screen, int size) {
        eventMap = new LinkedHashMap<String,Event>(size);
        this.screen = screen;
    }

    public void on(String name, Event event) { // Permite registrar um evento
        eventMap.put(name, event);
    }

    public void off(String name) { // Permite desregistrar um evento
        eventMap.remove(name);
    }

    public void emit(String name, Element element) { // Permite disparar um evento
        Event event = eventMap.get(name);
        if (event != null) {
            event.fire(this.screen, element);
        }
    }

    public static void setInstance(Screen screen, int size) {
        if (instance == null) {
            instance = new EventBus(screen, size);
        }
    }

    public static EventBus getInstance() {
        return instance;
    }
}
