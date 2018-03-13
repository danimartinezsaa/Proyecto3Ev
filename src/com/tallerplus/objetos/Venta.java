/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerplus.objetos;

/**
 *
 * @author dani_
 */
public class Venta {
    private String modelo,motor,cilindrada,caballos;
    Float precio;

    public Venta(String modelo, Float precio, String motor, String cilindrada, String caballos) {
        this.modelo = modelo;
        this.precio = precio;
        this.motor = motor;
        this.cilindrada = cilindrada;
        this.caballos = caballos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCaballos() {
        return caballos;
    }

    public void setCaballos(String caballos) {
        this.caballos = caballos;
    }

    @Override
    public String toString() {
        return "modelo=" + modelo + ", precio=" + precio + ", motor=" + motor + ", cilindrada=" + cilindrada + ", caballos=" + caballos;
    }
    
    
}
