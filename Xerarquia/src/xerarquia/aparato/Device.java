/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xerarquia.aparato;

/**
 *
 * @author roi.castrocalvar
 */
public class Device {

    protected Integer consumption;
    protected double price;

    public Integer getConsumption() {
        return consumption;
    }

    public void setConsumption(Integer consumption) {
        this.consumption = consumption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Device(Integer consumption, double price) {
        this.consumption = consumption;
        this.price = price;
    }

}
