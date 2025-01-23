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
public class Teacher extends Person implements Speaker {

    protected String office;
    protected String email;

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Teacher(String office, String email, String name, int age) {
        super(name, age);
        this.office = office;
        this.email = email;
    }

    @Override
    public void speack() {
        System.out.println("Ola, son unha " + getClass().getSimpleName() + " e sei falar.");
        System.out.println("Name: " + name + " Idade: " + age);
        System.out.println("Despacho: " + office + " Email: " + email);
    }

}
