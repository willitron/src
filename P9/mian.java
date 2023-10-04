package P9;

//  @author willitronick
public class mian {

    public static void main(String[] args) {
      // Instanciar un objeto CuentaBancaria desde el Main del mismo paquete
        CuentaBancaria cuenta = new CuentaBancaria("Juan", "Perez", 123456789, "ahorros");

        // Imprimir información de la cuenta
        cuenta.imprimirInformacion();

        // Agregar fondos a la cuenta
        cuenta.agregar(1000);

        // Consultar saldo
        cuenta.consultarSaldo();

        // Retirar fondos de la cuenta
        cuenta.retirar(500);

        // Consultar saldo nuevamente
        cuenta.consultarSaldo();
    }
    

}
