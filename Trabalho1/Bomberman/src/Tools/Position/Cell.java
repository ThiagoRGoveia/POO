package Tools.Position;

import Tools.Consts;

public abstract class Cell {
    protected ScreenPosition screenPosition;
    protected Coordinate coordinate;

    public Cell (ScreenPosition screenPosition) {
        this.screenPosition = screenPosition;
        setCoordinate(screenPosition.value);
    }

    public Cell (Coordinate coordinate) {
        this.coordinate = coordinate;
        setScreenPosition(coordinate.value);
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public ScreenPosition getScreenPosition() {
        return screenPosition;
    }

    public void setCoordinate(int screenPosition) {
        this.coordinate = new Coordinate((screenPosition + Consts.CELL_SIZE_FACTOR/2) / Consts.CELL_SIZE_FACTOR);
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
        setScreenPosition(coordinate.value);
    }

    public void setScreenPosition(ScreenPosition screenPosition) {
        this.screenPosition = screenPosition;
        setCoordinate(screenPosition.value);
    }

    public void setScreenPosition(int coordinate) {
        this.screenPosition = new ScreenPosition(coordinate * Consts.CELL_SIZE_FACTOR);
    }
}
