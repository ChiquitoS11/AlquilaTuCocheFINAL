/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.alquilatucochefinal;

import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author ChiquitoS11
 */
public class AlquilaTuCocheFINAL {
    
    static ArrayList<CocheFINAL> coches = new ArrayList<>();
    

    /**
     * Encargado de crear objetos de la clase CocheFINAL<P>
     * e inicializar la interfaz grafica con pequenios ajustes
     * @param args 
     */
    public static void main(String[] args) {
        
        
        
        ArrayList<URL> img1 = new ArrayList<>(); 
        rellenarArrayImagenes(img1, "/resources/gengar1.jpg");
        rellenarArrayImagenes(img1, "/resources/gengar2.png");
        coches.add(new CocheFINAL("Pokemon", "Gengar", 4, CocheFINAL.Tipo.Gasoil, 500.0, img1));
        
        ArrayList<URL> img2 = new ArrayList<>();
        rellenarArrayImagenes(img2, "/resources/kirby1.jpg");
        rellenarArrayImagenes(img2, "/resources/kirby2.jpg");
        coches.add(new CocheFINAL("VideoJuegos", "Kirby", 2, CocheFINAL.Tipo.Gasolina,250.0, img2));
        
        ArrayList<URL> img3 = new ArrayList<>();
        rellenarArrayImagenes(img3, "/resources/traumas1.gif");
        coches.add(new CocheFINAL("Anime", "CyberPunk EdgeRunners", 4, CocheFINAL.Tipo.Electrico, 420.0, img3));
        
        ArrayList<URL> img4 = new ArrayList<>();
        rellenarArrayImagenes(img4, "/resources/shimakaze1.jpg");
        rellenarArrayImagenes(img4, "/resources/shimakaze2.jpg");
        rellenarArrayImagenes(img4, "/resources/shimakaze3.jpg");
        rellenarArrayImagenes(img4, "/resources/shimakaze4.jpg");
        coches.add(new CocheFINAL("VideoJuegos", "Shimakaze", 2, CocheFINAL.Tipo.Gasolina, 150.0, img4));
        
        ArrayList<URL> img5 = new ArrayList<>();
        rellenarArrayImagenes(img5, "/resources/noPonerlaV1.jpg");
        coches.add(new CocheFINAL("Anime", "No la he puesto en anios V1", 6, CocheFINAL.Tipo.Electrico, 300.0, img5));
        
        ArrayList<URL> img6 = new ArrayList<>();
        rellenarArrayImagenes(img6, "/resources/noPonerlaV2.jpg");
        coches.add(new CocheFINAL("Anime", "No la he puesto en anios V2", 2, CocheFINAL.Tipo.Electrico, 200.0, img6));
        
        ArrayList<URL> img7 = new ArrayList<>();
        rellenarArrayImagenes(img7, "/resources/shuna1.jpg");
        coches.add(new CocheFINAL("Anime", "Shuna", 2, CocheFINAL.Tipo.Electrico, 150.0, img7));
        
        ArrayList<URL> img8 = new ArrayList<>();
        rellenarArrayImagenes(img8, "/resources/lamboShiny1.gif");
        rellenarArrayImagenes(img8, "/resources/lamboShiny2.jpg");
        coches.add(new CocheFINAL("Lamborghini", "Shiny", 6, CocheFINAL.Tipo.Electrico, 1000.0, img8));
        
        ArrayList<URL> img9 = new ArrayList<>();
        rellenarArrayImagenes(img9, "/resources/hatsuneMiku1.jpg");
        rellenarArrayImagenes(img9, "/resources/hatsuneMiku2.jpg");
        rellenarArrayImagenes(img9, "/resources/hatsuneMiku3.jpg");
        rellenarArrayImagenes(img9, "/resources/hatsuneMiku4.jpg");
        coches.add(new CocheFINAL("Anime", "Hatsune Miku", 6, CocheFINAL.Tipo.Electrico, 200.0, img9));
        
        ArrayList<URL> img10 = new ArrayList<>();
        rellenarArrayImagenes(img10, "/resources/golf1.gif");
        rellenarArrayImagenes(img10, "/resources/golf2.gif");
        rellenarArrayImagenes(img10, "/resources/golf3.gif");
        coches.add(new CocheFINAL("Carrito de Golf", "Fortnite", 4, CocheFINAL.Tipo.Gasolina, 50.0, img10));
        
        GUIFINAL gui = new GUIFINAL();
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
        gui.setResizable(false);
        
//        for (CocheFINAL c : coches) {
//           
//            System.out.println(c.getTipo().toString());
//            if (c.getTipo().toString().equalsIgnoreCase("Electrico")) {
//                System.out.println("este coche es electrico");
//            }
//        }
    }
    
    public static void rellenarArrayImagenes(ArrayList<URL> array, String ruta){
        array.add(AlquilaTuCocheFINAL.class.getResource(ruta));
    }
}
