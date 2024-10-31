/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package masgrande;

/**
 *
 * @author roi.castrocalvar
 */
public class MasGrande {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1 = 101;
        int number2 = 102;
        int number3 = 103;
        //Comporbamos cual es el nuemro mas grande y lo sacamos opr pantalla
        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println("Este numero es el mayor " + number1);
            } else {
                System.out.println("Este numero es el mayor " + number3);
            }
        } else if (number2 > number3) {
            System.out.println("Este numero es el mayor " + number2);
        } else {
            System.out.println("Este numero es el mayor " + number3);
        }
    }

}
