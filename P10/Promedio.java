
package P10;

/**
 *
 * @author willitronick
 */
public class Promedio {
    private int[] edades;

    // Constructor que recibe un arreglo de edades
    public Promedio(int[] edades) {
        this.edades = edades;
    }

    // Método para calcular el promedio de las edades
    public double calcularPromedio() {
        int sumaEdades = 0;
        for (int edad : edades) {
            sumaEdades += edad;
        }
        return (double) sumaEdades / edades.length;
            
        }
}
