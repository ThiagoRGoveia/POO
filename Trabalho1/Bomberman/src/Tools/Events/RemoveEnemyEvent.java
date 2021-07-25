package Tools.Events;

import Controls.GameManager;
import Model.Element;
import Model.Enemies.Enemy;

// Permite remover um elemento da tela e do mapa de interação
public class RemoveEnemyEvent implements Event {
    public void fire(GameManager gameManager, Element element) {
        Enemy enemy = (Enemy) element;
        gameManager.getInteractionMap().remove(enemy.getPosition());
        gameManager.removeEnemy(enemy);
    }

}
