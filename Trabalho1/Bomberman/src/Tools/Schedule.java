package Tools;

import java.util.TimerTask;

public class Schedule {
    public TimerTask timerTask;
    public long delay;
    public long interval;

    public Schedule(TimerTask timerTask, long delay, long interval) {
        this.timerTask = timerTask;
        this.delay = delay;
        this.interval = interval;
    }

    public Schedule(TimerTask timerTask, long delay) {
        this.timerTask = timerTask;
        this.delay = delay;
    }
}
