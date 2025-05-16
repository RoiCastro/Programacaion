package ficherolines;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author roi.castrocalvar
 */
public class FicheroLines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Verificamos que se proporcionou o parámetro da ruta do ficheiro
        if (args.length != 1) {
            System.out.println("Debe proporcionar a ruta do ficheiro.");
            return;
        }

        String rutaFicheiro = args[0];
        FicheroLines file = new FicheroLines();
        try {
            file.copyFileWithLineNumbers(rutaFicheiro);
        } catch (IOException e) {
            System.out.println("Erro ao manexar os ficheiros: " + e.getMessage());
        }
    }

    // Método que copia o ficheiro engadindo números de liña
    public void copyFileWithLineNumbers(String rutaFicheiro) throws IOException {
        // Creamos os fluxos de entrada e saída con BufferedReader e BufferedWriter
        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            // Abrimos o BufferedReader para ler o ficheiro de orixe
            in = new BufferedReader(new FileReader(rutaFicheiro));
            // Creamos o BufferedWriter para escribir no ficheiro de destino
            out = new BufferedWriter(new FileWriter(rutaFicheiro + ".lines"));

            String line;
            int lineNumber = 1;

            // Lemos liña por liña e escribimos no ficheiro de destino engadindo o número de liña
            while ((line = in.readLine()) != null) {
                out.write(lineNumber + ". " + line);
                out.newLine(); // Engadimos unha nova liña no ficheiro de saída
                lineNumber++;
            }

            System.out.println("Ficheiro copiado correctamente a: " + rutaFicheiro + ".lines");

        } finally {
            // Pechamos os fluxos de lectura e escritura se están abertos
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
