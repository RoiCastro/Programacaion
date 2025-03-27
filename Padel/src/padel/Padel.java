/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padel;

import java.time.Instant;
import java.util.Date;
import padel.model.DoubleBooking;
import padel.model.PadelCourt;
import padel.model.Player;
import padel.model.SingleBooking;

/**
 *
 * @author roi.castrocalvar
 */
public class Padel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player player1 = new Player("luisf", "abc", "Luis Fdez", 2.5, 25.90);
        Player player2 = new Player("maria", "abc", "Maria Insua", 2.83, 70);
        PadelCourt court1 = new PadelCourt(1, PadelCourt.DOUBLE, new String[]{"9:00", "11:00", "13:00", "16:00"});
        PadelCourt court2 = new PadelCourt(2, PadelCourt.SINGLE, new String[]{"9:00", "11:00", "13:00", "16:00"});
        PadelCourt court3 = new PadelCourt(3, PadelCourt.DOUBLE, new String[]{"9:00", "11:00"});
        SingleBooking c = new SingleBooking(Date.from(Instant.now()), " ", court1);
        DoubleBooking a = new DoubleBooking(Date.from(Instant.now()), "", court3);
        c.addPlayer(player2);
        c.addPlayer(player1);
        a.addPlayer(player1, 0);
        a.addPlayer(player2, 1);
        System.out.println(""+c.getDescription());
        System.out.println(""+a.getDescription());
    }

}
