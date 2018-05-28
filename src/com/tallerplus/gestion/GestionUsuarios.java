package com.tallerplus.gestion;

import VentanasEmergentes.Mensajes;
import com.tallerplus.files.Conexion;
import com.tallerplus.objetos.Usuario;
import java.util.ArrayList;


public class GestionUsuarios extends Conexion{
    
    public static ArrayList<Usuario> usuarios=new ArrayList();

    public GestionUsuarios(){
    }
    
    
    /**
     * Añade un usuario al ArrayList que recibe y lo devuelve.
     *
     * @param usuario parámetro "usuario" del la clase "Usuario"
     * @param contrasena parámetro "contrasena" de la clase "Usuario"
     * @param tipo parámetro "tipo" de la clase "Usuario"
     * @return repetido - indica si se ha añadido el usuario o no cumple los
     * requisitos.
     */
    public static boolean anadirUsuario(String usuario, String contrasena, String tipo) {
        boolean repetido = false;
        for (Usuario elemento : Ficheros.usuarios) { // recorremos la lista de usuarios para saber si el usuario que buscamos ya existe 
            if (elemento.getUsuario().equals(usuario)) {
                repetido = true;
            }
        }
        if (repetido == false) { // si el usuario que buscamos no existe lo añadimos, en caso contrario, informamos que ya existe un usuario con ese nombre 
            Ficheros.usuarios.add(new Usuario(usuario, contrasena, tipo));
            Ficheros.escribirFicheroUsuarios();
        } else {
            Mensajes.ventanaError("Ya existe un usuario con ese nombre.","Añadir usuario");
        }

        return repetido; // retornamos si el usuario existia o no, que sera usado en la interfaz 
    }

    /**
     * Borra un usuario al ArrayList que recibe y lo devuelve con el mismo
     * borrado.
     *
     * @param usuario Nombre del usuario que se desea borrar
     * @return Indica si se ha borrado el usuario.
     */
    public static boolean borrarUsuario(String usuario) {
        boolean bandera = true;
        if (!usuario.equals("admin")) { // si el usuario es el administrador "admin" no puede ser borrado 
            boolean borrado = false;
            for (int i = 0; i < Ficheros.usuarios.size(); i++) { // en caso de que no sea este, buscamos el usuario concreto y se elimina 
                if (Ficheros.usuarios.get(i).getUsuario().equals(usuario)) {
                    Ficheros.usuarios.remove(i);
                    borrado = true; 
                    break;
                }
            }
            if (borrado == true) { // en caso de borrar el usuario sobreescribimos el fichero
                Ficheros.escribirFicheroUsuarios();
            }
        } else {
            bandera = false; // en caso contrario mandamos un mensaje de error
            Mensajes.ventanaError("No se puede borrar 'ADMIN'","Error");
        }
        return bandera; // retornamos si el usuario ha sido borrado o no 
    }

    /**
     * Edita los parámetros de un usuario en concreto
     * @param numero Número de la posición del array que ocupa el usuario a editar.
     * @param usuario Nuevo usuario a insertar.
     * @param contrasena Nueva contraseña a insertar.
     * @param tipo Nuevo tipo a insertar.
     * @return true si se ha editado el usuario.
     */
    public static boolean editarUsuario(int numero,String usuario, String contrasena, String tipo) {
        boolean editado = false;
        Ficheros.usuarios.set(numero, new Usuario(usuario, contrasena, tipo)); // seleccionamos el usuario en cuestion y le enviamos los nuevos valores 
        editado = true;

        Ficheros.escribirFicheroUsuarios();
 
        return editado;
    }

    @Override
    public void select(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
