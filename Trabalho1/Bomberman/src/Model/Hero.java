package Model;

import Tools.Events.EventBus;

public class Hero extends Element {
    public Hero (EventBus eventBus) {
        super("skooter_hero.png", eventBus);
    }

    public void resetToLastPosition(){
        this.position.reset();
    }
}
