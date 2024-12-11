/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package brainbreaker;

/**
 *
 * @author Roi
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BrainBreaker {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido a Brain Breaker!");
        System.out.println("Resuelve este rompecabezas para ganar el juego. Ordena los colores en el orden correcto.");

        // Generar colores y solución aleatoria
        List<String> colors = new ArrayList<>(List.of("rojo", "azul", "verde", "amarillo", "naranja"));
        Collections.shuffle(colors);
        List<String> solution = new ArrayList<>(colors);
        Collections.sort(solution);

        System.out.println("Colores desordenados: " + colors);
        System.out.println("Ingresa los colores en el orden correcto separados por un espacio.");

        Scanner scanner = new Scanner(System.in);
        int attempts = 3; // Número de intentos permitidos

        while (attempts > 0) {
            System.out.print("Tu respuesta: ");
            String userInput = scanner.nextLine();
            List<String> userSolution = List.of(userInput.replaceAll(",", "").split(" "));

            if (userSolution.equals(solution)) {
                System.out.println("¡Correcto! Has resuelto el rompecabezas. 🎉");
                break;
            } else {
                attempts--;
                System.out.println("Incorrecto. Te quedan " + attempts + " intento(s).\n");

                // Comprobar elementos correctos
                for (int i = 0; i < userSolution.size(); i++) {
                    if (i < solution.size()) {
                        String userColor = userSolution.get(i).trim();
                        if (userColor.equals(solution.get(i))) {
                            System.out.println("El color " + userColor + " está en la posición correcta.");
                        } else if (solution.contains(userColor)) {
                            System.out.println("El color " + userColor + " está en la solución, pero en otra posición.");
                        } else {
                            System.out.println("El color " + userColor + " no está en la solución.");
                        }
                    }
                }

                if (attempts == 0) {
                    System.out.println("Lo siento, has perdido. La solución correcta era: " + solution);
                }
            }
        }

        System.out.println("Gracias por jugar Brain Breaker. ¡Vuelve pronto!");
    }
}

