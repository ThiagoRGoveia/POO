package Model;

import Tools.Consts;
import Tools.Position;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.ImageIcon;


public class Element implements Serializable {
    protected ImageIcon image;
    protected Position position;
    protected boolean canBePassedThrough; /*Pode passar por cima?*/
    protected boolean killOnTouch;       /*Se encostar, morre?*/

    protected Element(String imageName) {
        this.position = new Position(1, 1);
        this.canBePassedThrough = true;
        this.killOnTouch = false;
        try {
            image = new ImageIcon(new java.io.File(".").getCanonicalPath() + Consts.PATH + imageName);
            Image img = image.getImage();
            BufferedImage bi = new BufferedImage(Consts.CELL_SIDE, Consts.CELL_SIDE, BufferedImage.TYPE_INT_ARGB);
            Graphics g = bi.createGraphics();
            g.drawImage(img, 0, 0, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
            image = new ImageIcon(bi);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Position getPosition() {
        return position;
    }

    public boolean canPassThrough() {
        return canBePassedThrough;
    }

    public void setCanBePassedThrough(boolean canBePassedThrough) {
        this.canBePassedThrough = canBePassedThrough;
    }

    public boolean setPosition(int row, int column) {
        return position.setPosition(row, column);
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
}