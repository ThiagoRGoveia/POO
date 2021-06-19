package Controls;

import Model.Element;
import Model.Hero;
import Model.Enemies.Enemy;
import Tools.InteractionMap;
import Tools.Position.HeroHitBox;
import Tools.Position.HitBox;

import java.util.ArrayList;

/**
 *
 * @author junio
 */
public class Controller {
    private Screen screen;

    public Controller (Screen screen) {
        this.screen = screen;
    }
    public void draw(ArrayList<Element> elements, ArrayList<Enemy> enemies){
        for(int i = 1; i < elements.size(); i++){ // desenhar elementos estáticos excluindo o herói
            screen.drawer.draw(elements.get(i));
        }
        screen.drawer.draw(elements.get(0)); // Desenhar o herói antes do inimigos
        for (Enemy enemy: enemies) { // Desenhar inimigos por último
            screen.drawer.draw(enemy);
        }
    }
    public void process(Hero hero){
        InteractionMap map = screen.getInteractionMap();
        Element element = map.get(hero.getPosition()); // Buscar elemento na posição do herói
        if (element != null) { // Se elemento existir interaja com ele
            element.interact(hero);
        }

    }

    public boolean isPositionValid(ArrayList<Element> elements, Hero hero){
            Element element;
            for(int i = 1; i < elements.size(); i++) {
                element = elements.get(i);
                if (!element.isTraversable()) {
                    boolean isHiting = HitBox.isHiting(
                        new HeroHitBox(hero.getPosition()),
                        new HitBox(element.getPosition())
                    );
                    if (isHiting){
                        return false;
                    }
                }
            }
        return true;
    }
}
