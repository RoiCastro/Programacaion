/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package showprime;

/**
 *
 * @author Roi
 */
public class ShowPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 90;
        

        for (int i = 2; i < n; i++) {

            boolean esPrimo = true;
            for (int e = 2; e <= Math.sqrt(i); e++) {
                if (i % e == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(i);
            }
        }
    }

}
