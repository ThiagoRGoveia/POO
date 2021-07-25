package Model.Items;

import Model.Element;
import Tools.Events.EventBus;
import Tools.Position.Position;

public interface Creatable {
    public Item create(Position position);
}
