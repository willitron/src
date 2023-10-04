package P5;

public class main {

    public static void main(String[] args) {
        System.out.println("INSTANCIAMOS LOS TRES PRIMEROS PAQUETES ");
       // Instanciar 3 objetos de la clase Empleado con distintas antiguedades
        Empleado empleado1 = new Empleado(1, 2000.0, 1);
        Empleado empleado2 = new Empleado(2, 2500.0, 3);
        Empleado empleado3 = new Empleado(3, 3000.0, 6);

        // Mostrar información de los empleados
        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();
        empleado3.mostrarInformacion();
    }

}
