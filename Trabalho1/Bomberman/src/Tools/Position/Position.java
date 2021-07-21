package Tools.Position;

import java.io.Serializable;

import Tools.Consts;

// Controla a posição dos elementos,
public class Position implements Serializable {
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
                new Coordinate(row)
            ),
            new Column(
                new Coordinate(column)
            )
        );
    }

    public boolean setPosition(Row row, Column column) {
        if (row.getScreenPosition().value < 0) {
            this.column = column;
            setRow(0);
            return false;
        }
        if (row.getScreenPosition().value > Consts.SCREEN_BOUNDARY) {
            this.column = column;
            setRow(Consts.SCREEN_BOUNDARY);
            return false;
        }
        if (column.getScreenPosition().value < 0) {
            this.row = row;
            setColumn(0);
            return false;
        }
        if (column.getScreenPosition().value > Consts.SCREEN_BOUNDARY) {
            this.row = row;
            setColumn(Consts.SCREEN_BOUNDARY);
            return false;
        }
        this.previousRow = this.row;
        this.previousColumn = this.column;
        this.row = row;
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

    public boolean copy(Position position){
        return this.setPosition(position.getRow(),position.getColumn());
    }

    public Position getMovementUp() {
        return new Position(
            new Row(
                new ScreenPosition(
                    this.getRow().getScreenPosition().value - 1
                )
            ),
            this.getColumn()
        );
    }
    public Position getMovementDown(){
        return new Position(
            new Row(
                new ScreenPosition(
                    this.getRow().getScreenPosition().value + 1
                )
            ),
            this.getColumn()
        );
    }
    public Position getMovementRight(){
        return new Position(
            this.getRow(),
            new Column(
                new ScreenPosition(
                    this.getColumn().getScreenPosition().value + 1
                )
            )
        );
    }
    public Position getMovementLeft(){
        return new Position(
            this.getRow(),
            new Column(
                new ScreenPosition(
                    this.getColumn().getScreenPosition().value - 1
                )
            )
        );
    }

    // Verifica se positão está dentro dos limites exluindo as extremidades
    public static boolean isPositionOutOfBoundaries(Position position) {
        if (position.getRow().getScreenPosition().value < 0) {
            return true;
        }
        if (position.getRow().getScreenPosition().value > Consts.SCREEN_BOUNDARY) {
            return true;
        }
        if (position.getColumn().getScreenPosition().value < 0) {
            return true;
        }
        if (position.getColumn().getScreenPosition().value > Consts.SCREEN_BOUNDARY) {
            return true;
        }
        return false;
    }

    // Verifica se positão está dentro dos limites incluindo as extremidades
    public static boolean isPositionByTheBoundaries(Position position) {
        if (position.getRow().getScreenPosition().value <= 0) {
            return true;
        }
        if (position.getRow().getScreenPosition().value >= Consts.SCREEN_BOUNDARY) {
            return true;
        }
        if (position.getColumn().getScreenPosition().value <= 0) {
            return true;
        }
        if (position.getColumn().getScreenPosition().value >= Consts.SCREEN_BOUNDARY) {
            return true;
        }
        return false;
    }

    // Verifica se duas posições são iguais
    public boolean equals(Position p) {
        return p.getColumn().getCoordinate().value == this.getColumn().getCoordinate().value &&
            p.getRow().getCoordinate().value == this.getRow().getCoordinate().value;
    }
}


