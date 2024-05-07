package gestorTareas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TaskManager {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static int taskCounter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    markTaskAsComplete(scanner);
                    break;
                case 3:
                    deleteTask(scanner);
                    break;
                case 4:
                    showAllTasks();
                    break;
                case 5:
                    showTasksByPriority();
                    break;
                case 6:
                    running = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Vuelve a intentarlo.");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nMenú de tareas:");
        System.out.println("1. Añadir una nueva tarea");
        System.out.println("2. Marcar una tarea como completada");
        System.out.println("3. Borrar una tarea");
        System.out.println("4. Mostrar todas las tareas");
        System.out.println("5. Mostrar las tareas por prioridad");
        System.out.println("6. Salir");
        System.out.print("Elige una opción: ");
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Descripción de la tarea: ");
        String description = scanner.nextLine();
        System.out.print("Prioridad (baja/media/alta): ");
        String priority = scanner.nextLine();
        Task newTask = new Task(taskCounter++, description, priority);
        tasks.add(newTask);
        System.out.println("Tarea añadida correctamente.");
    }

    private static void markTaskAsComplete(Scanner scanner) {
        System.out.print("Introduce el identificador de la tarea: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
                System.out.println("Tarea marcada como completada.");
                return;
            }
        }
        System.out.println("No se ha encontrado ninguna tarea con este identificador.");
    }

    private static void deleteTask(Scanner scanner) {
        System.out.print("Introduce el identificador de la tarea: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                System.out.println("Tarea eliminada correctamente.");
                return;
            }
        }
        System.out.println("No se ha encontrado ninguna tarea con este identificador.");
    }

    private static void showAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No hay ninguna tarea en la lista.");
        } else {
            System.out.println("Todas las tareas:");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    private static void showTasksByPriority() {
        HashMap<String, ArrayList<Task>> tasksByPriority = new HashMap<>();
        tasksByPriority.put("baja", new ArrayList<>());
        tasksByPriority.put("media", new ArrayList<>());
        tasksByPriority.put("alta", new ArrayList<>());

        for (Task task : tasks) {
            tasksByPriority.get(task.getPriority()).add(task);
        }

        System.out.println("Tareas por prioridad:");
        for (String priority : tasksByPriority.keySet()) {
            System.out.println("\nPrioridad " + priority + ":");
            for (Task task : tasksByPriority.get(priority)) {
                System.out.println(task);
            }
        }
    }

    private static class Task {
        private int id;
        private String description;
        private String priority;
        private boolean completed;

        public Task(int id, String description, String priority) {
            this.id = id;
            this.description = description;
            this.priority = priority;
            this.completed = false;
        }

        public int getId() {
            return id;
        }

        public String getDescription() {
            return description;
        }

        public String getPriority() {
            return priority;
        }

        public boolean isCompleted() {
            return completed;
        }

        public void setCompleted(boolean completed) {
            this.completed = completed;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Descripción: " + description + ", Prioridad: " + priority + ", Estado: " + (completed ? "Completada" : "Pendiente");
        }
    }
}
