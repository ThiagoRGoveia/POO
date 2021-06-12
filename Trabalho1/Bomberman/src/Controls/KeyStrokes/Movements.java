package Controls.KeyStrokes;
import java.util.LinkedHashMap;
import java.awt.event.KeyEvent;
import Model.Hero;

public class Movements {
    private LinkedHashMap<Integer,KeyStroke> keyStrokeMap;

    public Movements() {
        keyStrokeMap = new LinkedHashMap<>(4);
        keyStrokeMap.put(KeyEvent.VK_UP, new MoveUp());
        keyStrokeMap.put(KeyEvent.VK_DOWN, new MoveDown());
        keyStrokeMap.put(KeyEvent.VK_RIGHT, new MoveRight());
        keyStrokeMap.put(KeyEvent.VK_LEFT, new MoveLeft());
        keyStrokeMap.put(KeyEvent.VK_E, new PlaceBomb());
    }

    public boolean makeMovement(KeyEvent keyEvent, Hero hero) {
        KeyStroke keyStroke = keyStrokeMap.get(keyEvent.getKeyCode());
        if (keyStroke != null) {
            return keyStroke.execute(hero);
        } else {
            return false;
        }
    }

}
