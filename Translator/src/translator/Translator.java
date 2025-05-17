/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package translator;


import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 *
 * @author Roi
 */
public class Translator {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java Translator <ficheiro_dicionario> <ficheiro_texto>");
            return;
        }

        String ficheiroDicionario = args[0];
        String ficheiroTexto = args[1];

        try {
            // Cargar o dicionario
            Properties dicionario = new Properties();
            dicionario.load(new FileInputStream(ficheiroDicionario));

            // Ler o contido do ficheiro de texto
            String texto = new String(Files.readAllBytes(Paths.get(ficheiroTexto)));

            // Traducir palabra por palabra
            String[] palabras = texto.split(" ");
            StringBuilder traducido = new StringBuilder();

            for (String palabra : palabras) {
                String traducida = dicionario.getProperty(palabra, palabra);
                traducido.append(traducida).append(" ");
            }

            // Mostrar o resultado traducido
            System.out.println("Texto traducido:\n" + traducido.toString().trim());

        } catch (IOException e) {
            System.out.println("Erro ao ler os ficheiros: " + e.getMessage());
        }
    }
}


    

