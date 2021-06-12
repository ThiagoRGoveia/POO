package Tools.Position;

import Tools.Consts;

public class HitBox {
    public static boolean isHiting(Position elementPosition, Position heroPosition) {
        int y1 = elementPosition.getRow().getScreenPosition().value;
        int x1 = elementPosition.getColumn().getScreenPosition().value;
        int height1 = y1 + Consts.CELL_SIZE_FACTOR;
        int width1 = x1 + Consts.CELL_SIZE_FACTOR;

        // A hitbox do herói deve ser menor que a dos elementos
        int y2 = heroPosition.getRow().getScreenPosition().value + Consts.HERO_HIT_BOX_FACTOR;
        int x2 = heroPosition.getColumn().getScreenPosition().value + Consts.HERO_HIT_BOX_FACTOR;
        int height2 = y2 + Consts.CELL_SIZE_FACTOR - Consts.HERO_HIT_BOX_FACTOR * 2;
        int width2 = x2 + Consts.CELL_SIZE_FACTOR - Consts.HERO_HIT_BOX_FACTOR * 2;

        int hitWidth1 = width1 - x2;
        int hitWidth2 = width2 - x1;
        int hitHeight1 = height1 - y2;
        int hitHeight2 = height2 - y1;

        if (
            (
                (hitWidth1 <= Consts.CELL_SIZE_FACTOR && hitWidth1 >= 0) ||
                (hitWidth2 <= Consts.CELL_SIZE_FACTOR && hitWidth2 >= 0)
            ) && (
                (hitHeight1 <= Consts.CELL_SIZE_FACTOR && hitHeight1 >= 0) ||
                (hitHeight2 <= Consts.CELL_SIZE_FACTOR && hitHeight2 >= 0)
            )

        ) {
            return true;
        }
        return false;

    }
}
