package Model;



import Controls.Screen;
import Tools.Drawer;
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


