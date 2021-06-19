package Tools.Events;

import Controls.Screen;
import Model.Element;
import Model.Enemies.Enemy;

public class RemoveEnemyEvent implements Event<Element> {
    public void fire(Screen screen, Element element) {
        Enemy enemy = (Enemy) element;
        screen.getInteractionMap().remove(enemy.getPosition());
        screen.removeEnemy(enemy);
    }

}
