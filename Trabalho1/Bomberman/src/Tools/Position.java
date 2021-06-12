package Tools;

import java.io.Serializable;

public class Position {
    private int	row;
    private int column;

    private int previousRow;
    private int previousColumn;

    public Position(int row, int column){
        this.setPosition(row, column);
    }

    public boolean setPosition(int row, int column){
        if(row < 0) {
            this.row = 0;
            return false;
        }
        previousRow = this.row;
        if (row > (Tools.Consts.RES - 1) * Consts.CELL_SIZE_FACTOR) {
            System.out.println(row);
            this.row = (Tools.Consts.RES - 1) * Consts.CELL_SIZE_FACTOR;
            return false;
        }
        this.row = row;

        previousColumn = this.column;
        if(column < 0) {
            this.column = 0;
            return false;
        }
        if (column > (Tools.Consts.RES - 1) * Consts.CELL_SIZE_FACTOR) {
            this.column = (Tools.Consts.RES - 1) * Consts.CELL_SIZE_FACTOR;
            return false;
        }
        this.column = column;
        return true;
    }

    public int getRow(){
        return row;
    }

    public boolean reset(){
        return this.setPosition(previousRow, previousColumn);
    }

    public int getColumn(){
        return column;
    }

    public boolean isSamePosition(Position position){
        return (
            row/Consts.CELL_SIZE_FACTOR == position.getRow()/Consts.CELL_SIZE_FACTOR &&
            column/Consts.CELL_SIZE_FACTOR == position.getColumn()/Consts.CELL_SIZE_FACTOR
        );
    }

    public boolean copy(Position position){
        return this.setPosition(position.getRow(),position.getColumn());
    }

    public boolean moveUp(){
        return this.setPosition(this.getRow() - Consts.HERO_SPEED, this.getColumn());
    }
    public boolean moveDown(){
        return this.setPosition(this.getRow() + Consts.HERO_SPEED, this.getColumn());
    }
    public boolean moveRight(){
        return this.setPosition(this.getRow(), this.getColumn() + Consts.HERO_SPEED);
    }
    public boolean moveLeft(){
        return this.setPosition(this.getRow(), this.getColumn() - Consts.HERO_SPEED);
    }
}
