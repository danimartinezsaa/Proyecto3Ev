/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerplus.files;

import com.tallerplus.objetos.Cita;
import com.tallerplus.objetos.Coche;
import com.tallerplus.objetos.Usuario;
import com.tallerplus.objetos.Venta;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * clase para realizar la gestion de ficheros 
 */
public class Ficheros {
    
    //Listas para almacenar la informacion de los ficheros 
    public static ArrayList<Usuario> usuarios=new ArrayList();
    public static ArrayList<Coche> coches=new ArrayList();
    public static ArrayList <Cita> citas=new ArrayList();
    public static ArrayList <Venta> ventas=new ArrayList();
    //Array para almacenar cada uno de los atributos de cada linea del fichero 
    static String[] atributoscoche = new String[7];
    static String[] atributosusuario = new String[3];
    static String[] atributoscita = new String[5];
    static String[] atributosventas=new String[5];

    //Ficheros
    static File ficherocoches = new File("src/com/tallerplus/files/coche.txt");
    static File ficherousuarios = new File("src/com/tallerplus/files/usuario.txt");
    static File ficherocitas = new File("src/com/tallerplus/files/cita.txt");
    static File ficheroventas = new File("src/com/tallerplus/files/ventas.txt");
    
    // variable para almacenar una linea del fichero concreta 
    static String linea;
/**
 * metodo para leer la informacion del fichero coches  
 */
    public static void leerFicheroCoches() {

        try {
            Scanner sc; // creamos un objeto de tipo scanner para poder leer los ficheros 
            sc = new Scanner(ficherocoches);
            while (sc.hasNextLine()) { // con el bucle recorremos cada una de las lineas del fichero, que almacenamos en la variable linea 
                linea = sc.nextLine(); 
                atributoscoche = linea.split(","); // una vez tenemos la linea metemos los atributos en el array correspondiente y creamos el objeto coche para añadirlo a la lista de coches 
                Coche c = new Coche(atributoscoche[0], atributoscoche[1], atributoscoche[2], atributoscoche[3], atributoscoche[4], atributoscoche[5], atributoscoche[6]);
                coches.add(c);
            }
            sc.close(); // cerramos el fichero 
        } catch (FileNotFoundException ex) { // recopgemos las excepciones que salen 
            System.out.println("Error al leer coches");
        } catch (ArrayIndexOutOfBoundsException ex1){
            System.out.println("No hay coches en el fichero");
        }

    }
/**
 * metodo para leer el fichero usuarios
 * recorremos el fichero y almacenamos la informacion en su array correspondiente 
 */
    public static void leerFicheroUsuarios() {

        try {
            Scanner sc;
            sc = new Scanner(ficherousuarios);
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                atributosusuario = linea.split(",");
                Usuario c = new Usuario(atributosusuario[0], atributosusuario[1], atributosusuario[2]);
                usuarios.add(c);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error al leer usuarios");
        }
    }
/**
 * metodo para leer el fichero citas 
 */
    public static void leerFicheroCitas() {

        try {
            Scanner sc;
            sc = new Scanner(ficherocitas);
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                atributoscita = linea.split(",");
                Cita c = new Cita(atributoscita[0], atributoscita[1], atributoscita[2], Float.parseFloat(atributoscita[3]), atributoscita[4]);
                citas.add(c);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error al leer citas");
        }
    }
/**
 * metodo para leer el fichero ventas 
 */
    public static void leerFicheroVentas(){
        try {
            Scanner sc;
            sc = new Scanner(ficheroventas);
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                atributosventas = linea.split(",");
                Venta c = new Venta(atributosventas[0], Float.parseFloat(atributosventas[1]), atributosventas[2], atributosventas[3],atributosventas[4]);
                ventas.add(c);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error al leer ventas");
        }        
    }
    /**
     * metodo para escribir el fichero coches 
     */
    public static void escribirFicheroCoches() {

        try {
            FileWriter escribir;
            escribir = new FileWriter(ficherocoches); // abrimos un filewriter que nos permite escribir en el fichero y le enviamos la informacion que nos interesa
            for (Coche elemento : coches) {
                escribir.write(elemento.getMatricula()
                        + "," + elemento.getMotor()
                        + "," + elemento.getCilindrada()
                        + "," + elemento.getCaballos()
                        + "," + elemento.getNombreDueño()
                        + "," + elemento.getDni()
                        + "," + elemento.getTelefono()+"\n");
            }
            escribir.close(); // cerramos el fichero 
        } catch (IOException ex) { // capturamos el error 
            System.out.println("Error al escribir");
        }   
    }
/**
 * metodo para escribir el fichero ventas 
 * 
 */
    public static void escribirFicheroVentas() {

        try {
            FileWriter escribir;
            escribir = new FileWriter(ficheroventas);
            for (Venta elemento : ventas) {
                escribir.write(elemento.getModelo()
                        + "," + elemento.getPrecio()
                        + "," + elemento.getMotor()
                        + "," + elemento.getCilindrada()
                        + "," + elemento.getCaballos()+"\n");
            }
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Error al escribir");
        }   
    }
    /**
     * metodo para escribir en el fichero usuarios 
     */
    public static void escribirFicheroUsuarios() {

        try {
            FileWriter escribir;
            escribir = new FileWriter(ficherousuarios);
            for (Usuario elemento : usuarios) {
                escribir.write(elemento.getUsuario()
                        + "," + elemento.getContrasena()
                        + "," + elemento.getTipo()+"\n");
            }
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Error al escribir");
        }   
    }
    /**
     * metodo para escribir en el fichero citas 
     */
    
    public static void escribirFicheroCitas() {

        try {
            FileWriter escribir;
            escribir = new FileWriter(ficherocitas);
            for (Cita elemento : citas) {
                escribir.write(elemento.getMatricula()
                        + "," + elemento.getFechaHora()
                        + "," + elemento.getDescripcion()
                        + "," + elemento.getPrecio()
                        + "," + elemento.getEstado()+"\n");
            }
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Error al escribir");
        }   
    }   
}
