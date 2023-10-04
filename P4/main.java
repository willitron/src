package P4;

public class main {

    public static void main(String[] args) {
        System.out.println("PRIMER OBJETO: ");
        Curso c1=new Curso("Wilson","Electronica",5,"ELT");
        c1.mostrar();
        
        System.out.println("SEGUNDO OBJETO: ");
        Curso c2=new Curso();
        c2.setNombre("juan");
        c2.setCarrera("Medicina");
        c2.setSemestre(5);
        c2.setSigla("DEM");
        System.out.println("Nombre: "+c2.getNombre());
        System.out.println("Carrera: "+c2.getCarrera());
        System.out.println("Semestre: "+c2.getSemestre());
        System.out.println("Sigla: "+c2.getSigla());
        
        System.out.println("TERCER OBJETO: ");
        Curso c3=new Curso();
        c3.inicializar("Manuel", "Derecho", 10, "DER");
        c3.mostrar();
        
    }

}
