/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hogwarts.view;

import hogwarts.excepcions.UnderConstructionException;
import hogwarts.modelo.HogwartsCharacter;
import hogwarts.modelo.Subject;
import java.util.ArrayList;

/**
 *
 * @author roi.castrocalvar
 */
public interface HogwartsView {

    /**
     * Este método será chamado pola controladora para indicar a lista de
     * personaxes da academia que hai que mostrar.
     *
     * @param characters
     * @throws UnderConstructionException
     */
    public void setCharacters(ArrayList<HogwartsCharacter> characters) throws UnderConstructionException;

    /**
     * Este método será chamado pola controladora para indicar a lista de
     * materia da academia que hai que mostrar.
     *
     * @param subjects
     * @throws UnderConstructionException
     */
    public void setSubjects(ArrayList<Subject> subjects) throws UnderConstructionException;

    /**
     * Este método será chamado pola controladora para que se mostre ao usuario
     * o menú coas opcións da aplicación
     *
     * @throws UnderConstructionException
     */
    public void showMenu() throws UnderConstructionException;

    /**
     * Este método será chamado pola controladora para mostrar os datos dunha
     * personaxe da academias
     *
     * @param character
     * @throws UnderConstructionException
     */
    public void showCharacterData(HogwartsCharacter character) throws UnderConstructionException;

    /**
     * Este método será chamado pola controladora para mostrar os datos dunha
     * materia da academia.
     *
     * @param subject
     * @throws UnderConstructionException
     */
    public void showSubjectData(Subject subject) throws UnderConstructionException;

    /**
     *
     * @param operationName
     */
    public void showUnderConstructionMessage(String operationName);
}
