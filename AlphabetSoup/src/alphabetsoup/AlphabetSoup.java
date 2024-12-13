/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alphabetsoup;

import java.util.Scanner;

/**
 *
 * @author roi.castrocalvar
 */
public class AlphabetSoup {

    private String title;
    private char[][] soup;
    private String[] words;

    /**
     * Obtén o título da sopa de letras
     *
     * @return Título da sopa de letras
     */
    public String getTitle() {
        return title;
    }

    /**
     * Establece o título da sopa de letras
     *
     * @param title Novo título
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Obtén a táboa cos caracteres da sopa de letras
     *
     * @return Array bidimensional cos caracteres
     */
    public char[][] getSoup() {
        return soup;
    }

    /**
     * Establece a táboa cos caracteres da sopa de letras
     *
     * @param soup Array bidimensional cos caracteres
     */
    public void setSoup(char[][] soup) {
        this.soup = soup;
    }

    /**
     * Obtén as palabras agochadas na sopa de letras
     *
     * @return Array coas palabras agochadas
     */
    public String[] getWords() {
        return words;
    }

    /**
     * Estabelce a lista de palabras agochadas na sopa de letras
     *
     * @param words Array coas palabras agochadas
     */
    public void setWords(String[] words) {
        this.words = words;
    }

    /**
     * Crea unha nova sopa de letras
     *
     * @param title Título da sopa de letras
     * @param soup Táboa de caracteres da sopa de letras
     * @param words Lista de palabras agochadas na sopa de letras
     */
    public AlphabetSoup(String title, char[][] soup, String[] words) {
        this.title = title;
        this.soup = soup;
        this.words = words;
    }

    /**
     * Mostra o título e as letras da sopa por pantalla
     */
    public void display() {
        System.out.println("Sopa de letras: " + title);
        for (char[] row : soup) {
            for (char letter : row) {
                System.out.print(letter + " ");
            }
            System.out.println();
        }
    }

}
