/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tacebook.persistencia;

import tacebook.model.Profile;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que simula la base de datos con almacenamiento estático de perfiles.
 */
public class TacebookDB {

    // Colección estática que almacena todos los perfiles
    public static List<Profile> profiles = new ArrayList<>();
    
    /*
    * Pechar conexion con la base de datos
    */
    public static void close(){
        
    }
}
