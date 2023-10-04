package P10;

//  @author willitronick

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        // Instanciar 3 objetos PromedioEdades desde el Main del mismo paquete
        for (int i = 1; i <= 3; i++) {
            System.out.print("Cantidad de edades para el objeto " + i + ": ");
            int cantidadEdades = scanner.nextInt();

            int[] edades = new int[cantidadEdades];
            for (int j = 0; j < cantidadEdades; j++) {
                System.out.print("Ingrese la edad " + (j + 1) + ": ");
                edades[j] = scanner.nextInt();
            }

            Promedio promedioEdades = new Promedio(edades);
            double promedio = promedioEdades.calcularPromedio();

            System.out.println("Promedio para el objeto " + i + ": " + promedio);
        }

        scanner.close();
    }

}
