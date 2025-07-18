package Models;

import java.util.List;
import java.util.Set;

public class Maze {
    private boolean[][] grid;

    public Maze() {
        this.grid = new boolean[][] {
            {true, true, true, true},
            {false, true, true, true},
            {true, true, false, false},
            {true, true, true, true}
        };
    }

    public boolean[][] getGrid() {
        return grid;
    }

    public void setGrid(boolean[][] grid) {
        this.grid = grid;
    }

    public void printMaze() {
        for (boolean[] row : grid) {
            for (boolean cell : row) {
                System.out.print(cell ? "- " : "* ");
            }
            System.out.println();
        }
    }

    public void printMaze(Set<Celda> visited) {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                Celda cell = new Celda(r, c);
                if (!grid[r][c]) {
                    System.out.print("* ");
                } else if (visited.contains(cell)) {
                    System.out.print("> ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    public void printMaze(List<Celda> path) {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                Celda cell = new Celda(r, c);
                if (!grid[r][c]) {
                    System.out.print("* ");
                } else if (path.contains(cell)) {
                    System.out.print("> ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}

    


