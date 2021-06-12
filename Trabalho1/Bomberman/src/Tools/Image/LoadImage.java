package Tools.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import Tools.Consts;
import java.awt.Graphics;
import java.io.IOException;
import java.io.File;


public class LoadImage {
    public static ImageIcon loadImageFromFile(String imageName, Boundaries boundaries) {
            try {
                BufferedImage bigImg = ImageIO.read(new File(new java.io.File(".").getCanonicalPath() + Consts.PATH + imageName));
                BufferedImage img = bigImg.getSubimage(
                    boundaries.x,
                    boundaries.y,
                    boundaries.width,
                    boundaries.height
                );

                BufferedImage bi = new BufferedImage(Consts.CELL_SIDE, Consts.CELL_SIDE, BufferedImage.TYPE_INT_ARGB);
                Graphics g = bi.createGraphics();
                g.drawImage(img, 0, 0, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
                g.dispose();
            return new ImageIcon(bi);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        return null;
    }
}
