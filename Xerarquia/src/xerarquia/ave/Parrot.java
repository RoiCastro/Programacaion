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
public class Parrot extends Bird implements Speaker {

    protected String region;
    protected String color;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Parrot(String region, String color, int age, char sex) {
        super(age, sex);
        this.region = region;
        this.color = color;
    }

    @Override
    public void speack() {
        System.out.println("Ola, son unha " + getClass().getSimpleName() + " e sei falar.");
        System.out.println("Sexo: " + sex + " Idade: " + age);
        System.out.println("Rexion: " + region + " Cor: " + color);

    }

}
