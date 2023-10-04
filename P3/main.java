package P3;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de términos: ");
        int n = scanner.nextInt();
        Sucesion sucesion1 = new Sucesion(n);
        Sucesion sucesion2 = new Sucesion(n);
        Sucesion sucesion3 = new Sucesion(n);

        sucesion1.Sucesion();
        sucesion2.Sucesion_uno();
        sucesion3.Sucesion_dos();
        sucesion1.Sucesion_tres();

        scanner.close();
    
    }

}
