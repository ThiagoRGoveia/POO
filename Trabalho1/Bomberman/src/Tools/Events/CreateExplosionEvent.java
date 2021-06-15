package Tools.Events;

import Controls.Screen;
import Model.Element;
import Model.Explosion;
import Tools.InteractionMap;

public class CreateExplosionEvent implements Event {

    public void fire(Screen screen, Element... elements) {
        for (Element element: elements) {
            Explosion explosion = (Explosion) element;
            InteractionMap interactionMap = screen.getInteractionMap();
            Element preExistingElement = interactionMap.get(explosion.getPosition());
            if (preExistingElement == null) {
                screen.addElement(explosion);
                interactionMap.insert(explosion.getPosition(), explosion);
                explosion.propagateExplosion(explosion.getIntensity());
            } else {
                preExistingElement.interact(explosion);
                if (element.isTraversable()) {
                    explosion.propagateExplosion(explosion.getIntensity());
                }
            }
        }
    }

}
