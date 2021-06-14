package Tools.Image;

import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import Tools.Consts;
import Tools.Image.Boundaries.Boundaries;

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
    private boolean isLoop;
    private long interval;

    public Animator(boolean isLoop, long interval, ArrayList<ImageIcon> images) {
        this.isLoop = isLoop;
        this.interval = interval;
        this.images = images;
    }

    public void start() {
        startImageSchedule(isLoop, interval);
    }

    public void stop() {
        timer.cancel();
    }

    private void iterateImgIndexLoop() {
        if (++imgIndex == numberOfImages) {
            imgIndex = 0;
        }
    }

    private void iterateImgIndexOnce() {
        if (++imgIndex == numberOfImages) {
            timer.cancel();
            imgIndex--;
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

    public ImageIcon getImage() {
        if (imgIndex == numberOfImages) {
            return images.get(0);
        } else {
            return images.get(imgIndex);
        }
    }
}
