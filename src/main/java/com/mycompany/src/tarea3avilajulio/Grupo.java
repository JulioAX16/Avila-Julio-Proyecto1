/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea3avilajulio;

/**
 *
 * @author IdeaPad Gaming
 */
public class Grupo {
    private int numero;
    private int codigo;
    private String carrera;
    
    public Grupo(int numero, int codigo, String carrera) {
        this.numero = numero;
        this.codigo=codigo;
        this.carrera=carrera;
    }

    public int getNumero() {
        return numero;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String mostrarInfo() {
        return ("El numero del grupo es "+this.getNumero()+", el codigo del grupo es "+
                this.getCodigo()+", pertenece a la carrera de "+this.getCarrera());
    }
    
}
