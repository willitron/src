package HerTrabajador;

//  @author willitronick
public class Main {

    public static void main(String[] args) {
        System.out.println("Instanciamos Administrador Base de Datos");
        AdministradorBD bd1 = new AdministradorBD(20, "Pewdro", 2536897, 10, 150);
        bd1.calcular_padre();
        bd1.calcular_descuento_retraso();
        bd1.calcular_bono_antiguedad();
        bd1.calcualar_salario_final2();
        System.out.println("\nAdministrador de Base de Datos: ");
        System.out.println(
                bd1.toString());

        System.out.println("\nInstanciamos Objeto 2 Seguridad de redes");
        AdministradorSR sr1 = new AdministradorSR("maria", 10, 50, 200);
        sr1.calcular_padre();
        sr1.calcular_bono_dias_extra();
        sr1.calcular_bono_antiguedad();
        sr1.calculalar_total_bono();
        sr1.calcular_salario_final();

        System.out.println("Seguridad de Redes: ");
        System.out.println(sr1.toString());

    }

}
