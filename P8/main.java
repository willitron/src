package P8;

//  @author willitronick
public class main {

    public static void main(String[] args) {
      // Instanciar 2 objetos Estudiante desde el Main del mismo paquete
        Estudiante estudiante1 = new Estudiante("Juan", "Perez", 12345, 20);
        Estudiante estudiante2 = new Estudiante("Ana", "Gomez", 67890, 17);

        // Imprimir información de los estudiantes
        estudiante1.imprimirInformacion();
        estudiante2.imprimirInformacion();

        // Calificar a los estudiantes
        estudiante1.calificar(20.5);
        estudiante2.calificar(7.0);

        // Mostrar el promedio de los estudiantes
        System.out.println("Promedio de " + estudiante1.getNombre() + ": " + estudiante1.obtenerPromedio());
        System.out.println("Promedio de " + estudiante2.getNombre() + ": " + estudiante2.obtenerPromedio());

        // Verificar si los estudiantes son mayores de edad
        System.out.println(estudiante1.getNombre() + " es mayor de edad: " + estudiante1.esMayorEdad());
        System.out.println(estudiante2.getNombre() + " es mayor de edad: " + estudiante2.esMayorEdad());
    }

}
