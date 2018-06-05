package com.tallerplus.gestion;

import VentanasEmergentes.Mensajes;
import com.tallerplus.files.Conexion;
import com.tallerplus.objetos.Coche;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestionClientes extends Conexion{

    public static ArrayList<Coche> coches=new ArrayList();

    public GestionClientes(){
    }

    
    /**
     * Añade un cliente al ArrayList de clientes que recibe y lo devuelve
     *
     * @param matricula matricula del vehiculo a reparar
     * @param motor tipo de combustible, diesel o gasolina
     * @param cilindrada cilindrada del vehiculo en cuestion
     * @param caballos potencia del vehiculo expresada en caballos de vapor
     * @param nombreDueño nombre del propietario del vehiculo
     * @param dni numero de identificacion personal del dueño del vehiculo
     * @param telefono telefono de contacto del dueño del vehiculo
     */
    public boolean anadirCliente(String matricula, String motor, String cilindrada, String caballos, String nombreDueño, String dni, String telefono){ // pasamos al metodo todos los datos del cliente
        boolean encontrado=false;
        select();
        for(int i=0; i<coches.size(); i++){ // comprobamos que el ciente introducido no exista ya , para eso usamos el campo matricula dado que no pueden existir dos coches con la misma matricula
            if(coches.get(i).getMatricula().equals(matricula)){ // si ya existe retornamos un mensaje de error y marcamos como true nuestra bandera 
                Mensajes.ventanaError("El cliente introducido ya existe.", "Gestión de clientes.");
                encontrado=true;
                break;
            }
        }

        if(encontrado==false){ // si no existe añadimos el coche como un cliente nuevo 
            connect();
            try{
                st=conexion.prepareStatement("insert into coche values('"+matricula+"'"
                        +","+"'"+motor+"'"
                        +","+"'"+cilindrada+"'"
                        +","+"'"+caballos+"'"
                        +","+"'"+nombreDueño+"'"
                        +","+"'"+dni+"'"
                        +","+"'"+telefono+"'"+");");

                st.execute();
                select();
            }catch(SQLException ex){
                Mensajes.ventanaError("Error al insertar en la base de datos.", "Error.");
            }
            close();
        }

        return encontrado; // retornamos true si habia un cliente con esa matricula introducido, o false en caso contrario
    }

    /**
     * Elimina un vehiculo de la lista de vehiculos que tenemos en el taller
     *
     * @param matricula matricula del vehiculo a eliminar
     * @param eb le indica si estamos modificando o borrando al cliente
     */
    public void borrarCliente(String matricula, String eb){
        boolean borrado=false; // indicador de borrado que solo salta a true en caso de que se encuentre el coche, posteriormente trataremos que no se encuentre con el 

        connect();

        try{
            st=conexion.prepareStatement("DELETE FROM coche WHERE matricula='"+matricula+"'");
            st.executeUpdate();
            borrado=true;
            select();
        }catch(SQLException ex){
            Mensajes.ventanaError("No se ha encontrado al cliente a eliminar.", "Gestión de clientes.");
        }
        
        close();

        if(eb.equals("borrar")){
            Mensajes.ventanaInfo("Cliente borrado", "Gestión de clientes.");
        }
    }

    /**
     * Edita los parámetros de un cliente en concreto.
     *
     * @param editar Matrícula del elemento a editar.
     * @param matricula Matrícula a insertar en el cliente indicado.
     * @param motor Motor a insertar en el cliente indicado.
     * @param cilindrada Cilindrada a insertar en el cliente indicado.
     * @param caballos Caballos a insertar en el cliente indicado.
     * @param nombreDueño Nombre del dueño a insertar en el cliente indicado.
     * @param dni DNI a insertar en el cliente indicado.
     * @param telefono Teléfono a insertar en el cliente indicado.
     * @return true si se ha editado el cliente.
     */
    public boolean editarCliente(String editar, String matricula, String motor, String cilindrada, String caballos, String nombreDueño, String dni, String telefono){
        boolean editado=false;
        connect();

        try{
            st=conexion.prepareStatement("update coche set matricula="
                    +"'"+matricula+"' "
                    +", motor="+"'"+motor+"' "+", cilindrada="+"'"+cilindrada+"'"
                    +" , caballos="+"'"+caballos+"'"+" , nombreDueno="+"'"+nombreDueño+"'"
                    +" , dni="+"'"+dni+"'"+" , telefono="+"'"+telefono+"'"
                    +" where matricula="+"'"+editar+"'"+";");
            st.executeUpdate();
            editado=true;
            select();
        }catch(SQLException ex){
            Mensajes.ventanaError("Error al actualizar la tabla.", "Error.");
        }    
        close();
        
        return editado;
    }

    @Override
    public void select(){
        
        connect();
                
        try{
            st=conexion.prepareStatement("select * from coche;");
            resultado=st.executeQuery();

            coches.clear();
            while(resultado.next()){
                coches.add(new Coche(resultado.getString("matricula"), resultado.getString("motor"), resultado.getString("cilindrada"), resultado.getString("caballos"), resultado.getString("nombreDueno"), resultado.getString("dni"), resultado.getString("telefono")));
            }
        }catch(SQLException ex){
            Mensajes.ventanaError("Error al ejecutar la consulta.", "Error.");
        }catch(NullPointerException error){
            System.out.println("No existen datos en la tabla clientes");
            System.out.println(error.getMessage());
        }
    }

}
