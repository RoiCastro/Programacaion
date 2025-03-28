/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padel.controler;

import java.util.Scanner;

/**
 *
 * @author roi.castrocalvar
 */
public class InitMenuView {

    private InitMenuController controller;
    private Scanner scan = new Scanner(System.in);

    public InitMenuView(InitMenuController controller) {
        this.controller = controller;
    }

    public void showInvalidUser() {
        System.out.println("Las credenciales introducidas no son correctas");
    }

    public boolean showLoginMenu() {
        System.out.println("Escribe o id do usuario:");
        String id = scan.nextLine();
        if(id ==""){
            return true;
        }
        System.out.println("Escribe o contrasinal do usuario:");
        String password = scan.nextLine();
        controller.login(id, password);
        return false;
    }

}
