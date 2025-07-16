
import java.util.ArrayList;
import java.util.List;

public class MazeSolverRecursivo implements MazeSolver {

    @Override
    public List<Celda> getPath(boolean[][] grid, Celda start, Celda end) {
        if (grid == null || grid.length == 0) {
            return new ArrayList<>();
        }

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        List<Celda> path = new ArrayList<>();

        if (findPath(grid, start, end, path, visited)) {
            
            List<Celda> correctOrder = new ArrayList<>();
            for (int i = path.size() - 1; i >= 0; i--) {
                correctOrder.add(path.get(i));
            }
            return correctOrder;
        }

        return new ArrayList<>();
    }

    private boolean findPath(boolean[][] grid, Celda current, Celda end, List<Celda> path, boolean[][] visited) {
        int row = current.getRow();
        int col = current.getCol();

        
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) return false;
        if (!grid[row][col] || visited[row][col]) return false;

        
        visited[row][col] = true;

        
        if (row == end.getRow() && col == end.getCol()) {
            path.add(current);
            return true;
        }

        
        if (findPath(grid, new Celda(row - 1, col), end, path, visited)) {
            path.add(current);
            return true;
        }

        
        if (findPath(grid, new Celda(row, col - 1), end, path, visited)) {
            path.add(current);
            return true;
        }

        
        return false;
    }
    

}
