package Tools.Events;

import Controls.Screen;
import Model.Element;
import Model.Enemies.Enemy;

// Permite remover um elemento da tela e do mapa de interação
public class RemoveEnemyEvent implements Event {
    public void fire(Screen screen, Element element) {
        Enemy enemy = (Enemy) element;
        screen.getInteractionMap().remove(enemy.getPosition());
        screen.removeEnemy(enemy);
    }

}
