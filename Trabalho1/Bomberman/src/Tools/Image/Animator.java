package Tools.Image;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import java.util.Timer;
import java.util.TimerTask;

// Esta classe controla uma animação, ela é composta por um objeto Timer dedicado,
// ou seja, cada animação roda em uam thread própria. A cada intervalo dado a imagem servida
// é substituída plea seguinte. Os seguntes modos são possíveis: loop, animação única e modo estático.
public class Animator implements Serializable {

    private ArrayList<ImageIcon> images;
    private int imgIndex = 0;
    private int numberOfImages;
    private Timer timer;
    private boolean isLoop;
    private boolean isStatic;
    private long interval;
    private TimerTask timerTask;

    public Animator(boolean isLoop, long interval, ArrayList<ImageIcon> images) {
        this.isLoop = isLoop;
        this.interval = interval;
        this.images = images;
        numberOfImages = images.size();
        isStatic = false;
    }

    public Animator(ImageIcon image) {
        isStatic = true;
        images = new ArrayList<ImageIcon>(1);
        numberOfImages = 1;
        imgIndex = 1;
        images.add(image);
    }

    public void start() {
        if (!this.isStatic) {
            startImageSchedule(isLoop, interval);
        }
    }

    public void stop() {
        if (!this.isStatic) {
            timer.cancel();
        }
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

    public void reset () {
        imgIndex = 0;
    }
}
