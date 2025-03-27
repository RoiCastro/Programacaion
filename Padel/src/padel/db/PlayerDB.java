/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padel.db;

import padel.model.Player;

/**
 *
 * @author roi.castrocalvar
 */
public class PlayerDB {

      //NOSE IMPORTANTE REPASAR
      public static Player findByIdAndPassword(String id, String password){
// Recorremos el HashMap de jugadores de PadelManagerDB para encontrar el jugador que coincida con el id y password
        Player player = PadelManagerDB.getPlayers().get(id);

        // Si el jugador existe y la contraseña es correcta, lo devolvemos
        if (player != null && player.getPassword().equals(password)) {
            return player;
        }
        
        // Si no se encuentra el jugador o la contraseña no es correcta, devolvemos null
        return null;
        
    }
}
