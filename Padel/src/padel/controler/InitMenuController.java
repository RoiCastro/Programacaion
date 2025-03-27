/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padel.controler;

import padel.db.PadelManagerDB;
import padel.db.PlayerDB;
import padel.model.PadelCourt;
import padel.model.Player;

/**
 *
 * @author roi.castrocalvar
 */
public class InitMenuController {

    private InitMenuView view;

    public InitMenuController() {
        view = new InitMenuView();
    }

    public void initApp() {
        while (!view.showLoginMenu()) {

        }
    }

    public void login(String id,String password) {
        Player player = PlayerDB.findByIdAndPassword(id, password);
        if (player == null) {
            
        }
    }

    public static void main(String[] args) {
        // Creamos os datos de partida
        Player player1 = new Player("luisf", "abc", "Luis Fdez", 2.5, 25.90);
        Player player2 = new Player("maria", "abc", "Maria Insua", 2.83, 70);
        PadelCourt court1 = new PadelCourt(1, PadelCourt.DOUBLE, new String[]{"9:00", "11:00", "13:00", "16:00"});
        PadelCourt court2 = new PadelCourt(2, PadelCourt.SINGLE, new String[]{"9:00", "11:00", "13:00", "16:00"});
        PadelCourt court3 = new PadelCourt(3, PadelCourt.DOUBLE, new String[]{"9:00", "11:00"});
        // Engadimos os datos á base de datos
        PadelManagerDB.getPlayers().put(player1.getId(), player1);
        PadelManagerDB.getPlayers().put(player2.getId(), player2);
        PadelManagerDB.getCourts().add(court1);
        PadelManagerDB.getCourts().add(court2);
        PadelManagerDB.getCourts().add(court3);
        // Creamos un obxecto InitMenuController para iniciar a aplicacion
        InitMenuController imc = new InitMenuController();
        imc.initApp();
    }
}
