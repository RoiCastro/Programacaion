/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alerta;

/**
 *
 * @author roi.castrocalvar
 */
public class Alerta {

    /**
     * A humidade maxima que pode ter a temperatura sen ser unha advertenza
     */
    public final static int MAX_HUMI = 50;
    /**
     * A temperatura maxima que pode ter a temperatura sen ser unha advertenza
     */
    public final static int MAX_TEMP = 24;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp = 24;
        int humi = 50;

        if (temp >= MAX_TEMP && humi >= MAX_HUMI) {
            System.out.println("Alerta vermella");
        } else if (temp >= MAX_TEMP || humi >= MAX_HUMI) {
            System.out.println("Alerta amarela");
        } else {
            System.out.println("Alerta verde");
        }

    }

}
