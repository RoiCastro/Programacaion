/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adventcalendar;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author roi.castrocalvar
 */
public class AdventCalendar {

    private int ancho = 4;
    private int alto = 6;
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AdventCalendar calendario1 = new AdventCalendar();

        calendario1.fill();
        calendario1.show();
    }

    public void show() {
        for (int i = 0; i < alto; i++) {
            System.out.println();
            for (int j = 0; j < ancho; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
        }
    }

    /**
     * Comproba se o array "matriz" contén un determinado valor
     *
     * @param value Valor que se quere comprobar se está ou non en "matriz"
     * @return true se o valor recibido está en "matriz", false en caso
     * contrario
     */
    private boolean contains(int value) {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (matriz[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 
     */
    public void fill() {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                int value;
                do {
                    value = new java.util.Random().nextInt(24) + 1;
                } while (contains(value));

                matriz[i][j] = value;

            }
        }

    }
    public void eat() {
        for(int i=1; i<=(alto*ancho);i++){
            
        }
    }

}
