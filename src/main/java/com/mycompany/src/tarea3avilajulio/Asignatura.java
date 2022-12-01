/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea3avilajulio;

/**
 *
 * @author IdeaPad Gaming
 */
public class Asignatura {
    private String nombre;
    private int horas;
    private int codigoA;
    
    public Asignatura(String nombre, int horas, int codigoA) {
        this.nombre = nombre;
        this.codigoA = codigoA;
        this.horas=horas;
    }

    public void setNomnbe(String nomnre) {
        this.nombre = nomnre;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setCodigoA(int codigoA) {
        this.codigoA = codigoA;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public int getCodigoA() {
        return codigoA;
    }
    public String mostrarInfo() {
        return ("La asignatura es "+this.getNombre()+", su codigo es "+this.getCodigoA()+
                " se llevara a cabo durate "+this.getHoras()+" horas.");
    }

}
    

