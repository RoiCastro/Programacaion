/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hogwarts.modelo;

import java.util.ArrayList;

/**
 *
 * @author roi.castrocalvar
 */
public class Subject {

    private String nomeMateria;
    private String codigoMateria;
    private int cursoMateria;
    private Teacher profesor;
    private ArrayList<Student> alumnos = new ArrayList<>();

    /**
     * Ontiene
     *
     * @return
     */
    public String getNomeMateria() {
        return nomeMateria;
    }

    /**
     * Inserta
     *
     * @param nomeMateria
     */
    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    /**
     * Obtiene
     *
     * @return
     */
    public String getCodigoMateria() {
        return codigoMateria;
    }

    /**
     * Inserta
     *
     * @param codigoMateria
     */
    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    /**
     * Obtiene
     *
     * @return
     */
    public int getCursoMateria() {
        return cursoMateria;
    }

    /**
     * Inserta
     *
     * @param cursoMateria
     */
    public void setCursoMateria(int cursoMateria) {
        this.cursoMateria = cursoMateria;
    }

    /**
     * Obtiene
     *
     * @return
     */
    public Teacher getProfesor() {
        return profesor;
    }

    /**
     * Inserta
     *
     * @param profesor
     */
    public void setProfesor(Teacher profesor) {
        this.profesor = profesor;
    }

    /**
     * Obtiene
     *
     * @return
     */
    public ArrayList<Student> getAlumnos() {
        return alumnos;
    }

    /**
     * Inserta
     *
     * @param alumnos
     */
    public void setAlumnos(ArrayList<Student> alumnos) {
        this.alumnos = alumnos;
    }

    /**
     *
     * @param nomeMateria
     * @param codigoMateria
     * @param cursoMateria
     * @param profesor
     */
    public Subject(String nomeMateria, String codigoMateria, int cursoMateria, Teacher profesor) {
        this.nomeMateria = nomeMateria;
        this.codigoMateria = codigoMateria;
        this.cursoMateria = cursoMateria;
        this.profesor = profesor;
    }


}
