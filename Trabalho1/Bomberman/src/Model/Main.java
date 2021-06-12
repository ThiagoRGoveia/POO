package Model;


import Controls.Screen;
import Tools.Drawer;
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
        // Position pos = new Position(0,0);
        // Column column = pos.getColumn();
        // System.out.println(pos.getColumn().getScreenPosition());
        // Row row = new Row(50);
        // System.out.println(row.getCoordinate());
        // System.out.println(row.getScreenPosition());
    }
}

