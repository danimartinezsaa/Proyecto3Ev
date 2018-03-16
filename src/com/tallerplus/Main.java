package com.tallerplus;

import com.tallerplus.files.Ficheros;
import com.tallerplus.gestion.Login;
/**
 * clase principal donde comenzara la ejecucion de la aplicacion 
 * 
 */
public class Main {
    /**
     * metodo main 
     * @param args 
     */
    public static void main(String[] args) {
        // leemos todos los ficheros llamando al metodo creado para ello 
        Ficheros.leerFicheroCoches();
        Ficheros.leerFicheroCitas();
        Ficheros.leerFicheroUsuarios();
        Ficheros.leerFicheroVentas();
        
        //Lanzamos ventana Login para iniciar el programa.
        Login.lanzarVentanaLogin();
        
        
    }
}
