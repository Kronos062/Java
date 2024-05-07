package gestorTareas;

import gestorTareas.*;
import java.util.Scanner;

public class añadir {
    private static void añadirTarea(Scanner scanner) {
        System.out.print("Introduce la descripción de la tarea: ");
        String descripcion = scanner.nextLine();
        System.out.print("Introduce la prioridad (baja, mediana o alta): ");
        String prioridad = scanner.nextLine();

        Tarea nuevaTarea = new Tarea(contadorTareas, descripcion, prioridad);
        Tareas.add(nuevaTarea);
        mapeoTarea.put(contadorTareas, nuevaTarea);
        System.out.println("Tarea añadida con exito (ID: " + contadorTareas + ").");
        contadorTareas++;
    }
}
