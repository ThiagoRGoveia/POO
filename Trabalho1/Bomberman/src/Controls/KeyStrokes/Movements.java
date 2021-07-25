package Controls.KeyStrokes;
import java.util.HashMap;

import Controls.Screen;

import java.awt.event.KeyEvent;
import java.io.Serializable;

// Aqui é possível registrar handlers para as teclas pressionadas
// com  o objetivo de desacoplar essa logica e tirar a responsabilidade da classe Screen
public class Movements implements Serializable {
    private HashMap<Integer,KeyStroke> keyStrokeMap;

    public Movements() {
        keyStrokeMap = new HashMap<Integer,KeyStroke>(8);
        keyStrokeMap.put(KeyEvent.VK_UP, new MoveUp());
        keyStrokeMap.put(KeyEvent.VK_DOWN, new MoveDown());
        keyStrokeMap.put(KeyEvent.VK_RIGHT, new MoveRight());
        keyStrokeMap.put(KeyEvent.VK_LEFT, new MoveLeft());
        keyStrokeMap.put(KeyEvent.VK_E, new PlaceBomb());
        keyStrokeMap.put(KeyEvent.VK_Z, new NextLevel());
        keyStrokeMap.put(KeyEvent.VK_X, new SaveGame());
        keyStrokeMap.put(KeyEvent.VK_C, new LoadGame());
    }

    public void makeMovement(KeyEvent keyEvent, Screen screen) {
        KeyStroke keyStroke = keyStrokeMap.get(keyEvent.getKeyCode());
        if (keyStroke != null) { // Se a tecla foi registrada execute uam ação
            keyStroke.execute(screen);
        }
    }

}
