/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerplus.objetos;


public class Venta {
    // atributos de las ventas 
    private int id;
    private String modelo,motor,cilindrada,caballos;
    Float precio;
/**
 * constructor por parematros 
 * @param modelo
 * @param precio
 * @param motor
 * @param cilindrada
 * @param caballos 
 */
    public Venta(String modelo, Float precio, String motor, String cilindrada, String caballos) {

        this.modelo = modelo;
        this.precio = precio;
        this.motor = motor;
        this.cilindrada = cilindrada;
        this.caballos = caballos;
    }
     public Venta(int id,String modelo, Float precio, String motor, String cilindrada, String caballos) {
        this.id=id;
        this.modelo = modelo;
        this.precio = precio;
        this.motor = motor;
        this.cilindrada = cilindrada;
        this.caballos = caballos;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
     
    
/**
 * metodo para optener el modelo del coche en venta 
 * @return modelo
 */
    public String getModelo() {
        return modelo;
    }
/**
 * metodo para modificar el modelo del coche en venta 
 * @param modelo 
 */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
/**
 * metodo para devolver el precio del coche en venta 
 * @return precio
 */
    public Float getPrecio() {
        return precio;
    }
/**
 * metodo para cambiar el precio del coche en venta 
 * @param precio 
 */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }
/**
 * metodo para obtener el tipo de motor que tiene el coche en venta 
 * @return motor tipo de motor
 */
    public String getMotor() {
        return motor;
    }
/**
 * metodo para modificar el tipo de motor que tiene el coche en venta 
 * @param motor 
 */
    public void setMotor(String motor) {
        this.motor = motor;
    }
/**
 * metodo para obtener la cilindrada del coche en venta 
 * @return cilindrada
 */
    public String getCilindrada() {
        return cilindrada;
    }
/**
 * metodo para cambiar la cilindrada de los coches en venta 
 * @param cilindrada 
 */
    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
/**
 * metodo para obtener el caballaje de los coches en venta 
 * @return caballos
 */
    public String getCaballos() {
        return caballos;
    }
/**
 * metodo para modificar el caballaje de los coches en venta
 * @param caballos 
 */
    public void setCaballos(String caballos) {
        this.caballos = caballos;
    }
/**
 * devuelve descripcion del coche en venta 
 * @return toString
 */
    @Override
    public String toString() {
        return "modelo=" + modelo + ", precio=" + precio + ", motor=" + motor + ", cilindrada=" + cilindrada + ", caballos=" + caballos;
    }
    
    
}
