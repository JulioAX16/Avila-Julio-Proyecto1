/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea3avilajulio;

/**
 *
 * @author IdeaPad Gaming
 */
public class Pais2 {
    private String nombre; 
    private String continente;
    private int numeroDeEquipos;
    
    public Pais2(String nombre, String continente, int numeroDeEquipos ) {
        this.nombre = nombre;
        this.continente=continente;
        this.numeroDeEquipos=numeroDeEquipos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContinente() {
        return continente;
    }

    public int getNumeroDeEquipos() {
        return numeroDeEquipos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public void setNumeroDeEquipos(int numeroDeEquipos) {
        this.numeroDeEquipos = numeroDeEquipos;
    }
    
    public String mostrarInfo() {
        return ("EL pais es "+this.getNombre()+", su continente es "+this.getContinente()+", cuenta con "+
                this.getNumeroDeEquipos()+" equipos");
    }
}
