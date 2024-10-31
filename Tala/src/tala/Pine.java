/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tala;

/**
 *
 * @author roi.castrocalvar
 */
public class Pine {

    private int height;

    /**
     * Obtener altura
     *
     * @return altura del pino
     */
    public int getHeight() {
        return height;
    }

    /**
     * Poner altura
     *
     * @param height altura del pino
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Crear nuevo pino
     *
     * @param height altura pino
     */
    public Pine(int height) {
        this.height = height;

    }

    /**
     * Cortar x altura del pino
     *
     * @param corte altura que se va a cortar
     */
    public void cut(int corte) {
        height = height - corte;

    }
}
