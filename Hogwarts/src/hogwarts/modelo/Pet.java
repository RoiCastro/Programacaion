/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hogwarts.modelo;

/**
 *
 * @author roi.castrocalvar
 */
public class Pet {

    private String animal;
    private String name;
    private int age;

    /**
     *Obtiene
     * @return
     */
    public String getAnimal() {
        return animal;
    }

    /**
     * Inserta
     * @param animal
     */
    public void setAnimal(String animal) {
        this.animal = animal;
    }

    /**
     *Obtiene
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *Inserta
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *Inserta
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @param animal
     * @param name
     * @param age
     */
    public Pet(String animal, String name, int age) {
        this.animal = animal;
        this.name = name;
        this.age = age;
    }
}
