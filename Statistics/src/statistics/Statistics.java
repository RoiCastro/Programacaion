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

    public int[] getMedian() {
        return median;
    }

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

        statistic1.median();

    }

    public int median() {

        int masBajo = Integer.MAX_VALUE;
        int masAlto = Integer.MIN_VALUE;

        for (int med : median) {
            System.out.println();
            if (med < masBajo) {
                masBajo = med;
                System.out.println(med);
            }
            if (med > masAlto) {
                masAlto = med;
                System.out.println(med);
            }
        }
        int midleNumber = ((masAlto - masBajo) / 2) + masBajo;

        int masCercano;
        for (int med : median) {
            masCercano = med - midleNumber;
        }// el numero mas cercano a 0 es
        return 0;
    }

}
