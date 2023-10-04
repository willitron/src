
package HERENCIA;
import java.util.*;
public class Perros extends Animales {
private String color;
private int edad;
private String raza;
Scanner leers=new Scanner(System.in);
Scanner leern=new Scanner(System.in);
    public Perros() {
    }
    
@Override
public void Leer(){
    super.Leer();
    System.out.println("Ingrese el color");
    this.color=leers.nextLine();
    System.out.println("Introduvir edad: ");
    this.edad=leern.nextInt();
    System.out.println("Introducir la Raza: ");
    this.raza=leers.nextLine();
}
@Override
public void MostrarP (){
super.MostrarP();
    System.out.println("Color perro: "+this.color);
    System.out.println("Edad del perro: "+this.edad);
    System.out.println("Raza de perro: "+this.raza);
}
public String MostrarF(){
    return super.Mostrarf()+" Color perro es:"+this.color+
            "Edad de perro: "+this.edad+"raza:"+this.edad;
}
}
