/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author roi.castrocalvar
 */
public class DataBase {

    private ArrayList<Client> dataBase = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DataBase dataBase = new DataBase();
        Scanner scan = new Scanner(System.in);
        int option;
        
        do {
            System.out.println("Menu");
            System.out.println("Opciones");
            System.out.println("1. Añade un cliente");
            System.out.println("2. Enseña todos los clientes");
            System.out.println("3. Elimina un cliente");
            System.out.println("4. Enseña la cantidad de clientes");
            System.out.println("5. Salir");
            System.out.println("Elije una opcion");

            option = scan.nextInt();
            String paco = scan.nextLine();

            switch (option) {
                case 1:
                    dataBase.addClient();
                    break;
                case 2:
                    dataBase.showClients();
                    break;
                case 3:
                    System.out.println("Escribe el nif del cliente a eliminar");
                    dataBase.removeClient(scan.nextLine());
                    break;
                case 4:
                    System.out.println(dataBase.numClients());
                    break;
                case 5:
                    System.out.println("Chao que tenga un buen dia");
                    break;
                default:
                    System.out.println("Introduce un numero valido");
                    break;
            }

        } while (option != 5);

    }

    /**
     * Añade clientes al arraylist 'dataBase'
     */
    public void addClient() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el nif del cliente");
        String nif = scanner.nextLine();
        System.out.println("Escribe el nombre del cliente");
        String name = scanner.nextLine();
        System.out.println("Escribe el apellido del cliente");
        String surname = scanner.nextLine();
        Client Client = new Client(nif, name, surname);
        dataBase.add(Client);

    }

    /**
     * Enseña los clientes de 'dataBase'
     */
    public void showClients() {
        for (int i = 0; i < dataBase.size(); i++) {
            System.out.println(dataBase.get(i).getNif()+"  "+dataBase.get(i).getName());
            
        }
    }

    /**
     * Elimina un cliente de 'dataBase' y si no lo encuentra lo dice
     * @param nif para saber que cliente eliminar
     */
    public void removeClient(String nif) {

        for (int i = 0; i < dataBase.size(); i++) {

            if (nif.equals(dataBase.get(i).getNif())) {
                dataBase.remove(i);
                 System.out.println("Cliente eliminado");
                return;
            }
        }
        System.out.println("No se encontro el cliente.");

    }

    /**
     * Devulve el numero de clientes que se encuentra en 'dataBase'
     * @return devulve el numero sino hay nada -1
     */
    public int numClients() {
        if (dataBase.isEmpty()) {
            return -1;
        }
        return dataBase.size();

    }
}
