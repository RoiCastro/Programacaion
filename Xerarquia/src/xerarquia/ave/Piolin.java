/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xerarquia.ave;

import xerarquia.Speaker;

/**
 *
 * @author roi.castrocalvar
 */
public class Piolin extends Canary implements Speaker {

    protected int numberOfFilms;

    public int getNumberOfFilms() {
        return numberOfFilms;
    }

    public void setNumberOfFilms(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }

    public Piolin(int numberOfFilms, String sing, int age, char sex) {
        super(sing, age, sex);
        this.numberOfFilms = numberOfFilms;
    }

    @Override
    public void speack() {

        System.out.println("Ola, son unha " + getClass().getSimpleName() + " e sei falar.");
        System.out.println("Sexo: " + sex + " Idade: " + age);
        System.out.println("Canta: " + sing + " Peliculas: " + numberOfFilms);
    }

}
