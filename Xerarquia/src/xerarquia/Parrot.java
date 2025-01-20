/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xerarquia;

import java.awt.Color;

/**
 *
 * @author roi.castrocalvar
 */
public class Parrot extends Bird {
    protected String region;
    protected Color color;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Parrot(String region, Color color, int age, char sex) {
        super(age, sex);
        this.region = region;
        this.color = color;
    }
    
}
