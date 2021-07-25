package Tools.Events;

import Controls.GameManager;
import Model.Element;
import Model.Enemies.Enemy;
import Tools.InteractionMap;

// Permite criar um evento no mapa e inserí-lo no mapa de interação
public class CreateEnemyEvent implements Event {

    public void fire(GameManager gameManager, Element element) {
        Enemy enemy = (Enemy) element;
        InteractionMap interactionMap = gameManager.getInteractionMap();
        gameManager.addEnemy(enemy);
        interactionMap.insert(enemy.getPosition(), enemy);
    }

}
