/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerplus.gestion;

import VentanasEmergentes.Mensajes;
import com.tallerplus.files.Ficheros;
import com.tallerplus.objetos.Venta;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;

/**
 *
 * @author dani_
 */
public class GestionVentas {

    /**
     * Añade coche al ArrayList de ventas.
     *
     * @param modelo parámetro "modelo" del coche en venta.
     * @param precio parámetro "precio" del coche en venta.
     * @param motor parámetro "tipo" del coche en venta.
     * @param cilindrada parámetro "cilindrada" del coche en venta.
     * @param caballos parámetro "caballos" del coche en venta
     */
    public static void anadirVenta(String modelo, Float precio, String motor, String cilindrada, String caballos) {
        Ficheros.ventas.add(new Venta(modelo, precio, motor, cilindrada, caballos));
        Mensajes.ventanaInfo("Coche añadido con éxito.","Ventas");
        Ficheros.escribirFicheroVentas();
    }

    /**
     * Borra un coche en venta si queremos eliminarlo o venderlo.
     *
     * @param posicion posición del ArrayList a eliminar.
     * @param vendido indica si estamos vendiendo el coche o no.
     * @return devuelve true si se ha borrado la venta o false si no lo ha
     * hecho.
     */
    public static boolean borrarVenta(int posicion, boolean vendido) {
        boolean borrado = false;

        if (vendido == false) {
            int confirmado = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas borrar este coche de Ventas?");
            if (confirmado == YES_OPTION) {
                borrado = true;
            }
        } else {
            int confirmado = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas vender este coche de Ventas?");
            if (confirmado == YES_OPTION) {
                borrado = true;
            }
            Ficheros.escribirFicheroVentas();
            
            borrado = true;
        }
        if (borrado == true) {
            Ficheros.ventas.remove(posicion);
            Ficheros.escribirFicheroVentas();
        }
        return borrado;
    }

}
