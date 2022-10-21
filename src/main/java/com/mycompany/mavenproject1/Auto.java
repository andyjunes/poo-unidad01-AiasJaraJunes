/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author andyj
 */
public class Auto {
    

    String placa;
    String marca;
    int year;
    String color;
    double precio;
    int cilindrajeMotor;
    Propietario owner;

    public String mostrarInfo() {
        var retorno = " El auto tiene placa: " + this.placa + " es de marca: "
                + this.marca + ". El propietario es: " + this.owner.nombre
                + " la dirección del propietario es: " + this.owner.direccion
                + " . El auto cuesta "+this.precio+ " USD y es modelo: " + this.year;

        return retorno;
    
}
}