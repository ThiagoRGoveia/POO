package Tools.Image;

import java.util.ArrayList;
import javax.swing.ImageIcon;

import java.util.Timer;
import java.util.TimerTask;

public class Animator {

    private ArrayList<ImageIcon> images;
    private int imgIndex = 0;
    private int numberOfImages;
    private Timer timer;
    private boolean isLoop;
    private long interval;
    private TimerTask timerTask;

    public Animator(boolean isLoop, long interval, ArrayList<ImageIcon> images, Timer timer) {
        this.isLoop = isLoop;
        this.interval = interval;
        this.images = images;
        numberOfImages = images.size();
        this.timer = timer;
    }

    public void start() {
        startImageSchedule(isLoop, interval);
    }

    public void stop() {
        timer.cancel();
    }

    private void iterateImgIndexLoop() {
        if (++imgIndex >= numberOfImages) {
            imgIndex = 0;
        }
    }

    private void iterateImgIndexOnce() {
        if (++imgIndex >= numberOfImages) {
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
        if (isLoop) {
            timerTask = getLoopTimerTask();
        } else {
            timerTask = getOneTimeTimerTask();
        }
        timer = new Timer();
        timer.schedule(timerTask, 0, interval);
    }

    public ImageIcon getImage() {
        if (imgIndex >= numberOfImages) {
            return images.get(0);
        } else {
            return images.get(imgIndex);
        }
    }
}
