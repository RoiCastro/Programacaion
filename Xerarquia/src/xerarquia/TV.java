/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xerarquia;

/**
 *
 * @author roi.castrocalvar
 */
public class TV extends Device {

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

}
