
package P4;
public class Curso {
    private String nombre;
    private String carrera;
    private int semestre;
    private String sigla;

    
    public Curso() {
    }

    public Curso(String nombre, String carrera, int semestre, String sigla) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
        this.sigla = sigla;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getSigla() {
        return sigla;
    }
    
    public void inicializar(String nombre,String carrera, int semestre,String sigla){
        this.nombre=nombre;
        this.carrera =carrera;
        this.semestre=semestre;
        this.sigla=sigla;
    }
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Carrera: "+carrera);
        System.out.println("Semestre: "+semestre);
        System.out.println("Sigla: "+sigla);
    }
}
