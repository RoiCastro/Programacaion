package teacher;

/**
 * La clase Interim extiende de Teacher y representa a un profesor interino.
 *
 * @author roi.castrocalvar
 */
public class Interim extends Teacher {

    /**
     * Complemento adicional que se le otorga a este tipo de profesor.
     */
    protected double interimComplement;

    /**
     * Devuelve el complemento de interino del profesor.
     *
     * @return el valor del complemento interino
     */
    public double getInterimComplement() {
        return interimComplement;
    }

    /**
     * Establece el complemento de interino para el profesor.
     *
     * @param interimComplement el nuevo valor del complemento interino
     */
    public void setInterimComplement(double interimComplement) {
        this.interimComplement = interimComplement;
    }

    /**
     * Constructor de la clase Interim.
     *
     * @param interimComplement Valor complementario para el interino.
     * @param name nombre
     * @param surname apellido
     * @param addres dirección
     * @param baseSalary salario base
     */
    public Interim(double interimComplement, String name, String surname, String addres, double baseSalary) {
        super(name, surname, addres, baseSalary);
        this.interimComplement = interimComplement;
    }

    /**
     * Calcula el salario sumando el salario base y el complemento de interino .
     */
    @Override
    void generatePayroll() {
        salary = baseSalary + interimComplement;
    }

}
