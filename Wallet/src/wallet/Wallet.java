/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wallet;

/**
 *
 * @author roi.castrocalvar
 */
public class Wallet {

    private double money;
    private boolean card;

    /**
     * Obtines la cantidad de dinero que tengas en el objeto cartera
     *
     * @return double
     */
    public double getMoney() {
        return money;
    }

    /**
     * Pones la cantidad de dinero que tengas en el objeto cartera
     *
     * @param money double
     */
    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * Obtines si tienes tarjeta en el ojeto cartera
     *
     * @return boolean
     */
    public boolean isCard() {
        return card;
    }

    /**
     * Pone si tines cartera o no
     *
     * @param card boolean
     */
    public void setCard(boolean card) {
        this.card = card;
    }

    /**
     *
     * @param money el dinero que tines , double
     * @param card si tines taejeta de credito o debito, boolean
     */
    public Wallet(double money, boolean card) {
        this.money = money;
        this.card = card;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Wallet w1 = new Wallet(250, false);
        Wallet w2 = new Wallet(25, true);
        Wallet w3 = new Wallet(10, false);
        w1.available();
        w2.available();
        w3.available();
    }

    /**
     * Avalia si tines dinero en el objeto cartera
     */
    public void available() {
        if (money > 100) {
            System.out.println("Si teño efectivo");
        } else if (card) {
            System.out.println("Tienes que ir al cajero");
        } else {
            System.out.println("Tienes que ir a la sucursal");
        }

    }

}
