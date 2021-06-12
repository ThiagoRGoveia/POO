package Tools.Position;

import Tools.Consts;

public class HitBox {
    public int x;
    public int y;
    public int height;
    public int width;

    public HitBox() {}

    public HitBox(Position position) {
        this.x = position.getColumn().getScreenPosition().value;
        this.y = position.getRow().getScreenPosition().value;
        this.height = y + Consts.CELL_SIZE_FACTOR;
        this.width = x + Consts.CELL_SIZE_FACTOR;
    }


    public static boolean isHiting(HitBox h1, HitBox h2) {
        int hitWidth1 = h1.width - h2.x;
        int hitWidth2 = h2.width - h1.x;
        int hitHeight1 = h1.height - h2.y;
        int hitHeight2 = h2.height - h1.y;
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
