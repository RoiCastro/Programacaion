/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package memorygame;

/**
 *
 * @author roi.castrocalvar
 */
public interface CardGenerator {


    public Card[][] generateCards(int filas, int columnas) throws GenerateCardsException;
}
