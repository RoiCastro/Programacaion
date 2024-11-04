/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplesof5;

/**
 *
 * @author roi.castrocalvar
 */
public class MultiplesOf5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = -5;
        int numero = 0;
        if (a > 0 && b > 0) {
            if (a > b) {
                int c = a;
                a = b;
                b = c;
            }
            for (int i = a; i <= b; i++) {
                if (i % 5 == 0) {
                    numero = numero + i;
                }

            }
        System.out.println(numero);
        } else {
            System.out.println("Os números deben ser positivos");
        }
        
    }
}
