package Tools;

import java.io.Serializable;


public class Position {
    private Row	row;
    private Column column;

    private Row previousRow;
    private Column previousColumn;

    public Position(int row, int column){
        this.setPosition(new Row(row), new Column(column));
    }

    public boolean setPosition(int row, int column) {
        return this.setPosition(new Row(row), new Column(column));
    }

    public boolean setPosition(Row row, Column column) {
        if (row.getScreenPosition() < 0) {
            row = new Row(0);
            return false;
        }
        if (row.getScreenPosition() > Consts.SCREEN_BOUNDARY) {
            row = new Row(Consts.SCREEN_BOUNDARY);
            return false;
        }
        this.row = row;
        if (column.getScreenPosition() < 0) {
            column = new Column(0);
            return false;
        }
        if (column.getScreenPosition() > Consts.SCREEN_BOUNDARY) {
            column = new Column(Consts.SCREEN_BOUNDARY);
            return false;
        }
        this.column = column;
        return true;
    }

    public Row getRow(){
        return row;
    }

    public boolean reset(){
        return this.setPosition(previousRow, previousColumn);
    }

    public Column getColumn(){
        return column;
    }

    public boolean isSamePosition(Position position){
        return row.getCoordinate() == position.getRow().getCoordinate() &&
            column.getCoordinate() == position.getColumn().getCoordinate();
    }

    public boolean copy(Position position){
        return this.setPosition(position.getRow(),position.getColumn());
    }

    public boolean moveUp(){
        return this.setPosition(
            new Row(this.getRow().getScreenPosition() - Consts.HERO_SPEED),
            this.getColumn()
        );
    }
    public boolean moveDown(){
        return this.setPosition(
            new Row(this.getRow().getScreenPosition() + Consts.HERO_SPEED),
            this.getColumn()
        );
    }
    public boolean moveRight(){
        return this.setPosition(
            this.getRow(),
            new Column(
                this.getColumn().getScreenPosition() + Consts.HERO_SPEED
            )
        );
    }
    public boolean moveLeft(){
        return this.setPosition(
            this.getRow(),
            new Column(
                this.getColumn().getScreenPosition() - Consts.HERO_SPEED
            )
        );
    }
}
