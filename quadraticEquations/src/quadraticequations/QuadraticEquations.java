/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadraticequations;

/**
 *
 * @author roi.castrocalvar
 */
public class QuadraticEquations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables para la ecuacion de segundo grado
        int a = 1;
        int b = -2;
        int c = -15;
        //calculamos la raiz de la ecuacion
        double sqrt = Math.sqrt(Math.pow(b, 2)-(4*a*c));
        //calculamos la parte positiva de la ecuacion de segundo grado
        double equationpos = (-b+sqrt)/(2*a);
        //calculamos la parte negativa de la ecuacion de segundo grado
        double equationneg = (-b- Math.sqrt(Math.pow(b, 2)-(4*a*c))) / (2*a);
        
        System.out.println("El resultado postivo de la ecuacion es "+equationpos);
        
        System.out.println("El resultado negativo de la ecuacion es "+equationneg);
    }
    
}
