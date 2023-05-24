/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_05;

import com.mycompany.entidades.ciudad;
import com.mycompany.entidades.enfermero;
import com.mycompany.entidades.entidadHospitalaria;
import com.mycompany.entidades.medico;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del hospital: ");
        String nombreHospital = scanner.nextLine();
        System.out.print("Dirección del hospital: ");
        String direccionHospital = scanner.nextLine();

        System.out.print("Nombre de la ciudad: ");
        String nombreCiudad = scanner.nextLine();
        System.out.print("Provincia de la ciudad: ");
        String provinciaCiudad = scanner.nextLine();
        ciudad c1 = new ciudad(nombreCiudad, provinciaCiudad);

        System.out.print("Número de especialidades: ");
        int numEspecialidades = scanner.nextInt();

        
        medico[] m1 = new medico[numEspecialidades];
        scanner.nextLine(); 
        for (int i = 0; i < numEspecialidades; i++) {
            System.out.println("Médico " + (i + 1));
            System.out.print("Nombre del médico: ");
            String nombreMedico = scanner.nextLine();
            System.out.print("Especialidad del médico: ");
            String especialidadMedico = scanner.nextLine();
            System.out.print("Sueldo mensual del médico: ");
            double sueldoMedico = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer del scanner
            m1[i] = new medico(nombreMedico, especialidadMedico, sueldoMedico);
        }

        System.out.print("Número de enfermeros(as): ");
        int numEnfermeros = scanner.nextInt();
        enfermero[] e1 = new enfermero[numEnfermeros];
        scanner.nextLine(); // Limpiar el buffer del scanner
        for (int i = 0; i < numEnfermeros; i++) {
            System.out.println("Enfermero(a) " + (i + 1));
            System.out.print("Nombre del enfermero(a): ");
            String nombreEnfermero = scanner.nextLine();
            System.out.print("Tipo del enfermero(a) (nombramiento/contrato): ");
            String tipoEnfermero = scanner.nextLine();
        
            System.out.print("Sueldo mensual del enfermero(a): ");
            double sueldoEnfermero = scanner.nextDouble();
            scanner.nextLine(); 
            e1[i] = new enfermero(nombreEnfermero, tipoEnfermero, sueldoEnfermero);
        }

        entidadHospitalaria eH1 = new entidadHospitalaria(nombreHospital, c1, numEspecialidades, direccionHospital, m1, e1);

        System.out.println(eH1.toString());
    }
    
}
