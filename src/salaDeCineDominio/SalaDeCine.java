package salaDeCineDominio;

public class SalaDeCine {
	
    private int[][] asientos;
    private int filas;
    private int columnas;
    
    public SalaDeCine(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.asientos = new int[filas][columnas]; 
    }
}
