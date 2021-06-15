package Tools;

import Model.Explosion;
import Model.Hero;
import Model.Enemies.Enemy;

public interface Interactable {
    public void interact(Hero hero);
    public void interact(Enemy enemy);
    public void interact(Explosion explosion);
}
