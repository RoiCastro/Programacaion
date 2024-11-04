/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuartohotel;

/**
 *
 * @author roi.castrocalvar
 */
public class CuartoHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age = 19;
        boolean retiredCard = false;
        boolean universityCard = true;
        boolean largeFamilyCard = true;
        boolean unemployed = true;

        if (age < 30 | age > 55) {

            if (age < 30) {
                if (universityCard == true && unemployed == true) {
                    System.out.println("O cuarto custa 35€");
                }
                else if (universityCard == true || unemployed == true) {
                    System.out.println("O cuarto custa 40€");
                } else {
                    System.out.println("O cuarto custa 50€");
                }

            } else {
                if (retiredCard == true || unemployed == true) {
                    System.out.println("O cuarto custa 45€");
                } else {
                    System.out.println("O cuarto custa 60€");
                }
            }

        } else if (largeFamilyCard == true) {
            System.out.println("O cuarto custa 65€");
        } else {
            System.out.println("O cuarto custa 75€");
        }

    }
}
