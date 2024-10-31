/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edad2030;

/**
 *
 * @author roi.castrocalvar
 */
public class Person {

    private String name;
    private int birthYear;

    /**
     * Saber el nombre de una persona
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Poner nombre a una persona
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * conseguir el año de nacimiento de una persona
     *
     * @return
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Poner el año de nacimiento a una persona
     *
     * @param birthYear
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * Crear nueva persona
     *
     * @param name nombre de la persona
     * @param birthYear año en el que nacio
     */
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    /**
     * Saber la edad de una persona en 2030 y mostrandolo por pantalla
     */
    public void future() {
        int futureYear =2030 - birthYear;
        System.out.println("Son " + name + ", e no ano 2030 terei " + futureYear + " anos");
    }
}
