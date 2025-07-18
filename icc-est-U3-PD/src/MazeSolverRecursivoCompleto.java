/* 
import java.util.ArrayList;
import java.util.List;

import Models.Celda;

public class MazeSolverRecursivoCompleto implements MazeSolver {
    @Override
    public List<Celda> getPath(boolean[][] grid, Celda start, Celda end) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        List<Celda> path = new ArrayList<>();
        List<Celda> bestPath = new ArrayList<>();

        findPath(grid, start, end, path, visited, bestPath);

        return bestPath;
    }

    private void findPath(boolean[][] grid, Celda current, Celda end,
                          List<Celda> path, boolean[][] visited, List<Celda> bestPath) {
        int row = current.getRow();
        int col = current.getCol();

        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) return;
        if (!grid[row][col] || visited[row][col]) return;

        visited[row][col] = true;
        path.add(current);

        if (row == end.getRow() && col == end.getCol()) {
            if (bestPath.isEmpty() || path.size() < bestPath.size()) {
                bestPath.clear();
                bestPath.addAll(new ArrayList<>(path));
            }
        } else {
            findPath(grid, new Celda(row - 1, col), end, path, visited, bestPath);
            findPath(grid, new Celda(row + 1, col), end, path, visited, bestPath);
            findPath(grid, new Celda(row, col - 1), end, path, visited, bestPath);
            findPath(grid, new Celda(row, col + 1), end, path, visited, bestPath);
        }

        path.remove(path.size() - 1);
        visited[row][col] = false;
    }

}
*/
