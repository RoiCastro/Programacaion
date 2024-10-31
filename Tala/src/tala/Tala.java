/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tala;

/**
 *
 * @author roi.castrocalvar
 */
public class Tala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pine p1 = new Pine(34);
        Pine p2 = new Pine(25);
        p1.cut(7);
        p2.cut(12);
        System.out.println("Altura de primer pino " + p1.getHeight());
        System.out.println("Altura de segundo pino " + p2.getHeight());
    }

}
