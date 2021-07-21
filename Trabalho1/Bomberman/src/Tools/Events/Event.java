package Tools.Events;

import java.io.Serializable;

import Controls.Screen;
// Interface que define os eventos e permite que eles sejam disparados polimorficamente
public interface Event<T> extends Serializable {
    public void fire(Screen screen, T t);
}
