package com.tallerplus.gestion;

import VentanasEmergentes.Mensajes;
import com.tallerplus.files.Ficheros;
import com.tallerplus.objetos.Usuario;
import javax.swing.JOptionPane;

public class GestionUsuarios {

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
        for (Usuario elemento : Ficheros.usuarios) {
            if (elemento.getUsuario().equals(usuario)) {
                repetido = true;
            }
        }
        if (repetido == false) {
            Ficheros.usuarios.add(new Usuario(usuario, contrasena, tipo));
            Ficheros.escribirFicheroUsuarios();
        } else {
            Mensajes.ventanaError("Ya existe un usuario con ese nombre.","Añadir usuario");
        }

        return repetido;
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
        if (!usuario.equals("admin")) {
            boolean borrado = false;
            for (int i = 0; i < Ficheros.usuarios.size(); i++) {
                if (Ficheros.usuarios.get(i).getUsuario().equals(usuario)) {
                    Ficheros.usuarios.remove(i);
                    borrado = true;
                    break;
                }
            }
            if (borrado == true) {
                Ficheros.escribirFicheroUsuarios();
            }
        } else {
            bandera = false;
            Mensajes.ventanaError("No se puede borrar 'ADMIN'","Error");
        }
        return bandera;
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
        Ficheros.usuarios.set(numero, new Usuario(usuario, contrasena, tipo));
        editado = true;

        Ficheros.escribirFicheroUsuarios();
 
        return editado;
    }
}
