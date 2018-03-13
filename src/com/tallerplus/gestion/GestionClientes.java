package com.tallerplus.gestion;

import com.tallerplus.files.Ficheros;
import com.tallerplus.objetos.Coche;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GestionClientes {

    /**
     * Añade un cliente al ArrayList de clientes que recibe y lo devuelve
     *
     * @param matricula matricula del vehiculo a reparar
     * @param motor tipo de combustible, diesel o gasolina
     * @param cilindrada cilindrada del vehiculo en cuestion
     * @param caballos potencia del vehiculo expresada en caballos de vapor
     * @param nombreDueño nombre del propietario del vehiculo
     * @param dni numero de identificacion personal del dueño del vehiculo
     * @param telefono telefono de contacto del dueño del vehiculo
     */
    public static boolean anadirCliente(String matricula, String motor, String cilindrada, String caballos, String nombreDueño, String dni, String telefono) {
        boolean encontrado = false;
        for (int i = 0; i < Ficheros.coches.size(); i++) {
            if (Ficheros.coches.get(i).getMatricula().equals(matricula)) {
                JOptionPane.showMessageDialog(null, "El cliente introducido ya existe", "Gestión de clientes", 0);
                encontrado = true;
                break;
            }
        }

        if (encontrado == false) {
            Ficheros.coches.add(new Coche(matricula, motor, cilindrada, caballos, nombreDueño, dni, telefono));
            JOptionPane.showMessageDialog(null, "cliente introducido con exito", "Gestión de clientes", 1);
            Ficheros.escribirFicheroCoches();
        }
        
        return encontrado;
    }

    /**
     * Elimina un vehiculo de la lista de vehiculos que tenemos en el taller
     *
     * @param matricula matricula del vehiculo a eliminar
     * @param eb le indica si estamos modificando o borrando al cliente
     */
    public static void borrarCliente(String matricula,String eb) {
        boolean borrado = false; // indicador de borrado que solo salta a true en caso de que se encuentre el coche, posteriormente trataremos que no se encuentre con el 
        for (int i = 0; i < Ficheros.coches.size(); i++) {
            if (Ficheros.coches.get(i).getMatricula().equals(matricula)) {
                Ficheros.coches.remove(i);
                borrado = true;
                break;
            }

        }
        if (borrado == true) {
            Ficheros.escribirFicheroCoches();
            if(eb.equals("borrar"))
                JOptionPane.showMessageDialog(null, "cliente borrado", "gestión de clientes", 1);
        } else {
            JOptionPane.showMessageDialog(null, "no se ha encontrado el cliente a eliminar", "Gestión de clientes", 0);
        }
    }

}
