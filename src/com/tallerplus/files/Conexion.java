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
    private PreparedStatement st;
    private ResultSet resultado;
    private Connection conexion;
    
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
/**
 * Método para realizar una inserción en la base de datos de un nuevo elemento.
 */
    public abstract void insert();
/**
 * Método para realizar una consulta de todos los elementos de la tabla Coches
 */
    public abstract void select();
/**
 * Método para borrar un elemento concreto de la tabla coches.
 */
    public abstract void delete();
/**
 * Método para actualizar un elemento de la tabla coches
 */
    public abstract void update();
/**
 * Método para realizar una consulta condicionada por una búsqueda, si algún campo del Objeto coincide con el String que recibe.
 */
    public abstract void selectWhere();
}
