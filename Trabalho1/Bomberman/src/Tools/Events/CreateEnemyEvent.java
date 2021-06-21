package Tools.Events;

import Controls.Screen;
import Model.Element;
import Model.Enemies.Enemy;
import Tools.InteractionMap;

// Permite criar um evento no mapa e inserí-lo no mapa de interação
public class CreateEnemyEvent implements Event<Element> {

    public void fire(Screen screen, Element element) {
        Enemy enemy = (Enemy) element;
        InteractionMap interactionMap = screen.getInteractionMap();
        screen.addEnemy(enemy);
        interactionMap.insert(enemy.getPosition(), enemy);
    }

}
