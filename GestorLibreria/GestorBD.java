package GestorLibreria;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GestorBD {
    //empiezo creando como logear y donde esta situada la base de datos
    private static final String URL = "pues no se cual es";
    private static final String USER = "root";
    private static final String PASSWORD = "a";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void añadirLibro(Libro libro) {
        String sql = "INSERT INTO libros (titulo, autor, año) Values (?, ?, ?)"
    }
}
