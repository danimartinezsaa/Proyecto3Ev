package com.tallerplus.gestion;

import VentanasEmergentes.Mensajes;
import com.tallerplus.files.Conexion;
import com.tallerplus.objetos.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestionUsuarios extends Conexion {

    public static ArrayList<Usuario> usuarios = new ArrayList();

    public GestionUsuarios() {
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
    public boolean anadirUsuario(String usuario, String contrasena, String tipo) {
        boolean repetido = false;
        for (Usuario elemento : usuarios) { // recorremos la lista de usuarios para saber si el usuario que buscamos ya existe 
            if (elemento.getUsuario().equals(usuario)) {
                repetido = true;
            }
        }
        if (repetido == false) { // si el usuario que buscamos no existe lo añadimos, en caso contrario, informamos que ya existe un usuario con ese nombre 
            connect();
            try {
                st = conexion.prepareStatement("insert into usuarios values('" + usuario + "'"
                        + "," + "'" + contrasena + "'"
                        + "," + "'" + tipo + "'" + ");");

                st.execute();
                select();
                Mensajes.ventanaInfo("Usuario introducido con éxito", "Gestión de usuarios.");
            } catch (SQLException ex) {
                Mensajes.ventanaError("Error al insertar en la base de datos.", "Error.");
            }
            close();

        } else {
            Mensajes.ventanaError("Ya existe un usuario con ese nombre.", "Añadir usuario");
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
    public boolean borrarUsuario(String usuario) {
        boolean bandera = true;
        if (!usuario.equals("admin")) { // si el usuario es el administrador "admin" no puede ser borrado 
            boolean borrado = false;
            connect();
            try {
                st = conexion.prepareStatement("delete from usuarios where usuario='" + usuario + "'");
                st.executeUpdate();
                borrado = true;
                select();
            } catch (SQLException ex) {
                Mensajes.ventanaError("No se ha encontrado al usuario a eliminar.", "Gestión de usuarios.");
            }
            close();

        } else {
            bandera = false; // en caso contrario mandamos un mensaje de error
            Mensajes.ventanaError("No se puede borrar 'ADMIN'", "Error");
        }
        return bandera; // retornamos si el usuario ha sido borrado o no 
    }

    /**
     * Edita los parámetros de un usuario en concreto
     *
     * @param lastUser nombre de usuario antes de la modificacion 
     * @param usuario Nuevo usuario a insertar.
     * @param contrasena Nueva contraseña a insertar.
     * @param tipo Nuevo tipo a insertar.
     * @return true si se ha editado el usuario.
     */
    public boolean editarUsuario(String lastUser, String usuario, String contrasena, String tipo) {
        boolean editado = false;
        connect();
        try {
            st = conexion.prepareStatement("update usuarios set"
                    + " usuario=" + "'" + usuario + "' "
                    + ", contrasena=" + "'" + contrasena + "' "
                    + ", tipo=" + "'" + tipo + "' "
                    + " where usuario=" + "'" + lastUser + "'" + ";");
            st.executeUpdate();
            editado = true;
            select();
        } catch (SQLException ex) {
            Mensajes.ventanaError("Error al actualizar usuario.", "Error.");
        }
        close();

        return editado;
    }
    /**
     * metodo para recoger toda la información de la tabla en el arrayList
     */

    @Override
    public void select() {
        connect();

        try {
            st = conexion.prepareStatement("select * from usuarios");
            resultado = st.executeQuery();
            usuarios.clear();
            while (resultado.next()) {
                usuarios.add(new Usuario(resultado.getString("usuario"), resultado.getString("contrasena"), resultado.getString("tipo")));
            }
        } catch (SQLException ex) {
            Mensajes.ventanaError("Error al ejecutar la consulta.", "Error.");
        }catch(NullPointerException error){
            System.out.println("No existen datos en la tabla usuarios");
            
        }
        close();
    }
}
