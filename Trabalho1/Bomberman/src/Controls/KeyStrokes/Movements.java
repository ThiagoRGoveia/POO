package Controls.KeyStrokes;
import java.util.LinkedHashMap;
import java.awt.event.KeyEvent;
import Model.Hero;

public class Movements {
    private LinkedHashMap<Integer,KeyStroke> keyStrokeMap;

    public Movements() {
        keyStrokeMap = new LinkedHashMap<Integer,KeyStroke>(4);
        keyStrokeMap.put(KeyEvent.VK_UP, new MoveUp());
        keyStrokeMap.put(KeyEvent.VK_DOWN, new MoveDown());
        keyStrokeMap.put(KeyEvent.VK_RIGHT, new MoveRight());
        keyStrokeMap.put(KeyEvent.VK_LEFT, new MoveLeft());
        keyStrokeMap.put(KeyEvent.VK_E, new PlaceBomb());
    }

    public void makeMovement(KeyEvent keyEvent, Hero hero) {
        KeyStroke keyStroke = keyStrokeMap.get(keyEvent.getKeyCode());
        if (keyStroke != null) {
            keyStroke.execute(hero);
        }
    }

}
