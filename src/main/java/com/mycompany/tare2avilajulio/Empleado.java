/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tare2avilajulio;

/**
 *
 * @author IdeaPad Gaming
 */
public class Empleado {
    String nombre;
    int horasTrabajadas;
    Double  costoHora;
    int añoIngreso;

    public double calcularHorasExtra() {
        var retorno = 0.0d;
        if (this.horasTrabajadas > 160) {
            var horasAdicionales = 0;
            horasAdicionales = (this.horasTrabajadas - 160);
            var valorPagarHoraExtra = this.costoHora * 2;
            retorno = horasAdicionales * valorPagarHoraExtra;
        }
        return retorno;

    }

    public double calcularIngresos(int yearActual) {
        var retorno = 0.0;
        var ingresoBasico = this.costoHora * this.horasTrabajadas;
        int añoActual = 0;
        var ingresoAntiguedad = añoActual - this.añoIngreso;
        var valor20 = ingresoBasico * 0.02;
        var valorPorAño = valor20 * ingresoAntiguedad;
        retorno = ingresoBasico;

        return retorno;

    }

    public double calcularImpuesto(int limite1, int limite2, int limite3) {

        //< o > &&
        var retorno = 0.0;
        if (this.calcularIngresos(añoIngreso) <= limite1) {
            retorno = this.calcularIngresos(añoIngreso) * 0;

        }
        if (this.calcularIngresos(añoIngreso) > limite1
                && this.calcularIngresos(añoIngreso) <= limite2) {
            retorno = this.calcularIngresos(añoIngreso) * 0.05;

        }
        if (this.calcularIngresos(añoIngreso) > limite2
                && this.calcularIngresos(añoIngreso) <= limite3) {
            retorno = this.calcularIngresos(añoIngreso) * 0.12;

        }
        if (this.calcularIngresos(añoIngreso) > limite3) {
            retorno = this.calcularIngresos(añoIngreso) * 0.25;
        }

        return retorno;
    }

    public double calcularTotal(int yearActual, int limite1, int limite2, int limite3) {

        var retorno = 0.0;
        retorno = this.calcularIngresos(añoIngreso) + this.calcularHorasExtra()
                - this.calcularImpuesto(limite1, limite2, limite3);

        return retorno;
    }
}

