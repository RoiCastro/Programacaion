/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ascensor;

import java.util.Scanner;

/**
 *
 * @author roi.castrocalvar
 */
public class Ascensor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Acciones posibles del ascensor 
        System.out.println("'a' para abrir, 'b' para baixar, 'p' para pechar , 's' para subir ");
        // Escaneo la entrada de teclado
        Scanner scan = new Scanner(System.in);
        String action = scan.nextLine();
        // ACiones
        switch(action){
            case "a":
                System.out.println("abrir");
                break;
            case "b":
                System.out.println("baixar");
                break;
            case "p":
                System.out.println("pechar");
                break;
            default:
                System.out.println("erro");
                break;
        }
    }
    
}
