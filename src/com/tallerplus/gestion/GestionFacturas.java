/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerplus.gestion;

import VentanasEmergentes.Mensajes;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Clase con un método que genera una factura con los parámetros de una cita recibida
 * 
 */
public class GestionFacturas {
    /**
     * Genera un archivo de texto a modo de factura con los parámetros recibidos y la fecha en la que se genera.
     * Abre la factura en un editor de texto.
     * @param matricula matrícula del cliente
     * @param descripcion descripción de la avería
     * @param precio precio de la factura
     */
    public static void generarFactura(String matricula, String descripcion, float precio){
        Date fecha=new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String cadenaFecha = formato.format(fecha); // almacenamos la fecha de la cita en el formato que nos interesa 
        
        try {
            FileWriter escribir; // escribimos en el fichero factura la informacion necesaria 
            escribir = new FileWriter("/home/dani/NetBeansProjects/Taller-Plus/src/com/tallerplus/facturas/factura.txt");
            escribir.write(
                    "Fecha factura: "+cadenaFecha+"         "+"Matricula: "+matricula+"         \n"+
                    "         \n"+
                    "Descripcion: \n"+descripcion+"\n"+"\n         "+
                    "Total ---> "+precio+"€"
            );
            escribir.close(); // cerramos el fichero 
        } catch (IOException ex) { // si salta la excepcion informamos con un mensaje de error
            System.out.println("Error al escribir");
        }
        
        File fichero=new File("/home/dani/NetBeansProjects/Taller-Plus/src/com/tallerplus/facturas/factura.txt");
        try {
            Desktop.getDesktop().open(fichero); // abrimos automaticamente la factura generada para que pueda ser imprimida
        } catch (IOException ex) {
            Mensajes.ventanaError("Error al abrir la factura.", "Error"); // en caso de que no se pueda abrir mostramos un mensaje derror 
            JOptionPane.showMessageDialog(null,"Error al abrir la factura","Error",0);
        }
    }
}
