/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author roi.castrocalvar
 */
public class DBCliente {

    public void addClient(Client cli) {
        String name = cli.getName();
        String surname = cli.getSurname();
        String nif = cli.getNif();

        // Consulta SQL corregida
        String sql = "INSERT INTO clients (name, surname, nif) VALUES (?, ?, ?)";

        try (Connection c = DriverManager.getConnection(DBInitCliente.URL); PreparedStatement pst = c.prepareStatement(sql)) {

            pst.setString(1, name);
            pst.setString(2, surname);
            pst.setString(3, nif);
            pst.executeUpdate(); // Ejecutar la inserción

        } catch (SQLException e) {
            System.err.println("Error al acceder a la base de datos: " + e.getMessage());
        }
    }

    public ArrayList<Client> clientList() {
        ArrayList<Client> clientes = new ArrayList<>();
        String sql = "SELECT nif, name, surname FROM clients";

        try (Connection c = DriverManager.getConnection(DBInitCliente.URL); Statement st = c.createStatement(); ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                String nif = rs.getString("nif");
                String name = rs.getString("name");
                String surname = rs.getString("surname");

                Client client = new Client(nif, name, surname);
                clientes.add(client); // ¡Agregamos el cliente a la lista!
            }

        } catch (SQLException e) {
            System.err.println("Error al acceder a la base de datos: " + e.getMessage());
        }

        return clientes;
    }

    public void removeClient(String nif) {
        String sql = "DELETE FROM clients WHERE nif = ?";

        try (Connection c = DriverManager.getConnection(DBInitCliente.URL); PreparedStatement pst = c.prepareStatement(sql)) {

            pst.setString(1, nif);
            int affectedRows = pst.executeUpdate();

            if (affectedRows == 0) {
                System.out.println("No se encontró un cliente con el NIF proporcionado.");
            } else {
                System.out.println("Cliente eliminado correctamente.");
            }

        } catch (SQLException e) {
            System.err.println("Error al eliminar el cliente: " + e.getMessage());
        }
    }

}
