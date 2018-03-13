package com.tallerplus.gestion;

import com.tallerplus.interfaz.LoginUsers;
import com.tallerplus.interfaz.VentanaPrincipal;
import com.tallerplus.objetos.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Login {
    private static String usuario_logueado;
    
    public static String getUsuarioLogueado(){
        return usuario_logueado;
    }
    /**
     * Comprueba el usuario introducido en el formulario, si coincide con los usuarios ya registrados le abre su ventana correspondiente, si no
     * abre una ventana emergente informando al usuario.
     * @param usuario usuario introducido en el formulario "Login_users".
     * @param contrasena contraseña introducida en el formulario "Login_users".
     * @param usuarios ArrayList con los usuarios almacenados.
     * return Devuelve si encontró al usuario o no.
     * @return devuelve un true si ha encontado el usuario.
     */
    public static boolean comprobarUsuario(String usuario, String contrasena, ArrayList<Usuario> usuarios){
        boolean encontrado=false;
        for(int i=0;i<usuarios.size();i++){
            if((usuarios.get(i).getUsuario().equals(usuario))&&(usuarios.get(i).getContrasena().equals(contrasena))){
                lanzarVentanaPrincipal();
                encontrado=true;  
                usuario_logueado=usuarios.get(i).getTipo();
            }
            
        }
        
        if(encontrado==false)
            JOptionPane.showMessageDialog(null, "Los datos no coinciden, vuelva a intentarlo.", "Usuario o contraseña errónea", 0);
        
        return encontrado;
    }
    /**
     * Lanza la ventana inicial del proyecto, la ventana "Login_users".
     */
    public static void lanzarVentanaLogin(){
        LoginUsers login=new LoginUsers();
    }
    /**
     * Lanza la ventana principal del proyecto.
     */
    public static void lanzarVentanaPrincipal(){
        VentanaPrincipal v=new VentanaPrincipal();
    }
    
}
