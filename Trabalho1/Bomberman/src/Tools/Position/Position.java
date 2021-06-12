package Tools.Position;

import java.io.Serializable;

import Tools.Consts;


public class Position {
    private Row	row;
    private Column column;

    private Row previousRow;
    private Column previousColumn;

    public Position(int row, int column){
        this.setPosition(row, column);
    }

    public Position(Row row, Column column){
        this.setPosition(row, column);
    }

    public boolean setPosition(int row, int column) {
        return this.setPosition(
            new Row(
                new ScreenPosition(row)
            ),
            new Column(
                new ScreenPosition(column)
            )
        );
    }

    public boolean setPosition(Row row, Column column) {
        if (row.getScreenPosition().value < 0) {
            setRow(0);
            return false;
        }
        if (row.getScreenPosition().value > Consts.SCREEN_BOUNDARY) {
            setRow(Consts.SCREEN_BOUNDARY);
            return false;
        }
        this.row = row;
        if (column.getScreenPosition().value < 0) {
            setColumn(0);
            return false;
        }
        if (column.getScreenPosition().value > Consts.SCREEN_BOUNDARY) {
            setColumn(Consts.SCREEN_BOUNDARY);
            return false;
        }
        this.column = column;
        return true;
    }

    public boolean setPosition(Position position) {
        setPosition(position.getRow(), position.getColumn());
        return true;
    }

    public Row getRow(){
        return row;
    }

    public void setRow(int row){
        this.row = new Row(
            new ScreenPosition(row)
        );
    }

    public Column getColumn(){
        return column;
    }

    public void setColumn(int column){
        this.column = new Column(
            new ScreenPosition(column)
        );
    }

    public boolean reset(){
        return this.setPosition(previousRow, previousColumn);
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
            new Row(
                new ScreenPosition(
                    this.getRow().getScreenPosition().value - Consts.HERO_SPEED
                )
            ),
            this.getColumn()
        );
    }
    public boolean moveDown(){
        return this.setPosition(
            new Row(
                new ScreenPosition(
                    this.getRow().getScreenPosition().value + Consts.HERO_SPEED
                )
            ),
            this.getColumn()
        );
    }
    public boolean moveRight(){
        return this.setPosition(
            this.getRow(),
            new Column(
                new ScreenPosition(
                    this.getColumn().getScreenPosition().value + Consts.HERO_SPEED
                )
            )
        );
    }
    public boolean moveLeft(){
        return this.setPosition(
            this.getRow(),
            new Column(
                new ScreenPosition(
                    this.getColumn().getScreenPosition().value - Consts.HERO_SPEED
                )
            )
        );
    }
}
