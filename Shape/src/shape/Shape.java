/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shape;

import java.awt.Color;

/**
 *
 * @author roi.castrocalvar
 */
public abstract class Shape implements Coloreable {

    java.awt.Color color;

    /**
     * Metodo abstracto para debuxar
     */
    public abstract void draw();

    /**
     * Metodo abstracto para borrar
     */
    public abstract void erase();

    /**
     * Devuelve el color actual de la instancia.
     *
     * @return el color que tiene asignado esta instancia
     */
    @Override
    public Color getColor() {
        return color;
    }

    /**
     * Establece el color para esta instancia.
     *
     * @param color el nuevo color a asignar
     */
    @Override
    public void setColor(Color color) {
        this.color = color;
    }

}
