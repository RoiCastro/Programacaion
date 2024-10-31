/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

/**
 *
 * @author Roi
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matrizf = 5;
        int matrizc = 5;
        int matrizi = 10;
        int matrizn = matrizi;
        for (int e = 0; e < matrizc; e++) {
            System.out.println();
            matrizi=-e;
            int i = 0;
            do {
                System.out.print(((matrizi - i)+matrizn) + " ");
                i++;
            } while (i < matrizf);
        }

    }

}
