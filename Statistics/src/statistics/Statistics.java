/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statistics;

import java.util.Scanner;

/**
 * Clase Statistics que permite calcular la mediana de un arreglo de números.
 * Requiere un arreglo de longitud impar para calcular la mediana.
 * 
 * @author roi.castrocalvar
 */
public class Statistics {

    private int arrayLength;
    private int[] median;

    /**
     * Obtiene el valor del atributo 'median'
     * 
     * @return el arreglo de números del cual se va a calcular la mediana
     */
    public int[] getMedian() {
        return median;
    }

    /**
     * Establece el valor del atributo 'median'
     * 
     * @param median el arreglo de números del cual se va a calcular la mediana
     */
    public void setMedian(int[] median) {
        this.median = median;
    }

    /**
     * Método principal para iniciar la aplicación. Permite al usuario ingresar
     * el tamaño del arreglo y sus valores, luego calcula y muestra la mediana.
     * 
     * @param args argumentos de la línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Statistics statistic1 = new Statistics();
        statistic1.lengthArray();
        statistic1.fillArray();
        System.out.println("La mediana es " + statistic1.median());
    }

    /**
     * Calcula la mediana de un arreglo de números.
     * La mediana es el valor central cuando el arreglo está ordenado.
     * 
     * @return el valor de la mediana si existe.
     */
    public int median() {
 for (int i = 0; i < arrayLength - 1; i++)
    {
        int index = i;
        for (int j = i + 1; j < arrayLength; j++)
            if (median[j] < median[index]) //Finds smallest number
                index = j;

        int smallerNumber = median[index];  //Swap
        median[index] = median[i];
        median[i] = smallerNumber;
    }
        return median[arrayLength/2];
    
}

    /**
     * Solicita al usuario ingresar la longitud del arreglo, asegurándose
     * de que sea un número impar.
     */
    private void lengthArray() {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Introduce la cantidad de números para la mediana.");
            arrayLength = scan.nextInt();
            if(arrayLength % 2 == 0){
                System.out.println("Debe ser impar");
            }
        } while (arrayLength % 2 == 0);

        median = new int[arrayLength];
    }

    /**
     * Solicita al usuario llenar el arreglo con números enteros.
     */
    private void fillArray() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < median.length; i++) {
            System.out.println("Introduce el número en la posición " + i + ":");
            median[i] = scan.nextInt();
        }
    }
}
