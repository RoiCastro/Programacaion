/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortedarray;

/**
 *
 * @author roi.castrocalvar
 */
public class SortedArray {

    private int[] array = new int[]{14, 165, 2, 18, 19, 14};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SortedArray array = new SortedArray();
        array.sort();
        array.show();
    }

    public void sort() {
        for (int i = 0; i < array.length; i++) {
            if(array[i]>(array[i]+1)){
                System.out.print("perro  ");
            }
        }
    }

    public void show() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
