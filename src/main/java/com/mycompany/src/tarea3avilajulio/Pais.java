/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea3avilajulio;

/**
 *
 * @author IdeaPad Gaming
 */
public class Pais  extends ""Reconocer {

    private String nombrePresidente;
    private String continente;
    private int numeroDeHabitantes;
    private String nombre;

    public Pais(String nombrePresidente, String continente, int numeroDeHabitantes, String nombre) {

        this.nombrePresidente = nombrePresidente;
        this.continente = continente;
        this.numeroDeHabitantes = numeroDeHabitantes;
        this.nombre = nombre;
    }

    public String getNombrePresidente() {
        return nombrePresidente;
    }

    public String getContinente() {
        return continente;
    }

    public int getNumeroDeHabitantes() {
        return numeroDeHabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombrePresidente(String nombrePresidente) {
        this.nombrePresidente = nombrePresidente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public void setNumeroDeHabitantes(int numeroDeHabitantes) {
        this.numeroDeHabitantes = numeroDeHabitantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String mostrarInfo() {
        return ("El pais es " + this.getNombre()
                + ", su presidente actual es " + this.getNombrePresidente()
                + ", tiene aproximadamente " + this.getNumeroDeHabitantes()
                + " millones de habitantes y pertenece al continente de " + this.getContinente());
    }

    
}
