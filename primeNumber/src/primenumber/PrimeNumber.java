/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumber;

import java.util.Scanner;

/**
 *
 * @author roi.castrocalvar
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int number;
        PrimeNumber p1 = new PrimeNumber();
        do {
            System.out.println("Escribe un numero");
            number = scan.nextInt();

            if (number == 0) {
                System.out.println("Saindo do programa.");
                break;
            }
            if (p1.primeFormula(number)) {
                System.out.println("O número é primo.");
                break;
            } else {
                System.out.println("O número non é primo.");
                break;
            }
        } while (number != 0);
    }

    /**
     * Metodo para saber si un numero es primo
     *
     * @param number El numero caul queremos saber si es primo
     * @return true | false - Devuelve si es primo o no
     */
    public boolean primeFormula(int number) {
        //Uno no es primo
        if (number <= 1) {
            return false;
        }
        //Hacemos la raiz para obtener el numero maximo a alcanzar, porque un numero primo solo tiene dos factores 1 que ya lo descartamos y su raiz
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number);
                return false;
            }
        }
        return true;
    }
}
