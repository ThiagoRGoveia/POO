package Controls.KeyStrokes;
import java.util.LinkedHashMap;
import java.awt.event.KeyEvent;
import Model.Element;

public class Movements {
    private LinkedHashMap<Integer,KeyStroke> keyStrokeMap;

    public Movements() {
        keyStrokeMap = new LinkedHashMap<>(4);
        keyStrokeMap.put(KeyEvent.VK_UP, new MoveUp());
        keyStrokeMap.put(KeyEvent.VK_DOWN, new MoveDown());
        keyStrokeMap.put(KeyEvent.VK_RIGHT, new MoveRight());
        keyStrokeMap.put(KeyEvent.VK_LEFT, new MoveLeft());
    }

    public boolean makeMovement(KeyEvent keyEvent, Element element) {
        KeyStroke keyStroke = keyStrokeMap.get(keyEvent.getKeyCode());
        if (keyStroke != null) {
            return keyStroke.execute(element);
        } else {
            return false;
        }
    }

}
