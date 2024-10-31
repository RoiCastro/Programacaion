package agrupar.segundos;

/**
 *
 * @author roi.castrocalvar
 */
public class AgruparSegundos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de las variables
        int x =150000 ;
        int y = x/3600;
        int z = (x%3600)/60;
        int t = (x%3600)%60;
        // Imprimimos por pantalla el resultado
        System.out.println(x +" segundos son " + y + " horas, " + z + " minutos e " + t +" segundos");
    }
    
}
