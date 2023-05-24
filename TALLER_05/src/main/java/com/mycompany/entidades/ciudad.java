/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entidades;

/**
 *
 * @author LENOVO
 */
public class ciudad {
    private String nombreCiudad;
    private String provinciaCiudad;
    
    public ciudad(String nC, String pC){
        nombreCiudad = nC;
        provinciaCiudad = pC;
    }
    
    @Override
    public String toString() {
        return "Ciudad: " + nombreCiudad + "\nProvincia: " + provinciaCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getProvinciaCiudad() {
        return provinciaCiudad;
    }

    public void setProvinciaCiudad(String provinciaCiudad) {
        this.provinciaCiudad = provinciaCiudad;
    }
}
