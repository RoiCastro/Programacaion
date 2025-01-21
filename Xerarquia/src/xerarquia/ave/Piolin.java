/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xerarquia.ave;

/**
 *
 * @author roi.castrocalvar
 */
public class Piolin extends Canary {

    protected int numberOfFilms;

    public int getNumberOfFilms() {
        return numberOfFilms;
    }

    public void setNumberOfFilms(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }

    public Piolin(int numberOfFilms, boolean sing, int age, char sex) {
        super(sing, age, sex);
        this.numberOfFilms = numberOfFilms;
    }

}
