/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padel.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author roi.castrocalvar
 */
public abstract class Booking {
    protected Date date;
    protected String hour;
    protected PadelCourt court;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public PadelCourt getCourt() {
        return court;
    }

    public void setCourt(PadelCourt court) {
        this.court = court;
    }

    public Booking(Date date, String hour, PadelCourt court) {
        this.date = date;
        this.hour = hour;
        this.court = court;
    }
    
    public abstract double getPrice();
    public abstract boolean isCompleted();
    public abstract boolean containsPlayer(String id);
    public  String getDescription(){
        return "Reserva pendente:"+"\n"+ "Data: " + new SimpleDateFormat("dd/MM/yyyy").format(date)+ " Hora: "+hour + "Pista: "+court.getNumber();
    };
}
