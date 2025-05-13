/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padel.model;

import java.util.Date;

/**
 *
 * @author roi.castrocalvar
 */
public class SingleBooking extends Booking {

    private Player[] players;

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public SingleBooking(Date date, String hour, PadelCourt court) {
        super(date, hour, court);
        players = new Player[2];
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean isCompleted() {
        boolean completed = true;
        for (Player player : players) {
            if (player == null) {
                completed = false;
            }
        }
        return completed;
    }

    @Override
    public boolean containsPlayer(String id) {
        boolean contains = false;
        for (Player player : players) {
            if (player.getId() == id) {
                contains = true;
            }
        }
        return contains;
    }

    @Override
    public String getDescription() {
        String[] player = {"PENDENTE", "PENDENTE"};
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                player[i] = "" + players[i].getId() + " (" + players[i].getScore() + ")";
            }
        }
<<<<<<< Updated upstream
        return super.getDescription() +"\n"+ "Xogadores: " + player[0] + " " + player[1];
=======
        return super.getDescription() + " Xogadores: " + player[0] + " " + player[1];
>>>>>>> Stashed changes
    }

    public void addPlayer(Player player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                players[i] = player;
                return;
            }
        }
    }
}
