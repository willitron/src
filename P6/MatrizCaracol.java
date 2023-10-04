
package P6;

/** @author willitronick */
public class MatrizCaracol {
    public int[][] generarMatrizCaracol(int n) {
        int[][] matriz = new int[n][n];
        int valor = 1;
        int inicioFila = 0;
        int inicioColumna = 0;
        int finFila = n - 1;
        int finColumna = n - 1;

        while (valor <= n * n) {
            // Rellenar fila superior
            for (int i = inicioColumna; i <= finColumna; i++) {
                matriz[inicioFila][i] = valor++;
            }
            inicioFila++;

            // Rellenar columna derecha
            for (int i = inicioFila; i <= finFila; i++) {
                matriz[i][finColumna] = valor++;
            }
            finColumna--;

            // Rellenar fila inferior
            for (int i = finColumna; i >= inicioColumna; i--) {
                matriz[finFila][i] = valor++;
            }
            finFila--;

            // Rellenar columna izquierda
            for (int i = finFila; i >= inicioFila; i--) {
                matriz[i][inicioColumna] = valor++;
            }
            inicioColumna++;
        }

        return matriz;
    }

    public void mostrarMatriz(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }   
        }
}
