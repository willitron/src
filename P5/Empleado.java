
package P5;

package com.miempresa;

public class Empleado {
    private int idEmpleado;
    private double salario;
    private int antiguedad;
    private static final double PLUS = 100.0;

    public Empleado(int idEmpleado, double salario, int antiguedad) {
        this.idEmpleado = idEmpleado;
        this.salario = salario;
        this.antiguedad = antiguedad;
    }

    public double calcularSalarioTotal() {
        double salarioTotal = salario;

        if (antiguedad >= 2 && antiguedad <= 5) {
            salarioTotal += (PLUS * 0.5);
        } else if (antiguedad > 5) {
            salarioTotal += PLUS;
        }

        return salarioTotal;
    }

    public void mostrarInformacion() {
        System.out.println("ID del Empleado: " + idEmpleado);
        System.out.println("Salario Base: " + salario + " Bs.");
        System.out.println("Antigüedad en la empresa: " + antiguedad + " años");
        System.out.println("Salario Total: " + calcularSalarioTotal() + " Bs.");
    }

    
}
