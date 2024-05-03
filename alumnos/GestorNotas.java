import java.util.Hashtable;


public class GestorNotas {
    private Hashtable<String, double[]> alumnos = new Hashtable<String, double[]>();

    public void registrarNotas(String nombreAlumno, double[] notas) {
        alumnos.put(nombreAlumno, notas);
    }

    public double[] obtenerNotas(String nombreAlumno) {
        return alumnos.get(nombreAlumno);
    }
}


