package gestorTareas;

import java.util.Scanner;

public class completada {
    private static void marcaCompletada(Scanner scanner) {
        System.out.print("Introduce la ID de la tarea a marcar como completada: ");
        int tareaId = scanner.nextInt();
        scanner.nextLine(); // Consumir el salt de línia

        if (mapeoTarea.containsKey(tareaId)) {
            Tarea Tarea = mapeoTarea.get(tareaId);
            Tarea.setCompleted(true);
            System.out.println("Tarea " + tareaId + " marcada com a completa.");
        } else {
            System.out.println("No se ha encontrado ningun tarea con laID " + tareaId + ".");
        }
    }

}
