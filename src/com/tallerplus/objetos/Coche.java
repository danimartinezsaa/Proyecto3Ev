package com.tallerplus.objetos;
// un coche sera cada uno de los objetos tratados en el taller, reparado, con datos de su dueño para poder localizarlo
public class Coche {
    // un coche tendra datos sobre el motor, matricula, y datos identificativos de su dueño
    private String matricula,motor,cilindrada,caballos,nombreDueño,dni,telefono;

    public String getMatricula() {
        return matricula;
    }

    public Coche(String matricula, String motor, String cilindrada, String caballos, String nombreDueño, String dni, String telefono) {
        this.matricula = matricula;
        this.motor = motor;
        this.cilindrada = cilindrada;
        this.caballos = caballos;
        this.nombreDueño = nombreDueño;
        this.dni = dni;
        this.telefono = telefono;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "matricula: "+matricula+" motor"+cilindrada+" "+motor+" "+caballos+"propietario: "+nombreDueño+" "+dni+" "+telefono;
    }
  
    
    
}
