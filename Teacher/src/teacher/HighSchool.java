/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacher;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author roi.castrocalvar
 */
public class HighSchool {

    private String name;
    private ArrayList<Teacher> teachers = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public HighSchool(String name) {
        this.name = name;

    }

    /**
     * Devolve o profesor con máis salario.
     *
     * @return El profesor mas pagado.
     */
    public Teacher mostPaid() {
        double salary = Double.MIN_VALUE;
        Teacher myTeacher = null;

        for (Teacher teacher : teachers) {
            if (teacher.getSalary() >= salary) {
                salary = teacher.getSalary();
                myTeacher = teacher;
            }
        }
        return myTeacher;
    }

    /**
     * Devolve o profesor con menos salario.
     *
     * @return El profeosr menos pagado.
     */
    public Teacher leastPaid() {
        double salary = Double.MAX_VALUE;
        Teacher myTeacher = null;
        for (Teacher teacher : teachers) {
            if (teacher.getSalary() <= salary) {
                salary = teacher.getSalary();
                myTeacher = teacher;
            }
        }

        return myTeacher;
    }

    /**
     * Devolve a suma dos salarios de todos os profesores.
     *
     * @return suma dos salarios de todos os profesores.
     */
    public double salaryCosts() {
        double salary = 0;
        for (Teacher teacher : teachers) {
            salary = +teacher.getSalary();
        }
        return salary;

    }

    /**
     * Devolve a media dos salarios dos profesores.
     *
     * @return a media dos salarios dos profesores.
     */
    public double salaryAverage() {
        double salary = 0;
        for (Teacher teacher : teachers) {
            salary = +teacher.getSalary();
        }
        salary= salary/teachers.size();
        return salary;

    }

    /**
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        //Se crean tres profesores
        Teacher funcionario = new CareerOfficer(500, 0, "plaza", "Paco", "web", "direccion", 1010);
        Teacher interino = new Interim(800, "Aitor", "Martinez", "Direccion", 1010);
        Teacher sustituto = new Substitute(600, Date.from(Instant.now()), "Roi", "Castro", "Direccion", 1010);

        // Se crea el instituto
        HighSchool iesPazoDaMerce = new HighSchool("IES Pazo da Mercde");

        // Se añaden los profesores al instituto
        iesPazoDaMerce.getTeachers().add(sustituto);
        iesPazoDaMerce.getTeachers().add(interino);
        iesPazoDaMerce.getTeachers().add(funcionario);

        //Xerarase a nómina de cada obxecto profesor.
        funcionario.generatePayroll();
        interino.generatePayroll();
        sustituto.generatePayroll();
        //cousa
        System.out.println(iesPazoDaMerce.leastPaid().getName());
        System.out.println(iesPazoDaMerce.mostPaid().getName());
        System.out.println(iesPazoDaMerce.salaryAverage());
        System.out.println(iesPazoDaMerce.salaryCosts());
    }
}
