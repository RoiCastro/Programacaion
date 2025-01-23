/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xerarquia;

import xerarquia.ave.*;
import xerarquia.persona.*;
import xerarquia.aparato.*;

/**
 *
 * @author roi.castrocalvar
 */
public class Main {

    /**
     *Inicia la ejecucion
     * 
     * @param args
     */
    public static void main(String[] args) {

        //Creando los habladores
        Parrot loro = new Parrot("Australia", "Amrillo", 0, 'h');
        Piolin piolin = new Piolin(0, "na ducha", 0, 'a');
        Student alumno = new Student("Informatica", "1 Daw", "Roi", 19);
        Teacher profesor = new Teacher("Informatica", "antonio@gmail.com", "Antonio", 30);
        Concierge bedel = new Concierge("Dia", "10", "Paco", 50);
        TV tv = new TV(true, 0, Integer.SIZE, 0);
        Radio radio = new Radio(true, 0, Integer.SIZE, 0);

        //Creando el array de los habladores
        Speaker[] habladores = new Speaker[7];

        //Añadiendo al array los habladores
        habladores[0] = tv;
        habladores[1] = radio;
        habladores[2] = loro;
        habladores[3] = piolin;
        habladores[4] = alumno;
        habladores[5] = profesor;
        habladores[6] = bedel;

        //LLamando a los habladores a hablar
        for (Speaker habladore : habladores) {
            habladore.speack();
            System.out.println("");
        }

    }

}
