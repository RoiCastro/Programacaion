/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author roi.castrocalvar
 */
public class DBCliente {
    public void addClient(Client cli) throws SQLException{
        String name = cli.getName();
        String surname = cli.getSurname();
        String nif = cli.getNif();
        try(Connection c = DriverManager.getConnection(DBInitCliente.URL);
             PreparedStatement pst =  c.createStatement();){
            
        }
    }
}
