/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alphabetsoup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author roi.castrocalvar
 */
public class AlphabetSoupApp {

    // Lista coas sopas de letras dispoñibles na app
    private ArrayList<AlphabetSoup> soupList = new ArrayList<>();
    private final static int BIGER_NUMBER = 8;
    private int numeroIntentos;

    /**
     * DEvolve o numero de intentos maximos.
     *
     * @return
     */
    public int getNumeroIntentos() {
        return numeroIntentos;
    }

    /**
     * Poñe o numero de intentos maximos.
     *
     * @param numeroIntentos
     */
    public void setNumeroIntentos(int numeroIntentos) {
        this.numeroIntentos = numeroIntentos;
    }

    /**
     * Devolve a lista de sopas de letras dispoñibles
     *
     * @return Lista con todas as sopas de letras
     */
    public ArrayList<AlphabetSoup> getSoupList() {
        return soupList;
    }

    /**
     * Establece a lista de sopas de letras dispoñibles
     *
     * @param soupList Lista coas sopas de letras
     */
    public void setSoupList(ArrayList<AlphabetSoup> soupList) {
        this.soupList = soupList;
    }

    /**
     * Crea un novo obxecto para executar a aplicación de sopas de letras
     */
    public AlphabetSoupApp() {
        // Cargamos a sopa de letras por defecto
        addDefaultSoup();
    }

    /**
     * Mostra a lista con todas as sopas de letras e pide ao usuario que
     * selecciona unha delas
     *
     * @return Sopa de letras seleccionada polo usuario
     */
    public AlphabetSoup selectSoup() {
        Scanner scan = new Scanner(System.in);

        // Mostramos as sopas de letras dispoñibles
        System.out.println("Sopas de letras dispoñibles:");
        for (int i = 0; i < soupList.size(); i++) {
            System.out.println((i + 1) + ". " + soupList.get(i).getTitle());
        }

        // Pedimos ao usuario o número dunha sopa da lista e devolvémola
        System.out.println("Introduce o número dunha sopa de letras:");
        return soupList.get(scan.nextInt() - 1);
    }

    /**
     * Método que mostra o menú da aplicación e devolve a opción introducida
     * polo usuario
     *
     * @return Opción seleccionada do menú
     */
    public int showMainMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Benvido á App de sopas de letras!");
        System.out.println();
        System.out.println("1. Engadir unha nova sopa de letras");
        System.out.println("2. Resolver unha sopa de letras");
        System.out.println("3. Saír");
        System.out.println("Introduce una opción:");
        return (scan.nextInt());
    }

    /**
     * Engade unha sopa de letras por defecto
     */
    private void addDefaultSoup() {
        char[][] soup = {
            {'J', 'A', 'V', 'A', 'M'},
            {'O', 'A', 'G', 'H', 'A'},
            {'T', 'U', 'C', 'G', 'I'},
            {'T', 'N', 'I', 'K', 'N'}};
        String[] words = {"JAVA", "MAIN", "JACK", "INT"};
        soupList.add(new AlphabetSoup("Sobre Java", soup, words));
    }

    /**
     * Inicia a execución da aplicación
     *
     * @param args Argumentos en liña de comandos
     */
    public static void main(String[] args) {
        int option;

        // Creamos un obxecto para a aplicación
        AlphabetSoupApp myApp = new AlphabetSoupApp();

        // Mostramos o menú mentres a opción seleccionada non sexa a de saír
        do {
            option = myApp.showMainMenu();
            switch (option) {
                case 1:
                    myApp.addSoup();
                    break;
                case 2:
                    // Pedimos ao usuario que seleccions unha sopa de letras e
                    // mostrámola
                    AlphabetSoup soup = myApp.selectSoup();
                    myApp.solveSoup(soup);
                    break;
                case 3:
                    System.out.println("Ata logo!");
                    break;
                default:
                    System.out.println("Opción incorrecta! "
                            + "Introduce unha opción entre 1 e 3");
            }
        } while (option != 3);
    }

    /**
     * Añade una nueva sopa
     */
    public void addSoup() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe el titulo para");
        String title = scan.nextLine();

        System.out.println("Para la sopa de letras.");
        int rows;
        do {
            System.out.println("Dime el numero de filas :");
            rows = scan.nextInt();
            if (rows > BIGER_NUMBER) {
                System.out.println("Para este tamaño debes usar a versión PRO!");
            }
        } while (rows > BIGER_NUMBER);
        int colums;
        do {
            System.out.println("Dime el numero de columnas :");
            colums = scan.nextInt();
            if (colums > BIGER_NUMBER) {
                System.out.println("Para este tamaño debes usar a versión PRO!");
            }
        } while (colums > BIGER_NUMBER);
        System.out.println("Rellenamos la sopa");
        Scanner scanner = new Scanner(System.in);
        char[][] soup = new char[rows][colums];
        for (int i = 0; i < colums; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.println();
                System.out.println("Escribe la fila " + i + " columna " + j);
                soup[i][j] = scanner.nextLine().charAt(0);
                System.out.println();
            }

        }

        System.out.println("Cuantas palabras contine");
        int number = scan.nextInt();
        scanner.nextLine();

        System.out.println("Escribe las palabras qeu contine");
        String[] words = new String[number];
        for (int i = 0; i < number; i++) {
            words[i] = scan.nextLine();
        }

        soupList.add(new AlphabetSoup(title, soup, words));
    }

    /**
     * Resulve una sopa de letras pidiendo un numero de intentosS
     *
     * @param soup pide una sopa para resolver
     */
    public void solveSoup(AlphabetSoup soup) {
        ArrayList<String> wordsToGuess = new ArrayList<>();
        wordsToGuess.addAll(Arrays.asList(soup.getWords()));
        ArrayList<String> words = new ArrayList<>();
        System.out.println("Cual es el numero de intentos que quieres");
        Scanner scan = new Scanner(System.in);
        setNumeroIntentos(scan.nextInt());
        soup.display();

        
    }
}
