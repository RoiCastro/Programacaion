/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicacionprimaria;

/**
 *
 * @author roi.castrocalvar
 */
public class MultiplicacionPrimaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1 = 10;
        int number2 = 5;
        int suma = 0;
        for (int i = 0; i < number2; i++) {
            suma = suma + number1;
            System.out.println(suma);
        }

    }

    public void conWhi() {
        int number1 = 5;
        int number2 = 9;
        int i = 0;
        int suma = 0;
        while (i < number2) {
            suma = suma + number1;
            System.out.println(suma);
            i++;
        }
    }

}
