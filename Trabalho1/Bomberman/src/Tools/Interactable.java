package Tools;

import Model.Enemy;
import Model.Explosion;
import Model.Hero;
import Model.Item;

public interface Interactable {
    public void interact(Hero hero);
    public void interact(Item item);
    public void interact(Enemy enemy);
    public void interact(Explosion explosion);
}
