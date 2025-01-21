/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xerarquia.aparato;
import xerarquia.Speaker;

/**
 *
 * @author roi.castrocalvar
 */
public class TV extends Device implements Speaker{

    protected boolean teletext;
    protected int inches;

    public boolean isTeletext() {
        return teletext;
    }

    public void setTeletext(boolean teletext) {
        this.teletext = teletext;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public TV(boolean teletext, int inches, Integer consumption, double price) {
        super(consumption, price);
        this.teletext = teletext;
        this.inches = inches;
    }

    @Override
    public void speack() {
        System.out.println("Ola, son unha "+getClass() +" e sei falar.");
        System.out.println("Consumo: "+getConsumption()+" Prezo: "+getPrice());
        System.out.println();
    }

}
