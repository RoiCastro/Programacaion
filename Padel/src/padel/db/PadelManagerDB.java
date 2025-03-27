/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padel.db;

import java.util.ArrayList;
import java.util.HashMap;
import padel.model.Booking;
import padel.model.PadelCourt;
import padel.model.Player;

/**
 *
 * @author roi.castrocalvar
 */
public class PadelManagerDB {
    public static HashMap<String, Player> players = new HashMap<>();
    public static ArrayList<PadelCourt> courts;
    private static ArrayList<Booking> bookings;

    public static HashMap<String, Player> getPlayers() {
        return players;
    }

    public static void setPlayers(HashMap<String, Player> players) {
        PadelManagerDB.players = players;
    }

    public static ArrayList<PadelCourt> getCourts() {
        return courts;
    }

    public static void setCourts(ArrayList<PadelCourt> courts) {
        PadelManagerDB.courts = courts;
    }

    public static ArrayList<Booking> getBookings() {
        return bookings;
    }

    public static void setBookings(ArrayList<Booking> bookings) {
        PadelManagerDB.bookings = bookings;
    }




    
            
}
