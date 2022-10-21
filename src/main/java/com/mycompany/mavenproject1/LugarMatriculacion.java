/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author andyj
 */
public class LugarMatriculacion {
    String descripcion;
    String provincia;
    String ciudad;
    String telefono;
    Propietario matricula;
    
    
    public String mostraInfo(){
        var informacion = ("La matricula se realizo en: " + this.descripcion + 
                "El telefono del propietarios es: " + this.telefono + "La Provincia es: " 
                + this.provincia + "En la ciudad de: " + this.ciudad);
        return informacion;
    }
    
}
