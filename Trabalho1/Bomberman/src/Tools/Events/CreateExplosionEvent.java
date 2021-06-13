package Tools.Events;

import Controls.Screen;
import Model.Element;
import Model.Explosion;
import Tools.InteractionMap;
import Tools.Position.Position;

public class CreateExplosionEvent implements Event {

    public void fire(Screen screen, Element... elements) {
        for (Element element: elements) {
            Explosion explosion = (Explosion) element;
            InteractionMap interactionMap = screen.getInteractionMap();
            Element preExistingElement = interactionMap.get(explosion.getPosition());
            if (preExistingElement == null) {
                if (!Position.isPositionOutOfBoundaries(explosion.getPosition())) {
                    screen.addElement(explosion);
                    interactionMap.insert(explosion.getPosition(), explosion);
                }
            } else {
                preExistingElement.interact(explosion);
            }
        }
    }

}
