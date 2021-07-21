package Tools;

import java.io.Serializable;

import Model.Element;
import Tools.Position.Position;

// Esta classe centraliza as posições dos elementos (excluindo o heroi) no mapa
// é utilizada para determinar as interações
public class InteractionMap implements Serializable {
    private Element[][] interactionMap = new Element[Consts.RES][Consts.RES];

    public void insert(Position position, Element element){
        interactionMap[position.getRow().getCoordinate().value][position.getColumn().getCoordinate().value] = element;
    }

    public Element get(Position position) {
        return interactionMap[position.getRow().getCoordinate().value][position.getColumn().getCoordinate().value];
    }
    public void remove(Position position) {
        interactionMap[position.getRow().getCoordinate().value][position.getColumn().getCoordinate().value] = null;
    }

    public void clear() {
        for (int i = 0; i < Consts.RES; i++) {
            for(int j = 0; j < Consts.RES; j++) {
                interactionMap[i][j] = null;
            }
        }
    }
}
