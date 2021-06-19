package Tools.Events;

import Controls.Screen;
import Model.Element;
import Model.Enemies.Enemy;
import Tools.InteractionMap;

public class CreateEnemyEvent implements Event<Element> {

    public void fire(Screen screen, Element element) {
        Enemy enemy = (Enemy) element;
        InteractionMap interactionMap = screen.getInteractionMap();
        screen.addEnemy(enemy);
        interactionMap.insert(enemy.getPosition(), enemy);
    }

}
