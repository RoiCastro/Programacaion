package peliculasdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author roi.castrocalvar
 */
public class PeliculasDb {

    public static void main(String[] args) {

        // Ruta local al archivo de base de datos SQLite
        String url = "jdbc:sqlite:peliculas.db"; // Asegúrate de tener este archivo o que el programa pueda crearlo

        try (Connection c = DriverManager.getConnection(url)) {
            System.out.println("Conexión realizada con éxito");

            // Creamos la tabla si no existe
            try (Statement st = c.createStatement()) {
                String crearTabla = "CREATE TABLE IF NOT EXISTS films ("
                        + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                        + "title TEXT NOT NULL,"
                        + "year INTEGER NOT NULL"
                        + ")";
                st.execute(crearTabla);
            }

            boolean control = true;
            Scanner scan = new Scanner(System.in);

            while (control) {
                System.out.println("1. Inserte una nueva película");
                System.out.println("2. Mostrar todas las películas");
                System.out.println("3. Buscar una película");
                System.out.println("4. Cerrar la aplicación");
                int var = scan.nextInt();
                scan.nextLine(); // Limpiar buffer

                String sql;
                int id;
                int year;
                String title;

                switch (var) {
                    case 1:
                        System.out.println("Escriba el título de la película:");
                        title = scan.nextLine();
                        System.out.println("Escriba el año de la película:");
                        year = scan.nextInt();
                        scan.nextLine();

                        sql = "INSERT INTO films (year, title) VALUES (?, ?)";
                        try (PreparedStatement pst = c.prepareStatement(sql)) {
                            pst.setInt(1, year);
                            pst.setString(2, title);
                            pst.executeUpdate();
                        }
                        break;

                    case 2:
                        sql = "SELECT id, title, year FROM films";
                        try (Statement st = c.createStatement(); ResultSet rs = st.executeQuery(sql)) {
                            while (rs.next()) {
                                id = rs.getInt("id");
                                year = rs.getInt("year");
                                title = rs.getString("title");
                                System.out.println("Nombre de la película: " + title + ", año de estreno: " + year + ", ID: " + id);
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Escribe el ID de la película a buscar:");
                        id = scan.nextInt();
                        scan.nextLine();

                        sql = "SELECT id, title, year FROM films WHERE id = ?";
                        try (PreparedStatement pst = c.prepareStatement(sql)) {
                            pst.setInt(1, id);
                            try (ResultSet rs = pst.executeQuery()) {
                                if (rs.next()) {
                                    year = rs.getInt("year");
                                    title = rs.getString("title");
                                    System.out.println("Nombre de la película: " + title + ", año de estreno: " + year + ", ID: " + id);
                                } else {
                                    System.out.println("No se encontró ninguna película con ese ID.");
                                }
                            }
                        }
                        break;

                    case 4:
                        control = false;
                        break;

                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("La conexión con la base de datos no se pudo establecer: " + e.getMessage());
        }
    }
}
