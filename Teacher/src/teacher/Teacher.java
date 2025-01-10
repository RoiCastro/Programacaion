/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teacher;

/**
 *
 * @author roi.castrocalvar
 */
public abstract class Teacher {

    protected String name;
    protected String surname;
    protected String addres;
    protected double baseSalary;
    protected double SALARY;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    protected void teach(){
        System.out.println("Dou unha clase de programación en Java.");
    }
    abstract void generatePayroll();
    
}
