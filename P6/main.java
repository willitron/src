package P6;

//  @author willitronick
public class main {

    public static void main(String[] args) {
      MatrizCaracol generador = new MatrizCaracol();
        int n = 4;
        int[][] matriz = generador.generarMatrizCaracol(n);
        generador.mostrarMatriz(matriz);
    }

}
