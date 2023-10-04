package HerTrabajador;

public class AdministradorSR extends Trabajador {

    private int dias_extra_trabajado;
    private double bono_antiguedad;
    private double bono_dias_extra;
    private double total_bono;
    private double salario_final;

    public AdministradorSR(String nombre, int ci, int dias_trabajados, int pago_diario) {
        super(nombre, ci, dias_trabajados, pago_diario);
    }

    public void calcular_padre() {
        super.calcular_salario_neto();
        super.calcular_descuento_afp();
        super.calcular_salario_liquido();
    }

    public void calcular_bono_dias_extra() {
        this.bono_dias_extra = (0.1 * super.salario_neto) * this.dias_extra_trabajado;
    }

    public void calcular_bono_antiguedad() {
        this.bono_antiguedad = 0.15 * super.salario_neto;
    }

    public void calculalar_total_bono() {
        this.total_bono = this.bono_antiguedad + this.bono_dias_extra;
    }

    public void calcular_salario_final() {
        this.salario_final = (super.salario_neto - super.descuento_afp) + this.total_bono;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAdministradorSR" + "dias_extra_trabajado="
                + dias_extra_trabajado + ",\n bono_antiguedad=" + bono_antiguedad
                + ", bono_dias_extra = " + bono_dias_extra + ", \ntotal_bono = " + total_bono
                + ", salario_final = " + salario_final;

    }

}
