package Tools.Events;

import Controls.GameManager;
import Model.Element;
import Model.Explosion;
import Tools.InteractionMap;

// Permite crirar uma explosão e fazê-la interagir com os elementos
public class CreateExplosionEvent implements Event {

    public void fire(GameManager gameManager, Element element) {
        Explosion explosion = (Explosion) element;
        InteractionMap interactionMap = gameManager.getInteractionMap();
        Element preExistingElement = interactionMap.get(explosion.getPosition()); // Procurar elemento na posição da explosão a ser criada
        if (preExistingElement == null) { // Se não houver elemento, propagar explosão
            gameManager.addElement(explosion);
            interactionMap.insert(explosion.getPosition(), explosion);
            explosion.propagateExplosion(explosion.getIntensity());
        } else {
            if (!preExistingElement.isImmortal()) {
                gameManager.addElement(explosion);
                preExistingElement.interact(explosion); // Se houver um elemento e ele não for imortal, interagir
                if (preExistingElement.isTraversable()) {
                    explosion.propagateExplosion(explosion.getIntensity()); // Se o elemento puder ser atravessado propagar explosão
                } else {
                    explosion.changeToLastExplosion(); // Se o elemento não puder ser atravessado, mudar animação para ultima explosão
                }
            } else {
                explosion.cancelSchedule(); // Se o elemento for imortal, cancelar explosão
            }

        }
    }

}
