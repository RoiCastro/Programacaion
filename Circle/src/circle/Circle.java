/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circle;

/**
 *
 * @author roi.castrocalvar
 */
public class Circle {

    public final static int MAX_RADIUS = 10;
    private int radius;

    /**
     * Poner un valor en la variable radius y comprobando que no se pase
     *
     * @param radius
     */
    public void setRadius(int radius) {
        this.radius= radius;
        getMaxRadius();
    }

    public static int getMAX_RADIUS() {
        return MAX_RADIUS;
    }

    /**
     * Crear el nuevo circulo y comprobar que no se pase
     *
     * @param radius Valor del radio nuevo
     */
    public Circle(int radius) {
        this.radius = radius;
        getMaxRadius();
    }

    /**
     * Muestra por pantalla un texto que nos dice el radio del circulo
     */
    public void show() {

        System.out.println("Son un círculo de radio " + radius);

    }

    /**
     * Duplica el radio del circlo si no lo deveulve sin duplicar
     *
     */
    public void enlarge() {
        radius = radius * 2;
        getMaxRadius();
    }

    /**
     * Comporbacion del radio maximo permitido
     */
    public void getMaxRadius() {
        if (MAX_RADIUS<radius) {
            radius = MAX_RADIUS;
        } 
    }
}
