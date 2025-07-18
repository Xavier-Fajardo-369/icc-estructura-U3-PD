/* 
import java.util.ArrayList;
import java.util.List;

import Models.Celda;

public class MazeSolverRecursivo implements MazeSolver {


    @Override
    public List<Celda> getPath(boolean[][] grid, Celda start, Celda end) {
        if (grid == null || grid.length == 0) return new ArrayList<>();

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        List<Celda> path = new ArrayList<>();

        if (findPath(grid, start, end, path, visited)) {
            
            return path;
        }

        return new ArrayList<>();
    }

    private boolean findPath(boolean[][] grid, Celda current, Celda end, List<Celda> path, boolean[][] visited) {
        int row = current.getRow();
        int col = current.getCol();

        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) return false;
        if (!grid[row][col] || visited[row][col]) return false;

        visited[row][col] = true;
        path.add(current);

        if (row == end.getRow() && col == end.getCol()) {
            return true;
        }

        if (findPath(grid, new Celda(row, col + 1), end, path, visited)) return true; // derecha →
        if (findPath(grid, new Celda(row + 1, col), end, path, visited)) return true; // abajo ↓

        
        path.remove(path.size() - 1);
        return false;
    }
     

}
    */
