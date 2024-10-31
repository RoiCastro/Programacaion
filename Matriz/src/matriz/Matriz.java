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
        int matrizc = 3;
        int matrizi = 10;
        for (int e = 0; e < matrizc;e++) {
            matrizi = matrizi - e;
            System.out.println();
        for (int i = 0; i < matrizf;i++) {
            System.out.print((matrizi-i)+"  ");
        }
    }
    }

}
