package Tools.Events;

import Controls.Screen;
import Model.Element;
import Model.MovableElement;
import Tools.Consts;
import Tools.InteractionMap;
import Tools.Position.Column;
import Tools.Position.Position;
import Tools.Position.Row;
import Tools.Position.ScreenPosition;


// Permite verificar se um elemento está interagindo com outro
public class VerifyElementInteractionEvent implements Event<Element>{

    public void fire(Screen screen, Element element) {
        MovableElement movableElement = (MovableElement) element;
        InteractionMap interactionMap = screen.getInteractionMap();
        String movementDirection = movableElement.getMovementDirection();
        int rowFactor = 0;
        int colFactor = 0;
        // Verificar qual a direção de movimento atual e corrigir posição
        // com relação à fronteira da célula
        if (movementDirection == "up") {
            rowFactor = -Consts.RES / 2;
        } else if (movementDirection == "down") {
            rowFactor = Consts.RES / 2;
        } else if (movementDirection == "left") {
            colFactor = -Consts.RES / 2;
        } else if (movementDirection == "right") {
            colFactor = Consts.RES / 2;
        }
        // Verificar se existe algum elemento na proxima célula
        Element existingElement = interactionMap.get(
            new Position(
                new Row(
                    new ScreenPosition(movableElement.getNextPosition().getRow().getScreenPosition().value + rowFactor)
                ),
                new Column(
                    new ScreenPosition(movableElement.getNextPosition().getColumn().getScreenPosition().value + colFactor)
                )
            )
        );
        // Se existir, informar ao elemento móvel da interação
        if (existingElement != null) {
            movableElement.setInteractingElement(existingElement);
        } else {
            movableElement.setInteractingElement(null);
        }
    }

}
