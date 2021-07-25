package Model.Items;


import Model.Hero;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class SpeedUpItem extends Item {

    protected SpeedUpItem(Position position) {
        super(position);
        this.setAnimatorName("speed-up-item");
        EventBus.getInstance().emit("create-animator", this);
    }

    public SpeedUpItem(int row, int column) {
        this(new Position(row, column));
    }

    public void pickUp(Hero hero) {
        hero.increaseSpeed();
        die();
    }
}
