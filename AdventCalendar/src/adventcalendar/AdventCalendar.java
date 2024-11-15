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
    private int eaten = 1;

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
     * Obtiene la posicion que se va a comer
     *
     * @return
     */
    public int getEaten() {
        return eaten;
    }

    /**
     * Establece la cantidad siguiente posicion para comer
     *
     * @param eaten
     */
    public void setEaten(int eaten) {
        this.eaten = eaten;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AdventCalendar calendario1 = new AdventCalendar();

        calendario1.fill();
        for (int a = 0; a < 10; a++) {
            calendario1.eat();
            calendario1.show();
        }
        
    }

    /**
     * Metodo para mostrar la "matriz"
     */
    public void show() {
        for (int i = 0; i < alto; i++) {
            System.out.println();
            for (int j = 0; j < ancho; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
        }
        System.out.println();
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
     * Rellena o array "matriz" con numeros del 1 al 'alto' por 'ancho'
     */
    public void fill() {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                int value;
                do {
                    value = new java.util.Random().nextInt(alto * ancho) + 1;
                } while (contains(value));

                matriz[i][j] = value;
            }
        }

    }

    /**
     *
     */
    public void eat() {

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (matriz[i][j] == eaten) {
                    matriz[i][j] = 0;
                    eaten++;
                    return;   
                }   
            }
        }
    }

}
