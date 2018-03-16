package com.tallerplus.objetos;
// un coche sera cada uno de los objetos tratados en el taller, reparado, con datos de su dueño para poder localizarlo

public class Coche {

    // un coche tendra datos sobre el motor, matricula, y datos identificativos de su dueño
    private String matricula, motor, cilindrada, caballos, nombreDueño, dni, telefono;
/**
 * constructor con parametros 
 * @param matricula
 * @param motor
 * @param cilindrada
 * @param caballos
 * @param nombreDueño
 * @param dni
 * @param telefono 
 */
    public Coche(String matricula, String motor, String cilindrada, String caballos, String nombreDueño, String dni, String telefono) {
        this.matricula = matricula;
        this.motor = motor;
        this.cilindrada = cilindrada;
        this.caballos = caballos;
        this.nombreDueño = nombreDueño;
        this.dni = dni;
        this.telefono = telefono;
    }
/**
 * metodo get para devolver la matricula del coche
 * @return matricula
 */
    public String getMatricula() {
        return matricula;
    }
/**
 * metodo set para modificar el valor de la matricula
 * @param matricula 
 */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
/**
 * metodo get para obtener el tipo del motor del coche
 * @return motor
 */
    public String getMotor() {
        return motor;
    }
/**
 * metodo set para modificar el tipo de motor del coche 
 * @param motor 
 */
    public void setMotor(String motor) {
        this.motor = motor;
    }
/**
 * metodo get para obtener la cilindrada del coche 
 * @return cilindrada
 */
    public String getCilindrada() {
        return cilindrada;
    }
/**
 * metodo set para modificar el valor de la cilindrada del coche 
 * @param cilindrada 
 */
    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
/**
 * metodo get para obtener el numero de caballos del coche 
 * @return caballos
 */
    public String getCaballos() {
        return caballos;
    }
/**
 * metodo set para modificar el numero de caballos que tiene el coche 
 * @param caballos 
 */
    public void setCaballos(String caballos) {
        this.caballos = caballos;
    }
/**
 * metodo get para obtener el nombre del dueño del coche 
 * @return nombreDueño
 */
    public String getNombreDueño() {
        return nombreDueño;
    }
/**
 * metodo para modificar el nombre del dueño del coche 
 * @param nombreDueño 
 */
    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }
/**
 * metodo para obtener el dbu del dueño del coche 
 * @return dni
 */
    public String getDni() {
        return dni;
    }
/**
 * metodo para cambiar el dni del dueño del coche 
 * @param dni 
 */
    public void setDni(String dni) {
        this.dni = dni;
    }
/**
 * metodo para obtener el telefono del dueño del coche 
 * @return telefono 
 */
    public String getTelefono() {
        return telefono;
    }
/**
 * metodo para cambiar el telefono del dueño del coche 
 * @param telefono 
 */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
/**
 * metodo toString
 * @return descripcion del coche con todos sus campos 
 */
    @Override
    public String toString() {
        return "matricula: " + matricula + " motor" + cilindrada + " " + motor + " " + caballos + "propietario: " + nombreDueño + " " + dni + " " + telefono;
    }

}
