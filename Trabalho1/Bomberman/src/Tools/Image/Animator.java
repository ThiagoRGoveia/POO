package Tools.Image;

import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import Tools.Consts;
import java.awt.Graphics;
import java.io.IOException;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class Animator {

    private ArrayList<ImageIcon> images;
    private int imgIndex = 0;
    private int numberOfImages;

    public Animator(String imageName, int numberOfImages, Boundaries... boundaries) {
        this.numberOfImages = numberOfImages;
        images = new ArrayList<ImageIcon>(numberOfImages);
        loadImages(imageName, boundaries);
        startImageSchedule();
    }

    public void iterateImgIndex() {
        if (imgIndex++ == numberOfImages) {
            imgIndex = 0;
        }
    }

    private void startImageSchedule() {
        TimerTask redraw = new TimerTask() {
            public void run() {
                iterateImgIndex();
            }
        };
        Timer timer = new Timer();
        timer.schedule(redraw, 0, 500);
    }

    private void loadImages(String imageName, Boundaries[] boundariesList) {
        for (Boundaries boundaries: boundariesList) {
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
                images.add(new ImageIcon(bi));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public ImageIcon getImage() {
        if (imgIndex == numberOfImages) {
            return images.get(0);
        } else {
            return images.get(imgIndex);
        }
    }
}
