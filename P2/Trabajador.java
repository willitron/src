
package P2;
//import java.util.Scanner;
public class Trabajador {
    //declaramos atributos de la clase
    private String nombre;
    private int dias_trab;
    private double pago_diario;
    
    //declaramos metodos


    public Trabajador(String nombre, int dias_trab, double pago_diario) {
        this.nombre = nombre;
        this.dias_trab = dias_trab;
        this.pago_diario = pago_diario;
    }
    
     public double cal_sueldo_liquido(){
          double sueldo_liquido = dias_trab * pago_diario;
          return sueldo_liquido;
     }
     public double cal_descuento(){
         double sueldo_liquido = cal_sueldo_liquido();
         double descuento= sueldo_liquido * 0.16 ;
         return descuento;
     }
     public double cal_bono_te(){
         double bono_te=5*dias_trab;
         return bono_te;
     }
     public double cal_sueldo_final(){
         double sueldo_liquido=cal_sueldo_liquido();
         double bono_te=cal_bono_te();
         double descuento=cal_descuento();
         double sueldo_final = (sueldo_liquido + bono_te)-descuento;
         return sueldo_final;
     }
     
}
