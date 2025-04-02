/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hogwarts.controler;

import hogwarts.excepcions.UnderConstructionException;
import hogwarts.modelo.HogwartsCharacter;
import hogwarts.modelo.Pet;
import hogwarts.modelo.Student;
import hogwarts.modelo.Subject;
import hogwarts.modelo.Teacher;
import hogwarts.persitencia.HogwartsCharacterDB;
import hogwarts.persitencia.SubjectDB;
import hogwarts.view.HogwartsView;
import hogwarts.view.JFrameHogwarts;
import hogwarts.view.TextAppHogwarts;

/**
 *
 * @author roi.castrocalvar
 */
public class HogwartsController {

    private HogwartsView vista;

    public HogwartsController() {
        vista = new JFrameHogwarts(this);
    }

    /**
     * Este método inicia a aplicación, chamando ao método "setCharacters" da
     * vista para establecer a lista das personaxes que se obterá de
     * "HogwartsCharacterDB", e ao método "showMenu". En caso de que se produza
     * unha "UnderConstructionException" se mostrará unha mensaxe ao usuario,
     * chamando ao método "showUnderConstructionMessage" da vista, para indicar
     * que a operación "mostrar o menú inicial" está en construcción.
     */
    public void initApp() {
        
        try {
            vista.setCharacters(HogwartsCharacterDB.getHogwartsCharacters());
            vista.showMenu();
        } catch (UnderConstructionException ex) {
            String operationName = "mostrar o menú inicial";
            vista.showUnderConstructionMessage(operationName);
        }
    }

    /**
     * Este método obtén a personaxe que ten o código recibido como parámetro
     * (usando a clase "HogwartsCharacterDB") e chama ao método
     * "showCharacterData" da vista para mostrar os seus datos ao usuario. En
     * caso de que se produza unha "UnderConstructionException" se mostrará unha
     * mensaxe ao usuario, chamando ao método "showUnderConstructionMessage" da
     * vista, para indicar que a operación "mostrar os datos dunha personaxe"
     * está en construcción.
     *
     * @param hogwartsCode
     */
    public void showCharacterData(String hogwartsCode) {
        HogwartsCharacterDB.getHogwartsCharacters();
        for (HogwartsCharacter hogwartsCharacter : HogwartsCharacterDB.getHogwartsCharacters()) {
            if (hogwartsCharacter.getCodigo().equals(hogwartsCode)) {
                try {
                    vista.showCharacterData(hogwartsCharacter);
                } catch (UnderConstructionException ex) {
                    String operationName = "mostrar os datos dunha personaxe";
                    vista.showUnderConstructionMessage(operationName);
                }
            }
        }
    }

    /**
     * Carga os datos de exemplo para o funcionamento da aplicación
     */
    public void loadSampleData() {
        // Creamos uns alumnos e uns profesores
        Student harry = new Student("Harry Potter", "Cicatriz en forma de raio na fronte",
                "A-1992-0001", "Griffindor", new Pet("Curuxa", "Hedwig", 3), "Buscador", 3);
        Student hermione = new Student("Hermione Granger", "Moi observadora e boa estudante",
                "A-1992-0002", "Griffindor", new Pet("Gata", "Crookshanks", 2), "", 3);
        Student draco = new Student("Draco Malfoy", "Inimigo de Harry Potter",
                "A-1992-0004", "Slytherin", null, "Buscador", 3);
        Teacher dumbledore = new Teacher("Albus Dumbledore", "Longa barba", "P-001",
                "", new Pet("Fénix", "Fawkes", 150), "500 anos de experiencia na maxia");
        Teacher minerva = new Teacher("Minerva McGonagall",
                "Moi estrita", "P-002", "Griffindor", null, "Experta en feitizos");
        Teacher snape = new Teacher("Severus Snape", "Apariencia escura", "P-003",
                "Slytherin", null, "Experto en maxia negra");

        // Creamos unhas materias
        Subject trans4 = new Subject("MM-401", "Transformacións 4", 4, minerva);
        trans4.getAlumnos().add(harry);
        trans4.getAlumnos().add(hermione);
        trans4.getAlumnos().add(draco);
        Subject pot4 = new Subject("MM-402", "Pocións 4", 4, snape);

        // Engadimos os alumnos e profes ás personaxes de Howgwarts
        HogwartsCharacterDB.getHogwartsCharacters().add(harry);
        HogwartsCharacterDB.getHogwartsCharacters().add(hermione);
        HogwartsCharacterDB.getHogwartsCharacters().add(draco);
        HogwartsCharacterDB.getHogwartsCharacters().add(dumbledore);
        HogwartsCharacterDB.getHogwartsCharacters().add(minerva);
        HogwartsCharacterDB.getHogwartsCharacters().add(snape);

        // Engadimos as materias á lista de materias de Hogwarts
        SubjectDB.getMaterias().add(trans4);
        SubjectDB.getMaterias().add(pot4);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HogwartsController controlador = new HogwartsController();
        controlador.loadSampleData();
        controlador.initApp();
    }
    
    public void saveCharacter(HogwartsCharacter hogwartsCharacter){
        //vista.setCharacters(characters);
    }
    
    
    
}
