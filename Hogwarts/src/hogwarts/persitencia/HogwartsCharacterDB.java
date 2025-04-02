/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hogwarts.persitencia;

import hogwarts.modelo.HogwartsCharacter;
import java.util.ArrayList;

/**
 *
 * @author roi.castrocalvar
 */
public class HogwartsCharacterDB {

    private static ArrayList<HogwartsCharacter> HogwartsCharacters = new ArrayList<>();

    /**
     * Obtiene
     *
     * @return
     */
    public static ArrayList<HogwartsCharacter> getHogwartsCharacters() {
        return HogwartsCharacters;
    }

    /**
     *
     */
    public HogwartsCharacterDB() {

    }

    public static HogwartsCharacter findByCode(String id) {
        HogwartsCharacter HogwartsCharacter = null;

        for (HogwartsCharacter HogwartsCharacterFind : HogwartsCharacters) {
            if (HogwartsCharacterFind.getCodigo().equals(id)) {
                HogwartsCharacter = HogwartsCharacterFind;
            }
        }

        return HogwartsCharacter;

    }

    /**
     * Garda unha a personaxe recibida como parámetro na lista de personaxes da
     * academia. Simplemente ten que engadir o obxecto recibido como parámetro
     * no ArrayList.
     *
     * @param hogwartsCharacter
     */
    public static void save(HogwartsCharacter hogwartsCharacter) {
        HogwartsCharacters.add(hogwartsCharacter);
    }

    /**
     * Actualiza os datos da personaxe recibida como parámetro. Non ten que
     * facer nada.
     *
     * @param hogwartsCharacter
     */
    public static void update(HogwartsCharacter hogwartsCharacter) {

    }

    /**
     * Borra a personaxe recibida como parámetro da lista de personaxes da
     * academia.Simplemente ten que eliminar o obxecto recibido como parámetro
     * do ArrayList.
     *
     * @param hogwartsCharacter
     */
    public static void delete(HogwartsCharacter hogwartsCharacter) {
        for (int i = 0; i < HogwartsCharacters.size(); i++) {
            if (HogwartsCharacters.get(i).equals(hogwartsCharacter)) {
                HogwartsCharacters.remove(i);
            }
        }
    }
}
