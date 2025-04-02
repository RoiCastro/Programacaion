/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hogwarts.persitencia;

import hogwarts.modelo.Subject;
import java.util.ArrayList;

/**
 *
 * @author roi.castrocalvar
 */
public class SubjectDB {

    private static ArrayList<Subject> materias = new  ArrayList<>();

    /**
     *
     * @return
     */
    public static ArrayList<Subject> getMaterias() {
        return materias;
    }

    /**
     * Constructor
     */
    public SubjectDB() {
        
    }

    /**
     *
     * @param codigo
     * @return
     */
    public static Subject findByCode(String codigo) {
        Subject materiaBuscada = null;
        for (Subject materia : materias) {
            if (materia.getCodigoMateria().equals(codigo)) {
                materiaBuscada = materia;
            }
        }
        return materiaBuscada;
    }
}
