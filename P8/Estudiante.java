
package P8;

/**
 *
 * @author willitronick
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private int numeroEstudiante;
    private int edad;
    private double promedio;

    // Constructor
    public Estudiante(String nombre, String apellido, int numeroEstudiante, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroEstudiante = numeroEstudiante;
        this.edad = edad;
        this.promedio = 0.0;
    }

    // Método para imprimir la información del estudiante
    public void imprimirInformacion() {
        System.out.println("Información del Estudiante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Número de Estudiante: " + numeroEstudiante);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Promedio: " + promedio);
    }

    // Método para calificar al estudiante
    public void calificar(double calificacion) {
        promedio = (promedio + calificacion) / 2.0;
    }

    // Método para obtener el promedio actual de las calificaciones
    public double obtenerPromedio() {
        return promedio;
    }

    // Método para determinar si el estudiante es mayor de edad (18 años o más)
    public boolean esMayorEdad() {
        return edad >= 18;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public void setNumeroEstudiante(int numeroEstudiante) {
        this.numeroEstudiante = numeroEstudiante;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
            
        }
}
