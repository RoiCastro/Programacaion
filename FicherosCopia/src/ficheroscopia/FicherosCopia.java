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
        // Verificamos que se proporcionaron os tres parámetros
         if (args.length != 3) {
            System.out.println("Debe proporcionar tres parámetros: a ruta do ficheiro, o caracter a elixir e o caracter a substituir.");
            return;
        }

        String rutaFicheiro = args[0];
        char caracterElexido = args[1].charAt(0);  // O carácter a substituír
        char caracterSustituir = args[2].charAt(0);  // O carácter substituto

        FicherosCopia file = new FicherosCopia();
        file.copyFile(rutaFicheiro, caracterElexido, caracterSustituir);
    }
    
    public void copyFile(String rutaFicheiro, char caracterElexido, char caracterSustituir) throws IOException {
        // Declaramos o reader e o writer
        FileReader in = null;
        FileWriter out = null;
        
        try {
            // Abrimos o reader e o writer
            in = new FileReader(rutaFicheiro);
            out = new FileWriter(rutaFicheiro + ".copia");
            
            // Usamos os métodos read e write para ler e escribir carácter a carácter
            int oneChar;
            while ((oneChar = in.read()) != -1) {
                // Se o carácter lido coincide co caracter a substituír, escribimos o novo carácter
                if ((char) oneChar == caracterElexido) {
                    out.write(caracterSustituir);
                } else {
                    out.write(oneChar);
                }
            }
            
            System.out.println("Ficheiro copiado correctamente a: " + rutaFicheiro + ".copia");
            
        } finally {
            // En calquera caso, produciráse ou non unha excepción, pechamos o reader e o writer se están abertos
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
