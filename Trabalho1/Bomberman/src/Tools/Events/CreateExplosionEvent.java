package Tools.Events;

import Controls.Screen;
import Model.Element;
import Model.Explosion;
import Tools.InteractionMap;

public class CreateExplosionEvent implements Event<Element> {

    public void fire(Screen screen, Element element) {
        Explosion explosion = (Explosion) element;
        InteractionMap interactionMap = screen.getInteractionMap();
        Element preExistingElement = interactionMap.get(explosion.getPosition());
        if (preExistingElement == null) {
            screen.addElement(explosion);
            interactionMap.insert(explosion.getPosition(), explosion);
            explosion.propagateExplosion(explosion.getIntensity());
        } else {
            if (!preExistingElement.isImmortal()) {
                if (preExistingElement.isTraversable()) {
                    explosion.propagateExplosion(explosion.getIntensity());
                } else {
                    explosion.changeToLastExplosion();
                }
                screen.addElement(explosion);
                preExistingElement.interact(explosion);
            }

        }
    }

}
