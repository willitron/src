package PRACTICA;

//  @author willitronick
public class main {

    public static void main(String[] args) {

        int[] Alumnos_por_grupos =
        {
            60, 55, 53, 58, 42
        };
        
        int n = Alumnos_por_grupos.length;
        Vector[][] als = new Vector[n][];
        for (int i = 0; i < n; i++)
        {
            als[i] = new Vector[Alumnos_por_grupos[i]];
            for (int j = 0; j < als[i].length; j++)
            {
                als[i][j] = new Vector("Alumno" + j, j);
            }
        } 
        for (int i = 0; i < n; i++)
        {
            System.out.println("LISTADO POR GRUPOS: " + i);
            for (int j = 0; j < als[i].length; j++)
            {
                System.out.println(als[i][j].getNombre() + " " + als[i][j].getSemestre());
            }
        }
    }

}
