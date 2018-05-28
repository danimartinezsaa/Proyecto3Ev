package com.tallerplus;

import com.tallerplus.gestion.GestionCitas;
import com.tallerplus.gestion.GestionClientes;
import com.tallerplus.gestion.GestionUsuarios;
import com.tallerplus.gestion.GestionVentas;
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
        GestionCitas citas=new GestionCitas();
        GestionClientes clientes=new GestionClientes();
        GestionUsuarios usuarios=new GestionUsuarios();
        GestionVentas ventas=new GestionVentas();
        
        citas.select();
        clientes.select();
        usuarios.select();
        ventas.select();
        
        //Lanzamos ventana Login para iniciar el programa.
        Login.lanzarVentanaLogin();
        
        
    }
}
