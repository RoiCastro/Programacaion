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
    String url ="jdbc:mariadb://localhost:33006/peliculas" ;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        
        try (Connection c = DriverManager.getConnection("jdbc:sqlite://localhost:33006/peliculas")) {
            // Obtemos unha conexión coa base de datos
            System.out.println("Conexion realizada con exito");
            boolean control = true;
            while (control) {
                System.out.println("1. Inserte una nueva pelicula");
                System.out.println("2. Mostrar todas as peliculas");
                System.out.println("3. Buscar unha pelicula");
                System.out.println("4. Pechar a aplicacion");
                Scanner scan = new Scanner(System.in);
                int var = scan.nextInt();
                scan.nextLine();
                // parametros de la consulta
                String sql;
                int id;
                int year;
                String title;
                switch (var) {
                    case 1:
                        System.out.println("Escriba o titulo da pelicula");
                        title = scan.nextLine();
                        System.out.println("Escriba o ano da peliculas");
                        year = scan.nextInt();
                        scan.nextLine();
                        //Creamos la nueva entrada
                        sql = "INSERT INTO films (`year`, `title`) VALUES (?, ?)";
                        try (PreparedStatement pst = c.prepareStatement(sql)) {
                            pst.setInt(1, year);
                            pst.setString(2, title);
                            pst.executeUpdate();
                        }
                        break;
                    case 2:
                        sql = " SELECT f.id, f.title , f.`year` FROM films f";
                        try (Statement st = c.createStatement(); ResultSet rs = st.executeQuery(sql)) {
                            while (rs.next()) {
                                id = rs.getInt("f.id");
                                year = rs.getInt("f.year");
                                title = rs.getString("title");
                                System.out.println("Nome da pelicula: " + title + ", ano de estreno " + year + " e o id da pelcula e: " + id);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Escribe o id da pelicula a buscar:");
                        id = scan.nextInt();
                        scan.nextLine();
                        sql = "SELECT f.id, f.title , f.`year` FROM films f WHERE f.id = ?";
                        try (PreparedStatement pst = c.prepareStatement(sql)) {
                            pst.setInt(1, id);
                            // resulset necesario para saber la respuesta de la consulta
                            try (ResultSet rs = pst.executeQuery()) {
                                //IF para saber si encontro algun resultado
                                if (rs.next()) {
                                    id = rs.getInt("f.id");
                                    year = rs.getInt("f.year");
                                    title = rs.getString("title");
                                    System.out.println("Nome da pelicula: " + title + ", ano de estreno " + year + " e o id da pelcula e: " + id);
                                } else {
                                    System.out.println("Non se atopou ningunha pelicula con ese id.");
                                }
                            }
                        }
                        break;
                    case 4:
                        control = false;
                        break;
                    default:
                        throw new AssertionError();
                }

            }
        } catch (Exception e) {
            
            System.out.println("A conexión co servidor de bases de datos non se puido establecer");
        }
    }

}
