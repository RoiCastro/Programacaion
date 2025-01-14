package teacher;

/**
 * La clase CareerOfficer extiende de Teacher y representa a un profesor
 * funcionario de carrera.
 *
 * @author Roi Castro
 */
public class CareerOfficer extends Teacher {

    /**
     * Complemento adicional que se le otorga a este tipo de profesor.
     */
    protected double officerComplement;

    /**
     * Año en el que el profesor aprobó la oposición.
     */
    protected int opositionYear;

    /**
     * Lugar donde el profesor se presentó a la oposición.
     */
    protected String oppositionPlace;

    /**
     * Obtiene el complemento de funcionario de carrera.
     *
     * @return officerComplement
     */
    public double getOfficerComplement() {
        return officerComplement;
    }

    /**
     * Establece el complemento de funcionario de carrera.
     *
     * @param officerComplement
     */
    public void setOfficerComplement(double officerComplement) {
        this.officerComplement = officerComplement;
    }

    /**
     * Obtiene el año en el que se aprobó la oposición.
     *
     * @return opositionYear
     */
    public int getOpositionYear() {
        return opositionYear;
    }

    /**
     * Establece el año en el que se aprobó la oposición.
     *
     * @param opositionYear
     */
    public void setOpositionYear(int opositionYear) {
        this.opositionYear = opositionYear;
    }

    /**
     * Obtiene el lugar de realización de la oposición.
     *
     * @return oppositionPlace
     */
    public String getOppositionPlace() {
        return oppositionPlace;
    }

    /**
     * Establece el lugar de realización de la oposición.
     *
     * @param oppositionPlace
     */
    public void setOppositionPlace(String oppositionPlace) {
        this.oppositionPlace = oppositionPlace;
    }

    public CareerOfficer(double officerComplement, int opositionYear, String oppositionPlace, String name, String surname, String addres, double baseSalary) {
        super(name, surname, addres, baseSalary);
        this.officerComplement = officerComplement;
        this.opositionYear = opositionYear;
        this.oppositionPlace = oppositionPlace;
    }

    /**
     * Calcula el salario sumando el salario base y el complemento de
     * funcionario .
     */
    @Override
    public void generatePayroll() {
        salary = baseSalary + officerComplement;
    }

}
