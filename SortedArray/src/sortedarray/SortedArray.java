/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortedarray;

/**
 * Clase que implementa un arreglo de enteros y proporciona métodos para
 * ordenarlo y mostrar su contenido.
 *
 * @author roi.castrocalvar
 */
public class SortedArray {

    /**
     * Arreglo de enteros que se manipulará en la clase.
     */
    private int[] array = new int[]{14, 165, 2, 18, 19, 16};
    private boolean sorted = false;

    /**
     * Obtiene el arreglo de enteros actual.
     *
     * @return El arreglo de enteros.
     */
    public int[] getArray() {
        return array;
    }

    /**
     * Establece un nuevo arreglo de enteros.
     *
     * @param array El nuevo arreglo a establecer.
     */
    public void setArray(int[] array) {
        this.array = array;
    }

    /**
     * Devulve el valor de la Sorted
     *
     * @return
     */
    public boolean isSorted() {
        return sorted;
    }

    /**
     * obtine el valor de la Sorted
     *
     * @param sorted
     */
    public void setSorted(boolean sorted) {
        this.sorted = sorted;
    }

    /**
     * Método principal que ejecuta el programa. Crea una instancia de
     * {@code SortedArray}, ordena el arreglo y muestra su contenido.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // Crear una instancia de SortedArray
        SortedArray myArray = new SortedArray();
        myArray.sort();
        myArray.show();
        System.out.println("Tiene(16) : " + myArray.contains(16));
    }

    /**
     * Método que ordena el arreglo en orden ascendente utilizando el algoritmo
     * de ordenamiento de burbuja.
     *
     * @return El arreglo ordenado.
     */
    public int[] sort() {
        // Variable para controlar si hubo intercambio en la pasada actual
        boolean swapped = true;
        // Bucle que recorre el arreglo desde el final hasta el principio
        for (int i = array.length - 1; i > 0 && swapped; i--) {
            swapped = false; // Reiniciar el estado de intercambio

            // Bucle interno para comparar y ordenar elementos adyacentes
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambiar los elementos si están fuera de orden
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true; // Indicar que hubo intercambio
                }
            }
        }
        return array;
    }

    /**
     * Método que muestra los elementos del arreglo en una sola línea, separados
     * por espacios.
     */
    public void show() {

        try {
            for (int i = 0; i <= array.length; i++) { // Intentar acceder fuera del límite
                System.out.print(array[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) { // captura la excepcion
            System.out.println("\nError: Intentaste acceder a una posición fuera de los límites del array.");// "/n" sirve para hacer un salto de linea
        }
        /*
        for (int myArray : array) {
            System.out.print(myArray + " ");
        }
        sorted = true;
         */
        System.out.println();
    }

    /**
     * Comproba se o array "matriz" contén un determinado valor
     *
     * @param value Valor que se quere comprobar se está ou non en "matriz"
     * @return true se o valor recibido está en "matriz", false en caso
     * contrario
     */
    private boolean contains(int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}
