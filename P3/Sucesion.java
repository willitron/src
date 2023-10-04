
package P3;

public class Sucesion {
    private int n;

    // Constructor por defecto
    public Sucesion() {
        this.n = 0;
    }

    // Constructor con parámetros
    public Sucesion(int n) {
        this.n = n;
    }

    // Método para generar la serie Fibonacci
    public void Sucesion() {
        int a = 0;
        int b = 1;
        System.out.print("Serie Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }

    // Método para generar la serie de números primos
    public void Sucesion_uno() {
        int count = 0;
        int num = 2;
        System.out.print("Serie de Primos: ");
        while (count < n) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    // Método para verificar si un número es primo
    private boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para generar la serie (i+4)
    public void Sucesion_dos() {
        int start = 1;
        System.out.print("Serie (i+4): ");
        for (int i = 0; i < n; i++) {
            System.out.print(start + " ");
            start += 4;
        }
        System.out.println();
    }

    // Método para generar la serie (i+impar)
    public void Sucesion_tres() {
        int start = 0;
        System.out.print("Serie (i+impar): ");
        for (int i = 0; i < n; i++) {
            System.out.print(start + " ");
            start += (2 * i + 1);
        }
        System.out.println();
    }
        
    }

  
      
  