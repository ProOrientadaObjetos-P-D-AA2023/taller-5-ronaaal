/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entidades;

/**
 *
 * @author LENOVO
 */
public class medico {
    private String nombreDoctor;
    private String especialidad;
    double sueldoMensual;
    
    public medico(String nD, String e, double sM){
        nombreDoctor = nD;
        especialidad = e;
        sueldoMensual = sM;
    }
    
    @Override
    public String toString() {
        return "- " + nombreDoctor + " - sueldo: " + sueldoMensual + " - " + especialidad;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
