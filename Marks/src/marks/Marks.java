/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marks;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author roi.castrocalvar
 */
public class Marks {

    private int cantidadAlumnos = 10;
    private ArrayList<Integer> notes = new ArrayList<>();

    /**
     * Obtiens la cantidad de alumnos de la clase Marks
     *
     * @return
     */
    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    /**
     * Pones la cantidad de alumnos
     *
     * @param cantidadAlumnos
     */
    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    /**
     * Obtines la nota del alumno
     *
     * @return
     */
    public ArrayList<Integer> getNotes() {
        return notes;
    }

    /**
     * Colocas la nota al alumno
     *
     * @param notes
     */
    public void setNotes(ArrayList<Integer> notes) {
        this.notes = notes;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Marks daw1 = new Marks();
        daw1.ponerNotas();
        System.out.println(daw1.getAverage());
    }

    /**
     * Obtines la media de todos los alumnos usando un iterador.
     *
     * @return
     */
    public double getAverage() {
        double sum = 0;
        java.util.Iterator<Integer> iterator = notes.iterator(); // Crear o iterador

        while (iterator.hasNext()) { // Percorrer a lista usando o iterador
            sum += iterator.next();
        }

        return notes.isEmpty() ? 0 : sum / notes.size(); // Previr división por 0
    }

    /**
     * Metodo para introducir las notas en todos los alumnos la primera vez
     */
    public void ponerNotas() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Escribe la nota del alumuno " + i);
            notes.add(scanner.nextInt());
            //notes[i] = scanner.nextInt();
            System.out.println();
        }

    }
}
