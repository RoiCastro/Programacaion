import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CifradoCesar {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Debe proporcionar dous parámetros: opción (-c ou -d) e a ruta do ficheiro.");
            return;
        }

        String opcion = args[0];
        String rutaFicheiro = args[1];

        if (!opcion.equals("-c") && !opcion.equals("-d")) {
            System.out.println("A opción debe ser '-c' para cifrar ou '-d' para descifrar.");
            return;
        }

        try {
            // Pedir o número de posicións para o cifrado/descifrado
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce o número de posicións a sumar/restar ao alfabeto: ");
            int desplazamento = scanner.nextInt();

            // Crear ficheiro de saída
            String ficheiroSaida = rutaFicheiro + (opcion.equals("-c") ? ".cif" : ".des");

            // Realizar cifrado ou descifrado
            if (opcion.equals("-c")) {
                cifrarFicheiro(rutaFicheiro, ficheiroSaida, desplazamento);
            } else {
                descifrarFicheiro(rutaFicheiro, ficheiroSaida, desplazamento);
            }

            System.out.println("Proceso completado. Ficheiro de saída: " + ficheiroSaida);

        } catch (IOException e) {
            System.out.println("Erro ao procesar o ficheiro: " + e.getMessage());
        }
    }

    private static void cifrarFicheiro(String rutaEntrada, String rutaSaida, int desplazamento) throws IOException {
        try (FileInputStream fis = new FileInputStream(rutaEntrada);
             FileOutputStream fos = new FileOutputStream(rutaSaida)) {

            int byteLido;
            while ((byteLido = fis.read()) != -1) {
                // Aplica o cifrado César (só modifícase os caracteres imprimibles)
                char caracter = (char) byteLido;
                if (Character.isLetter(caracter)) {
                    // Aplicar desplazamento
                    if (Character.isLowerCase(caracter)) {
                        caracter = (char) ((caracter - 'a' + desplazamento) % 26 + 'a');
                    } else if (Character.isUpperCase(caracter)) {
                        caracter = (char) ((caracter - 'A' + desplazamento) % 26 + 'A');
                    }
                }
                fos.write(caracter);
            }
        }
    }

    private static void descifrarFicheiro(String rutaEntrada, String rutaSaida, int desplazamento) throws IOException {
        try (FileInputStream fis = new FileInputStream(rutaEntrada);
             FileOutputStream fos = new FileOutputStream(rutaSaida)) {

            int byteLido;
            while ((byteLido = fis.read()) != -1) {
                // Aplica o descifrado César (resta o desplazamento)
                char caracter = (char) byteLido;
                if (Character.isLetter(caracter)) {
                    // Restar desplazamento
                    if (Character.isLowerCase(caracter)) {
                        caracter = (char) ((caracter - 'a' - desplazamento + 26) % 26 + 'a');
                    } else if (Character.isUpperCase(caracter)) {
                        caracter = (char) ((caracter - 'A' - desplazamento + 26) % 26 + 'A');
                    }
                }
                fos.write(caracter);
            }
        }
    }
}
