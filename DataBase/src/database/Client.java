/*
 * Haga clic en nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para cambiar esta licencia
 * Haga clic en nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar esta plantilla
 */
package database;

/**
 * Clase que representa a un cliente.
 * Contiene atributos para almacenar el NIF, nombre y apellidos del cliente.
 * Proporciona métodos para acceder y modificar estos atributos.
 * 
 * @author roi.castrocalvar
 */
public class Client {
    
    private String nif; // Número de Identificación Fiscal del cliente.
    
    private String name; // Nombre del cliente.
    
    private String surname; // Apellidos del cliente.

    /**
     * Obtiene el NIF del cliente.
     * 
     * @return El NIF del cliente.
     */
    public String getNif() {
        return nif;
    }

    /**
     * Establece el NIF del cliente.
     * 
     * @param nif El NIF a asignar al cliente.
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return El nombre del cliente.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del cliente.
     * 
     * @param name El nombre a asignar al cliente.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene los apellidos del cliente.
     * 
     * @return Los apellidos del cliente.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Establece los apellidos del cliente.
     * 
     * @param surname Los apellidos a asignar al cliente.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Constructor de la clase Client.
     * Inicializa un nuevo cliente con el NIF, nombre y apellidos proporcionados.
     * 
     * @param nif El NIF del cliente.
     * @param name El nombre del cliente.
     * @param surname Los apellidos del cliente.
     */
    public Client(String nif, String name, String surname) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
    }
}
