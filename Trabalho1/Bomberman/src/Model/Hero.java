package Model;

import Tools.Events.EventBus;
import Tools.Image.Boundaries;
import Tools.Image.LoadImage;
import Tools.Position.Column;
import Tools.Position.Coordinate;
import Tools.Position.Position;
import Tools.Position.Row;

public class Hero extends StaticElement {
    public Hero (EventBus eventBus) {
        super(
            eventBus,
            LoadImage.loadImageFromFile(
                "b_parado.png",
                new Boundaries(0,0,31,31)
            )
        );
    }

    public void resetToLastPosition(){
        this.position.reset();
    }

    public boolean placeBomb() {
        Bomb bomb = new Bomb(this.eventBus);
        bomb.setPosition(
            new Position(
                new Row(
                    new Coordinate(
                        this.position.getRow().getCoordinate().value
                    )
                ),
                new Column(
                    new Coordinate(
                        this.position.getColumn().getCoordinate().value
                    )
                )
            )
        );
        this.eventBus.emit("create-element", bomb);
        return true;
    }

    public void interact(Hero hero) {}

    public void interact(Item item) {}

    public void interact(Enemy enemy) {}

    public void interact(Explosion explosion) {}
}
