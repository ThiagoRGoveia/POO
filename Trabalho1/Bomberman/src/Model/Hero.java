package Model;

import Tools.Events.EventBus;
import Tools.Position.Column;
import Tools.Position.Coordinate;
import Tools.Position.Position;
import Tools.Position.Row;

public class Hero extends Element {
    public Hero (EventBus eventBus) {
        super("b_parado.png", eventBus);
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
}
