/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primitiva;

/**
 *
 * @author roi.castrocalvar
 */
public class Primitiva {

    public final int TOTAL_NUMBERS = 6;
    public final int MAX_NUMBER = 49;
    public final int MAX_REFUND_NUMBER = 9;

    private int day;
    private int month;
    private int year;

    private int[] winnerNumbers = new int[TOTAL_NUMBERS];
    private int winnerComplement;
    private int refundNumber;

    /**
     * Obtiene el dia del la primitiva
     *
     * @return de vulve el dia
     */
    public int getDay() {
        return day;
    }

    /**
     * Pone el dia del la primitiva
     *
     * @param day el dia del la primitiva
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Obtiene el mes del la primitiva
     *
     * @return el mes de la primitiva
     */
    public int getMonth() {
        return month;
    }

    /**
     * Pone el mes de la primitiva
     *
     * @param month el mes de la primitiva
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Obtiene el año del la primitiva
     *
     * @return año del la primitiva
     */
    public int getYear() {
        return year;
    }

    /**
     * Pone el año de la primitiva
     *
     * @param year año de la primitiva
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Obtiene el conjunto de numeros ganadores
     *
     * @return numeros ganadores
     */
    public int[] getWinnerNumbers() {
        return winnerNumbers;
    }

    /**
     * Pone el conjunto de numeros ganadores
     *
     * @param winnerNumbers numeros ganadores
     */
    public void setWinnerNumbers(int[] winnerNumbers) {
        this.winnerNumbers = winnerNumbers;
    }

    /**
     * Obtiene el numero complementario
     *
     * @return numero complementario
     */
    public int getWinnerComplement() {
        return winnerComplement;
    }

    /**
     * Pone el numero complementario
     *
     * @param winnerComplement numero complementario
     */
    public void setWinnerComplement(int winnerComplement) {
        this.winnerComplement = winnerComplement;
    }

    /**
     * Obtiene el numero del reintegro
     *
     * @return numero del reintegro
     */
    public int getRefundNumber() {
        return refundNumber;
    }

    /**
     * Pone el numero del reintegro
     *
     * @param refundNumber numero del reintegro
     */
    public void setRefundNumber(int refundNumber) {
        this.refundNumber = refundNumber;
    }

    /**
     * Objeto primitiva
     *
     * @param day el dia que se jugo
     * @param month el mes que es jugo
     * @param year el año que se jugo
     */
    public Primitiva(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Primitiva primitiva1 = new Primitiva(11, 12, 2005);
        primitiva1.makeDraw();
        primitiva1.showResult();
    }

    /**
     * Enseña el resultado del sorteo
     */
    public void showResult() {
        System.out.println("O resultado do sorteo realizado o " + day + " do " + month + " do " + year + " foi o seguinte:");
        System.out.print("Numeros premiados: ");
        for (int numeros : winnerNumbers) {
            System.out.print(numeros + " ");
        }
        System.out.println();
        System.out.println("Complementario:" + winnerComplement);
        System.out.println("Reintegro:" + refundNumber);

    }

    /**
     * Me todo para crear un sorteo generando aleatoria mente 6 numeros
     * premiados mas el complementario y el numero de reintegro
     */
    public void makeDraw() {
        //Numero aleatorio para el reintegro entre 0 a 9
        refundNumber = new java.util.Random().nextInt(MAX_REFUND_NUMBER + 1);
        //Numeros aleatorios no repetidos para el array winnerNumbers
        for (int i = 0; i < TOTAL_NUMBERS; i++) {
            int value;
            do {
                value = new java.util.Random().nextInt(MAX_NUMBER) + 1;
            } while (contains(value));

            winnerNumbers[i] = value;
        }
        //Numero aleatorio no repetido para el complementario
        do {
            winnerComplement = new java.util.Random().nextInt(MAX_NUMBER) + 1;
        } while (contains(winnerComplement));
    }

    /**
     * Comproba se o array "winnerNumbers" contén un determinado valor
     *
     * @param value Valor que se quere comprobar se está ou non en "matriz"
     * @return true se o valor recibido está en "winnerNumbers", false en caso
     * contrario
     */
    private boolean contains(int value) {
        for (int i = 0; i < TOTAL_NUMBERS; i++) {
            if (winnerNumbers[i] == value) {
                return true;
            }
        }
        return false;
    }

}
