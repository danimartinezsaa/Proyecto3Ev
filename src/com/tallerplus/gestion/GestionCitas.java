package com.tallerplus.gestion;

import VentanasEmergentes.Mensajes;
import com.tallerplus.files.Conexion;

import com.tallerplus.objetos.Cita;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;

public class GestionCitas extends Conexion{

    public GestionCitas(){
    }
    
    public static ArrayList<Cita> citas=new ArrayList();

    /**
     * añade una cita para un vehiculo en la lista de citas que le pasamos .
     *
     * @param matricula matricula del vehiculo de la cita.
     * @param fechaHora fecha y hora de la cita en cuestion.
     * @param descripcion descripcion del problema del vehiculo.
     * @param precio precio de la reparacion.
     * @param estado estado de la reparacion.
     */
    public void anadirCita(String matricula, String fechaHora, String descripcion, float precio, String estado){
        boolean encontrado=false; // bandera que, cuando es true indica que el vehiculo ya existe en el fichero a esa hora, y false cuando no existe 
        for(int i=0; i<citas.size(); i++){ // realizamos un bucle para saber si alguna de las matriculas + horas existentes coincide con la que queremos añadir 
            if(citas.get(i).getMatricula().equals(matricula)&&citas.get(i).getFechaHora().equals(fechaHora)){ // si coincide
                Mensajes.ventanaError("La cita ya existe en el sistema.", "Cita no válida."); // indicamos que no es valida
                encontrado=true;
                break;
            }else;
        }

        if(encontrado==false){ // si no se encuentra añadimos la cita 
            connect();
            try{
                st=conexion.prepareStatement("insert into cita values('"+matricula+"'"
                        +","+"'"+fechaHora+"'"
                        +","+"'"+precio+"'"
                        +","+"'"+estado+"'"
                        +","+"'"+descripcion+"'"+");");

                st.execute();
                select();
            }catch(SQLException ex){
                Mensajes.ventanaError("Error al insertar en la base de datos.", "Error.");
            }
            close();
        }
    }

    /**
     * borra las citas de la lista de citas que tenemos .
     *
     * @param matricula matricula del vehiculo que tiene la cita a eliminar.
     * @param fechaHora momento de la cita.
     *
     */
    public boolean borrarCita(String matricula, String fechaHora){
        int confirmado=0; // indicador para la ventana emergente sobre si borrar la cita o no 
        boolean borrado=false; // indicador de borrado que solo cambia a true si se encuentra la cita en cuestion

        confirmado=JOptionPane.showConfirmDialog(null, "¿Seguro que deseas borrar esta cita?");
        if(confirmado==YES_OPTION){ // si el cliente confirma la operacion borramos la cita 
            connect();
            try{
                st=conexion.prepareStatement("DELETE FROM cita WHERE matricula='"+matricula+"'"+" and fechaHora='"+fechaHora+"';");
                st.executeUpdate();
                borrado=true;
            }catch(SQLException ex){
                Mensajes.ventanaError("Cita no encontrada.", "Gestión de citas.");
            }
            close();
        }

        return borrado;
    }

    /**
     * modifica las citas ya creadas dentro de una lista de citas .
     *
     * @param matricula matricula de la cita a modificar , este dato no puede
     * ser modificado.
     * @param fechaHora fecha y hora de la cita a modificar , este dato no puede
     * ser modificado.
     * @param estado estado de la reparacion, modificada o no.
     */
    public boolean modificarEstado(String matricula, String fechaHora, String estado){ // no se pueden modificar los campo clave matricula y fecha, en caso de que esos datos esten mal hay que borrar la cita y generar una nueva
        boolean modificado=false; // bandera que cuando es true indica que se realizo la operacion de modificacion y si es false indica que no se ha podido realizar 
        connect();

        try{
            st=conexion.prepareStatement("update cita set estado='"+estado+"'"
                    +" where matricula="+"'"+matricula+"'"+" and fechaHora='"+fechaHora+"';");
            st.executeUpdate();
            modificado=true; // indicamos que hemos encontrado la cita y modificado el estado 
            select();
        }catch(SQLException ex){
            Mensajes.ventanaError("Cita no encontrada, no se ha podido modificar.", "Modificación de citas."); // en caso contrario mostramos un mensaje de error 
        }
        select();
        close();

        return modificado; // retornamos si fue modificado o no 
    }

    /**
     * consulta la cita de una determinada hora de un determinado dia.
     *
     * @param fechaHora dato de fecha y hora para realizar la consulta.
     */
    public void consultarCitaFecha(String fechaHora){ // podemos consultar una cita segun su hora, si no se sabe la hora de una cita de una determinada matricula se debe usar el historial del vehiculo
        int encontrados=0;
        connect();
        try{
            st=conexion.prepareStatement("select * from cita where fechaHora="+"'"+fechaHora+"'"+";");
            resultado=st.executeQuery();
            citas.clear();
            while(resultado.next()){
                citas.add(new Cita(resultado.getString("matricula"),resultado.getString("fechaHora"),resultado.getString("descripcion"),Float.parseFloat(resultado.getString("precio")),resultado.getString("estado")));
                encontrados++;
            }
        }catch(SQLException ex){
            Mensajes.ventanaError("Error al ejecutar la consulta.", "Error.");
        }
        close();

        if(encontrados>0){ // si no se encuentra coincidencia retornamos un mensaje de error
            Mensajes.ventanaError("Cita no encontrada.", "Búsqueda.");
        }
    }

    /**
     * Consulta las citas con una matrícula determinada..
     *
     * @param matricula dato matrícula para realizar la búsqueda.
     */
    public void consultarCitaMatricula(String matricula){ // podemos consultar una cita segun su hora, si no se sabe la hora de una cita de una determinada matricula se debe usar el historial del vehiculo
        int encontrados=0;
        connect();
        try{
            st=conexion.prepareStatement("select * from cita where matricula="+"'"+matricula+"'"+";");
            resultado=st.executeQuery();
            citas.clear();
            while(resultado.next()){
                citas.add(new Cita(resultado.getString("matricula"),resultado.getString("fechaHora"),resultado.getString("descripcion"),Float.parseFloat(resultado.getString("precio")),resultado.getString("estado")));
                encontrados++;
            }
        }catch(SQLException ex){
            Mensajes.ventanaError("Error al ejecutar la consulta.", "Error.");
        }
        close();

        if(encontrados>0){ // si no se encuentra coincidencia retornamos un mensaje de error
            Mensajes.ventanaError("Cita no encontrada.", "Búsqueda.");
        }
    }

    @Override
    public void select(){

        connect();

        try{
            st=conexion.prepareStatement("select * from cita");
            resultado=st.executeQuery();

            citas.clear();
            while(resultado.next()){
                citas.add(new Cita(resultado.getString("matricula"), resultado.getString("fechaHora"), resultado.getString("descripcion"), Float.parseFloat(resultado.getString("precio")), resultado.getString("estado")));
            }
        }catch(SQLException ex){
            System.out.println("Error al ejecutar la consulta");
            Mensajes.ventanaError("Error al ejecutar la consulta.", "Error.");
        }

        close();
    }
}
