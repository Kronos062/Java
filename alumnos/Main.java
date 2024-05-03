import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos alumnos introduciremos?");
        int nbAlumnos = teclado.nextInt();

        System.out.println("¿Cuántas asignaturas hay?");
        int nbAsignaturas = teclado.nextInt();

        for (int i = 0; i < nbAlumnos; i++) {
            System.out.println("Introduce el nombre del alumno:");
            String alumno = teclado.next();
            double[] notas = new double[nbAsignaturas];

            for (int j = 0; j < nbAsignaturas; j++) {
                System.out.println("Introduce la nota de la asignatura:");
                double nota = teclado.nextDouble();
                notas[j] = nota;
            }

            gestorNotas.registrarNotas(alumno, notas);
        }
    }
}

