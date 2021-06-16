package Tools.Events;

import Controls.Screen;
import Model.Element;
import Tools.Schedule;

public class CreateScheduleEvent implements Event<Element> {

    public void fire(Screen screen, Element element) {
        Schedule schedule = element.getScheduledTask();
        screen.getTimer().schedule(
            schedule.timerTask,
            schedule.delay
        );
    }

}
