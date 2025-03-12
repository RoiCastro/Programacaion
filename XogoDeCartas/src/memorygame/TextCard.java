/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 *
 * @author roi.castrocalvar
 */
public class TextCard extends Card{

    public TextCard(String text) {
        super(text);
    }

    @Override
    public boolean isEquals(Card carta) {
        return carta.text.equals(text);
    }
    
}
