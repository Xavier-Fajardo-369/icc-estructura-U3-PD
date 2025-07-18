import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Models.Celda;

public class MazeSolverRecursivoCompletoBT implements MazeSolver {
    private Set<Celda> visited = new HashSet<>();
    private List<Celda> bestPath = new ArrayList<>();

    public Set<Celda> getVisited() {
        return visited;
    }

    @Override
    public List<Celda> getPath(boolean[][] grid, Celda start, Celda end) {
        visited.clear();
        bestPath.clear();
        List<Celda> currentPath = new ArrayList<>();
        findAllPaths(grid, start, end, currentPath);
        return bestPath;
    }

    private void findAllPaths(boolean[][] grid, Celda current, Celda end, List<Celda> path) {
        int rows = grid.length;
        int cols = grid[0].length;
        int row = current.getRow();
        int col = current.getCol();

        if (row < 0 || col < 0 || row >= rows || col >= cols) return;
        if (!grid[row][col]) return;
        if (visited.contains(current)) return;

        visited.add(current);
        path.add(current);

        if (current.equals(end)) {
            if (bestPath.isEmpty() || path.size() < bestPath.size()) {
                bestPath = new ArrayList<>(path);
            }
        } else {
            // Movimientos: derecha, abajo, izquierda, arriba
            findAllPaths(grid, new Celda(row, col + 1), end, path);
            findAllPaths(grid, new Celda(row + 1, col), end, path);
            findAllPaths(grid, new Celda(row, col - 1), end, path);
            findAllPaths(grid, new Celda(row - 1, col), end, path);
        }

        path.remove(path.size() - 1);
        visited.remove(current);
    }
}