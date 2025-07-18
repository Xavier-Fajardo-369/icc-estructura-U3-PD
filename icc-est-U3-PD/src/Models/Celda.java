package Models;

public class Celda {
    public int row;
    public int col;

    public Celda(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Celda)) return false;
        Celda celda = (Celda) o;
        return row == celda.row && col == celda.col;
    }

    @Override
    public int hashCode() {
        return 31 * row + col;
    }
    
   
    

}
