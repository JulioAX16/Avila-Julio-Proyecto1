/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea3avilajulio;

/**
 *
 * @author IdeaPad Gaming
 */
public class Equipo {
    private String nombre;
    private String patrocinador;
    private int titulosGanados;

    public Equipo(String nombre, String patrocinador, int titulosGanados) {
        this.nombre = nombre;
        this.patrocinador = patrocinador;
        this.titulosGanados = titulosGanados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public int getTitulosGandos() {
        return titulosGanados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public void setTitulosGandos(int titulosGandos) {
        this.titulosGanados = titulosGandos;
    }

    public String mostrarInfo() {
        return ("El equipo se llama " + this.getNombre() + ", lo patocina " + this.getPatrocinador()
                + " ,a ganado " + this.getTitulosGandos() + " titulos");
    }
    
}
