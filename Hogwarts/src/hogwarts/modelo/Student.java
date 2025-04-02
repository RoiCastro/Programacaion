/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hogwarts.modelo;

/**
 *
 * @author roi.castrocalvar
 */
public class Student extends HogwartsCharacter{
    
    private String quidditch;
    private int curso;

    /**
     * Obtiene
     * @return 
     */
    public String getQuidditch() {
        return quidditch;
    }

    /**
     * Inserta
     * @param quidditch 
     */
    public void setQuidditch(String quidditch) {
        this.quidditch = quidditch;
    }

    /**
     * Obtiene
     * @return 
     */
    public int getCurso() {
        return curso;
    }

    /**
     * Inserta
     * @param curso 
     */
    public void setCurso(int curso) {
        this.curso = curso;
    }

    /**
     * 
     * @param quidditch
     * @param curso
     * @param nome
     * @param caracteristicas
     * @param codigo
     * @param casa 
     */
    public Student(String nome, String caracteristicas, String codigo, String casa, Pet pet, String quidditch, int curso) {
        super(nome, caracteristicas, codigo, casa);
        this.quidditch = quidditch;
        this.curso = curso;
    }

    
}
