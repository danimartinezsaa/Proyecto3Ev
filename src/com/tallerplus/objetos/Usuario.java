package com.tallerplus.objetos;

public class Usuario {
    //tipo:admin,recepcion,mecanico.
    private String usuario,contrasena,tipo;
/**
 * constructor por paremetros 
 * @param usuario
 * @param contrasena
 * @param tipo 
 */
    public Usuario(String usuario, String contrasena, String tipo) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }
/**
 * metodo para obtener el nombre del usuario
 * @return usuario nombre de usuario
 */
    public String getUsuario() {
        return usuario;
    }
/**
 * metodo para modificar el nombre de usuario
 * @param usuario 
 */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
/**
 * metodo para obtener la contraseña del usuario
 * @return contrasena contraseña del usuario
 */
    public String getContrasena() {
        return contrasena;
    }
/**
 * metodo para modidicar la contraseña del usuario
 * @param contraseña 
 */
    public void setContrasena(String contraseña) {
        this.contrasena = contraseña;
    }
/**
 * metodo para obtener el tipo de usuario
 * @return tipo
 */
    public String getTipo() {
        return tipo;
    }
/**
 * metodo para modificar el tipo de usuario
 * @param tipo 
 */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
/**
 * to String
 * @return string con la descripcion del usuario
 */
    @Override
    public String toString() {
        return "usuario:" + usuario + ", contraseña:" + contrasena + ", tipo:" + tipo;
    }
    
    
}
