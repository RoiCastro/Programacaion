/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xerarquia;

/**
 *
 * @author roi.castrocalvar
 */
public class Concierge extends Person {
    protected String turn;
    protected String seniority;

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public Concierge(String turn, String seniority, String name, int age) {
        super(name, age);
        this.turn = turn;
        this.seniority = seniority;
    }
    
    
    
}
