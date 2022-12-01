/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea3avilajulio;

/**
 *
 * @author IdeaPad Gaming
 */
public class Jugador {
     private String nombre;
    private int edad;
    private String posicion;

    public Jugador(String nombre, String posicion, int edad ) {
        this.nombre = nombre;
        this.posicion=posicion;
        this.posicion=posicion;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }
    
    public String mostrarInfo() {
        return ("El nombre del juagador es "+this.getNombre()+"su edad es"+
                this.getEdad()+", su posicion es "+this.getPosicion());
    }
    
}
