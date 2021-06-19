package Tools.Events;

import Controls.Screen;
import Model.Element;

public class MonsterKillEvent implements Event<Element> {

    public void fire(Screen screen, Element t) {
       screen.recordMonsterKill();
    }

}
