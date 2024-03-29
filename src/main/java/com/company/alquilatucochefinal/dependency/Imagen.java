package com.company.alquilatucochefinal.dependency;

import java.awt.AlphaComposite;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Imagen extends JPanel {

    // atributos
    private URL rutaImagen;
    private Image imagenIMAGE;
    private ImageIcon imagenImageIcon;
    
    private Image imageIMAGElabel;
    private ImageIcon imagenImageIconlabel;

    private ImageIcon imagenFlippeada;
    
    // constructor

    public Imagen(URL rutaImagen) {

        this.rutaImagen = rutaImagen;
        
        this.imagenImageIcon = new ImageIcon(rutaImagen);
        
        try {
            // Carga la imagen utilizando File
            this.imagenIMAGE = new ImageIcon(rutaImagen).getImage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 

    // metodos

    /*
    *Con el Override sobreescribe el paintComponent con ayuda del 'this.setContentPane(img)'
    *en el JFrame
    **/
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja la imagen
        g.drawImage(imagenIMAGE, 0, 0, getWidth(), getHeight(), this);
    }
    
    public Icon imgToCOMPONENT(Component jLabel) {
        Icon icon = new ImageIcon(imagenImageIcon.getImage().getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_DEFAULT));
        return icon;
    }
    
    public Icon ajustarIMGtoJLABELInvert(Component imagen, boolean horizontal){
        int width = imagenIMAGE.getWidth(null);
        int height = imagenIMAGE.getHeight(null);
        BufferedImage imgFlipped = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = imgFlipped.createGraphics();
        if (horizontal) {
            g.drawImage(imagenIMAGE, width, 0, -width, height, null);
        } else {
            g.drawImage(imagenIMAGE, 0, 0, width, height, null);
        }
        g.dispose();
        this.imagenFlippeada = new ImageIcon(imgFlipped);
        
        Icon icon = new ImageIcon(imagenFlippeada.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
        
        this.repaint();
        
        return icon;
    }
    
    public Icon cambiarOpacidad(float opacidad, Component actual) {

        Image fckthis = null; // Variable para almacenar la imagen
        
        if (actual instanceof AbstractButton) {
            Icon uno = ((AbstractButton) actual).getIcon();
            if (uno instanceof ImageIcon) {
                fckthis = ((ImageIcon) uno).getImage();
            }
        } else if (actual instanceof JLabel) {
            Icon dos = ((JLabel) actual).getIcon();
            if (dos instanceof ImageIcon) {
                fckthis = ((ImageIcon) dos).getImage();
            }
        } else if (actual instanceof JMenuItem) {
            Icon tres = ((JMenuItem) actual).getIcon();
            if (tres instanceof ImageIcon) {
                fckthis = ((ImageIcon) tres).getImage();
            }
        }
        
        int ancho = fckthis.getWidth(null);
        int alto = fckthis.getHeight(null);
        BufferedImage imagenBuffer = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = (Graphics2D) imagenBuffer.getGraphics();
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacidad));
        g2d.drawImage(fckthis, 0, 0, null);
        g2d.dispose();
         
        Icon nuevaImg = new ImageIcon(imagenBuffer);
        return nuevaImg;
    }

}