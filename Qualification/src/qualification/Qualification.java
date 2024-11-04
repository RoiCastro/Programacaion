/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qualification;

/**
 *
 * @author roi.castrocalvar
 */
public class Qualification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cualificaicon
        int qualification = 7;
        //switch para saber que teine de nota
        switch (qualification) {
            case 10:
                System.out.println("Matrícula de Honra");
                break;
            case 9:
                System.out.println("Sobresaínte");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 6:
                System.out.println("Ben");
                break;
            case 5:
                System.out.println("Aprobado");
                break;
            default:
                System.out.println("Suspenso");
                break;
        }
    }

}
