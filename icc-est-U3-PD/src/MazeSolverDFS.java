import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class MazeSolverDFS implements MazeSolver{

    @Override
    public List<Celda> getPath(boolean[][] grid, Celda start, Celda end) {
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];
        Map<Celda, Celda> parentMap = new HashMap<>();
        Stack<Celda> stack = new Stack<>();

        stack.push(start);
        visited[start.getRow()][start.getCol()] = true;

        while (!stack.isEmpty()) {
            Celda current = stack.pop();

            if (current.equals(end)) {
                return buildPath(parentMap, end);
            }

            for (Celda next : getNeighbors(current, grid)) {
                if (!visited[next.getRow()][next.getCol()]) {
                    visited[next.getRow()][next.getCol()] = true;
                    parentMap.put(next, current);
                    stack.push(next);
                }
            }
        }

        return new ArrayList<>();
    }

    private List<Celda> buildPath(Map<Celda, Celda> parentMap, Celda end) {
        List<Celda> path = new ArrayList<>();
        Celda current = end;
        while (current != null) {
            path.add(current);
            current = parentMap.get(current);
        }
        return path;
    }

    private List<Celda> getNeighbors(Celda cell, boolean[][] grid) {
        int row = cell.getRow();
        int col = cell.getCol();
        List<Celda> neighbors = new ArrayList<>();

        if (row > 0 && grid[row - 1][col]) neighbors.add(new Celda(row - 1, col));
        if (row < grid.length - 1 && grid[row + 1][col]) neighbors.add(new Celda(row + 1, col));
        if (col > 0 && grid[row][col - 1]) neighbors.add(new Celda(row, col - 1));
        if (col < grid[0].length - 1 && grid[row][col + 1]) neighbors.add(new Celda(row, col + 1));

        return neighbors;
    }

}
