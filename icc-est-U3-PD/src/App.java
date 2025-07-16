public class App {
    public static void main(String[] args) throws Exception {
        runEjerciciosPD();
    }
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
            
            
            
    }
    
}
           
    
