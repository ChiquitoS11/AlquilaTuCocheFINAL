/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.alquilatucochefinal;

import static com.company.alquilatucochefinal.AlquilaTuCocheFINAL.coches;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author ChiquitoS11
 */
public class LogicaAlquiler {
    
    // atributos
    String nombreCocheActual = "";
    CocheFINAL cocheActual = null;

    // constructores
    public LogicaAlquiler(String nombreCocheActual) {
        this.nombreCocheActual = nombreCocheActual;
        nombreToCocheFINAL();
    }
    
    private void nombreToCocheFINAL() {
        for (CocheFINAL c : coches){
            if (c.getModelo().equals(nombreCocheActual)) {
                this.cocheActual = c;
            }
        }
    }
    
    // metodos
    private long calcularDiasTranscurridos(String fecha1Str, String fecha2Str) throws Exception{
        LocalDate fecha1 = LocalDate.parse(fecha1Str, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate fecha2 = LocalDate.parse(fecha2Str, DateTimeFormatter.ISO_LOCAL_DATE);
 
           
        long rtn = ChronoUnit.DAYS.between(fecha1, fecha2);
        
        if (rtn < 0) {
            throw new Exception();
        }
        
        return rtn;
    }
    
    public double calcularPrecio(String fecha1Str, String fecha2Str) throws Exception {
        long dias = calcularDiasTranscurridos(fecha1Str, fecha2Str);
        
        setDisponibilidad();
        return ((double)dias) * getPrecio();
    }

    
    private void setDisponibilidad() {
        for (CocheFINAL c : coches){
            if (this.cocheActual == c) {
                c.disponibilidad = false;
            }
        }
    }
    
   private double getPrecio() {
       for (CocheFINAL c : coches){
            if (c == this.cocheActual) {
                return c.alquilerDia;
            }
        }
        return 0;
   }
}
