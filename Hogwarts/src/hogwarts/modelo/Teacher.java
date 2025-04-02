/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hogwarts.modelo;

/**
 *
 * @author roi.castrocalvar
 */
public class Teacher extends HogwartsCharacter {

    private String CV;

    /**
     *Obtiene
     * @return
     */
    public String getCV() {
        return CV;
    }

    /**
     * Inserta
     * @param CV
     */
    public void setCV(String CV) {
        this.CV = CV;
    }

    /**
     * 
     * @param CV
     * @param nome
     * @param caracteristicas
     * @param codigo
     * @param casa 
     */
    public Teacher(String nome, String caracteristicas, String codigo, String casa, Pet pet, String CV) {
        super(nome, caracteristicas, codigo, casa);
        this.CV = CV;
    }
}
