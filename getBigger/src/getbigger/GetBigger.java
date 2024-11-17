/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package getbigger;

import java.util.Scanner;

/**
 *
 * @author Roi
 */
public class GetBigger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GetBigger number = new GetBigger();
        number.getBiger();
    }

    /**
     * Pide por teclado al ususario 10 numeros y devulve el mayor
     */
    public void getBiger() {
        Scanner scan = new Scanner(System.in);
        int bigger = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numero");
            int number = scan.nextInt();
            if (number > bigger) {
                bigger = number;
            }
        }
        System.out.println("El numero mas grande introducido es: "+bigger);
    }
}
