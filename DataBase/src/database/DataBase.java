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
        // TODO code application logic here
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
                case 1 ->
                    dataBase.addClient();
                case 2 ->
                    dataBase.showClients();
                case 3 ->
                    dataBase.removeClient(scan.nextLine());
                case 4 ->
                    System.out.println(dataBase.numClients());
                case 5 ->
                    System.out.println("Chao que tenga un buen dia");
                default ->
                    System.out.println("Introduce un numero valido");
            }

        } while (option != 5);

    }

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

    public void showClients() {
        for (int i = 0; i < dataBase.size(); i++) {
            System.out.println(dataBase.get(i).getNif());
        }
    }

    public void removeClient(String nif) {

        Scanner scanner = new Scanner(System.in);
        String nifToRemove = scanner.nextLine();

        for (int i = 0; i < dataBase.size(); i++) {

            if (nifToRemove == dataBase.get(i).getNif()) {

            }
        }

    }

    public int numClients() {
        if (dataBase.isEmpty()) {
            return -1;
        }
        return dataBase.size();

    }
}
