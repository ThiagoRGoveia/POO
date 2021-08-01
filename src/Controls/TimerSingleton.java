package Controls;

import java.io.Serializable;

public class TimerSingleton implements Serializable {
    private static TimerSingleton instance;
    private SerializableTimer timer;
    private TimerSingleton() {
        timer = new SerializableTimer();
    }
    public static TimerSingleton getInstance() {
        if (instance == null) {
            instance = new TimerSingleton();
        }
        return instance;
    }

    public SerializableTimer getTimer() {
        return getInstance().timer;
    }
}
