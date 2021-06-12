package Model;


import java.util.LinkedHashMap;

import Controls.Screen;
import Tools.Drawer;
import Tools.Events.Event;
import Tools.Events.EventBus;
import Tools.Position.Column;
import Tools.Position.Position;
import Tools.Position.Row;

/**
 *
 * @author junio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Screen screen = new Screen(
                    new Drawer()
                );
                screen.setVisible(true);
                screen.createBufferStrategy(2);
                screen.go();
            }
        });

    }
}


