/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verifique;

/**
 *
 * @author roi.castrocalvar
 */
public class Verifique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 98;
        //Comprubo si cumple las condiciones
        if (x > 100 || x % 2 == 0) {
            System.out.println("O número "+x+" cumpre a condición");
        } else {
            System.out.println("O número "+x+" non cumpre a condición");
        }
    }

}
