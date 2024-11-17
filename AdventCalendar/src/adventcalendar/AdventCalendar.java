/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adventcalendar;

import java.util.Arrays;

/**
 *
 * @author roi.castrocalvar
 */
public class AdventCalendar {

    private final int COLUMNS = 4;
    private final int ROWS  = 6;
    private int[][] matriz = new int[ROWS ][COLUMNS];
    private int eaten = 1;

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
        for (int a = 0; a < 24; a++) {
            calendario1.eat();
            calendario1.show();
            calendario1.christmasIsHere();
        }
    }

    /**
     * Metodo para mostrar la "matriz"
     */
    public void show() {
        for (int i = 0; i < ROWS ; i++) {
            System.out.println();
            for (int j = 0; j < COLUMNS; j++) {
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
        for (int i = 0; i < ROWS ; i++) {
            for (int j = 0; j < COLUMNS; j++) {
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
        for (int i = 0; i < ROWS ; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                int value;
                do {
                    value = new java.util.Random().nextInt(ROWS  * COLUMNS) + 1;
                } while (contains(value));

                matriz[i][j] = value;
            }
        }

    }

/**
 * Este método busca el valor actual de `eaten` dentro de la matriz y lo sustituye por 0.
 * Una vez encuentra y reemplaza dicho valor, incrementa `eaten` para marcar
 * el siguiente número que se debe "comer".
 * 
 * El método termina en cuanto encuentra el valor y lo reemplaza, por lo que
 * solo se "come" un número por cada llamada a este método.
 */
    public void eat() {

        for (int i = 0; i < ROWS ; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (matriz[i][j] == eaten) {
                    matriz[i][j] = 0;
                    eaten++;
                    return;
                }
            }
        }
    }

    /**
     * Comprueba si todos los valores estan en '0' y si es asi manda un mensaje
     * por pantalla y si no no muestra nada
     *
     * @return true o false si todos los valores de la matriz del calendario
     * estan a '0'
     */
    public boolean christmasIsHere() {
        int contador = 0;
        for (int i = 0; i < ROWS ; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (matriz[i][j] == 0) {
                    contador++;
                }
            }
        }
        if (contador == (ROWS*COLUMNS)) {
            System.out.println("La naviadad ya esta aqui");
            return true;
        }
        return false;
    }
}
