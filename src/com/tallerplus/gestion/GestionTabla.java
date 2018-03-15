/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerplus.gestion;

import javax.swing.table.DefaultTableModel;

/**
 * Clase con métodos para editar tablas.
 * @author dani_
 */
public class GestionTabla {
    /**
     * Método que borra el contenido de la tabla.
     */    
    public static void borrarTabla(DefaultTableModel tabla) {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            tabla.removeRow(i);
            i -= 1;
        }
    }    
}
