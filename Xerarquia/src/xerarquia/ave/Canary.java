/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xerarquia.ave;

/**
 *
 * @author roi.castrocalvar
 */
public class Canary extends Bird {

    protected boolean sing;

    public boolean isSing() {
        return sing;
    }

    public void setSing(boolean sing) {
        this.sing = sing;
    }

    public Canary(boolean sing, int age, char sex) {
        super(age, sex);
        this.sing = sing;
    }

}
