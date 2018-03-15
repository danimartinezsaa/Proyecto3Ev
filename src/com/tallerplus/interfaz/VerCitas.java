/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerplus.interfaz;

import com.tallerplus.files.Ficheros;
import com.tallerplus.gestion.GestionCitas;
import com.tallerplus.gestion.GestionTabla;
import com.tallerplus.objetos.Cita;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dani_
 */
public class VerCitas extends javax.swing.JFrame {
    ArrayList<Cita> encontradas = new ArrayList();
    ArrayList<Cita> mostradas = new ArrayList();
    DefaultTableModel tabla = new DefaultTableModel();

    /**
     * Creates new form BuscarCita
     */
    public VerCitas() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        //Columnas de la tabla
        tabla.addColumn("Matrícula");
        tabla.addColumn("Fecha y hora");
        tabla.addColumn("Descripción");
        tabla.addColumn("Precio");
        tabla.addColumn("Estado");
        mostrarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pbucita = new javax.swing.JPanel();
        batras = new javax.swing.JLabel();
        titulousuarios = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        infecha = new javax.swing.JTextField();
        bbuscarfecha = new javax.swing.JLabel();
        inmatricula = new javax.swing.JTextField();
        bbuscarmatricula = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablabusqueda = new javax.swing.JTable();
        inestado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        botoncombo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Borrar Cita");
        setMinimumSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));

        pbucita.setBackground(new java.awt.Color(109, 132, 180));

        batras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/flecha-hacia-la-izquierda.png"))); // NOI18N
        batras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batrasMouseClicked(evt);
            }
        });

        titulousuarios.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulousuarios.setForeground(new java.awt.Color(255, 255, 255));
        titulousuarios.setText("Citas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Búsqueda por fecha");

        infecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infechaActionPerformed(evt);
            }
        });

        bbuscarfecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/busqueda-p.png"))); // NOI18N
        bbuscarfecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bbuscarfechaMouseClicked(evt);
            }
        });

        inmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inmatriculaActionPerformed(evt);
            }
        });

        bbuscarmatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/busqueda-p.png"))); // NOI18N
        bbuscarmatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bbuscarmatriculaMouseClicked(evt);
            }
        });

        tablabusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Matrícula", "Fecha y hora", "Descripcion", "Precio", "Estado"
            }
        ));
        jScrollPane2.setViewportView(tablabusqueda);

        inestado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "En proceso", "Finalizado" }));
        inestado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inestadoMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cambiar estado:");

        botoncombo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/exito-p.png"))); // NOI18N
        botoncombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoncomboMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Búsqueda por matrícula");

        javax.swing.GroupLayout pbucitaLayout = new javax.swing.GroupLayout(pbucita);
        pbucita.setLayout(pbucitaLayout);
        pbucitaLayout.setHorizontalGroup(
            pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbucitaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulousuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pbucitaLayout.createSequentialGroup()
                        .addGroup(pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(infecha, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inmatricula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bbuscarmatricula)
                            .addComponent(bbuscarfecha))))
                .addGroup(pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pbucitaLayout.createSequentialGroup()
                        .addGap(518, 518, 518)
                        .addComponent(batras))
                    .addGroup(pbucitaLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pbucitaLayout.createSequentialGroup()
                                .addGroup(pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inestado, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(botoncombo))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pbucitaLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jLabel5)
                    .addContainerGap(694, Short.MAX_VALUE)))
        );
        pbucitaLayout.setVerticalGroup(
            pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbucitaLayout.createSequentialGroup()
                .addGroup(pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pbucitaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botoncombo))
                    .addGroup(pbucitaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titulousuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(batras))
                        .addGroup(pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbucitaLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(bbuscarfecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bbuscarmatricula))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbucitaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pbucitaLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infecha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(inmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inestado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
            .addGroup(pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbucitaLayout.createSequentialGroup()
                    .addContainerGap(294, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(193, 193, 193)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pbucita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pbucita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batrasMouseClicked
        VentanaPrincipal venanaprincipal = new VentanaPrincipal();
        dispose();
    }//GEN-LAST:event_batrasMouseClicked

    private void infechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infechaActionPerformed

    }//GEN-LAST:event_infechaActionPerformed

    private void inmatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inmatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inmatriculaActionPerformed
    /**
     * Botón búsqueda por fecha
     * @param evt
     */
    private void bbuscarfechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbuscarfechaMouseClicked

        String fecha = infecha.getText();

        //Recibimos la citas encontradas que no esten cerradas o finalizadas
        encontradas = GestionCitas.consultarCitaFecha(fecha);

        borrarCitasPendientesProceso();
        GestionTabla.borrarTabla(tabla);
        mostrarTablaEncontradas(encontradas);
        infecha.setText("");
    }//GEN-LAST:event_bbuscarfechaMouseClicked
    /**
     * Botón búsqueda por matrícula
     * @param evt
     */
    private void bbuscarmatriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbuscarmatriculaMouseClicked

        String matricula = inmatricula.getText();

        //Recibimos la citas encontradas
        encontradas = GestionCitas.consultarCitaMatricula(matricula);


        borrarCitasPendientesProceso();
        GestionTabla.borrarTabla(tabla);
        mostrarTablaEncontradas(encontradas);

        inmatricula.setText("");
    }//GEN-LAST:event_bbuscarmatriculaMouseClicked

    private void inestadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inestadoMouseClicked

    }//GEN-LAST:event_inestadoMouseClicked

    private void botoncomboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoncomboMouseClicked
        int seleccion = tablabusqueda.getSelectedRow();
        if (seleccion >= 0) {
            String estado = (String) inestado.getSelectedItem();
            String matricula = mostradas.get(seleccion).getMatricula();
            String fechahora = mostradas.get(seleccion).getFechaHora();
            GestionCitas.modificarEstado(matricula, fechahora, estado);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una cita", "Error", 0);
        }

        GestionTabla.borrarTabla(tabla);
        mostrarTabla();
    }//GEN-LAST:event_botoncomboMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VerCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display thbbuscarfecha*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerCitas().setVisible(true);
            }
        });
    }

    /**
     * Método que muestra en la tabla todas las citas pendientes y en proceso.
     */
    private void mostrarTabla() {
        Collections.sort(Ficheros.citas);

        for (Cita elemento : Ficheros.citas) {
            if ((elemento.getEstado().equalsIgnoreCase("pendiente") || elemento.getEstado().equalsIgnoreCase("en proceso"))) {
                String anadir[] = new String[5];
                anadir[0] = elemento.getMatricula();
                anadir[1] = elemento.getFechaHora();
                anadir[2] = elemento.getDescripcion();
                anadir[3] = Float.toString(elemento.getPrecio());
                anadir[4] = elemento.getEstado();
                mostradas.add(new Cita(anadir[0], anadir[1], anadir[2], Float.parseFloat(anadir[3]), anadir[4]));
                tabla.addRow(anadir);
            }
        }
        this.tablabusqueda.setModel(tabla);
    }
    /**
     * Método que muestra en la tabla las citas del array que recibe
     * @param encontradas Array con las citas que queremos mostrar
     */
    private void mostrarTablaEncontradas(ArrayList<Cita> encontradas){
        Collections.sort(encontradas);
        for (Cita elemento : encontradas) {
            String anadir[] = new String[5];
            anadir[0] = elemento.getMatricula();
            anadir[1] = elemento.getFechaHora();
            anadir[2] = elemento.getDescripcion();
            anadir[3] = Float.toString(elemento.getPrecio());
            anadir[4] = elemento.getEstado();
            tabla.addRow(anadir);
        }
        this.tablabusqueda.setModel(tabla);        
    }
    
    private void borrarCitasPendientesProceso(){
        Iterator<Cita> it = encontradas.iterator();
        while (it.hasNext()) {
            Cita cita = it.next();
            if (!(cita.getEstado().equalsIgnoreCase("pendiente") || cita.getEstado().equalsIgnoreCase("en proceso"))) {
                it.remove();
            }
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel batras;
    private javax.swing.JLabel bbuscarfecha;
    private javax.swing.JLabel bbuscarmatricula;
    private javax.swing.JLabel botoncombo;
    private javax.swing.JComboBox<String> inestado;
    private javax.swing.JTextField infecha;
    private javax.swing.JTextField inmatricula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pbucita;
    private javax.swing.JTable tablabusqueda;
    private javax.swing.JLabel titulousuarios;
    // End of variables declaration//GEN-END:variables
}
