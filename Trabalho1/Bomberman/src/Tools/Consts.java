package Tools;

import java.io.File;

/**
 *
 * @author Junio
 */
public class Consts {
    public static final int CELL_SIDE = 50;
    public static final int RES = 20;
    public static final int FRAME_INTERVAL = 10;
    public static final String PATH = File.separator+"imgs"+File.separator;
    public static final int CELL_SIZE_FACTOR = 50;
    public static final int SCREEN_BOUNDARY = Consts.CELL_SIZE_FACTOR * (Consts.RES - 1);
}
