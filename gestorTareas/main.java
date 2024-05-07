package gestorTareas;
import gestorTareas.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class main {
    private static ArrayList<Tarea> Tarea = new ArrayList<>();
    private static HashMap<Integer, Tarea> taskMap = new HashMap<>();
    private static int taskCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenú de tareas:");
            System.out.println("1. Añadir una nueva tarea");
            System.out.println("2. Marcar una tarea como completada");
            System.out.println("3. Borrar una tarea");
            System.out.println("4. Mostrar todas las tareas");
            System.out.println("5. Mostrar las tareas por prioridad");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    añadir(scanner);
                    break;
                case 2:
                    completada(scanner);
                    break;
                case 3:
                    eliminar(scanner);
                    break;
                case 4:
                    mostrarTodas();
                    break;
                case 5:
                    mostrarPrioridad();
                    break;
                case 6:
                    running = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no vàlida. Vuelve a intentarlo.");
                    break;
            }
        }
    }

}
