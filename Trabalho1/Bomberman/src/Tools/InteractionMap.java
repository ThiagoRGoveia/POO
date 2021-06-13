package Tools;

import Model.Element;
import Tools.Position.Position;

public class InteractionMap {
    private Element[][] interactionMap = new Element[Consts.RES][Consts.RES];

    public void insert(Position position, Element element){
        interactionMap[position.getRow().getCoordinate().value][position.getColumn().getCoordinate().value] = element;
    }

    public Element get(Position position) {
        return interactionMap[position.getRow().getCoordinate().value][position.getColumn().getCoordinate().value];
    }
}
