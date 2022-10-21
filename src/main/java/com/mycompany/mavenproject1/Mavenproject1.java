/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author andyj
 */
public class Mavenproject1 {

    public static void main(String[] args) {
  
        
        var propietario1 = new Propietario();
        propietario1.nombre="Juan Pérez";
        propietario1.direccion="París y Oslo";
        propietario1.telefono="0984357604";
        propietario1.yearNacimiento=1981;
        
        var propietario2 = new Propietario();
        propietario2.nombre="Carlos López";
        propietario2.direccion="Gran Colombia y Lamar";
        propietario2.telefono="09843578596";
        propietario2.yearNacimiento=1980;
        
        
        var auto1 = new Auto();
        auto1.color="Amarillo";
        auto1.cilindrajeMotor=1600;
        auto1.marca="Toyota";
        auto1.placa="AGF0526";
        auto1.precio=18000;
        auto1.year=2018;
        auto1.owner=propietario2;
        
        var auto2 = new Auto();
        auto2.color="Azul";
        auto2.cilindrajeMotor=2500;
        auto2.marca="Chevrolet";
        auto2.placa="UAF0526";
        auto2.precio=18000;
        auto2.year=2010;
        auto2.owner=propietario1;
        
        var LugarMatriculacion = new LugarMatriculacion();
        LugarMatriculacion.descripcion="Se matriculo en Mayancela";
        LugarMatriculacion.provincia="Azuay";
        LugarMatriculacion.ciudad="Cuenca";
        LugarMatriculacion.telefono="099875673";

        
        var LugarMatriculacion1 = new LugarMatriculacion();
        LugarMatriculacion1.descripcion="Se matriculo en Capulispamba";
        LugarMatriculacion1.provincia="Azuay";
        LugarMatriculacion1.ciudad="Cuenca";
        LugarMatriculacion1.telefono="099875673";
        
        System.out.println(auto1.mostrarInfo());
        System.out.println(auto2.mostrarInfo());
        System.out.println(LugarMatriculacion.mostrarInfo());
        System.out.println(LugarMatriculacion1.mostrarInfo());

        
        
    }
}
