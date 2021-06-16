package Tools.Events;

import Controls.Screen;
public interface Event<T> {
    public void fire(Screen screen, T t);
}
