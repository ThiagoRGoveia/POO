package Tools.Events;

import Controls.Screen;
import Model.Element;
import Model.MovableElement;
import Tools.InteractionMap;

public class MoveOnInteractionMap implements Event<Element>{

    public void fire(Screen screen, Element element) {
        MovableElement movableElement = (MovableElement) element;
        InteractionMap interactionMap = screen.getInteractionMap();
        interactionMap.remove(movableElement.getPosition());
        interactionMap.insert(movableElement.getNextPosition(), movableElement);
    }

}
