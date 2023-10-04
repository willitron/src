package HerTrabajador;

public class Trabajador {

    protected String nombre;
    protected int ci;
    protected int dias_trabajados;
    protected int pago_diario;
    protected double salario_neto;
    protected double descuento_afp;
    protected double salario_liquido;

    public Trabajador() {
    }

    public Trabajador(String nombre, int ci, int dias_trabajados, int pago_diario) {
        this.nombre = nombre;
        this.ci = ci;
        this.dias_trabajados = dias_trabajados;
        this.pago_diario = pago_diario;
    }

    public void calcular_salario_neto() {
        this.salario_neto = this.dias_trabajados * this.pago_diario;
    }

    public void calcular_descuento_afp() {
        this.descuento_afp = this.salario_neto * 0.16;
    }

    public void calcular_salario_liquido() {
        this.salario_liquido = this.salario_neto - this.descuento_afp;
    }

    @Override
    public String toString() {
        return "Trabajador" + "nombre=" + nombre + ", ci=" + ci
                + ",\ndias_trabajados=" + dias_trabajados
                + ", \npago_diario=" + pago_diario;
    }

}
