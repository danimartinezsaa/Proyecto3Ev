package com.tallerplus.objetos;
// objeto para cada una de las citas que tiene un coche en el taller
public class Cita implements Comparable {
    private String matricula;
    private String fechaHora;
    private String descripcion;
    private float precio;
    private String estado;

    public Cita() {
    }

    /**
     *constructor por defecto 
     * @return matricula
     */
    public String getMatricula() {
        return matricula;
    }
    /**
     * constructor con cada uno de los parametros 
     * @param matricula
     * @param fechaHora
     * @param descripcion
     * @param precio
     * @param estado 
     */

    public Cita(String matricula, String fechaHora, String descripcion, float precio, String estado) {
        this.matricula = matricula;
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
    }
/**
 * metodo set para devolver el valor de la matricula
 * @param matricula matricula del coche 
 */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    /**
     * metodo para devolver la feca y hora de la cita en cuestion
     * @return fechaHora en la cual se ha citado al cliente 
     */

    public String getFechaHora() {
        return fechaHora;
    }
/**
 * metodo para cambiar el valor de la fecha en la que se cito al cliente 
 * @param fechaHora fehca y hora en la que se cito al cliente 
 */
    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }
/**
 * metodo para devolver la descripcion de la averia o actuacion necesaria en el vehiculo
 * @return descripcion descripcion de lo que hay que hacer al coche 
 */
    public String getDescripcion() {
        return descripcion;
    }
/**
 * metodo para poder cambiar la descripcion de la cita 
 * @param descripcion descripcion de la cita en cuestion 
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * metodo para devolver el precio que va a tener la reparacion del vehiculo
     * @return precio de la reparacion del vehiculo
     */

    public float getPrecio() {
        return precio;
    }
/**
 * metodo para cambiar el precio de la reparacion 
 * @param precio 
 */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
/**
 * metodo para devolver el estado de la averia
 * @return estado 
 */
    public String getEstado() {
        return estado;
    }
/**
 * metodo para modificar el estado de la averia
 * @param estado 
 */
    public void setEstado(String estado) {
        this.estado = estado;
    }
/**
 * toString
 * @return String con la descripcion de la cita 
 */
    @Override
    public String toString() {
        return "cita del vehiculo "+matricula+" para el "+fechaHora+"con precio de reparacion "+precio+" y estado de reparacion "+estado;
    }
/**
 * metodo para poder ordenar la cita por el campo fechaHora 
 * @param o
 * @return 0,1,-1 dependiendo de la condicion de comparacion 
 */
    @Override
    public int compareTo(Object o) {
        Cita cita=(Cita)o;
        
        if(this.fechaHora.compareTo(cita.fechaHora)==0)
            return 0;
        else if(this.fechaHora.compareTo(cita.fechaHora)>0)
            return 1;
        else
            return -1;
    }
    
    
    
}
