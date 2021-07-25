package Model.Items;

import Model.Hero;
import Tools.Events.EventBus;
import Tools.Position.Position;

public class BombItem extends Item  {

    protected BombItem(Position position) {
        super(position);
        this.setAnimatorName("bomb-item");
        EventBus.getInstance().emit("create-animator", this);
        setTraversable(true);
    }

    public BombItem(int row, int column) {
        this(new Position(row, column));
    }

    public void pickUp(Hero hero) {
        hero.incrementMaxNumberOfBombs();
        die();
    }

}
