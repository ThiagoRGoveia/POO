package Tools;

public abstract class Cell {
    protected int screenPosition;
    protected int coordinate;

    Cell (int screenPosition) {
        this.screenPosition = screenPosition;
        setCoordinate(screenPosition);
    }

    public int getCoordinate() {
        return coordinate;
    }

    protected void setCoordinate(int screenPosition) {
        this.coordinate = screenPosition / Consts.CELL_SIZE_FACTOR;
    }

    public int getScreenPosition() {
        return screenPosition;
    }

    public void setScreenPosition(int screenPosition) {
        this.screenPosition = screenPosition;
        setCoordinate(screenPosition);
    }
}
