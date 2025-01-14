/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacher;

import java.util.Date;

/**
 *
 * @author roi.castrocalvar
 */
public class Substitute extends Teacher {

    /**
     * Complemento adicional que se le otorga a este tipo de profesor.
     */
    protected double displacement;

    /**
     * Fecha del desplazamiento del sustituto.
     */
    protected Date initDate;

/**
 * Retorna la distancia de desplazamiento.
 * 
 * @return el valor de displacement
 */
public double getDisplacement() {
    return displacement;
}

/**
 * Establece la distancia de desplazamiento.
 * 
 * @param displacement el nuevo valor de desplazamiento
 */
public void setDisplacement(double displacement) {
    this.displacement = displacement;
}

/**
 * Obtiene la fecha de inicio.
 * 
 * @return el valor de initDate
 */
public Date getInitDate() {
    return initDate;
}

/**
 * Asigna la fecha de inicio.
 * 
 * @param initDate la nueva fecha de inicio
 */
public void setInitDate(Date initDate) {
    this.initDate = initDate;
}

/**
 * Constructor de la clase Substitute.
 * 
 * @param displacement distancia de desplazamiento
 * @param initDate     fecha de inicio
 * @param name         nombre
 * @param surname      apellido
 * @param addres       dirección
 * @param baseSalary   salario base
 */
public Substitute(double displacement, Date initDate, String name, String surname, String addres, double baseSalary) {
    super(name, surname, addres, baseSalary);
    this.displacement = displacement;
    this.initDate = initDate;
}


    /**
     * Genera la nómina del profesor interino.
     */
    @Override
    void generatePayroll() {
        salary = displacement + baseSalary;
    }

    /**
     * Método que representa la acción de dar clase del profesor interino.
     */
    @Override
    public void teach() {
        System.out.println("Dou unha clase de programación en Java.");
    }
}
