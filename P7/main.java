package P7;

//  @author willitronick

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        Digito digito1 = new Digito();
        System.out.print("Ingrese un número entero positivo distinto de cero: ");
        int numero1 = scanner.nextInt();
        digito1.setDigito(numero1);

        Digito digito2 = new Digito();
        System.out.print("Ingrese un número entero positivo distinto de cero: ");
        int numero2 = scanner.nextInt();
        digito2.setDigito(numero2);

        Digito digito3 = new Digito();
        System.out.print("Ingrese un número entero positivo distinto de cero: ");
        int numero3 = scanner.nextInt();
        digito3.setDigito(numero3);

        System.out.println("\nPrimer y último dígito del primer número:");
        digito1.mostrarPrimeroUltimoDigito();
        System.out.println("\nPrimer y último dígito del segundo número:");
        digito2.mostrarPrimeroUltimoDigito();
        System.out.println("\nPrimer y último dígito del tercer número:");
        digito3.mostrarPrimeroUltimoDigito();

        System.out.println("\nIngrese un dígito para contar cuántas veces se repite en los números:");
        int digitoContar = scanner.nextInt();
        System.out.println("El dígito " + digitoContar + " se repite " + digito1.cuantasVecesRepiteDigito(digitoContar) + " veces en el primer número.");
        System.out.println("El dígito " + digitoContar + " se repite " + digito2.cuantasVecesRepiteDigito(digitoContar) + " veces en el segundo número.");
        System.out.println("El dígito " + digitoContar + " se repite " + digito3.cuantasVecesRepiteDigito(digitoContar) + " veces en el tercer número.");

        System.out.println("\nDigitos pares e impares de los números:");
        System.out.println("Para el primer número:");
        digito1.formarDigitosParesImpares();
        System.out.println("Para el segundo número:");
        digito2.formarDigitosParesImpares();
        System.out.println("Para el tercer número:");
        digito3.formarDigitosParesImpares();

        scanner.close();
    }
    

}
