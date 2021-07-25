package Tools.Image;

import java.io.Serializable;
import java.util.HashMap;

// Esta classe é responsável por criar instancias da classe Animator sob demanda
// cada uma das animações possíveis no jogo é reunida aqui e elas são acessadas através
// de uma string no HashMap
public class AnimatorFactory implements Serializable {
    private HashMap<String,Creatable> animatorMap;
    private ImageFactory imageLoader;

    public AnimatorFactory(ImageFactory imageLoader) {
        animatorMap = new HashMap<String,Creatable>(20);
        this.imageLoader = imageLoader;

        animatorMap.put("bomb", new BombAnimator());
        animatorMap.put("first-explosion", new FirstExplosionAnimator());
        animatorMap.put("horizontal-left-last-explosion", new HoriziontalLeftLastExplosionAnimator());
        animatorMap.put("horizontal-right-last-explosion", new HorizontalRightLastExplosionAnimator());
        animatorMap.put("vertical-up-last-explosion", new VerticalUpLastExplosionAnimator());
        animatorMap.put("vertical-down-last-explosion", new VerticalDownLastExplosionAnimator());
        animatorMap.put("horizontal-middle-explosion", new HorizontalMiddleExplosionAnimator());
        animatorMap.put("vertical-middle-explosion", new VerticalMiddleExplosionAnimator());
        animatorMap.put("enemy-vertical-up-movement", new EnemyVerticalUpMovementAnimator());
        animatorMap.put("enemy-vertical-down-movement", new EnemyVerticalDownMovementAnimator());
        animatorMap.put("enemy-horizontal-left-movement", new EnemyHorizontalLeftMovementAnimator());
        animatorMap.put("enemy-horizontal-right-movement", new EnemyHorizontalRightMovementAnimator());
        animatorMap.put("floor-static", new FloorStaticAnimator());
        animatorMap.put("floor-obstacle", new FloorObstacleAnimator());
        animatorMap.put("floor-obstacle-destruction", new FloorObstacleDestructionAnimator());
        animatorMap.put("indestructable-obstacle", new IndestructableObstacleAnimator());
        animatorMap.put("bomb-item", new BombItemAnimator());
        animatorMap.put("bomb-intensity-item", new BombIntensityItemAnimator());
        animatorMap.put("speed-up-item", new BombSpeedUpItemAnimator());
        animatorMap.put("extra-life-item", new BombExtraLifeItemAnimator());

    }

    class BombAnimator implements Creatable {
        public Animator create() {
            return new Animator(
                true,
                500,
                imageLoader.getImageList("bomb")
              );
            }
    }

    class FirstExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("first-explosion")
         );
}
    }

    class HoriziontalLeftLastExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("horizontal-left-last-explosion")
         );
}
    }

    class HorizontalMiddleExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("horizontal-middle-explosion")
         );
}
    }

    class HorizontalRightLastExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("horizontal-right-last-explosion")
         );
}
    }

    class VerticalDownLastExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("vertical-down-last-explosion")
         );
}
    }

    class VerticalMiddleExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("vertical-middle-explosion")
         );
}
    }

    class VerticalUpLastExplosionAnimator implements Creatable {
         public Animator create() {
            return new Animator(
                false,
                100,
                imageLoader.getImageList("vertical-up-last-explosion")
         );
}
    }

    class EnemyVerticalUpMovementAnimator implements Creatable {
        public Animator create() {
            return new Animator(
                true,
                100,
                imageLoader.getImageList("enemy-vertical-up-movement")
              );
            }
    }

    class EnemyVerticalDownMovementAnimator implements Creatable {
        public Animator create() {
            return new Animator(
                true,
                100,
                imageLoader.getImageList("enemy-vertical-down-movement")
              );
            }
    }

    class EnemyHorizontalLeftMovementAnimator implements Creatable {
    public Animator create() {
        return new Animator(
            true,
            100,
            imageLoader.getImageList("enemy-horizontal-left-movement")
          );
        }
    }

    class EnemyHorizontalRightMovementAnimator implements Creatable {
    public Animator create() {
        return new Animator(
            true,
            100,
            imageLoader.getImageList("enemy-horizontal-right-movement")
            );
        }
    }

    class FloorStaticAnimator implements Creatable {
    public Animator create() {
        return new Animator(
            imageLoader.getImageList("floor-static").get(0)
            );
        }
    }

    class FloorObstacleAnimator implements Creatable {
    public Animator create() {
        return new Animator(
            true,
            500,
            imageLoader.getImageList("floor-obstacle")
            );
        }
    }

    class FloorObstacleDestructionAnimator implements Creatable {
    public Animator create() {
        return new Animator(
            false,
            80,
            imageLoader.getImageList("floor-obstacle-destruction")
            );
        }
    }

    class IndestructableObstacleAnimator implements Creatable {   //FloorObstacleAnimator
    public Animator create() {
        return new Animator(
            imageLoader.getImageList("indestructable-obstacle").get(0)
            );
        }
    }

    class BombItemAnimator implements Creatable {
        public Animator create() {
            return new Animator(
            true,
            500,
            imageLoader.getImageList("bomb-item")
            );
        }
    }

    class BombIntensityItemAnimator implements Creatable {
        public Animator create() {
            return new Animator(
            true,
            500,
            imageLoader.getImageList("bomb-intensity-item")
            );
        }
    }

    class BombSpeedUpItemAnimator implements Creatable {
        public Animator create() {
            return new Animator(
            true,
            500,
            imageLoader.getImageList("speed-up-item")
            );
        }
    }

    class BombExtraLifeItemAnimator implements Creatable {
        public Animator create() {
            return new Animator(
            true,
            500,
            imageLoader.getImageList("extra-life-item")
            );
        }
    }

    public Animator getAnimator(String name) {
        return animatorMap.get(name).create();
    }
}

