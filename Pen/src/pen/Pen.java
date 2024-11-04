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
     * Cantida de tinta que tiene el objeto.
     *
     * @return
     */
    public int getInk() {
        return ink;
    }

    /**
     *
     * @param ink modificacion a la cantidad de tinta, por defecto 30.
     */
    public void setInk(int ink) {
        this.ink = ink;
    }

    /**
     * Objeto de tipo Pen .
     */
    public Pen() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pen bic = new Pen();
        bic.write("Arbol Cielo Mar Rapido Suenho Luz Rio Montanha Tiempo Sol Estrella Lluvia Paz Enfado Fuego Chispas Ceniza Camino Amor Lealtad");
        bic.write("Soy mauricio tengo tres anhos y soy de murcia y te recuerdo que murcia existe");
        bic.write("Me llamo mauricio tengo tres anhos");

    }

    public void write(String text) {

        int cantidadEspacios = 0;

        //Cuenta la cantidad de espacios
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                cantidadEspacios++;
            }
        }

        //Si hai una palabra que la cuente
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
