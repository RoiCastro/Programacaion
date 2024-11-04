/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Roi
 */
public class WorkingDay {

    private char quenda;
    private char dia;
    private int horas;
    private int h;

    /**
     * 'd' si es diurna 'n' si es nocturna
     *
     * @return
     */
    public char getQuenda() {
        return quenda;
    }

    /**
     *
     * @param quenda 'd' si es diurna 'n' si es nocturna
     */
    public void setQuenda(char quenda) {
        this.quenda = quenda;
    }

    /**
     * 'd' si es domingo 'x' para el resto de dias
     *
     * @return
     */
    public char getDia() {
        return dia;
    }

    /**
     *
     * @param dia 'd' si es domingo 'x' para el resto de dias
     */
    public void setDia(char dia) {
        this.dia = dia;
    }

    /**
     * Numero de horas trabajadas
     *
     * @return
     */
    public double getHoras() {
        return horas;
    }

    /**
     *
     * @param horas Numero de horas trabajadas
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     *
     * @param quenda 'd' si es diurna 'n' si es nocturna
     * @param dia 'd' si es domingo 'x' para el resto de dias
     * @param horas Numero de horas trabajadas
     */
    public WorkingDay(char quenda, char dia, int horas) {
        this.quenda = quenda;
        this.dia = dia;
        this.horas = horas;
    }

    /**
     *
     * @return
     */
    public int salary() {

        int rate = 1;

        if (quenda == 'd') {
            rate = 8;
        } else if (quenda == 'n') {
            rate = 12;
        }
        if (dia == 'd') {
            rate = (rate * 12) / 10;
        }
        return rate * horas;
    }
}
