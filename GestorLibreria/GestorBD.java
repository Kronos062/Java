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
        String sql = "INSERT INTO libros (titulo, autor, año) Values (?, ?, ?)";
        //empiezo mi try catch
        try (Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, libro.getTitulo());
                stmt.setString(2, libro.getAutor());
                stmt.setInt(3, libro.getAño());
                stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
