/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xerarquia;

/**
 *
 * @author roi.castrocalvar
 */
public class Vulture extends Bird {

    protected int flightSpeed;
    protected int weight;

    public int getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(int flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vulture(int flightSpeed, int weight, int age, char sex) {
        super(age, sex);
        this.flightSpeed = flightSpeed;
        this.weight = weight;
    }

}
