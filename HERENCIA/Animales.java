
package HERENCIA;
import java.util.*;
public class Animales {
    protected String nombre;
    Scanner leers=new Scanner(System.in);

    public Animales() {
    }
    public void Leer(){
        System.out.println("INTRODUSCA NOMBRE DEL ANIMAL");
        this.nombre=leers.nextLine();
    }
    public void MostrarP(){
        System.out.println("NOMBRE DEL ANIMAL ES: "+this.nombre);
    }
    public String Mostrarf(){
        return "Nombre animal"+this.nombre;
    }
}
