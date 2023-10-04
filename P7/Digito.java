
package P7;

/**
 *
 * @author willitronick
 */
public class Digito {
    public int z;

    public void setDigito(int z) {
        this.z = z;
    }

    public int getDigito() {
        return z;
    }

    public void mostrarPrimeroUltimoDigito() {
        if (z != 0) {
            int ultimoDigito = z % 10;
            int primerDigito = Character.getNumericValue(Integer.toString(z).charAt(0));
            System.out.println("Primer dígito: " + primerDigito);
            System.out.println("Último dígito: " + ultimoDigito);
        } else {
            System.out.println("El número debe ser distinto de cero.");
        }
    }

    public int cuantasVecesRepiteDigito(int x) {
        if (z != 0) {
            String zStr = Integer.toString(z);
            String xStr = Integer.toString(x);
            int contador = 0;
            for (int i = 0; i < zStr.length(); i++) {
                if (zStr.charAt(i) == xStr.charAt(0)) {
                    contador++;
                }
            }
            return contador;
        } else {
            System.out.println("El número debe ser distinto de cero.");
            return 0;
        }
    }

    public void formarDigitosParesImpares() {
        if (z != 0) {
            String zStr = Integer.toString(z);
            StringBuilder dp = new StringBuilder();
            StringBuilder di = new StringBuilder();

            for (int i = 0; i < zStr.length(); i++) {
                int digito = Character.getNumericValue(zStr.charAt(i));
                if (digito % 2 == 0) {
                    dp.append(digito);
                } else {
                    di.append(digito);
                }
            }

            System.out.println("DP = " + dp.toString());
            System.out.println("DI = " + di.toString());
        } else {
            System.out.println("El número debe ser distinto de cero.");
        }
            
        }
}
