/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1avilajulio;

/**
 *
 * @author IdeaPad Gaming
 */
public class AvilaJulioTarea1 {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        
        var perro1 = new Perro();
        perro1.nombre="Luke";
        perro1.edad=8;
        perro1.raza="Chihuahua";
        perro1.peso=25;
        var perro2 = new Perro();
        perro2.nombre="Max";
        perro2.edad=5;
        perro2.raza="Dalmata";
        perro2.peso=40;
        var perro3 = new Perro();
        perro3.nombre="coco";
        perro3.edad=4;
        perro3.raza="golden";
        perro3.peso=35;
        
        var Zapatos1 = new Zapatos();
        Zapatos1.marca="Nike";
        Zapatos1.precio="120";
        Zapatos1.año="2019";
        var Zapatos2 = new Zapatos();
        Zapatos2.marca="jordan";
        Zapatos2.precio="300";
        Zapatos2.año="2000";
        var Zapatos3= new Zapatos();
        Zapatos3.marca="adidas";
        Zapatos3.precio="350";
        Zapatos3.año="2022";
                
        var computadora1 = new Computadora();
        computadora1.marca="lenovo";
        computadora1.modelo="idepadgaming";
        computadora1.almacenamiento="1T";
        computadora1.precio=975;
        var computadora2 = new Computadora();
        computadora2.marca="ASUS";
        computadora2.modelo="F15";
        computadora2.almacenamiento="1TB";
        computadora2.precio=1500;
        var computadora3 = new Computadora();
        computadora3.marca="Thoshibs";
        computadora3.modelo="Gamer";
        computadora3.almacenamiento="1T";
        computadora3.precio=850;
        
        var persona1 = new Persona();
        persona1.apellido="Ortega";
        persona1.nombre="Santiago";
        persona1.edad=20;
        persona1.estatura=1.70;
        var persona2 = new Persona();
        persona2.apellido="Andrade";
        persona2.nombre="Mario";   
        persona2.edad=18;
        persona2.estatura=1.54;
        var persona3 = new Persona();
        persona3.apellido="Avila";
        persona3.nombre="Julio";
        persona3.edad=19;
        persona3.estatura=1.75; 
               
        
        var guitarra1= new Guitarra();
        guitarra1.marca="Guibson";
        guitarra1.precio="1200";
        guitarra1.año="2015";
        guitarra1.cuerdas="6";
        var guitarra2= new Guitarra();
        guitarra2.marca="fly v";
        guitarra2.precio="2500";
        guitarra2.año="1990";
        guitarra2.cuerdas="6";
        var guitarra3= new Guitarra();
        guitarra3.marca="Jackson";
        guitarra3.precio="800";
        guitarra3.año="2020";
        guitarra3.cuerdas="7";  
        
        var balon1= new Balon();
        balon1.marca="ADIDAS";
        balon1.nroBalon=3;
        balon1.modelo="Al Rila";
        balon1.deporte="Futbol";
        var balon2= new Balon();
        balon2.marca="Adidas";
        balon2.nroBalon=3;
        balon2.modelo="Champions edition";
        balon2.deporte="Futbol";
        var balon3= new Balon();
        balon3.marca="MIKASA";
        balon3.nroBalon=4;
        balon3.modelo="FT-5";
        balon3.deporte="Ecuavoley-Futbol";
        
        //Perros 
        System.out.println("Mi perro se llama "+ perro1.nombre+ " ademas tiene "+
                perro1.edad+ " años"+ " y es de raza "+ perro1.raza);
        
        System.out.println("Mi perro se llama "+ perro2.nombre+ " ademas tiene "+
                perro2.edad+ " años"+ " y es de la raza "+ perro2.raza); 
        
        System.out.println("Mi perro se llama "+ perro3.nombre+ " ademas tiene "+
                perro3.edad+ " años"+ " y es de la raza "+ perro3.raza);
        
        //Guitarra
        System.out.println("la marca de la guitarra  "+ guitarra1.marca 
                + "  su precio  "+ guitarra1.precio + " es del año "+ guitarra1.año +
                        " y tiene(numero de cuerdas) "+ guitarra1.cuerdas);
        
        System.out.println("la marca de la guitarra  "+ guitarra1.marca 
                + "  su precio  "+ guitarra2.precio + " es del año "+ guitarra2.año +
                        " y tiene(numero de cuerdas) "+ guitarra2.cuerdas);
        
        System.out.println("la marca de la guitarra  "+ guitarra3.marca 
                + "  su precio  "+ guitarra3.precio + " es del año "+ guitarra3.año +
                        " y tiene(numero de cuerdas) "+ guitarra3.cuerdas);
        
        //Computadoras
        System.out.println("El computador es de la marca "+computadora1.marca+
                " es del modelo "+computadora1.modelo+" tiene una capacidad de almacenamiento de "+
                computadora1.almacenamiento+" el precio del computador es de "+computadora1.precio+"$");
        
        System.out.println("El computador es de la marca "+computadora2.marca+
                " es del modelo "+computadora2.modelo+" tiene una capacidad de almacenamiento de "+
                computadora2.almacenamiento+" el precio del computador es de "+computadora2.precio+"$");
        
        System.out.println("El computador es de la marca "+computadora3.marca+
                " es del modelo "+computadora3.modelo+" tiene una capacidad de almacenamiento de "+
                computadora3.almacenamiento+" el precio del computador es de "+computadora3.precio+"$");
        
        //Personas 
        System.out.println("La persona se llama "+persona1.nombre+" y su apellido es "+persona1.apellido+
                " tiene una estatura de "+persona1.estatura+"m a los "+persona1.edad+" años");
        
        System.out.println("La persona se llama "+persona2.nombre+" y su apellido es "+persona2.apellido+
                " tiene una estatura de "+persona2.estatura+"m a los "+persona2.edad+" años");
        
        
        
        System.out.println("La persona se llama "+persona3.nombre+" y su apellido es "+persona3.apellido+
                " tiene una estatura de "+persona3.estatura+"m a los "+persona3.edad+" años");
        
        //zapatos 
        System.out.println("La marca de los Zapatos es "+Zapatos1.marca+" y cuestan "+Zapatos1.precio+
                " y son del año "+Zapatos1.año);
        
        System.out.println("La marca de los Zapatos es "+Zapatos1.marca+" y cuestan "+Zapatos1.precio+
                " y son del año "+Zapatos1.año);
        
       System.out.println("La marca de los Zapatos es "+Zapatos2.marca+" y cuestan "+Zapatos2.precio+
                " y son del año "+Zapatos2.año);
        
        //Balones 
        System.out.println("La marca del balon es "+balon1.marca+" y el modelo es "+balon1.modelo+
                " el numero del balon es "+balon1.nroBalon+" y se utiliza para jugar "+balon1.deporte);
        
        System.out.println("La marca del balon es "+balon2.marca+" y el modelo es "+balon2.modelo+
                " el numero del balon es "+balon2.nroBalon+" y se utiliza para jugar "+balon2.deporte);
                
        System.out.println("La marca del balon es "+balon3.marca+" y el modelo es "+balon3.modelo+
                " el numero del balon es "+balon3.nroBalon+" y se utiliza para jugar "+balon3.deporte);
        
}
