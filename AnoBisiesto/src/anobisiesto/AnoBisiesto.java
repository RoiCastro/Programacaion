/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anobisiesto;

import java.util.Scanner;

/**
 *
 * @author Roi
 */
public class AnoBisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        // Crear escners
        Scanner scanleap = new Scanner(System.in);
        Scanner scanmonth = new Scanner(System.in);
        // Escaner para saber si es bisiesto
        System.out.println("Escribe si el anho es bisiesto");
        boolean leap1 = scanleap.nextBoolean();
        // Escaner para el numero del mes
        System.out.println("Escribe el numero de mes");
        int month1 = scanmonth.nextInt();
        // Crear objeto
        Year year1 = new Year(leap1);
        year1.showDaysOfMonth(month1);

    }
    
}
