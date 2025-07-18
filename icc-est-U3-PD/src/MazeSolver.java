import java.util.List;

import Models.Celda;

public interface MazeSolver {
    List<Celda> getPath(boolean[][] grid, Celda start, Celda end);
}