/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xerarquia;

import java.awt.Color;
import xerarquia.ave.*;
import xerarquia.persona.*;
import xerarquia.aparato.*;


/**
 *
 * @author roi.castrocalvar
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        Parrot loro = new Parrot("Australia", Color.yellow, 0,'h');
        Piolin piolin = new Piolin(0, true, 0, 'a');
        Student alumno = new Student("Informatica", "1 Daw", "Roi", 19);
        Teacher profesor = new Teacher("Informatica", "antonio@gmail.com", "Antonio", 30);
        Concierge bedel = new Concierge("Dia", "10", "Paco", 50);
        TV tv = new TV(true, 0, Integer.SIZE, 0);
        Radio radio = new Radio(true, 0, Integer.SIZE, 0);
        
        Speaker[] habladores = new Speaker[7];
        
        habladores[0] = tv;
        habladores[0].speack();
      
    }

}
