package Tools;

import Model.Explosion;
import Model.Hero;
import Model.Enemies.Enemy;

// Interface que define a interação entre elementos
// é possível haver interação de elementos com herois
// inimigo e explosões
public interface Interactable {
    public void interact(Hero hero);
    public void interact(Enemy enemy);
    public void interact(Explosion explosion);
}
