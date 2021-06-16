package Tools.Events;

import Controls.Screen;
import Model.Element;
import Model.MovableElement;
import Tools.InteractionMap;
import Tools.Position.HitBox;

public class VerifyElementInteractionEvent implements Event<Element>{

    public void fire(Screen screen, Element element) {
        MovableElement movableElement = (MovableElement) element;
        InteractionMap interactionMap = screen.getInteractionMap();
        Element existingElement = interactionMap.get(movableElement.getNextPosition());
        if (existingElement != null) {
            boolean isHiting = HitBox.isHiting(
                element.getHitBox(),
                existingElement.getHitBox()
            );
            if (isHiting) {
                movableElement.setInteractingElement(existingElement);
            }
        } else {
            movableElement.setInteractingElement(null);
        }
    }

}
