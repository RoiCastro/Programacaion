/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author roi.castrocalvar
 */
public class PaintingSession {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //Creamos las figuras y la pizarra
        Board encerado = new Board();
        Shape cuadrado = new Square();
        Shape triangulo = new Triangle();
        Shape circulo = new Circle();
        // dibujamos las figuras
        encerado.drawBoard(cuadrado);
        encerado.drawBoard(triangulo);
        encerado.drawBoard(circulo);
        //Decimos el color de las figuras
        
        // borramos la pizarra
        encerado.dropShapes();
    }

}
