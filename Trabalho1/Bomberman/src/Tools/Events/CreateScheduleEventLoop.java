package Tools.Events;

import Controls.Screen;
import Model.Element;
import Tools.Schedule;

// Permite programar uma ação repetitiva na thread principal do jogo
public class CreateScheduleEventLoop implements Event<Element> {

    public void fire(Screen screen, Element element) {
        Schedule schedule = element.getScheduledTask();
        screen.getTimer().schedule(
            schedule.timerTask,
            schedule.delay,
            schedule.interval
        );
    }

}
