/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

import java.util.ArrayList;

/**
 *
 * @author roi.castrocalvar
 */
public class Board {

    private ArrayList<Shape> Shapes = new ArrayList<>();

    /**
     * Obtiene la lista de figuras (Shapes).
     *
     * @return Una lista de objetos de tipo Shape.
     */
    public ArrayList<Shape> getShapes() {
        return Shapes;
    }

    /**
     * Establece la lista de figuras (Shapes).
     *
     * @param Shapes Una nueva lista de objetos de tipo Shape.
     */
    public void setShapes(ArrayList<Shape> Shapes) {
        this.Shapes = Shapes;
    }

    /**
     * Metodo para borrar toda las fiuguras de la pizarra.
     */
    public void dropShapes() {
        int lenght= Shapes.size();
        for (int i = 0; i < lenght; i++) {
            Shapes.getLast().erase();
            Shapes.removeLast();
        }
        
    }

    /**
     * Metodo para dibujar una nueva figura.
     *
     * @param shape nueva figura a dibujar.
     */
    public void drawBoard(Shape shape) {
        shape.draw();
        Shapes.add(shape);
    }

}
