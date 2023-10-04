package Prueba_trab;

//  @author willitronick

import P5.Empleado;

public class mainTrab {

    public static void main(String[] args) {
            System.out.println("EL SEGUNDO OBJETO INSTANCIADO: ");
       // Instanciar un objeto de la clase Empleado desde otro paquete
        Empleado empleado4 = new Empleado(4, 2200.0, 4);

        // Mostrar información del empleado
        empleado4.mostrarInformacion();
    }

}
