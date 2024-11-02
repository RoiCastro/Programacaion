package stringcomparator;

/**
 *
 * @author R
 */
public class StringComparator {

    private String text1;
    private String text2;
    private String text3;

    /**
     * Devulve el texto escrito
     *
     * @return
     */
    public String getText1() {
        return text1;
    }

    /**
     * Escribe un texto
     *
     * @param text1 texto
     */
    public void setText1(String text1) {
        this.text1 = text1;
    }

    /**
     * Devulve el texto escrito
     *
     * @return
     */
    public String getText2() {
        return text2;
    }

    /**
     * Escribe un texto
     *
     * @param text2 texto
     */
    public void setText2(String text2) {
        this.text2 = text2;
    }

    /**
     * Devulve el texto escrito
     *
     * @return
     */
    public String getText3() {
        return text3;
    }

    /**
     * Escribe un texto
     *
     * @param text3 texto
     */
    public void setText3(String text3) {
        this.text3 = text3;
    }

    /**
     * Crea objeto StringComparator
     *
     * @param text1 texto
     * @param text2 texto
     * @param text3 texto
     */
    public StringComparator(String text1, String text2, String text3) {
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringComparator comp1 = new StringComparator("Kas", "paras", "lluvia");
        comp1.getBigger();
    }

    /**
     * Comprueba cual es el texto de mayor tamaño y te lo devuelve por pantalla
     */
    public void getBigger() {

        //metodo lenght sirve para contar los char del texto
        int text1val = text1.length();
        int text2val = text2.length();
        int text3val = text3.length();

        if (text1val > text2val) {
            if (text1val > text3val) {
                System.out.println("El texto de mayor tamaño es " + text1);
            } else {
                System.out.println("El texto de mayor tamaño es " + text3);
            }
        } else if (text2val > text3val) {
            System.out.println("El texto de mayor tamaño es " + text2);
        } else {
            System.out.println("El texto de mayor tamaño es " + text3);
        }
    }

}