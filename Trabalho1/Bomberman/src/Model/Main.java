package Model;



import Controls.GameManager;
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
                gm.start();
            }
        });

    }
}


