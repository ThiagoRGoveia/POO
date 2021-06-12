package Tools.Position;

import Tools.Consts;

public class HeroHitBox extends HitBox {

    public HeroHitBox(Position position) {
        this.y = position.getRow().getScreenPosition().value + Consts.HERO_HIT_BOX_FACTOR;
        this.x = position.getColumn().getScreenPosition().value + Consts.HERO_HIT_BOX_FACTOR;
        this.height = this.y + Consts.CELL_SIZE_FACTOR - Consts.HERO_HIT_BOX_FACTOR * 2;
        this.width = this.x + Consts.CELL_SIZE_FACTOR - Consts.HERO_HIT_BOX_FACTOR * 2;
    }

}
