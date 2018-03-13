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
 * @author dani_
 */
public class Ficheros {
    
    //Listas
    public static ArrayList<Usuario> usuarios=new ArrayList();
    public static ArrayList<Coche> coches=new ArrayList();
    public static ArrayList <Cita> citas=new ArrayList();
    public static ArrayList <Venta> ventas=new ArrayList();
    //Array Atributos
    static String[] atributoscoche = new String[7];
    static String[] atributosusuario = new String[3];
    static String[] atributoscita = new String[5];
    static String[] atributosventas=new String[5];

    //Ficheros
    static File ficherocoches = new File("src\\com\\tallerplus\\files\\coche.txt");
    static File ficherousuarios = new File("src\\com\\tallerplus\\files\\usuario.txt");
    static File ficherocitas = new File("src\\com\\tallerplus\\files\\cita.txt");
    static File ficheroventas = new File("src\\com\\tallerplus\\files\\ventas.txt");

    static String linea;

    public static void leerFicheroCoches() {

        try {
            Scanner sc;
            sc = new Scanner(ficherocoches);
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                atributoscoche = linea.split(",");
                Coche c = new Coche(atributoscoche[0], atributoscoche[1], atributoscoche[2], atributoscoche[3], atributoscoche[4], atributoscoche[5], atributoscoche[6]);
                coches.add(c);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error al leer coches");
        } catch (ArrayIndexOutOfBoundsException ex1){
            System.out.println("No hay coches en el fichero");
        }

    }

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
    
    public static void escribirFicheroCoches() {

        try {
            FileWriter escribir;
            escribir = new FileWriter(ficherocoches);
            for (Coche elemento : coches) {
                escribir.write(elemento.getMatricula()
                        + "," + elemento.getMotor()
                        + "," + elemento.getCilindrada()
                        + "," + elemento.getCaballos()
                        + "," + elemento.getNombreDueño()
                        + "," + elemento.getDni()
                        + "," + elemento.getTelefono()+"\n");
            }
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Error al escribir");
        }   
    }

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
