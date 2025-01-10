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

    public Matrix(boolean c) {
        if (c) {
            for (int i = 0; i < alto; i++) {
                for (int j = 0; j < ancho; j++) {
                    matriz[i][j] = i + j;
                }
            }
        }
    }

    public Matrix() {
        ponerDatos();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matrix matriz1 = new Matrix(true);
        Matrix matriz2 = new Matrix();
        Matrix matriz3 = new Matrix();

        Matrix sumaMatriz = matriz3.sum(matriz2,matriz1);
        sumaMatriz.show();

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
                resultado.matriz[i][j] = this.matriz[i][j] + otraMatriz.matriz[i][j];
            }
        }
        return resultado;
    }
    /**
     * Suma dos veces la misma matriz y devulve el resultado.
     *
     * @return la matriz resultante de la suma de la actual y la otra
     */
    public Matrix sum(){
        Matrix resultado = new Matrix();
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                resultado.matriz[i][j] = this.matriz[i][j] + this.matriz[i][j];
            }
        }
        return resultado;
        
    }
    
    /**
     * Suma tres matrices y devuelve el resultado.
     *
     * @param Matriz1  otra matriz que se sumara a la actual
     * @param Matriz2  otra matriz que se sumara a la actual
     * @return la matriz resultante de la suma de la actual y la otra
     */
    public Matrix sum(Matrix Matriz1,Matrix Matriz2){
        Matrix resultado = new Matrix();
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                resultado.matriz[i][j] = this.matriz[i][j] + Matriz1.matriz[i][j] +Matriz2.matriz[i][j];
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
                resultado.matriz[i][j] = this.matriz[i][j] - otraMatriz.matriz[i][j];
            }
        }
        return resultado;
    }

    /**
     * Permite al usuario ingresar valores para cada posición de la matriz,
     * solicitándolos por consola.
     */
    private void ponerDatos() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.println();
                System.out.println("Escribe la fila " + i + " columna " + j);
                matriz[i][j] = scanner.nextInt();
                scanner.nextLine();
                System.out.println();
            }
        }
    }

    /**
     * Muestra la matriz en consola, imprimiendo fila a fila.
     */
    private void show() {
        for (int i = 0; i < alto; i++) {
            System.out.println();
            for (int j = 0; j < ancho; j++) {
                System.out.print(matriz[i][j] + "  ");

            }
        }
    }
}
