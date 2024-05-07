package gestorTareas;

import java.util.Scanner;

public class eliminar {
    private static void eliminarTarea(Scanner scanner) {
        System.out.print("Introduce la ID de la tarea para borrar: ");
        int tareaId = scanner.nextInt();
        scanner.nextLine();
        if (mapeoTarea.containsKey(tareaId)) {
            Tarea Tarea = mapeoTarea.get(tareaId);
            Tareas.remove(Tarea);
            mapeoTarea.remove(tareaId);
            System.out.println("Tarea " + tareaId + " borrada.");
        } else {
            System.out.println("No se ha encontrado ningun tarea con la ID " + tareaId + ".");
        }
    }
}
