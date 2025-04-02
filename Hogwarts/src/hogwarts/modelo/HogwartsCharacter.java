/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hogwarts.modelo;

/**
 *
 * @author roi.castrocalvar
 */
public class HogwartsCharacter {

    private String nome;
    private String caracteristicas;
    private String codigo;
    private String casa;
    private Pet mascota = null;

    /**
     * Obtiene
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *Insreta
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *Obtiene
     * @return
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     *Insreta
     * @param caracteristicas
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    /**
     *Obtiene
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Insreta
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     *Obtiene
     * @return
     */
    public String getCasa() {
        return casa;
    }

    /**
     *Insreta
     * @param casa
     */
    public void setCasa(String casa) {
        this.casa = casa;
    }

    /**
     *Obtiene
     * @return
     */
    public Pet getMascota() {
        return mascota;
    }

    /**
     * Insreta
     * @param mascota
     */
    public void setMascota(Pet mascota) {
        this.mascota = mascota;
    }

    /**
     *
     * @param nome
     * @param caracteristicas
     * @param codigo
     * @param casa
     */
    public HogwartsCharacter(String nome, String caracteristicas, String codigo, String casa) {
        this.nome = nome;
        this.caracteristicas = caracteristicas;
        this.codigo = codigo;
        this.casa = casa;
    }

}
