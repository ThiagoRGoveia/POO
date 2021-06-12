package Model;

import java.util.Timer;
import java.util.TimerTask;

import Tools.Events.EventBus;
import Tools.Position.Position;

public class Bomb extends Element {
    public Bomb (EventBus eventBus) {
        super("bomb.png", eventBus);
        this.canBePassedThrough = true;

        schedulePropertyChange();
    }

    private void turnBlockable() {
        this.canBePassedThrough = false;
        System.out.println("BUM");
    }

    private void schedulePropertyChange() {
        TimerTask task = new TimerTask() {
            public void run() {
                turnBlockable();
            }
        };
        Timer time = new Timer();
        time.schedule(task, 2000);
    }


}
