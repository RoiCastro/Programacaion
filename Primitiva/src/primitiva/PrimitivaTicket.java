/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitiva;

/**
 *
 * @author roi.castrocalvar
 */
public class PrimitivaTicket {
    private int[] numbers;
    private int refundNumber;

    /**
     * Obtine los numeros del ticket
     * @return 
     */
    public int[] getNumbers() {
        return numbers;
    }

    /**
     * Pone los numeros del ticket
     * @param numbers 
     */
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }


    /**
     * Obtiene el numero de rentegro del ticket
     * @return 
     */
    public int getRefundNumber() {
        return refundNumber;
    }

    /**
     * Pone el numero de rentegro del ticket
     * @param refundNumber 
     */
    public void setRefundNumber(int refundNumber) {
        this.refundNumber = refundNumber;
    }

    /**
     * Objeto ticket
     * 
     * @param numbers
     * @param refundNumber 
     */
    public PrimitivaTicket(int[] numbers, int refundNumber) {
        this.numbers = numbers;
        this.refundNumber = refundNumber;
    }


    
}
