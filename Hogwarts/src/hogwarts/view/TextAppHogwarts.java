/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hogwarts.view;

import hogwarts.controler.HogwartsController;
import hogwarts.excepcions.UnderConstructionException;
import hogwarts.modelo.HogwartsCharacter;
import hogwarts.modelo.Subject;
import hogwarts.persitencia.SubjectDB;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author roi.castrocalvar
 */
public class TextAppHogwarts implements HogwartsView {

    private HogwartsController controlador;
    private ArrayList<HogwartsCharacter> characters = new ArrayList<>();

    public TextAppHogwarts(HogwartsController aThis) {
        controlador = aThis;
    }

    @Override
    public void setCharacters(ArrayList<HogwartsCharacter> characters) throws UnderConstructionException {
        this.characters = characters;
    }

    @Override
    public void setSubjects(ArrayList<Subject> subjects) throws UnderConstructionException {
        throw new UnderConstructionException();
    }

    @Override
    public void showMenu() throws UnderConstructionException {
        boolean sair = true;
        Scanner scan = new Scanner(System.in);
        while (sair) {
            System.out.println("Benvido a Hogwarts...");
            System.out.println("1. Listar todas as personaxes");
            System.out.println("2. Mostrar os datos dunha personaxe");
            System.out.println("3. Listar todas as materias");
            System.out.println("4. Mostrar os datos dunha materia");
            System.out.println("5. Saír de Hogwarts");
            System.out.println("Que queres facer?:");
            int var = scan.nextInt();
            scan.nextLine();
            switch (var) {
                case 1:
                    System.out.println("Estas son todas as personaxes rexistradas:");
                    for (HogwartsCharacter character : characters) {
                        System.out.println(character.getCodigo() + " - " + character.getNome() + " " + character.getCasa() + " : " + character.getCaracteristicas());
                    }
                case 2:
                    System.out.println("Introduce o código de Hogwarts da personaxe:");
                    String codigo = scan.nextLine();
                    for (HogwartsCharacter character : characters) {
                        if (character.getCodigo().equals(codigo)) {
                            showCharacterData(character);
                        }
                    }
                case 3:
                case 4:
                    String materia = scan.nextLine();
                    for (Subject subject : SubjectDB.getMaterias()) {
                        if (subject.getCodigoMateria().equals(materia)) {
                            showSubjectData(subject);
                        }
                    }

                case 5:
                    sair = false;
                    break;
                default:
                    System.out.println("Opción incorrecta!");
            }
        }
    }

    /**
     * Implementación do método da interface "HogwartsView". Este método ímolo
     * deixar sen implementar, así que debe arroxar unha
     * "UnderConstructionException"
     *
     * @param character
     * @throws UnderConstructionException
     */
    @Override
    public void showCharacterData(HogwartsCharacter character) throws UnderConstructionException {
        throw new UnderConstructionException();
    }

    /**
     * Implementación do método da interface "HogwartsView". Este método ímolo
     * deixar sen implementar, así que debe arroxar unha
     * "UnderConstructionException"
     *
     * @param subject
     * @throws UnderConstructionException
     */
    @Override
    public void showSubjectData(Subject subject) throws UnderConstructionException {
        throw new UnderConstructionException();
    }

    /**
     * Implementación do método da interface "HogwartsView". Este método
     * simplemente mostra por pantalla o texto "A operación xxx aínda está en
     * construcción", onde "xxx" é o valor recibido como parámetro, e logo unha
     * liña en branco.
     *
     * @param operationName
     */
    @Override
    public void showUnderConstructionMessage(String operationName) {
        System.out.println("A operacion " + operationName + " aínda está en construcción");
        System.out.println("");
    }

}
