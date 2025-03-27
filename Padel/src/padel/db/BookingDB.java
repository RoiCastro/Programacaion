/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padel.db;

import java.util.ArrayList;
import java.util.Date;
import padel.model.Booking;

/**
 *
 * @author roi.castrocalvar
 */
public class BookingDB {

    /**
     * É un método estático que recibe unha data e devolve un ArrayList con
     * todas as reservas desa data.
     *
     * @param date
     * @return
     */
    public ArrayList<Date> findByDate(Date date) {
        ArrayList<Date> dates = new ArrayList<>();
        for (int i = 0; i < PadelManagerDB.getBookings().size(); i++) {
            if (PadelManagerDB.getBookings().get(i).getDate() == date) {
                dates.add(PadelManagerDB.getBookings().get(i).getDate());
            }
        }
        return dates;
    }

    /**
     * É un método estático que recibe un Id dun xogador e unha data e devolve
     * un ArrayList con todas as reservas dese xogador para unha data igual ou
     * posterior
     *
     * @param id
     * @param date
     * @return
     */
    public ArrayList<Date> findByUserAndDate(String id, Date date) {
        ArrayList<Date> dates = new ArrayList<>();
        for (int i = 0; i < PadelManagerDB.getBookings().size(); i++) {
            Date bookingDate = PadelManagerDB.getBookings().get(i).getDate();
            String playerId = PadelManagerDB.getPlayers().get(i).getId();
            // Comparo la fecha obteniada con la que pregunta
            if (bookingDate.compareTo(date) >= 0 && playerId.equals(id)) {
                dates.add(bookingDate);
            }
        }
        return dates;
    }

    /**
     * É un método estático que recibe como parámetro unha reserva (de tipo
     * "Booking") e a engade na lista "bookings" de "PadelManagerDB"
     *
     * @param reserva
     */
    public void save(Booking reserva) {
        PadelManagerDB.getBookings().add(reserva);
    }
}
