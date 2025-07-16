package Models;

public class Maze {
    private boolean[][] grid;

    public Maze() {
        this.grid = new boolean[][] {
            {true, true, true, true},
            {false, true, true, true},
            {true, true, false, false},
            {true, true, true, true},
        };
    }
    public boolean[][] getGrid() {
        return grid;
    }
    public void printMaze() {
        for (boolean[] row : grid) {
            for (boolean cell : row) {
                System.out.print(cell ? "1 " : "0 ");
            }
            System.out.println();
        }
    }
    public void setGrid(boolean[][] grid) {
        this.grid = grid;
    }
    

}
