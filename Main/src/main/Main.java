/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Roi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salarioTotal = 0;
        boolean domingo = true;
        int horasDiarais = 8;
        
        if (!domingo) {
            for (int i = 0; i < 5; i++) {
                WorkingDay diaNormal = new WorkingDay('d', 'x', horasDiarais);
                salarioTotal += diaNormal.salary();
            }
        } else {
            for (int i = 0; i < 4; i++) {
                WorkingDay diaNormal = new WorkingDay('d', 'x', horasDiarais);
                salarioTotal += diaNormal.salary();
            }

            WorkingDay diaDomingo = new WorkingDay('d', 'd', horasDiarais);
            salarioTotal += diaDomingo.salary();
        }
        System.out.println("El salario total de la semana es: " + salarioTotal + " euros");

    }
}
