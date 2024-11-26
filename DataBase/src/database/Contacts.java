/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.util.HashMap;

/**
 * 
 * @autor Roi
 */
public class Contacts {

    // Atributo privado que almacena o directorio telefónico.
    private HashMap<Integer, Client> phonebook = new HashMap<>();

    /**
     * Obtén o HashMap completo do phonebook.
     * 
     * @return O HashMap que contén os contactos.
     */
    public HashMap<Integer, Client> getPhonebook() {
        return phonebook;
    }

    /**
     * Establece un novo HashMap para o phonebook.
     * 
     * @param phonebook O novo HashMap a asignar.
     */
    public void setPhonebook(HashMap<Integer, Client> phonebook) {
        this.phonebook = phonebook;
    }
    
    /**
     * Engade un novo contacto ao directorio.
     * Se o número de teléfono xa existe, o obxecto Client será actualizado.
     * 
     * @param tel O número de teléfono do cliente.
     * @param cli O obxecto Client a asociar ao número.
     */
    public void insert(int tel, Client cli) {
        phonebook.put(tel, cli);
    }

    /**
     * Elimina un contacto do directorio usando o seu número de teléfono.
     * 
     * @param tel O número de teléfono do cliente a eliminar.
     */
    public void remove(int tel) {
        phonebook.remove(tel);
    }

    /**
     * Busca e devolve un cliente polo seu número de teléfono.
     * 
     * @param tel O número de teléfono a buscar.
     * @return O obxecto Client asociado ao número ou null se non se atopa.
     */
    public Client findByNumber(int tel) {
        return phonebook.get(tel);
    }

    /**
     * Devolve o número total de contactos no directorio.
     * 
     * @return O número de contactos almacenados.
     */
    public int numContacts() {
        return phonebook.size();
    }
}
