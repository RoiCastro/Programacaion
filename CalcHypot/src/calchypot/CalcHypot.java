/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calchypot;

/**
 *
 * @author roi.castrocalvar
 */
public class CalcHypot {
    //Declaramos un metodo para calcular hipotenusa
    public static void main(String[] args) {
        //Valores de los catetos
        double cat1 = 3;
        double cat2 = 4;
        //Calculo de la hipotenusa
        Math.pow(cat2, 2);
        Math.pow(cat1, 2);
        double results = Math.sqrt(Math.pow(cat1, 2)+Math.pow(cat2, 2));
        System.out.print("El valor de la hipotenusa es "+results);
    }
    
}
