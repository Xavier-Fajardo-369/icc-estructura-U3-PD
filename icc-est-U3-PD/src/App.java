
import Models.Maze;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //runEjerciciosPD();
        runMaze();
    }
    /* 
    public static void runEjerciciosPD() {
        EjerciciosPD ejercicios = new EjerciciosPD();
        int n = 100; 
        
        System.out.println(" Recursivo ");
        long start1 = System.nanoTime();
        long resultado1 = ejercicios.getFibonaci(n);
        long end1 = System.nanoTime();
        long duracion1 = end1 - start1;
        System.out.println("Resultado: " + resultado1 + " Duración: " + duracion1 + " ns");
        
        System.out.println("Fibonacci con caching");
        long start2 = System.nanoTime();
        long resultado2 = ejercicios.getFibonaciPD(n);
        long end2 = System.nanoTime();
        long duracion2 = end2 - start2;
        System.out.println("Resultado: " + resultado2 + " Duración: " + duracion2 + " ns");
        
        /* 
        System.out.println("Fibonacci iterativo");
        long start = System.nanoTime();  
        int resultado = ejercicios.getFibonaci(50);  
        long end = System.nanoTime();    
        long duracion = end - start;     
        System.out.println("Resultado: " + resultado + " Duración: " + duracion + "ns");

        System.out.println("Fibonacci recursivo Caching");
        long startPD = System.nanoTime();
        int resultadoPD = ejercicios.getFibonaciPD(50);
        long endPD = System.nanoTime();
        long duracionPD = endPD - startPD;
        System.out.println("Resultado: " + resultadoPD + " Duración: " + duracionPD + "ns");
        */
        public static void runMaze() {
        boolean[][] predefinedmaze = {
            {true, true, true, true},
            {false, true, true, true},
            {true, true, false, false},
            {true, true, true, true},
        };
        Maze maze = new Maze();
        maze.setGrid(predefinedmaze);

        System.out.println("Laberinto cargado:");
        printMazeCustom(maze.getGrid());

        Celda start = new Celda(0, 0);
        Celda end = new Celda(3, 3);

        List<MazeSolver> solvers = Arrays.asList(
            new MazeSolverRecursivo(),
            new MazeSolverRecursivoCompleto(),
            new MazeSolverBFS(),
            new MazeSolverDFS()
        );

        for (MazeSolver solver : solvers) {
            System.out.println("Ejecutando: " + solver.getClass().getSimpleName());
            List<Celda> path = solver.getPath(maze.getGrid(), start, end);
            System.out.print("Camino encontrado:");
            printPath(path);
        }
    }

    public static void printMazeCustom(boolean[][] grid) {
        for (boolean[] row : grid) {
            for (boolean cell : row) {
                System.out.print(cell ? "- " : "* ");
            }
            System.out.println();
        }
    }

    public static void printPath(List<Celda> path) {
        for (int i = 0; i < path.size(); i++) {
        Celda c = path.get(i);
        System.out.print("Cell [" + c.getRow() + "," + c.getCol() + "]");
        if (i != path.size() - 1) System.out.print(", ");
    }
    System.out.println();
      
       
    }  
}
           
    
