package Model;



import Controls.GameManager;
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
                GameManager gm = new GameManager();
                gm.newScreen();
                gm.start();
            }
        });

    }
}


