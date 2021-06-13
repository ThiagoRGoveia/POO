package Model;

import Tools.Events.EventBus;
import Tools.Image.Animator;

public abstract class Explosion extends AnimatedElement {

    protected Explosion(Animator animator, EventBus eventBus) {
        super(animator, eventBus);
        //TODO Auto-generated constructor stub
    }


    public void interact(Hero hero) {
    }

    public void interact(Enemy enemy) {
    }

    public void interact(Explosion explosion) {
    }

}
