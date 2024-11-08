/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrix;

import java.util.Scanner;

/**
 *
 * @author roi.castrocalvar
 */
public class Matrix {

    private int ancho=3;
    private int alto=3;
    private int[][] matriz = new int[ancho][alto];

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    
    
        private void ponerDatos() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < (alto*ancho); i++) {
            System.out.println();
            System.out.println("Escribe la nota del alumuno " + i);
            matriz[i][i] = scanner.nextInt();
            String porque = scanner.nextLine();
            System.out.println();
        }

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matrix maztriz1 = new Matrix();
        Matrix maztriz2 = new Matrix();
        
        
        
        
    }

}
