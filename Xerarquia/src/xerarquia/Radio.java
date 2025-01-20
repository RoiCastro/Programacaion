/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xerarquia;

/**
 *
 * @author roi.castrocalvar
 */
public class Radio extends Device {

    protected boolean casette;
    protected int power;

    public boolean isCasette() {
        return casette;
    }

    public void setCasette(boolean casette) {
        this.casette = casette;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Radio(boolean casette, int power, Integer consumption, double price) {
        super(consumption, price);
        this.casette = casette;
        this.power = power;
    }

}
