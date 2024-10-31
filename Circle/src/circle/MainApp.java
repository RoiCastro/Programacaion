/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circle;

/**
 *
 * @author roi.castrocalvar
 */
public class MainApp {
    /**
     * 
     * @param args 
     */
    
    public static void main(String[] args) {
        // Creo dos circulos y le doi sus valores
        Circle c1= new Circle(9);
        Circle c2= new Circle(3);
        //Agrando el radio del circulo
        c1.enlarge();
        c2.enlarge();
        //Muestro el resultado del metodo show
        c1.show();
        c2.show();
    }
}
