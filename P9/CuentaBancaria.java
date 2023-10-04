
package P9;

/**
 *
 * @author willitronick
 */
public class CuentaBancaria {
    private String nombreTitular;
    private String apellidoTitular;
    private int numeroCuenta;
    private String tipoCuenta;
    private float saldo = 0;

    // Constructor por defecto
    public CuentaBancaria() {
        // Se puede utilizar este constructor para crear una cuenta vacía
    }

    // Constructor con parámetros
    public CuentaBancaria(String nombreTitular, String apellidoTitular, int numeroCuenta, String tipoCuenta) {
        this.nombreTitular = nombreTitular;
        this.apellidoTitular = apellidoTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    // Método para consultar el saldo actual de la cuenta
    public void consultarSaldo() {
        System.out.println("Saldo actual de la cuenta: " + saldo);
    }

    // Método para agregar fondos a la cuenta
    public boolean agregar(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Se agregaron " + valor + " Bs. a la cuenta.");
            return true;
        } else {
            System.out.println("El valor a agregar debe ser mayor que cero.");
            return false;
        }
    }

    // Método para retirar fondos de la cuenta
    public boolean retirar(float valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Se retiraron " + valor + " Bs. de la cuenta.");
            return true;
        } else {
            System.out.println("El valor a retirar debe ser mayor que cero y no puede superar el saldo actual.");
            return false;
        }
    }

    // Método para imprimir información de la cuenta
    public void imprimirInformacion() {
        System.out.println("Información de la cuenta bancaria:");
        System.out.println("Titular: " + nombreTitular + " " + apellidoTitular);
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Saldo actual: " + saldo + " Bs.");
    }
}
