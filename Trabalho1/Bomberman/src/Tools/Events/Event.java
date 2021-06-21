package Tools.Events;

import Controls.Screen;
// Interface que define os eventos e permite que eles sejam disparados polimorficamente
public interface Event<T> {
    public void fire(Screen screen, T t);
}
