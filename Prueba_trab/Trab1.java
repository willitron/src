package Prueba_trab;

import P2.Trabajador;

public class Trab1 {

    public static void main(String[] args) {
      Trabajador t1= new Trabajador("Samuel", 20, 100);
        System.out.println("Segundo Objeto: ");
        System.out.println("Sueldo liqudo de trabajador: "+t1.cal_sueldo_liquido());
        System.out.println("Descuento: "+t1.cal_descuento());
        System.out.println("Bono te "+t1.cal_bono_te());
        System.out.println("Sueldo Final: "+t1.cal_sueldo_final());
    }

}
