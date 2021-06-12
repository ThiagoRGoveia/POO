package Tools;

import java.io.Serializable;

public class Position {
    private int	row;
    private int column;

    private int previousRow;
    private int preveiousColumn;

    public Position(int row, int column){
        this.setPosition(row,column);
    }

    public boolean setPosition(int row, int column){
        if(row < 0 || row >= Tools.Consts.RES * Consts.CELL_SIZE_FACTOR)
            return false;
        previousRow = this.row;
        this.row = row;

        if(column < 0 || column >= Tools.Consts.RES * Consts.CELL_SIZE_FACTOR)
            return false;
        preveiousColumn = this.column;
        this.column = column;
        return true;
    }

    public int getRow(){
        return row;
    }

    public boolean reset(){
        return this.setPosition(previousRow, preveiousColumn);
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
        return this.setPosition(this.getRow() - 1, this.getColumn());
    }
    public boolean moveDown(){
        return this.setPosition(this.getRow() + 1, this.getColumn());
    }
    public boolean moveRight(){
        return this.setPosition(this.getRow(), this.getColumn() + 1);
    }
    public boolean moveLeft(){
        return this.setPosition(this.getRow(), this.getColumn() - 1);
    }
}
