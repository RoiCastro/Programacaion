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

    private ArrayList<Client> dataBase;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataBase paco = new DataBase();
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
        } while (option != 5);

    }

    public void addClient() {

        dataBase = new ArrayList();

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

    public void showClients() {
        for (int i = 0; i < dataBase.size(); i++) {
            ;
            System.out.println(dataBase.get(i).getNif());
            
        }

    }

    public void removeClient(String nif) {

    }

    public int numClients() {

        return 0;

    }
}
