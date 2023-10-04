package HerTrabajador;

public class AdministradorBD extends Trabajador {

    private int minutos_retraso;
    private double descuento_retrazo;
    private double bono_antiguedad;
    private double salario_final2;

    public AdministradorBD() {
    }

    public AdministradorBD(int minutos_retraso, String nombre, int ci, int dias_trabajados, int pago_diario) {
        super(nombre, ci, dias_trabajados, pago_diario);

    }

    public void calcular_padre() {
        super.calcular_salario_neto();
        super.calcular_descuento_afp();
        super.calcular_salario_liquido();
    }

    public void calcular_descuento_retraso() {
        this.descuento_retrazo = 3.5 * this.minutos_retraso;
    }

    public void calcular_bono_antiguedad() {
        this.bono_antiguedad = super.salario_neto * 0.05;
    }

    public void calcualar_salario_final2() {
        this.salario_final2 = super.salario_neto + this.bono_antiguedad - super.descuento_afp + this.descuento_retrazo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAdministradorBD"
                + "\nminutos_retraso = "
                + minutos_retraso + ",\n descuento_retrazo = " + descuento_retrazo
                + ", \nbono_antiguedad = " + bono_antiguedad + ",\n salario_final2 = " + salario_final2;
    }

}
