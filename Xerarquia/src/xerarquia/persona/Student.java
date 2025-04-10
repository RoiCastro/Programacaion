/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xerarquia.persona;

import xerarquia.Speaker;

/**
 *
 * @author roi.castrocalvar
 */
public class Student extends Person implements Speaker {

    protected String career;
    protected String course;

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(String career, String course, String name, int age) {
        super(name, age);
        this.career = career;
        this.course = course;
    }

    @Override
    public void speack() {
        System.out.println("Ola, son unha " + getClass().getSimpleName() + " e sei falar.");
        System.out.println("Name: " + name + " Idade: " + age);
        System.out.println("Carreira: " + career + " Curso: " + course);
    }

}
