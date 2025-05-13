/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheroscopia;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author roi.castrocalvar
 */
public class FicherosCopia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
                if (args.length != 3) {
            System.out.println("Debe proporcionar tres parámetros:  a ruta do ficheiro ,o caracter a elegir e o caracter a sustituir.");
            return;
        }

        String rutaFicheiro = args[0];
        String caracterElexido = args[1];
        String caracterSustituir = args[2];

        FicherosCopia file = new FicherosCopia();
        file.copyFile(rutaFicheiro, caracterElexido, caracterSustituir);
    }
     public void copyFile(String rutaFicheiro, String caracterElexido, String caracterSustituir)
            throws IOException {
        // Declaramos o reader e o writer
        FileReader in = null;
        FileWriter out = null;
        try {
            // Abrimos o reader e o writer
            in = new FileReader(rutaFicheiro);
            out = new FileWriter(rutaFicheiro+".copia");
            // Usamos os métodos read e write para ler e escribir caracter a caracter
            int oneChar;
            while ((oneChar = in.read()) != -1) {
                out.write(oneChar);
            }
        } finally {
            // En calquera caso, producirase ou non unha excepción, pechamos o
            // reader e o writer se están abertos
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
