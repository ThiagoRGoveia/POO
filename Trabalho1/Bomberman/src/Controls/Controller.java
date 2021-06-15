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
    public void draw(ArrayList<Element> e){
        for(int i = 1; i < e.size(); i++){
            screen.drawer.draw(e.get(i));
        }
        screen.drawer.draw(e.get(0)); // Desenhar o herói por último
    }
    public void process(Hero hero){
        InteractionMap map = screen.getInteractionMap();
        Element element = map.get(hero.getPosition());
        if (element != null) {
            element.interact(hero);
        }

    }
    public void process(ArrayList<Enemy> enemies){
        InteractionMap map = screen.getInteractionMap();
        for (Enemy enemy: enemies) {
            Element element = map.get(enemy.getPosition());
            if (element != null) {
                element.interact(enemy);
            }
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

    public void processHeroMovement(Hero hero) {
        InteractionMap map = screen.getInteractionMap();
        Element element = map.get(hero.getPosition());
        if (element != null) {
            if (!element.isTraversable()) {
                hero.getPosition().reset();
            }
        }
    }
}
