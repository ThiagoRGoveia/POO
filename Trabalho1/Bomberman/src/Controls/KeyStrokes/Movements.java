package Controls.KeyStrokes;
import java.util.LinkedHashMap;

import Controls.Screen;

import java.awt.event.KeyEvent;

// Aqui é possível registrar handlers para as teclas pressionadas
// com  o objetivo de desacoplar essa logica e tirar a responsabilidade da classe Screen
public class Movements {
    private LinkedHashMap<Integer,KeyStroke> keyStrokeMap;

    public Movements() {
        keyStrokeMap = new LinkedHashMap<Integer,KeyStroke>(6);
        keyStrokeMap.put(KeyEvent.VK_UP, new MoveUp());
        keyStrokeMap.put(KeyEvent.VK_DOWN, new MoveDown());
        keyStrokeMap.put(KeyEvent.VK_RIGHT, new MoveRight());
        keyStrokeMap.put(KeyEvent.VK_LEFT, new MoveLeft());
        keyStrokeMap.put(KeyEvent.VK_E, new PlaceBomb());
        keyStrokeMap.put(KeyEvent.VK_Z, new NextLevel());
    }

    public void makeMovement(KeyEvent keyEvent, Screen screen) {
        KeyStroke keyStroke = keyStrokeMap.get(keyEvent.getKeyCode());
        if (keyStroke != null) { // Se a tecla foi registrada execute uam ação
            keyStroke.execute(screen);
        }
    }

}
