/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statistics;

/**
 *
 * @author roi.castrocalvar
 */
public class Statistics {

    private int[] median = new int[7];

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
        statistic1.median[0] = 16;
        statistic1.median[1] = 12;
        statistic1.median[2] = 99;
        statistic1.median[3] = 95;
        statistic1.median[4] = 18;
        statistic1.median[5] = 87;
        statistic1.median[6] = 10;

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

}
