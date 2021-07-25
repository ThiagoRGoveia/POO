package Tools;

import java.io.Serializable;
import java.util.HashMap;

import Model.Element;
import Model.Hero;
import Model.Blocks.ExplodingBlock;
import Model.Blocks.IndestructableBlock;
import Model.Blocks.RegularBlock;
import Model.Enemies.BasicEnemy;

public final class ElementFactory implements Serializable {
    private HashMap<String, GenericElementFactory> elementMap;

    public ElementFactory() {
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
            return new Hero(x, y);
        }
    }

    class EnemyFactory extends GenericElementFactory {
        public Element create(int x, int y) {
            return new BasicEnemy(x, y);
        }
    }

    class RegularBlockFactory extends GenericElementFactory {
        public Element create(int x, int y) {
            return new RegularBlock(x, y);
        }
    }

    class IndestructableBlockFactory extends GenericElementFactory {
        public Element create(int x, int y) {
            return new IndestructableBlock(x, y);
        }
    }

    class ExplodingBlockFactory extends GenericElementFactory {
        public Element create(int x, int y) {
            return new ExplodingBlock(x, y);
        }
    }
}
