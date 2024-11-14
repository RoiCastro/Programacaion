/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statistics;

import java.util.Scanner;

/**
 *
 * @author roi.castrocalvar
 */
public class Statistics {

    private int arrayLength;
    private int[] median = new int[arrayLength];
    
    /**
     * Obtine el valor del atributo 'median' 
     * @return 
     */
    public int[] getMedian() {
        return median;
    }
    
    /**
     * Establece el valor de la variable 'median'
     * @param median 
     */
    public void setMedian(int[] median) {
        this.median = median;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Statistics statistic1 = new Statistics();

        statistic1.lenghtArray();
        statistic1.fillArray();
        System.out.println("La mediana es " + statistic1.median());
    }

    /**
     * Este metodo devulve la media de un array de numeros
     * @return 
     */
    public int median() {

        for (int med : median) {
            int biggers = 0;
            int lowers = 0;

            for (int i = 0; i < median.length; i++) {
                if (med != median[i]) {
                    if (med > median[i]) {
                        lowers++;
                    }
                    if (med < median[i]) {
                        biggers++;
                    }
                }
            }

            if (biggers == lowers) {
                return med;
            }
        }
        return 0;
    }
    
    private int lenghtArray(){
        Scanner scan = new Scanner(System.in);
        do{
            arrayLength= scan.nextInt();
        }while(arrayLength%2==0);
        return arrayLength;
    }
    
    private void fillArray(){
        Scanner scan = new Scanner(System.in);
    
        for (int i = 0; i < median.length; i++) {
            median[i]=scan.nextInt();
        }
    }
}
