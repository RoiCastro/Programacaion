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
public class DoubleBooking extends Booking {

    private Player[][] teams;

    public Player[][] getTeams() {
        return teams;
    }

    public void setTeams(Player[][] teams) {
        this.teams = teams;
    }

    public DoubleBooking(Date date, String hour, PadelCourt court) {
        super(date, hour, court);
        teams = new Player[2][2];
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean isCompleted() {
        boolean completed = true;
        for (Player[] team : teams) {
            for (Player player : team) {
                if (player == null) {
                    completed = false;
                }
            }
        }
        return completed;
    }

    @Override
    public boolean containsPlayer(String id) {
        boolean contains = false;
        for (Player[] team : teams) {
            for (Player player : team) {
                if (player.getId() == id) {
                    contains = true;
                }
            }
        }
        return contains;
    }

    @Override
    public String getDescription() {
        String[][] player = {
            {"PENDENTE", "PENDENTE"},
            {"PENDENTE", "PENDENTE"}};
        for (int i = 0; i < player.length; i++) {
            for (int j = 0; j < player[i].length; j++) {
                if (teams[i][j] != null) {
                    player[i][j] = "" + teams[i][j].getId() + " (" + teams[i][j].getScore() + ")";
                }
            }
        }
        return super.getDescription() + " Xogadores: " +"Equipo 1:"+ player[0][0] + " " + player[0][1]+" Equipo 2:"+ player[1][0] + " " + player[1][1];
    }
        public void addPlayer(Player player, int number) {
        for (int i = 0; i < teams[number].length; i++) {
            if (teams[number][i] == null) {
                teams[number][i] = player;
                return;
            }
        }
    }
}
