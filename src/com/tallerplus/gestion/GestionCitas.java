package com.tallerplus.gestion;

import VentanasEmergentes.Mensajes;
import com.tallerplus.files.Conexion;

import com.tallerplus.objetos.Cita;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;

public class GestionCitas extends Conexion{

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
        connect();
        boolean encontrado=false; // bandera que, cuando es true indica que el vehiculo ya existe en el fichero a esa hora, y false cuando no existe 
        for(int i=0; i<citas.size(); i++){ // realizamos un bucle para saber si alguna de las matriculas + horas existentes coincidde con la que queremos añadir 
            if(citas.get(i).getMatricula().equals(matricula)&&citas.get(i).getFechaHora().equals(fechaHora)){ // si coincide
                Mensajes.ventanaError("La cita ya existe en el sistema.", "Cita no válida."); // indicamos que no es valida
                encontrado=true;
                break;
            }else;
        }
        
        if(encontrado==false){ // si no se encuentra añadimos la cita 
            Ficheros.citas.add(new Cita(matricula, fechaHora, descripcion, precio, estado));
            Ficheros.escribirFicheroCitas();
        }
        close();
    }

    /**
     * borra las citas de la lista de citas que tenemos .
     *
     * @param matricula matricula del vehiculo que tiene la cita a eliminar.
     * @param fechaHora momento de la cita.
     *
     */
    public static boolean borrarCita(String matricula, String fechaHora){
        int confirmado=0; // indicador para la ventana emergente sobre si borrar la cita o no 
        boolean borrado=false; // indicador de borrado que solo cambia a true si se encuentra la cita en cuestion
        for(int i=0; i<Ficheros.citas.size(); i++){
            if(Ficheros.citas.get(i).getMatricula().equals(matricula)&&Ficheros.citas.get(i).getFechaHora().equals(fechaHora)){
                confirmado=JOptionPane.showConfirmDialog(null, "¿Seguro que deseas borrar esta cita?");
                if(confirmado==YES_OPTION){ // si el cliente confirma la operacion borramos la cita 
                    Ficheros.citas.remove(i);
                    borrado=true;
                }
                break;
            }
        }

        if(borrado==true&&confirmado==YES_OPTION){ // si se confirma la operacion borramos la cita del fichero
            Ficheros.escribirFicheroCitas();
        }else if(confirmado!=YES_OPTION);else{
            Mensajes.ventanaError("Cita no encontrada.", "Gestión de citas.");
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
    public static boolean modificarEstado(String matricula, String fechaHora, String estado){ // no se pueden modificar los campo clave matricula y fecha, en caso de que esos datos esten mal hay que borrar la cita y generar una nueva
        boolean modificado=false; // bandera que cuando es true indica que se realizo la operacion de modificacion y si es false indica que no se ha podido realizar 
        for(int i=0; i<Ficheros.citas.size(); i++){ // buscamos entre todas las citas la que coincide con la que tenemos seleccionada
            if(Ficheros.citas.get(i).getMatricula().equals(matricula)&&Ficheros.citas.get(i).getFechaHora().equals(fechaHora)){
                Ficheros.citas.get(i).setEstado(estado); // cambiamos el estado por el estado que nos interesa 
                modificado=true; // indicamos que hemos encontrado la cita y modificado el estado 
                break;
            }
        }

        if(modificado==true){ // si se realiza la operacion correctamente añadimos la cita modificada al fichero 
            Ficheros.escribirFicheroCitas();
        }else{
            Mensajes.ventanaError("Cita no encontrada, no se ha podido modificar.", "Modificación de citas."); // en caso contrario mostramos un mensaje de error 
        }

        return modificado; // retornamos si fue modificado o no 
    }

    /**
     * consulta la cita de una determinada hora de un determinado dia.
     *
     * @param fechaHora dato de fecha y hora para realizar la consulta.
     * @return encontradas Lista de citas encontradas en esa fecha.
     */
    public static ArrayList<Cita> consultarCitaFecha(String fechaHora){ // podemos consultar una cita segun su hora, si no se sabe la hora de una cita de una determinada matricula se debe usar el historial del vehiculo
        ArrayList<Cita> encontradas=new ArrayList(); // creamos una lista para poder almacenar las citas que hemos encontrado 
        boolean encontrado=false; // indicador que si es true indica que se ha encontrado alguna cita que coincida con la busqueda 
        for(int i=0; i<Ficheros.citas.size(); i++){ // recorremos todas las citas para hacer la busqueda 
            if(Ficheros.citas.get(i).getFechaHora().equals(fechaHora)){ // si la comparacion coincide añadimos la cita a la lista y ponemos el indicador a true 
                encontradas.add(Ficheros.citas.get(i));
                encontrado=true;
            }
        }

        if(encontrado==false){ // si no se encuentra ninguna cita que coincida mostramos un mensaje de error
            Mensajes.ventanaError("Cita no encontrada.", "Búsqueda.");
        }
        return encontradas;
    }

    /**
     * Consulta las citas con una matrícula determinada..
     *
     * @param matricula dato matrícula para realizar la búsqueda.
     * @return encontradas Lista de citas encontradas con esa matrícula.
     */
    public static ArrayList<Cita> consultarCitaMatricula(String matricula){ // podemos consultar una cita segun su hora, si no se sabe la hora de una cita de una determinada matricula se debe usar el historial del vehiculo
        ArrayList<Cita> encontradas=new ArrayList(); // los mismos casos que en metodo anterior, almacenamos en este array las citas coincidentes despues de buscar coincidencias con el bucle for y devolvemos true en caso de que se encuentre 
        boolean encontrado=false;
        Cita citaConsultada=new Cita();
        for(int i=0; i<Ficheros.citas.size(); i++){
            if(Ficheros.citas.get(i).getMatricula().equals(matricula)){
                citaConsultada=Ficheros.citas.get(i);
                encontradas.add(citaConsultada);
                encontrado=true;
            }
        }

        if(encontrado==false){ // si no se encuentra coincidencia retornamos un mensaje de error
            Mensajes.ventanaError("Cita no encontrada.", "Búsqueda.");
        }
        return encontradas;
    }
}
