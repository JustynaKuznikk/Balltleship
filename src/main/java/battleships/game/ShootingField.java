package battleships.game;

public class ShootingField extends Field{
    private char xRow;
    private int xCol;


    public ShootingField(char row, int col) {
        super(row, col);
        xRow = row;
        xCol = col;
    }

    public void setRow(char xRow) {
        this.xRow = xRow;
    }

    public void setCol(int xCol) {
        this.xCol = xCol;
    }

    @Override
    public int getCol() {
        return xCol;
    }

    @Override
    public char getRow() {
        return xRow;
    }
}
