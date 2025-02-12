/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roi.castrocalvar
 */
public class Equation {

    public int variableA;
    public int variableB;
    public int variableC;

    /**
     * Constructor de la clase Equation.
     *
     * @param variableA el valor inicial para variableA
     * @param variableB el valor inicial para variableB
     * @param variableC el valor inicial para variableC
     */
    public Equation(int variableA, int variableB, int variableC) {
        this.variableA = variableA;
        this.variableB = variableB;
        this.variableC = variableC;
    }

    /**
     * Obtiene el valor de variableA.
     *
     * @return el valor de variableA
     */
    public int getVariableA() {
        return variableA;
    }

    /**
     * Establece el valor de variableA.
     *
     * @param variableA el nuevo valor para variableA
     */
    public void setVariableA(int variableA) {
        this.variableA = variableA;
    }

    /**
     * Obtiene el valor de variableB.
     *
     * @return el valor de variableB
     */
    public int getVariableB() {
        return variableB;
    }

    /**
     * Establece el valor de variableB.
     *
     * @param variableB el nuevo valor para variableB
     */
    public void setVariableB(int variableB) {
        this.variableB = variableB;
    }

    /**
     * Obtiene el valor de variableC.
     *
     * @return el valor de variableC
     */
    public int getVariableC() {
        return variableC;
    }

    /**
     * Establece el valor de variableC.
     *
     * @param variableC el nuevo valor para variableC
     */
    public void setVariableC(int variableC) {
        this.variableC = variableC;
    }

    /**
     * Raiz de la equacion
     * @return resultado de la raiz
     */
    private double discriminate() {
        double sqrt = Math.sqrt(Math.pow(variableB, 2) - (4 * variableA * variableC));
        return sqrt;

    }

    /**
     * Resultado de la equacion positiva
     * @return 
     */
    public double positiveEquationQuadratic() {
        double equationPos = (-variableB + discriminate()) / (2 * variableA);
        return equationPos;
    }

    /**
     * Resultado de la equacion negativa
     * @return 
     */
    public double negativeEquationQuadratic() {
        double equationNeg = (-variableB - discriminate()) / (2 * variableA);
        return equationNeg;
    }
}
