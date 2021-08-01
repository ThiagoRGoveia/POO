package Tools.Events;

import Controls.GameManager;
import Model.Element;
import Tools.Schedule;

// Permite programar uma ação repetitiva na thread principal do jogo
public class CreateScheduleEventLoop implements Event {

    public void fire(GameManager gameManager, Element element) {
        Schedule schedule = element.getScheduledTask();
        gameManager.getScreen().getTimer().schedule(
            schedule.timerTask,
            schedule.delay,
            schedule.interval
        );
    }

}
