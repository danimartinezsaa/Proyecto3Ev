/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerplus.interfaz;

import com.tallerplus.files.Ficheros;
import com.tallerplus.gestion.GestionVentas;
import com.tallerplus.gestion.Login;
import com.tallerplus.objetos.Venta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Validaciones.ValidarFormatos; // importamos la libreria que creamos
import com.tallerplus.gestion.GestionTabla;
import java.awt.Color;

/**
 * Interfaz venta de coches.
 *
 * @author dani_
 */
public class VentaCoches extends javax.swing.JFrame {

    static DefaultTableModel tabla = new DefaultTableModel();
    ArrayList<Venta> enventa = new ArrayList();
    static String motor;
    static String caballos;
    static String cilindrada;
    static boolean correcto;
    static int eliminar;

     
    public VentaCoches() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        //Columnas de la tabla
        tabla.addColumn("Modelo");
        tabla.addColumn("Precio");
        tabla.addColumn("Motor");
        tabla.addColumn("Cilindrada");
        tabla.addColumn("Caballos");

        //Recibimos los coches encontrados
        enventa = Ficheros.ventas;
        
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

        jPanel1 = new javax.swing.JPanel();
        batras = new javax.swing.JLabel();
        titulousuarios2 = new javax.swing.JLabel();
        titulousuarios1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablabusqueda = new javax.swing.JTable();
        bañadir = new javax.swing.JLabel();
        titulousuarios = new javax.swing.JLabel();
        inprecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inmotor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        incilindrada = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        incaballos = new javax.swing.JTextField();
        inmodelo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bborrar = new javax.swing.JLabel();
        bvender = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cerrar Cita");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(109, 132, 180));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));

        jPanel1.setBackground(new java.awt.Color(109, 132, 180));

