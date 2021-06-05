package Model;

public class Hero extends Element {
    public Hero () {
        super("skooter_hero.png");
    }

    public void resetToLastPosition(){
        this.position.reset();
    }
}
