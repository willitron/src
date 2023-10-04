package P1;

public class Prueba {

    public static void main(String[] args) {
        //cramos el objeto 2
        Area_Perimetro_Altura triangulo2 = new Area_Perimetro_Altura(5);
        System.out.println("La Altura de Segundo triangulo" + triangulo2.CalcularAltura());
        System.out.println("El Perimetro del Segundo triangulo " + triangulo2.CalcularPerimetro());
        System.out.println("El Area del Segundo triangulo: " + triangulo2.CalcularArea());

    }

}
