package Tools.Events;

import Controls.Screen;
import Model.Element;
import Tools.Schedule;

// Permite progrmar uma ação na thread principal do jogo
public class CreateScheduleEvent implements Event {

    public void fire(Screen screen, Element element) {
        Schedule schedule = element.getScheduledTask();
        screen.getTimer().schedule(
            schedule.timerTask,
            schedule.delay
        );
    }

}
