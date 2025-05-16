/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author roi.castrocalvar
 */
public class DBInitCliente {

    public static final String URL = "jdbc:sqlite:clients.db";

    public static void init() {
        try (Connection c = DriverManager.getConnection(URL); Statement st = c.createStatement()) {

            String crearTabla = "CREATE TABLE IF NOT EXISTS clients ("
                    + "nif VARCHAR(9) PRIMARY KEY ,"
                    + "name VARCHAR(255) NOT NULL,"
                    + "surname VARCHAR(255) NOT NULL)";
            st.execute(crearTabla);
        } catch (SQLException e) {
            System.out.println("Error inicializando la base de datos: " + e.getMessage());
        }
    }
}
