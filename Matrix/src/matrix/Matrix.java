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

    private int ancho = 3;
    private int alto = 3;
    private int[][] matriz = new int[alto][ancho];

    /**
     * Obtiene el ancho de la matriz.
     * 
     * @return el ancho de la matriz
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * Establece el ancho de la matriz.
     * 
     * @param ancho el ancho a establecer para la matriz
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * Obtiene el alto de la matriz.
     * 
     * @return el alto de la matriz
     */
    public int getAlto() {
        return alto;
    }

    /**
     * Establece el alto de la matriz.
     * 
     * @param alto el alto a establecer para la matriz
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }

    /**
     * Obtiene la matriz.
     * 
     * @return la matriz en forma de arreglo bidimensional
     */
    public int[][] getMatriz() {
        return matriz;
    }

    /**
     * Establece los valores de la matriz.
     * 
     * @param matriz la matriz a establecer
     */
    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    private void ponerDatos() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.println();
                System.out.println("Escribe la fila " + i + " columna " + j);
                matriz[i][j] = scanner.nextInt();
                String porque = scanner.nextLine();
                System.out.println();
            }
        }
    }

    private void show() {
        for (int i = 0; i < alto; i++) {
            System.out.println();
            for (int j = 0; j < ancho; j++) {
                System.out.print(matriz[i][j] + "  ");

            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matrix matriz1 = new Matrix();
        Matrix matriz2 = new Matrix();

        matriz1.ponerDatos();
        matriz2.ponerDatos();
        
        Matrix sumaMatriz = matriz1.sum(matriz2);
        sumaMatriz.show();
        
        Matrix subtractMatriz = matriz1.subtract(matriz2);
        subtractMatriz.show();
    }


    /**
     * Suma dos matrices y devuelve el resultado.
     * 
     * @param otraMatriz la otr matriz que se sumara a la actual
     * @return la matriz resultante de la suma de la actual y la otra
     */
    public Matrix sum(Matrix otraMatriz) {
        Matrix resultado = new Matrix();
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                resultado.matriz[i][j]=this.matriz[i][j]+otraMatriz.matriz[i][j];
            }
        }
        return resultado;
    }
    
    /**
     * Resta dos matrices y devuelve el resultado.
     * 
     * @param otraMatriz la otr matriz que se restara a la actual
     * @return la matriz resultante de la suma de la actual y la otra
     */
    public Matrix subtract(Matrix otraMatriz) {
        Matrix resultado = new Matrix();
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                resultado.matriz[i][j]=this.matriz[i][j]-otraMatriz.matriz[i][j];
            }
        }
        return resultado;
    }
}
