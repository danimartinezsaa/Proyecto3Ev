package com.tallerplus.gestion;

import VentanasEmergentes.Mensajes;
import com.tallerplus.files.Ficheros;
import com.tallerplus.objetos.Cita;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;

public class GestionCitas {

    /**
     * añade una cita para un vehiculo en la lista de citas que le pasamos .
     *
     * @param matricula matricula del vehiculo de la cita.
     * @param fechaHora fecha y hora de la cita en cuestion.
     * @param descripcion descripcion del problema del vehiculo.
     * @param precio precio de la reparacion.
     * @param estado estado de la reparacion.
     */
    public static void anadirCita(String matricula, String fechaHora, String descripcion, float precio, String estado) {
        boolean encontrado = false;
        for (int i = 0; i < Ficheros.citas.size(); i++) {
            if (Ficheros.citas.get(i).getMatricula().equals(matricula) && Ficheros.citas.get(i).getFechaHora().equals(fechaHora)) {
                Mensajes.ventanaError("La cita ya existe en el sistema.", "Cita no válida.");
                encontrado = true;
                break;
            } else;
        }
        if (encontrado == false) {
            Ficheros.citas.add(new Cita(matricula, fechaHora, descripcion, precio, estado));
            Ficheros.escribirFicheroCitas();
        }
    }

    /**
     * borra las citas de la lista de citas que tenemos .
     *
     * @param matricula matricula del vehiculo que tiene la cita a eliminar.
     * @param fechaHora momento de la cita.
     *
     */
    public static boolean borrarCita(String matricula, String fechaHora) {
        int confirmado = 0;
        boolean borrado = false; // indicador de borrado que solo cambia a true si se encuentra la cita en cuestion
        for (int i = 0; i < Ficheros.citas.size(); i++) {
            if (Ficheros.citas.get(i).getMatricula().equals(matricula) && Ficheros.citas.get(i).getFechaHora().equals(fechaHora)) {
                confirmado = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas borrar esta cita?");
                if (confirmado == YES_OPTION) {
                    Ficheros.citas.remove(i);
                    borrado = true;
                }
                break;
            }
        }
        // implementar en graficos
        if (borrado == true && confirmado == YES_OPTION) {
            Ficheros.escribirFicheroCitas();
        } else if (confirmado != YES_OPTION); else {
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
    public static boolean modificarEstado(String matricula, String fechaHora, String estado) { // no se pueden modificar los campo clave matricula y fecha, en caso de que esos datos esten mal hay que borrar la cita y generar una nueva
        boolean modificado = false;
        for (int i = 0; i < Ficheros.citas.size(); i++) {
            if (Ficheros.citas.get(i).getMatricula().equals(matricula) && Ficheros.citas.get(i).getFechaHora().equals(fechaHora)) {
                Ficheros.citas.get(i).setEstado(estado);
                modificado=true;
                break;
            } 
        }

        if (modificado == true) {
            Ficheros.escribirFicheroCitas();
        } else {
            Mensajes.ventanaError("Cita no encontrada, no se ha podido modificar.", "Modificación de citas.");
        }

        return modificado;
    }

    /**
     * consulta la cita de una determinada hora de un determinado dia.
     *
     * @param fechaHora dato de fecha y hora para realizar la consulta.
     * @return encontradas Lista de citas encontradas en esa fecha.
     */
    public static ArrayList<Cita> consultarCitaFecha(String fechaHora) { // podemos consultar una cita segun su hora, si no se sabe la hora de una cita de una determinada matricula se debe usar el historial del vehiculo
        ArrayList<Cita> encontradas = new ArrayList();
        boolean encontrado = false;
        for (int i = 0; i < Ficheros.citas.size(); i++) {
            if (Ficheros.citas.get(i).getFechaHora().equals(fechaHora)) {
                encontradas.add(Ficheros.citas.get(i));
                encontrado = true;
            }
        }

        if (encontrado == false) {
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
    public static ArrayList<Cita> consultarCitaMatricula(String matricula) { // podemos consultar una cita segun su hora, si no se sabe la hora de una cita de una determinada matricula se debe usar el historial del vehiculo
        ArrayList<Cita> encontradas = new ArrayList();
        boolean encontrado = false;
        Cita citaConsultada = new Cita();
        for (int i = 0; i < Ficheros.citas.size(); i++) {
            if (Ficheros.citas.get(i).getMatricula().equals(matricula)) {
                citaConsultada = Ficheros.citas.get(i);
                encontradas.add(citaConsultada);
                encontrado = true;
            }
        }

        if (encontrado == false) {
            Mensajes.ventanaError("Cita no encontrada.", "Búsqueda.");
        }
        return encontradas;
    }

    /**
     * Consulta las citas con las que coincidan la fecha y la hora.
     *
     * @param matricula dato matrícula para realizar la búsqueda.
     * @param fechahora dato con la fecha y la hora para realizar la búsqueda.
     * @return encontradas Lista de citas encontradas con esa matrícula.
     */
    public static ArrayList<Cita> consultarCitas(String matricula, String fechahora) { // podemos consultar una cita segun su hora, si no se sabe la hora de una cita de una determinada matricula se debe usar el historial del vehiculo
        ArrayList<Cita> encontradas = new ArrayList();
        boolean encontrado = false;
        Cita citaConsultada = new Cita();
        for (int i = 0; i < Ficheros.citas.size(); i++) {
            if (Ficheros.citas.get(i).getMatricula().equals(matricula) && Ficheros.citas.get(i).getFechaHora().equals(fechahora)) {
                citaConsultada = Ficheros.citas.get(i);
                encontradas.add(citaConsultada);
                encontrado = true;
            }
        }

        if (encontrado == false) {
            Mensajes.ventanaError("Cita no encontrada.", "Búsqueda.");
        }
        return encontradas;
    }

    /**
     * ver el historial de citas de un determinado vehiculo.
     *
     * @param matricula matricula del vehiculo que queremos sacar su historial.
     * @return citaCoche lista de todas las citas de ese determinado vehiculo.
     */
    public static ArrayList<Cita> verHistorial(String matricula) { // ver historial de un determinado vehiculo
        ArrayList<Cita> citaCoche = new ArrayList<>();
        for (int i = 0; i < Ficheros.citas.size(); i++) {
            if (Ficheros.citas.get(i).getMatricula().equals(matricula)) {
                citaCoche.add(Ficheros.citas.get(i));
            }

        }
        return citaCoche;
    }

    /**
     * Método que recibe la matrícula y la fecha de una cita y la cierra.
     *
     * @param matricula matrícula del vehículo.
     * @param fechahora fecha y hora de la cita.
     */
    public static void cerrarCita(String matricula, String fechahora) {
        for (Cita elemento : Ficheros.citas) {
            if (elemento.getMatricula().equals(matricula) && elemento.getFechaHora().equals(fechahora)) {
                elemento.setEstado("Cerrado");
                Mensajes.ventanaInfo("Cita cerrada!","Cita");
                Ficheros.escribirFicheroCitas();
            }
        }
    }
}
