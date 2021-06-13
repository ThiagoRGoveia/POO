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
    private Timer timer;

    public Animator(String imageName, int numberOfImages, boolean isLoop, long interval, Boundaries... boundaries) {
        this.numberOfImages = numberOfImages;
        images = new ArrayList<ImageIcon>(numberOfImages);
        loadImages(imageName, boundaries);
        startImageSchedule(isLoop, interval);
    }

    private void iterateImgIndexLoop() {
        if (imgIndex++ == numberOfImages) {
            imgIndex = 0;
        }
    }

    private void iterateImgIndexOnce() {
        if (imgIndex++ == numberOfImages) {
            timer.cancel();
        }
    }

    private TimerTask getLoopTimerTask() {
        return new TimerTask() {
            public void run() {
                iterateImgIndexLoop();
            }
        };
    }

    private TimerTask getOneTimeTimerTask() {
        return new TimerTask() {
            public void run() {
                iterateImgIndexOnce();
            }
        };
    }

    private void startImageSchedule(boolean isLoop, long interval) {
        TimerTask changeImageTask;
        if (isLoop) {
            changeImageTask = getLoopTimerTask();
        } else {
            changeImageTask = getOneTimeTimerTask();
        }
        timer = new Timer();
        timer.schedule(changeImageTask, 0, interval);
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
