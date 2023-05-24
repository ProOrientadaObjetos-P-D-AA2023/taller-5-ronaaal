/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entidades;


/**
 *
 * @author LENOVO
 */
public class entidadHospitalaria {
    private String nombreHospital;
    private ciudad ciudadHospital;
    private int numEspecialidades;
    private String direccion;
    private medico[] medicos;
    private enfermero[] enfermeros;
    
    public entidadHospitalaria(String nH, ciudad cH, int nE, String dirrr, medico[] m, enfermero[] e){
        nombreHospital = nH;
        ciudadHospital = cH;
        numEspecialidades = nE;
        direccion = dirrr;
        medicos = m;
        enfermeros = e;
    }
    
    public double calcSueldo(){
        double sueldoTotal = 0;
        for (int i = 0; i < medicos.length; i++) {
            sueldoTotal += medicos[i].sueldoMensual;
        }
        for (int i = 0; i < enfermeros.length; i++) {
            sueldoTotal += enfermeros[i].sueldoMensual;
        }
        return sueldoTotal;
    }
    
    @Override
    public String toString() {
        String result = nombreHospital + "\n";
        result += "Dirección: " + direccion + "\n";
        result += ciudadHospital.toString() + "\n";
        result += "Número de especialidades: " + numEspecialidades + "\n";
        result += "Listado de médicos" + "\n";
        for (int i = 0; i < medicos.length; i++) {
            result += medicos[i].toString() + "\n";
        }
        result += "Listado de enfermeros(as)" + "\n";
        for (int i = 0; i < enfermeros.length; i++) {
            result += enfermeros[i].toString() + "\n";
        }
        result += "Total de sueldos a pagar por mes: " + calcSueldo();
        return result;
    }
}
