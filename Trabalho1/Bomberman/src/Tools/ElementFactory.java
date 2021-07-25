package Tools;

import java.io.Serializable;
import java.util.HashMap;

import Model.Element;
import Model.Hero;
import Model.Blocks.ExplodingBlock;
import Model.Blocks.IndestructableBlock;
import Model.Blocks.RegularBlock;
import Model.Enemies.BasicEnemy;
import Tools.Events.EventBus;

public final class ElementFactory implements Serializable {
    private HashMap<String, GenericElementFactory> elementMap;
    private EventBus eventBus;

    public ElementFactory(EventBus eventBus) {
        this.eventBus = eventBus;
        elementMap = new HashMap<String, GenericElementFactory>(5);
        elementMap.put("hero", new HeroFactory());
        elementMap.put("block", new RegularBlockFactory());
        elementMap.put("enemy", new EnemyFactory());
        elementMap.put("explodingBlock", new ExplodingBlockFactory());
        elementMap.put("indestructableBlock", new IndestructableBlockFactory());
    }

    public Element createElement(String type, int x, int y) {
        return elementMap.get(type).create(x, y);
    }

    abstract class GenericElementFactory {
        public abstract Element create(int x, int y);
    }

    class HeroFactory extends GenericElementFactory {
        public Element create(int x, int y) {
            return new Hero(eventBus, x, y);
        }
    }

    class EnemyFactory extends GenericElementFactory {
        public Element create(int x, int y) {
            return new BasicEnemy(eventBus, x, y);
        }
    }

    class RegularBlockFactory extends GenericElementFactory {
        public Element create(int x, int y) {
            return new RegularBlock(eventBus, x, y);
        }
    }

    class IndestructableBlockFactory extends GenericElementFactory {
        public Element create(int x, int y) {
            return new IndestructableBlock(eventBus, x, y);
        }
    }

    class ExplodingBlockFactory extends GenericElementFactory {
        public Element create(int x, int y) {
            return new ExplodingBlock(eventBus, x, y);
        }
    }
}
