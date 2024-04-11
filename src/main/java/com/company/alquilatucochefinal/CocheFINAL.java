package com.company.alquilatucochefinal;

import com.company.alquilatucochefinal.dependency.Imagen;
import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author ChiquitoS11
 */
public class CocheFINAL {
    
    // Atributos
    boolean disponibilidad; 
            String marca;
            String modelo;
            int numeroPlazas;
            double alquilerDia;
            
            Tipo tipo; 
            public enum Tipo {Electrico,Gasoil,Gasolina}

    private ArrayList<URL> rutaFotoURL;
            ArrayList<Icon> fotoICON;
            
    // mi propia dependencia para el ajuste automatico dentro de un JPanel
    private Imagen fotoIMAGEN;
    private ArrayList<Imagen> fotoIMAGEN_ARRAY;
    
    // Constructor
    public CocheFINAL(String marca, String modelo, int numeroPlazas, Tipo tipo, double alquilerDia, ArrayList<URL> rutaFotoURL, boolean disponibilidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPlazas = numeroPlazas;
        this.tipo = tipo;
        this.alquilerDia = alquilerDia;
        this.rutaFotoURL = rutaFotoURL;
        
        this.fotoICON = new ArrayList<>();
        this.fotoIMAGEN_ARRAY = new ArrayList<>(); 
        
        for (URL url : rutaFotoURL) {
            Icon efim1 = new ImageIcon(url);
            Imagen efim2 = new Imagen(url);
            fotoICON.add(efim1);
            fotoIMAGEN_ARRAY.add(efim2);
        }
        
        this.disponibilidad = disponibilidad;
    }
    
    public CocheFINAL(String marca, String modelo, int numeroPlazas, Tipo tipo, double alquilerDia, Imagen fotoIMAGEN) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPlazas = numeroPlazas;
        this.tipo = tipo;
        this.alquilerDia = alquilerDia;
        this.fotoIMAGEN = fotoIMAGEN;
        
        this.fotoICON = new ArrayList<>();
        this.fotoIMAGEN_ARRAY = new ArrayList<>();
        
        for (URL url : rutaFotoURL) {
            Icon efim1 = new ImageIcon(url);
            Imagen efim2 = new Imagen(url);
            fotoICON.add(efim1);
            fotoIMAGEN_ARRAY.add(efim2);
        }
    }

    // Métodos

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public double getAlquilerDia() {
        return alquilerDia;
    }

    public void setAlquilerDia(double alquilerDia) {
        this.alquilerDia = alquilerDia;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public ArrayList<URL> getRutaFoto() {
        return rutaFotoURL;
    }

    public void setRutaFoto(ArrayList<URL> rutaFoto) {
        this.rutaFotoURL = rutaFoto;
    }

    public ArrayList<Icon> getFoto() {
        return fotoICON;
    }

    public void setFoto(ArrayList<Icon> foto) {
        this.fotoICON = foto;
    }

    public Imagen getFotoIMAGEN() {
        return fotoIMAGEN;
    }

    public ArrayList<Imagen> getFotoIMAGEN_ARRAY() {
        return fotoIMAGEN_ARRAY;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
    
    
    @Override
    public String toString(){
        String fullText = "<html>"
                        + "Marca: "+ marca +"<br>"
                        + "Modelo: "+ modelo +"<br>"
                        + "Numero de Plazas: "+ numeroPlazas +"<br>"
                        + "Tipo: "+ tipo.toString() +"<br>"
                        + "Precio de alquiler Diario: €"+ alquilerDia +"<br>"
                        + "<br>";
        
        return fullText;
    }
}

