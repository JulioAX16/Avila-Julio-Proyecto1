/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea3avilajulio;

/**
 *
 * @author IdeaPad Gaming
 */
public class Profesor {
     private String nombre;
    private String materiaImpartida;
    private int yearDeExperiencia;
    
    public Profesor(String nombre,String materiaImpartida, int yearDeExperiencia ) {
        this.nombre = nombre;
        this.materiaImpartida=materiaImpartida;
        this.yearDeExperiencia=yearDeExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMateriaImpartida() {
        return materiaImpartida;
    }

    public int getYearDeExperiencia() {
        return yearDeExperiencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMateriaImpartida(String materiaImpartida) {
        this.materiaImpartida = materiaImpartida;
    }

    public void setYearDeExperiencia(int yeardExperiencia) {
        this.yearDeExperiencia = yeardExperiencia;
    }
    public String mostrarInfo() {
        return ("EL profesor se llama "+this.getNombre()+", impartira la materia de "+
                this.getMateriaImpartida()+", tiene "+this.getYearDeExperiencia()+" años de experiencia");
        
    }
    
}
