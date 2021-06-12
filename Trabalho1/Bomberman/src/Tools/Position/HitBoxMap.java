package Tools.Position;

import Tools.Consts;

public class HitBoxMap {
    private int[][] map = new int[Consts.RES][Consts.RES];

    public HitBoxMap() {
        for (int i = 0; i < Consts.RES; i++) {
            for (int j = 0; j < Consts.RES; j++) {
                map[i][j] = -1;
            }
        }
    }

    public boolean insert(int id, int x, int y) {
        if (map[y][x] > 0) {
            return false;
        }
        map[y][x] = id;
        return true;
    }

    public void remove(int x, int y) {
        map[y][x] = -1;
    }

    public int get(int x, int y) {
        return map[y][x];
    }
}
