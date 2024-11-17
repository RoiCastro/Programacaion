/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pen;

/**
 *
 * @author Roi
 */
public class Pen {

    
    private int ink = 30;

    /**
     * Obtiene la cantidad actual de tinta que tiene el bolígrafo.
     *
     * @return La cantidad de tinta disponible.
     */
    public int getInk() {
        return ink;
    }

    /**
     * Permite establecer una nueva cantidad de tinta para el bolígrafo.
     *
     * @param ink Nueva cantidad de tinta a establecer. Por defecto es 30.
     */
    public void setInk(int ink) {
        this.ink = ink;
    }

    /**
     * Constructor por defecto de la clase `Pen`. Inicializa el bolígrafo con la
     * cantidad de tinta predeterminada.
     */
    public Pen() {
    }

    /**
     * Método principal del programa. Aquí se crean objetos de tipo `Pen` y se
     * utilizan para escribir texto.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este
     * programa).
     */
    public static void main(String[] args) {
   
        Pen bic = new Pen();

  
        bic.write("Arbol Cielo Mar Rapido Suenho Luz Rio Montanha Tiempo Sol Estrella Lluvia Paz Enfado Fuego Chispas Ceniza Camino Amor Lealtad");
        bic.write("Soy mauricio tengo tres anhos y soy de murcia y te recuerdo que murcia existe");
        bic.write("Me llamo mauricio tengo tres anhos");
    }

    /**
     * Método que permite escribir texto utilizando el bolígrafo. Cada palabra
     * escrita consume una unidad de tinta. Si no hay suficiente tinta, no se
     * puede escribir el texto.
     *
     * @param text El texto que se desea escribir.
     */
    public void write(String text) {

        int cantidadEspacios = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                cantidadEspacios++;
            }
        }

        if (text.length() != 0) {
            cantidadEspacios++;
        }

        if (ink > cantidadEspacios) {
            ink -= cantidadEspacios;
            System.out.println(text);
        } else {

            System.out.println("Non queda a suficiente tinta.");
        }
    }
}
