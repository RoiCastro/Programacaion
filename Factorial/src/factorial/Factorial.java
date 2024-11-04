/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

/**
 *
 * @author roi.castrocalvar
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculo de factorial con while

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);

    }

    public void manuel() {
        // Calculo de factorial con for
        int numberbase = 5;
        int number = 1;
        for (int i = 1; i < (numberbase + 1); i++) {
            number = i * number;
            System.out.println(number);
        }
    }

    public void jose() {
        int numberbase = 9;
        int number = 1;
        int i = 1;
        while (i < (numberbase + 1)) {
            number = i * number;
            System.out.println(number);
            i++;
        }

    }
}
