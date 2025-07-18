import java.util.List;
import java.util.Set;
import Models.Celda;

public class MazeResult {
    private List<Celda> bestPath;
    private Set<Celda> visited;

    public MazeResult(List<Celda> bestPath, Set<Celda> visited) {
        this.bestPath = bestPath;
        this.visited = visited;
    }

    public List<Celda> getBestPath() {
        return bestPath;
    }

    public Set<Celda> getVisited() {
        return visited;
    }
}