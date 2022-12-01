/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea3avilajulio;

/**
 *
 * @author IdeaPad Gaming
 */
public class Ciudad {extends Reconocer {

    private String nombreAlcalde;
    private int numeroDeHospitales;
    private Ciudad pais;

    public Ciudad(String nombreAlcade, int numeroDeHospitales) {

        this.nombreAlcalde = nombreAlcade;
        this.numeroDeHospitales = numeroDeHospitales;
    }

    public String getNombreAlcalde() {
        return nombreAlcalde;
    }

    public int getNumeroDeHospitales() {
        return numeroDeHospitales;
    }

    public void setNombreAlcalde(String nombreAlcalde) {
        this.nombreAlcalde = nombreAlcalde;
    }

    public void setNumeroDeHospitales(int numeroDeHospitales) {
        this.numeroDeHospitales = numeroDeHospitales;
    }

    public Ciudad getpais() {
        return pais;
    }

    public void setpais(Ciudad pais) {
        this.pais = pais;
    }

    @Override
    public String mostrarInfo() {
        return ("; La ciudad es " + this.getNombre() + ", el alcalde es "
                + this.getNombreAlcalde() + " la ciudad cuenta con "
                + this.getNumeroDeHospitales() + " hospitales");
    }

    void setNombre(String cuenca) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class Reconocer {

        public Reconocer() {
        }
    }

}
  
