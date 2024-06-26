/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.company.alquilatucochefinal;

import static com.company.alquilatucochefinal.AlquilaTuCocheFINAL.coches;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ChiquitoS11
 */
public class Alquilar extends javax.swing.JFrame {

    GUIFINAL gf = new GUIFINAL();
    
    /**
     * Creates new form Alquilar
     * @param gf
     */
    public Alquilar(GUIFINAL gf) {
        initComponents();
        
        this.gf = gf;
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreTF = new javax.swing.JTextField();
        apellidoTF = new javax.swing.JTextField();
        DNITF = new javax.swing.JTextField();
        ingresarBTN = new javax.swing.JButton();
        salirBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(31, 36, 70, 16);

        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(31, 76, 80, 16);

        jLabel3.setText("DNI:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(31, 116, 80, 16);

        nombreTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTFActionPerformed(evt);
            }
        });
        getContentPane().add(nombreTF);
        nombreTF.setBounds(120, 30, 174, 22);

        apellidoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTFActionPerformed(evt);
            }
        });
        getContentPane().add(apellidoTF);
        apellidoTF.setBounds(120, 70, 174, 22);

        DNITF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNITFActionPerformed(evt);
            }
        });
        getContentPane().add(DNITF);
        DNITF.setBounds(120, 110, 170, 22);

        ingresarBTN.setText("INGRESAR");
        ingresarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarBTN);
        ingresarBTN.setBounds(30, 160, 102, 23);

        salirBTN.setText("SALIR");
        salirBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBTNActionPerformed(evt);
            }
        });
        getContentPane().add(salirBTN);
        salirBTN.setBounds(192, 160, 72, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String nombreUSER = "";
    String apellidoUSER = "";
    String fecha1Str = "";
    String fecha2Str = "";

    private void ingresarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBTNActionPerformed
        nombreUSER = nombreTF.getText();
        apellidoUSER = apellidoTF.getText();
        JOptionPane.showMessageDialog(null, "Hola " + nombreUSER + " "+ apellidoUSER + ", gracias por acceder al programa ALQUILA TU COCHE.");
        JOptionPane.showMessageDialog(null, "A continuación por favor seleccione las fechas de alquiler: (YYYY-MM-DD)");
        fecha1Str = JOptionPane.showInputDialog(null, "FECHA DE INICIO: (YYYY-MM-DD)");
        
        fecha2Str = JOptionPane.showInputDialog(null, "FECHA FINAL: (YYYY-MM-DD)");
        
        String nombreCocheActual = (String) gf.resultadosCB.getSelectedItem();
        LogicaAlquiler la = new LogicaAlquiler(nombreCocheActual);
        
        double precio = 0;
        boolean bucle = true;
        do {
            try {
            precio = la.calcularPrecio(fecha1Str, fecha2Str);    
            bucle = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "PORFAVOR INSERTE LA FECHA EN EL FORMATO VALIDO.");
                fecha1Str = JOptionPane.showInputDialog(null, "FECHA DE INICIO: (YYYY-MM-DD)");
                fecha2Str = JOptionPane.showInputDialog(null, "FECHA FINAL: (YYYY-MM-DD)");
            }
        } while (bucle);
        
        
        JOptionPane.showMessageDialog(null, "Usted ha alquilado el coche: \n'" + nombreCocheActual + "' por: €" + precio);
    }//GEN-LAST:event_ingresarBTNActionPerformed

    private void salirBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBTNActionPerformed
        dispose();
    }//GEN-LAST:event_salirBTNActionPerformed

    private void DNITFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNITFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DNITFActionPerformed

    private void nombreTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTFActionPerformed

    private void apellidoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DNITF;
    private javax.swing.JTextField apellidoTF;
    private javax.swing.JButton ingresarBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JButton salirBTN;
    // End of variables declaration//GEN-END:variables
}
