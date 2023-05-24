/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entidades;

/**
 *
 * @author LENOVO
 */
public class enfermero {
    private String nombre;
    private String tipoNombramiento;
    double sueldoMensual;
    
    public enfermero(String n, String tN, double sM){
        nombre = n;
        tipoNombramiento = tN;
        sueldoMensual = sM;
    }
    
    @Override
    public String toString() {
        return "- " + nombre + " - sueldo: " + sueldoMensual + " - " + tipoNombramiento ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoNombramiento() {
        return tipoNombramiento;
    }

    public void setTipoNombramiento(String tipoNombramiento) {
        this.tipoNombramiento = tipoNombramiento;
    }


    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
