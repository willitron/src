package P1;

public class Area_Perimetro_Altura {

    private double lado;

    public Area_Perimetro_Altura(double lado) {
        this.lado = lado;
    }
//METODOS PARA CALCULAR EL AREA DEL TRIANGULO

    public double CalcularArea() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    public double CalcularPerimetro() {
        return 3 * lado;
    }
    public double CalcularAltura(){
        return (Math.sqrt(3)/2)*lado;
    }

}
