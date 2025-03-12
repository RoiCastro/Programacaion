/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 *
 * @author roi.castrocalvar
 */
public  abstract  class Card {
    
    public String text;
    public Boolean hit = false;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getHit() {
        return hit;
    }

    public void setHit(Boolean hit) {
        this.hit = hit;
    }

    public Card(String text) {
        this.text = text;
    }

    
    public abstract boolean isEquals(Card carta);
}
