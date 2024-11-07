/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmarks;

import java.util.Scanner;

/**
 *
 * @author roi.castrocalvar
 */
public class StudentMarks {

    private int cantidadAlumnos = 3;
    private int[] notes = new int[cantidadAlumnos];
    private String[] nomes = new String[cantidadAlumnos];

    /**
     * Obtine a cantidade de alumnos
     *
     * @return
     */
    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    /**
     * Devolve a cantidade de alumnos
     *
     * @param cantidadAlumnos
     */
    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    /**
     * Obtiene a nota do alumno
     *
     * @return
     */
    public int[] getNotes() {
        return notes;
    }

    /**
     * Poñe a nota ao alumno
     *
     * @param notes
     */
    public void setNotes(int[] notes) {
        this.notes = notes;
    }

    /**
     * Obtiene el nombre del alumno
     *
     * @return
     */
    public String[] getNomes() {
        return nomes;
    }

    /**
     * Nomea o alumno
     *
     * @param nomes
     */
    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    /**
     * Metodo para introducir las notas y nombres en todos los alumnos la
     * primera vez
     */
    private void ponerDatos() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Escribe el nombre del alumuno " + i);
            nomes[i] = scanner.nextLine();
            System.out.println();
            System.out.println("Escribe la nota del alumuno " + i);
            notes[i] = scanner.nextInt();
            String porque = scanner.nextLine();
            System.out.println();
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentMarks daw1 = new StudentMarks();
        daw1.ponerDatos();
        System.out.println(daw1.max());
        System.out.println(daw1.min());
    }

    /**
     * Devolve o alumno con a nota mais baixa
     *
     * @return
     */
    public String min() {

        int numero = Integer.MAX_VALUE;
        int numeroI = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] < numero) {
                numero = notes[i];
                numeroI = i;
            }
        }
        return nomes[numeroI];

    }

    /**
     * Devolve o alumno con a nota mais alta
     *
     * @return
     */
    public String max() {
        int numero = Integer.MIN_VALUE;
        int numeroI = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > numero) {
                numero = notes[i];
                numeroI = i;
            }
        }
        return nomes[numeroI];

    }
}
