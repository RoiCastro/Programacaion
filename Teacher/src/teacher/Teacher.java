package teacher;

import java.time.Instant;
import java.util.Date;

/**
 * Clase abstracta Teacher que representa de forma genérica a un profesor.
 *
 *
 * @author Roi Castro
 */
public abstract class Teacher {

    /**
     * Atributo protegido que almacena el nombre del profesor.
     */
    protected String name;

    /**
     * Atributo protegido que almacena el apellido del profesor.
     */
    protected String surname;

    /**
     * Atributo protegido que almacena la dirección del profesor.
     *
     * Nota: existe un pequeño error de ortografía en "addres". Podrías
     * renombrarlo a "address" para mayor claridad.
     */
    protected String addres;

    /**
     * Atributo protegido que almacena el salario base del profesor.
     */
    protected double baseSalary;

    /**
     * Atributo protegido que almacena el salario total (quizás tras algún
     * cálculo adicional).
     */
    protected double salary;

    /**
     * Obtiene el nombre del profesor.
     *
     * @return El nombre del profesor.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del profesor.
     *
     * @param name Nombre del profesor.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el apellido del profesor.
     *
     * @return El apellido del profesor.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Establece el apellido del profesor.
     *
     * @param surname Apellido del profesor.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Obtiene la dirección del profesor.
     *
     * @return La dirección del profesor.
     */
    public String getAddres() {
        return addres;
    }

    /**
     * Establece la dirección del profesor.
     *
     * @param addres Dirección del profesor.
     */
    public void setAddres(String addres) {
        this.addres = addres;
    }

    /**
     * Obtiene el salario base del profesor.
     *
     * @return Salario base.
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * Establece el salario base del profesor.
     *
     * @param baseSalary Salario base.
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * Obtiene el salario total (posiblemente tras cálculos adicionales).
     *
     * @return Salario total.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Establece el salario total.
     *
     * @param salary Salario total.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Método main a modo de prueba.
     *
     * Aquí se instancia (o se intenta instanciar) un objeto de tipo
     * CareerOfficer que debe ser una clase concreta que extienda de Teacher e
     * implemente sus métodos abstractos.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {

        //Se creará un obxecto de cada subclase.
        //Estableceranse os valores para todos os seus atributos.
        Teacher funcionario = new CareerOfficer(500, 0, "plaza", "Paco", "web", "direccion", 1010);
        Teacher interino = new Interim(800, "Aitor", "Martinez", "Direccion", 1010);
        Teacher sustituto = new Substitute(92, Date.from(Instant.now()), "Roi", "Castro", "Direccion", 1010);

        //Xerarase a nómina de cada obxecto profesor.
        funcionario.generatePayroll();
        interino.generatePayroll();
        sustituto.generatePayroll();

        //Mostrarase unha mensaxe para cada obxecto profesor da seguinte forma: 
        //"Chámome name e o meu salario é de salary", mostrando en "name" e "salary" o valor destes atributos.
        //Invocarase o método "teach()" de cada obxecto profesor.
        System.out.println("Chámome " + interino.getName() + " e o meu salario é de " + interino.getSalary() + " €");
        interino.teach();
        System.out.println("Chámome " + sustituto.getName() + " e o meu salario é de " + sustituto.getSalary() + " €");
        sustituto.teach();
        System.out.println("Chámome " + funcionario.getName() + " e o meu salario é de " + funcionario.getSalary() + " €");
        funcionario.teach();

    }

    /**
     * Método que representa la acción de dar clase.
     */
    public void teach() {
        System.out.println("Dou unha clase de programación en Java.");
    }

    /**
     * Método abstracto para generar la nómina (o planilla de pago) del
     * profesor.
     *
     * Al ser abstracto, obliga a que las clases hijas proporcionen su propia
     * implementación.
     */
    abstract void generatePayroll();

    /**
     * Constructor de la clase Teacher.
     *
     * @param name nombre
     * @param surname apellido
     * @param addres dirección
     * @param baseSalary salario base
     */
    public Teacher(String name, String surname, String addres, double baseSalary) {
        this.name = name;
        this.surname = surname;
        this.addres = addres;
        this.baseSalary = baseSalary;
    }

}
