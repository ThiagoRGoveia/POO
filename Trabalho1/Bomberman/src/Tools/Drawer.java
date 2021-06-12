package Tools;

import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.ImageIcon;
import Model.Element;

import Controls.Screen;

public class Drawer {
    private Screen screen;

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Screen getScreen() {
        return screen;
    }

    // public void draw(ImageIcon image, int column, int row) {
    public void draw(Element element) {
        Position position = element.getPosition();
        element.getImage().paintIcon(
            screen,
            getScreenGraphics(),
            position.getColumn() * Consts.CELL_SIDE / Consts.HERO_SPEED_FACTOR,
            position.getRow() * Consts.CELL_SIDE / Consts.HERO_SPEED_FACTOR
        );
    }

    private Graphics getScreenGraphics() {
        return screen.getGraphicsBuffer();
    }
}
