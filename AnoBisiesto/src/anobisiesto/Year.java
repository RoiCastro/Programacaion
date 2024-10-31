/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anobisiesto;

/**
 *
 * @author Roi
 */
public class Year {

    private boolean leapYear;

    /**
     * Para saber si el año es bisiesto o no
     *
     * @return si es bisiesto, devulve true|false
     */
    public boolean isLeapYear() {
        return leapYear;
    }

    /**
     * Para pones si el año es bisiesto o no
     *
     * @param leapYear si es bisiesto, debe ser true|false
     */
    public void setLeapYear(boolean leapYear) {
        this.leapYear = leapYear;
    }

    /**
     * Para crear un objeto año
     *
     * @param leapYear si es bisiesto, debe ser true|false
     */
    public Year(boolean leapYear) {
        this.leapYear = leapYear;
    }

    /**
     * Te dice cuantos dias tiene un mes
     *
     * @param daysOfMonth numero del mes, debe estar comprendido entre 1 y 12
     */
    public void showDaysOfMonth(int daysOfMonth) {
        if (daysOfMonth < 12 | 0 > daysOfMonth) {

            switch (daysOfMonth) {
                case 1, 3, 5, 7, 8, 10, 12:
                         System.out.println("Este mes tiene 31 dias");
                         
                        break;
                case 2:
                    if (leapYear == true) {
                        System.out.println("Este mes tiene 29 dias");
                    } else {
                        System.out.println("Este mes tiene 28 dias");
                    }
                    break;
                case 4, 6, 9, 11:
                    System.out.println("Este mes tiene 30 dias");
                    break;
            }
        } else {
            System.out.println("Mal intentalo de nuevo");
        }
    }
}
