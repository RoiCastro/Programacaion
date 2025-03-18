/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

import memorygame.GenerateCardsException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author roi.castrocalvar
 */
public class ArrayCardGenerator implements CardGenerator {

    // Arrays coa información para as cartas
    private static final String[] words = new String[]{"Elefante", "Pataca", "Pera"};
    private static final int[] operators1 = new int[]{3, 5, 6};
    private static final int[] operators2 = new int[]{9, 2, 3};
    private static final char[] operations = new char[]{MathCard.SUM, MathCard.MULT, MathCard.SUB};

    /**
     * Inserta un array de dúas cartas aleatoriamente nun array bidimensional de
     * cartas que ten o número de filas e de columnas indicado
     *
     * @param cardPair Array con dúas cartas
     * @param cards Array bidimensional no que se queren colocar as cartas
     * @param rows Número de filas
     * @param columns Número de columnas
     */
    private void insertPair(Card[] cardPair, Card[][] cards, int rows, int columns) {
        // Recorremos o array co par de cartas para colocar as dúas cartas
        for (int i = 0; i < 2; i++) {
            boolean cardInserted = false;
            do {
                // Xeramos aleatoriamente unha fila e unha columna para colocar
                // a carta
                int row = new java.util.Random().nextInt(rows);
                int column = new java.util.Random().nextInt(columns);
                // Se na posición xerada non hai ningunha carta, colocamos
                // a carta nesa posición e marcamos que está insertada
                if (cards[row][column] == null) {
                    cards[row][column] = cardPair[i];
                    cardInserted = true;
                }
            } while (!cardInserted);
        }
    }

    /**
     * Genera un array bidimensional de cartas para el juego, distribuyéndolas
     * aleatoriamente. Crea pares de cartas de texto y matemáticas y lanza una
     * excepción si el número total de cartas excede el límite de 12.
     *
     * @param filas Número de filas del tablero.
     * @param columnas Número de columnas del tablero.
     * @return Array bidimensional de cartas generadas.
     * @throws GenerateCardsException Si el número total de cartas excede 12.
     */
    @Override
    public Card[][] generateCards(int filas, int columnas) throws GenerateCardsException {
        // EXECPCION: Lanza excepción si el número de cartas excede el límite de 12
        if (filas * columnas > 12) {
            throw new GenerateCardsException("Se queres tantas cartas, debes mercar a versión PRO");
        }

        // Array bidimensional de cartas
        Card[][] cartas = new Card[filas][columnas];

        // Lista para almacenar todas las cartas que se van a crear
        ArrayList<Card> cartasList = new ArrayList<>();

        // Crear las cartas de texto (pares)
        for (String word : words) {
            TextCard textCard1 = new TextCard(word);
            TextCard textCard2 = new TextCard(word);
            cartasList.add(textCard1);
            cartasList.add(textCard2);
        }

        // Crear las cartas matemáticas (pares)
        for (int i = 0; i < operators1.length; i++) {
            int operator1 = operators1[i];
            int operator2 = operators2[i];
            char operation = operations[i];

            MathCard mathCard1 = new MathCard(operator1, operator2, operation, MathCard.OPERACION);
            MathCard mathCard2 = new MathCard(operator1, operator2, operation, MathCard.RESULTADO);

            cartasList.add(mathCard1);
            cartasList.add(mathCard2);
        }

        // Barajar las cartas aleatoriamente
        Collections.shuffle(cartasList);

        // Colocar las cartas en el array bidimensional
        int contador = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (contador < cartasList.size()) {
                    cartas[i][j] = cartasList.get(contador);
                    contador++;
                }
            }
        }

        return cartas;
    }
}
