package GestorLibreria;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            //ingresar uin libro
        System.out.print("Ingrese el ID del libro: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el año del libro: ");
        int año = scanner.nextInt();
        //creo libro con lo que pone el user
        Libro libro = new Libro(id, titulo, autor, año);
        GestorBD.añadirLibro(libro);
        System.out.println("Libro añadido exitosamente.");

        // para actualizar el libro
        System.out.print("Ingrese el nuevo título del libro: ");
        String nuevoTitulo = scanner.nextLine();
        libro.setTitulo(nuevoTitulo);
        GestorBD.actualizarLibro(libro);

        System.out.println("Libro actualizado exitosamente.");

        //eliminar libro
        GestorBD.eliminarLibro(id);
        System.out.println("Libro eliminado exitosamente.");
    }
}
