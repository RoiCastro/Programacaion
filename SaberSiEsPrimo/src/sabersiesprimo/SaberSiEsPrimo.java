/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sabersiesprimo;

/**
 *
 * @author roi.castrocalvar
 */
public class SaberSiEsPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=1700;
        int desp=0;
        for (int i = 1; i < num; i++){
            if(num%i==0){
                System.out.println(num/i);
            }
            
        }
    }
    
}
