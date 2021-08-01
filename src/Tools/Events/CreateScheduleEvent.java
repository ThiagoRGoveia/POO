package Tools.Events;

import Controls.GameManager;
import Model.Element;
import Tools.Schedule;

// Permite progrmar uma ação na thread principal do jogo
public class CreateScheduleEvent implements Event {

    public void fire(GameManager gameManager, Element element) {
        Schedule schedule = element.getScheduledTask();
        gameManager.getScreen().getTimer().schedule(
            schedule.timerTask,
            schedule.delay
        );
    }

}
