/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerplus.files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dani
 */
public abstract class Conexion{
    public PreparedStatement st;
    public ResultSet resultado;
    public Connection conexion;
    
/**
 * Método para conectarse a la base de datos.
 */
    public void connect(){
        try{
            conexion=DriverManager.getConnection("jdbc:sqlite:"+"src/com/tallerplus/files/base");
            if(conexion!=null){
                System.out.println("Conectado");
            }
        }catch(SQLException ex){
            System.out.println("Error de conexión a la base de datos");
        }
    }
/**
 * Método para cerrar la base de datos
 */
    public void close(){
        try{
            conexion.close();
        }catch(SQLException ex){
            System.out.println("Error al cerrar la base de datos");
        }
    }
    
    public abstract void select();
}
