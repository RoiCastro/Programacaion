/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package table;

/**
 *
 * @author Roi
 */
public class Table {

    private int number;

    /**
     * Obtine el numero del objeto tabla
     * @return number
     */
    public int getNumber() {
        return number;
    }
/**
 * Coloca un valor al numero del objeto tabla
 * @param number 
 */
    public void setNumber(int number) {
        this.number = number;
    }
/**
 *  Valor numerico para el objeto tabla
 * @param number 
 */
    public Table(int number) {
        this.number = number;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int  i = 1  ; i < 10; i++) {
        Table table = new Table(i);
        table.show();
        System.out.println();
        }
    }
/**
 * Metodo que muestra por pantalla la serie de multiiplicaciones del 0 al 10
 */
    public void show() {
        for (int  i = 0  ; i < 11; i++) {
            int mult = number*i;
            System.out.println(number + " * "+i+" = "+mult);
        }
    }
}
