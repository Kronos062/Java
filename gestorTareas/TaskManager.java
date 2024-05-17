package gestorTareas;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TaskManager {
    private static ArrayList<Task> tasks = new ArrayList<>();

    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        File file = new File("tascas.txt");
        try {
            // Comprovem si el fitxer ja existeix
            if (file.createNewFile()) {
                System.out.println("Fitxer creat amb èxit.");
            } else {
                System.out.println("El fitxer ja existeix.");
            }
        } catch (IOException e) {
            System.out.println("S'ha produït un error en crear el fitxer.");
            e.printStackTrace();
        }

        while (running) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

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
                    saveTasksToFile();
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
        System.out.println("5. Guardar las tareas en un fichero");
        System.out.println("6. Salir");
        System.out.print("Elige una opción: ");
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Título de la tarea: ");
        String title = scanner.nextLine();
        System.out.print("Descripción de la tarea: ");
        String description = scanner.nextLine();
        System.out.print("Fecha de vencimiento (dd/MM/yyyy): ");
        String dateString = scanner.nextLine();
        LocalDate dueDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Estado (pend/curso/comp): ");
        String status = scanner.nextLine();Task newTask = new Task(title, description, dueDate, status);        tasks.add(newTask);
        System.out.println("Tarea añadida correctamente.");
    }

    private static void markTaskAsComplete(Scanner scanner) {
        System.out.print("Introduce el identificador de la tarea: ");
        String title = scanner.nextLine();
        scanner.nextLine();
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                System.out.print("Nueva descripción: ");
                String description = scanner.nextLine();
                System.out.print("Nueva fecha de vencimiento (dd/MM/yyyy): ");
                String dateString = scanner.nextLine();
                LocalDate dueDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                System.out.print("Nuevo estado (pend/curso/comp): ");
                String status = scanner.nextLine();
                task.setDescription(description);
                task.setDueDate(dueDate);
                task.setStatus(status);
                System.out.println("Tarea modificada correctamente.");
                return;
            }
        }
        System.out.println("No se ha encontrado ninguna tarea con este identificador.");
    }

    private static void deleteTask(Scanner scanner) {
        System.out.print("Introduce el identificador de la tarea: ");
        String title = scanner.nextLine();
        scanner.nextLine();
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTitle() == title) {
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

    private static void saveTasksToFile() {
        File file = new File("data.txt");
        try {
            // Creem un objecte FileWriter per escriure dades al fitxer
            FileWriter writer = new FileWriter(file);
            // Escrivim dades al fitxer
            writer.write("Hola, aquest és un exemple de fitxer en Java.\n");
            writer.write("Això és una segona línia.\n");
            // Tanquem el FileWriter
            writer.close();
            System.out.println("Datos escritos en el fichero.");
            // Creem un objecte FileReader per llegir les dades del fitxer
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            // Llegim les dades del fitxer línia per línia
            String line;
            System.out.println("Contingut del fitxer:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            // Tanquem el FileReader
            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("Error al escribir o leer el mensage");

        }
        }

    private static class Task {
        private String title;
        private String description;
        private LocalDate dueDate;
        private String status;

        public Task(String title, String description, LocalDate dueDate, String status) {
            this.title = title;
            this.description = description;
            this.dueDate = dueDate;
            this.status = status;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public LocalDate getDueDate() {
            return dueDate;
        }

        public String getStatus() {
            return status;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setDueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "Título: " + title + ", Descripción: " + description + ", Fecha de vencimiento: " +
                dueDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", Estado: " + status;
        }
    }
}
