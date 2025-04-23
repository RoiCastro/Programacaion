/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstjdbc_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/**
 *
 * @author roi.castrocalvar
 */
public class MyFirstJDBC_APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
try ( Connection c = DriverManager.getConnection("jdbc:mariadb://localhost:33006/traballadores","admin", "daw2pass")){
  // Obtemos unha conexión coa base de datos
 
  System.out.println("Conexion realizada con exito");
  try(Statement st = c.createStatement()){
      String sql = "INSERT INTO empregado VALUES ('Jorge')";
      st.executeUpdate(sql);
  }
} catch (Exception e) {
    System.out.println(e.getMessage());
    }
    }
    
}