        batras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/flecha-hacia-la-izquierda.png"))); // NOI18N
        batras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batrasMouseClicked(evt);
            }
        });

        titulousuarios2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulousuarios2.setForeground(new java.awt.Color(255, 255, 255));
        titulousuarios2.setText("Añadir");

        titulousuarios1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulousuarios1.setForeground(new java.awt.Color(255, 255, 255));
        titulousuarios1.setText("Venta de coches");

        tablabusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Modelo", "Precio", "Motor", "Cilindrada", "Caballos"
            }
        ));
        jScrollPane1.setViewportView(tablabusqueda);

        bañadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/exito-p.png"))); // NOI18N
        bañadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bañadirMouseClicked(evt);
            }
        });

        titulousuarios.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulousuarios.setForeground(new java.awt.Color(255, 255, 255));
        titulousuarios.setText("Vehículos en venta");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("motor");

        inmotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diesel", "Gasolina", "Hibrido", "Electrico" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("cilindrada");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("caballos");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Modelo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("€");

        bborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/error.png"))); // NOI18N
        bborrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bborrarMouseClicked(evt);
            }
        });

        bvender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/euro.png"))); // NOI18N
        bvender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bvenderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulousuarios1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(batras))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(inprecio)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(incilindrada)
                            .addComponent(inmotor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(incaballos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(titulousuarios2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bañadir)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bborrar)
                        .addGap(18, 18, 18)
                        .addComponent(bvender)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulousuarios)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(batras)
                    .addComponent(titulousuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulousuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bborrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bvender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inmotor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(incilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(incaballos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bañadir)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(titulousuarios2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batrasMouseClicked
        VentanaPrincipal venanaprincipal = new VentanaPrincipal();
        dispose();
    }//GEN-LAST:event_batrasMouseClicked

    /**
     * Botón para añadir un coche nuevo a la venta.
     *
     * @param evt
     */
    private void bañadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bañadirMouseClicked
        boolean caballosValidos = ValidarFormatos.isNumeric(incaballos.getText()); // comprobacion de que los datos esten validados correctamente 
        boolean precioValido = ValidarFormatos.validarPrecio(inprecio.getText());
        boolean cilindradaValida = ValidarFormatos.validarPrecio(incilindrada.getText());
        if (Login.getUsuarioLogueado().equals("admin")) {
            if (caballosValidos == true && precioValido == true && cilindradaValida == true) { // si se cumplen que todos los datos esten validados correctamente 
                incaballos.setForeground(Color.black); // marcamos que todos los campos tengan color de letra negra, porque si se introducieron datos erroneos antes, el color que aparece es rojo 
                incilindrada.setForeground(Color.black);
                inprecio.setForeground(Color.black);

                String modelo = inmodelo.getText(); // guardamos en una variable cada uno de los campos que introducimos en la interfaz 
                String motor = (String) inmotor.getSelectedItem();
                String cilindrada = incilindrada.getText();
                String caballos = incaballos.getText();
                Float precio = Float.parseFloat(inprecio.getText());

                GestionVentas.anadirVenta(modelo, precio, motor, cilindrada, caballos); // llamamos al metodo añadir ventas para poder insertar un coche en venta 

                inmodelo.setText(""); // una vez ya insertamos el coche marcamos todos los campos de entrada de texto en blanco 
                incilindrada.setText("");
                incaballos.setText("");
                inprecio.setText("");

                //Borramos contanido anterior de la tabla
                GestionTabla.borrarTabla(tabla);

                //Recibimos los coches encontrados
                enventa = Ficheros.ventas;

                mostrarTabla();
            } else { // en caso de que no se cumpla que los campos no esten validados con exito 
                JOptionPane.showMessageDialog(null, "datos erroneos"); // mostramos un mensaje de error al usuario 
                if (caballosValidos == false) {
                    incaballos.setForeground(Color.red); // en caso de que este mal validado marcamos el campo con letra de color rojo 
                } else {
                    incaballos.setForeground(Color.black); // en caso contrario ponemos la letra en negro, por si en un intento anterior se haya puesto en rojo 
                }
                if (cilindradaValida == false) {
                    incilindrada.setForeground(Color.red);
                } else {
                    incilindrada.setForeground(Color.black);
                }
                if (precioValido == false) {
                    inprecio.setForeground(Color.red);
                } else {
                    inprecio.setForeground(Color.black);
                }

            }
        } else { // en caso de que el usuario que intenta realizar la operacion no tenga permisos suficientes 
            JOptionPane.showMessageDialog(null, "No tienes permisos para realizar esta operación", "Error", 0); // mostramos un mensaje de error
            inmodelo.setText(""); // y ponemos de nuevo todos los campos en blanco 
            incilindrada.setText("");
            incaballos.setText("");
            inprecio.setText("");
        }

    }//GEN-LAST:event_bañadirMouseClicked

    /**
     * Botón para borrar un coche de las ventas.
     *
     * @param evt
     */
    private void bborrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bborrarMouseClicked

        if (Login.getUsuarioLogueado().equals("admin")) {
             eliminar = tablabusqueda.getSelectedRow();
            if (eliminar >= 0) {
                boolean correcto = GestionVentas.borrarVenta(eliminar, false);
                if(correcto==true){
                    GestionTabla.borrarTabla(tabla);
                    mostrarTabla();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No tienes permisos para realizar esta operación", "Error", 0);
        }
    }//GEN-LAST:event_bborrarMouseClicked
    /**
     * Botón para vender un coche.
     * @param evt 
     */
    private void bvenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bvenderMouseClicked
        eliminar = tablabusqueda.getSelectedRow();
        if (eliminar >= 0) {

            ClientesVentas clienteventas = new ClientesVentas();

        } else {
            System.out.println("errror");
        }
    }//GEN-LAST:event_bvenderMouseClicked

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
            java.util.logging.Logger.getLogger(VentaCoches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaCoches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaCoches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaCoches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaCoches().setVisible(true);
            }
        });
    }
    
    /**
     * Método que muestra la tabla actualizada
     */
    private void mostrarTabla() {
        for (Venta elemento : enventa) {
            String anadir[] = new String[5];
            anadir[0] = elemento.getModelo();
            anadir[1] = elemento.getPrecio().toString();
            anadir[2] = elemento.getMotor();
            anadir[3] = elemento.getCilindrada();
            anadir[4] = elemento.getCaballos();
            tabla.addRow(anadir);
        }
        this.tablabusqueda.setModel(tabla);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel batras;
    private javax.swing.JLabel bañadir;
    private javax.swing.JLabel bborrar;
    private javax.swing.JLabel bvender;
    private javax.swing.JTextField incaballos;
    private javax.swing.JTextField incilindrada;
    private javax.swing.JTextField inmodelo;
    private javax.swing.JComboBox<String> inmotor;
    private javax.swing.JTextField inprecio;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablabusqueda;
    private javax.swing.JLabel titulousuarios;
    private javax.swing.JLabel titulousuarios1;
    private javax.swing.JLabel titulousuarios2;
    // End of variables declaration//GEN-END:variables
}
