/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */package ficherotokenatoken;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FicheroTokenAToken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Verificamos que se proporcionaron os dous parámetros
        if (args.length != 2) {
            System.out.println("Debe proporcionar a ruta do ficheiro e o delimitador.");
            return;
        }

        String rutaFicheiro = args[0];
        String delimitador = args[1];

        // Creamos unha instancia da clase FicheroTokenAToken
        FicheroTokenAToken lector = new FicheroTokenAToken();
        
        try {
            // Chamamos ao método para ler e mostrar os tokens
            lector.leerFicheiroTokens(rutaFicheiro, delimitador);
        } catch (FileNotFoundException e) {
            System.out.println("Non se atopou o ficheiro: " + rutaFicheiro);
        }
    }

    // Método non estático para ler o ficheiro token por token
    public void leerFicheiroTokens(String rutaFicheiro, String delimitador) throws FileNotFoundException {
        // Abrimos o ficheiro usando a clase Scanner
        File file = new File(rutaFicheiro);
        Scanner scanner = new Scanner(file);

        // Establecemos o delimitador para os tokens
        scanner.useDelimiter(delimitador);

        // Leemos e mostramos cada token
        while (scanner.hasNext()) {
            String token = scanner.next();
            System.out.println(token);
        }

        // Pechamos o scanner despois de usalo
        scanner.close();
    }
}

