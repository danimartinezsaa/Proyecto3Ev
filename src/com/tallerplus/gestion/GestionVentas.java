/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerplus.gestion;

import VentanasEmergentes.Mensajes;
import com.tallerplus.files.Conexion;
import com.tallerplus.objetos.Venta;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;

/**
 *
 * clase para la gestion de ventas de vehiculos
 */
public class GestionVentas extends Conexion {

    public static ArrayList<Venta> ventas = new ArrayList();

    public GestionVentas() {
    }

    /**
     * Añade venta a la tabla de ventas en la base de datos
     *
     * @param modelo parámetro "modelo" del coche en venta.
     * @param precio parámetro "precio" del coche en venta.
     * @param motor parámetro "tipo" del coche en venta.
     * @param cilindrada parámetro "cilindrada" del coche en venta.
     * @param caballos parámetro "caballos" del coche en venta
     */
    public void anadirVenta(String modelo, Float precio, String motor, String cilindrada, String caballos) {
        connect();
        try {
            st = conexion.prepareStatement("insert into venta values('" + modelo + "'"
                    + "," + "'" + precio + "'"
                    + "," + "'" + motor + "'"
                    + "," + "'" + cilindrada + "'"
                    + "," + "'" + caballos + "'" + ");");

            st.execute();
            select();
            Mensajes.ventanaInfo("venta introducida con éxito", "Gestión de ventas.");
        } catch (SQLException ex) {
            Mensajes.ventanaError("Error al insertar en la base de datos.", "Error.");
        }
        close();
}

/**
 * Borra un coche en venta si queremos eliminarlo o venderlo.
 *
 * 
 * @param vendido indica si estamos vendiendo el coche o no.
 * @return devuelve true si se ha borrado la venta o false si no lo ha hecho.
 */
public  boolean borrarVenta(boolean vendido, int id) {
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
          connect();
            try {
                st = conexion.prepareStatement("delte from venta where id='" + id + "'");
                st.executeUpdate();
                select();
            } catch (SQLException ex) {
                Mensajes.ventanaError("No se ha encontrado la venta  a eliminar.", "Gestión de ventas.");
            }
            close();
        }
        return borrado;
    }

    @Override
        public void select() {
         connect();

        try {
            st = conexion.prepareStatement("select * from venta");
            resultado = st.executeQuery();
            ventas.clear();
            while (resultado.next()) {
                ventas.add(new Venta(resultado.getInt("id"), resultado.getString("modelo"), resultado.getFloat("precio"), resultado.getString("motor"), resultado.getString("cilindrada"), resultado.getString("caballos")));
            }
        } catch (SQLException ex) {
            Mensajes.ventanaError("Error al ejecutar la consulta.", "Error.");
        }catch(NullPointerException error){
            System.out.println("No existen datos en la tabla ventas");
            
        }
        close();
    }

}
