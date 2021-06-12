package Model;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import Tools.Consts;
import Tools.Events.EventBus;
import Tools.Position.Position;


public class Element implements Serializable {
    protected ImageIcon image;
    protected Position position;
    protected boolean canBePassedThrough; /*Pode passar por cima?*/
    protected boolean killOnTouch;       /*Se encostar, morre?*/
    protected EventBus eventBus;

    protected Element(String imageName, EventBus eventBus) {
        this.position = new Position(1, 1);
        this.canBePassedThrough = true;
        this.killOnTouch = false;
        this.eventBus = eventBus;
        loadImage(imageName);
    }

    public Position getPosition() {
        return position;
    }

    public boolean canBePassedThrough() {
        return canBePassedThrough;
    }

    public void setCanBePassedThrough(boolean canBePassedThrough) {
        this.canBePassedThrough = canBePassedThrough;
    }

    public boolean setPosition(int row, int column) {
        return position.setPosition(row, column);
    }

    public boolean setPosition(Position position) {
        return this.position.setPosition(position);
    }

    public boolean moveUp() {
        return this.position.moveUp();
    }

    public boolean moveDown() {
        return this.position.moveDown();
    }

    public boolean moveRight() {
        return this.position.moveRight();
    }

    public boolean moveLeft() {
        return this.position.moveLeft();
    }

    public ImageIcon getImage() {
        return image;
    }

    private void loadImage(String imageName) {
        try {
            BufferedImage bigImg = ImageIO.read(new File(new java.io.File(".").getCanonicalPath() + Consts.PATH + imageName));
            BufferedImage img = bigImg.getSubimage(
                390,
                151,
                16,
                16
            );

            BufferedImage bi = new BufferedImage(Consts.CELL_SIDE, Consts.CELL_SIDE, BufferedImage.TYPE_INT_ARGB);
            Graphics g = bi.createGraphics();
            g.drawImage(img, 0, 0, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
            g.dispose();
            image = new ImageIcon(bi);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
