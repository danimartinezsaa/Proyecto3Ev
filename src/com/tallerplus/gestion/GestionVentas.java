/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerplus.gestion;

import VentanasEmergentes.Mensajes;
import com.tallerplus.files.Conexion;
import com.tallerplus.objetos.Venta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;



/**
 *
 * clase para la gestion de ventas de vehiculos 
 */
public class GestionVentas extends Conexion{

    public static ArrayList <Venta> ventas=new ArrayList();

    public GestionVentas(){
    }
    
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
        Mensajes.ventanaInfo("Coche añadido con éxito.","Ventas"); // al añadir un coche mostramos un mensaje
        Ficheros.escribirFicheroVentas(); // sobreescribimos el fichero con la informacion concreta 
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

        if (vendido == false) { // si el coche se borra por ser una borrado y no una venta , se manda el mensaje oportuno y si el cliente confirma la operacion se elimina de la lista 
            int confirmado = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas borrar este coche de Ventas?");
            if (confirmado == YES_OPTION) {
                borrado = true;
            }
        } else {
            int confirmado = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas vender este coche de Ventas?"); // si se elimina tras una venta, se envia el mensaje oportuno y si se confirma la operacion se borra
            if (confirmado == YES_OPTION) {
                borrado = true;
            }
          
        }
        if (borrado == true) { // si el usuario confirmo la operacion se borra 
            Ficheros.ventas.remove(posicion);
            Ficheros.escribirFicheroVentas();
        }
        return borrado;
    }

    @Override
    public void select(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
