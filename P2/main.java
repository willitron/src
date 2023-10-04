package P2;

public class main {

    public static void main(String[] args) {
    Trabajador t=new Trabajador("Wilson",30,100);
        System.out.println("Sueldo liqudo de trabajador: "+t.cal_sueldo_liquido());
        System.out.println("Descuento: "+t.cal_descuento());
        System.out.println("Bono te "+t.cal_bono_te());
        System.out.println("Sueldo Final: "+t.cal_sueldo_final());
        System.out.println("  ");
    }
    
}
