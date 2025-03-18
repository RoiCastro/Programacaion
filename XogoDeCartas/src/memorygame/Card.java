/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 *
 * @author roi.castrocalvar
 */
public abstract class Card {

    protected String text;
    protected boolean hit = false;

    /**
     * Obtén o texto da carta
     *
     * @return o texto da carta
     */
    public String getText() {
        return text;
    }

    /**
     * Establece o texto da carta
     *
     * @param text o texto da carta
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Obten se esta marcada
     *
     * @return se esta marcada
     */
    public boolean getHit() {
        return hit;
    }

    /**
     * Estable se esta marcada
     *
     * @param hit se esta marcada
     */
    public void setHit(boolean hit) {
        this.hit = hit;
    }

    /**
     * Crea una carta
     *
     * @param text
     */
    public Card(String text) {
        this.text = text;
    }

    /**
     * Devera comprobar si la carta es igual a esta
     *
     * @param carta
     * @return Devuelve si la carta es igual
     */
    public abstract boolean isEquals(Card carta);
}
