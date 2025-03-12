/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 *
 * @author roi.castrocalvar
 */
public class MathCard extends Card{

    private int operator1;
    private int operator2;
    private char[] operation={SUM,MULT,SUB};
    public final static char SUM = '+';
    public final static char MULT='*';
    public final static char SUB = '-';
    public final static int OPERACION=0;
    public final static int RESULTADO=1;
    

    public MathCard(int operator1, int operator2, char[] operation, String text) {
        super(text);
        this.operator1 = operator1;
        this.operator2 = operator2;
        this.operation = operation;
        int[] cardType={OPERACION,RESULTADO};
    }
    


    @Override
    public boolean isEquals(Card carta) {
         return carta.text.equals(text);
    }
    
}
