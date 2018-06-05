package com.tallerplus.interfaz;

import com.tallerplus.gestion.GestionCitas;
import com.tallerplus.gestion.GestionTabla;
import com.tallerplus.objetos.Cita;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que gestiona la ventana Ver Citas. Tiene un formulario para buscarlas
 * por fecha o matrícula. Permite cambiar el estado. Contiene una tabla que
 * muestra las citas no cerradas o finalizadas. Cierra el programa al presionar
 * el botón cerrar.
 *
 * @author dani_
 */
public class VerCitas extends javax.swing.JFrame{

    ArrayList<Cita> encontradas=new ArrayList();
    DefaultTableModel tabla=new DefaultTableModel();
    GestionCitas cita=new GestionCitas();

    /**
     * Constructor que inicializa los componentes, centra la ventana, la hace
     * visible y evita que sea redimensionable. Inicializa el contenido de la
     * tabla.
     */
    public VerCitas(){
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        //Cambiamos icono
        ImageIcon ImageIcon=new ImageIcon(getClass().getResource("/com/tallerplus/icon/LogoT+.png"));
        Image Image=ImageIcon.getImage();
        this.setIconImage(Image);
        cita.select();
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
        bbuscarfecha = new javax.swing.JLabel();
        inmatricula = new javax.swing.JTextField();
        bbuscarmatricula = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablabusqueda = new javax.swing.JTable();
        inestado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        botoncombo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelfechahora = new javax.swing.JLabel();
        combodia = new javax.swing.JComboBox<>();
        combomes = new javax.swing.JComboBox<>();
        comboano = new javax.swing.JComboBox<>();
        combohora = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Citas");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));

        pbucita.setBackground(new java.awt.Color(109, 132, 180));

        batras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/flecha-hacia-la-izquierda.png"))); // NOI18N
        batras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        batras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batrasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                batrasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                batrasMouseEntered(evt);
            }
        });

        titulousuarios.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulousuarios.setForeground(new java.awt.Color(255, 255, 255));
        titulousuarios.setText("Citas");

        bbuscarfecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/busqueda-p.png"))); // NOI18N
        bbuscarfecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bbuscarfecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bbuscarfechaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bbuscarfechaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bbuscarfechaMouseEntered(evt);
            }
        });

        inmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inmatriculaActionPerformed(evt);
            }
        });

        bbuscarmatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/busqueda-p.png"))); // NOI18N
        bbuscarmatricula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bbuscarmatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bbuscarmatriculaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bbuscarmatriculaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bbuscarmatriculaMouseEntered(evt);
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
        botoncombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoncombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoncomboMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botoncomboMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botoncomboMouseEntered(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Búsqueda por matrícula");

        labelfechahora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelfechahora.setForeground(new java.awt.Color(255, 255, 255));
        labelfechahora.setText("Fecha y Hora");

        combodia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        combomes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octuble", "Noviembre", "Diciembre" }));

        comboano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038" }));

        combohora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00", "09:15", "09:30", "09:45", "10:00", "10:15", "10:30", "10:45", "11:00", "11:15", "11:30", "11:45", "12:00", "12:15", "12:30", "12:45", "13:00", "13:15", "13:30", "13:45", "14:00", "14:15", "14:30", "15:45", "16:00", "16:15", "16:30", "16:45", "17:00", "17:15", "17:30", "18:45", "19:00", "19:15", "19:30", "20:45", "21:00", "22:15", "23:30", "23:45", "00:00", "00:15", "00:30", "00:45", "01:00", "01:15", "01:30", "01:45", "02:00", "02:15", "02:30", "02:45", "03:00", "03:15", "03:30", "03:45", "04:00", "04:15", "04:30", "04:45", "05:00", "05:15", "05:30", "05:45", "06:00", "06:15", "06:30", "06:45", "07:00", "07:15", "07:30", "07:45", "08:00", "08:15", "08:30", "08:45" }));

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
                            .addGroup(pbucitaLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(inmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelfechahora, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pbucitaLayout.createSequentialGroup()
                                .addGroup(pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(combohora, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pbucitaLayout.createSequentialGroup()
                                        .addComponent(combodia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(combomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(53, Short.MAX_VALUE))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pbucitaLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(labelfechahora)
                                .addGap(18, 18, 18)
                                .addGroup(pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pbucitaLayout.createSequentialGroup()
                                        .addGroup(pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(combodia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(combohora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bbuscarfecha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pbucitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bbuscarmatricula, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbucitaLayout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inestado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
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
    /**
     * Botón que devuelve al usuario a la pantalla principal.
     *
     * @param evt
     */
    private void batrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batrasMouseClicked
        VentanaPrincipal venanaprincipal=new VentanaPrincipal();
        dispose();
    }//GEN-LAST:event_batrasMouseClicked

   /**
     * Campo de texto para introducir la matrícula.
     *
     * @param evt
     */
    private void inmatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inmatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inmatriculaActionPerformed
    /**
     * Botón búsqueda por fecha
     *
     * @param evt
     */
    private void bbuscarfechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbuscarfechaMouseClicked

        String fechaHora;
        
        switch((String)combomes.getSelectedItem()){
            case "Enero":
                fechaHora=(String) combodia.getSelectedItem()+"/"+0+1+"/"+comboano.getSelectedItem()+" "+combohora.getSelectedItem();
                break;
            case "Febrero":
                fechaHora=(String) combodia.getSelectedItem()+"/"+0+2+"/"+comboano.getSelectedItem()+" "+combohora.getSelectedItem();
                break;
            case "Marzo":
                fechaHora=(String) combodia.getSelectedItem()+"/"+0+3+"/"+comboano.getSelectedItem()+" "+combohora.getSelectedItem();
                break;
            case "Abril":
                fechaHora=(String) combodia.getSelectedItem()+"/"+0+4+"/"+comboano.getSelectedItem()+" "+combohora.getSelectedItem();
                break;
            case "Mayo":
                fechaHora=(String) combodia.getSelectedItem()+"/"+0+5+"/"+comboano.getSelectedItem()+" "+combohora.getSelectedItem();
                break;  
            case "Junio":
                fechaHora=(String) combodia.getSelectedItem()+"/"+0+6+"/"+comboano.getSelectedItem()+" "+combohora.getSelectedItem();
                break;
            case "Julio":
                fechaHora=(String) combodia.getSelectedItem()+"/"+0+7+"/"+comboano.getSelectedItem()+" "+combohora.getSelectedItem();
                break;
            case "Agosto":
                fechaHora=(String) combodia.getSelectedItem()+"/"+0+8+"/"+comboano.getSelectedItem()+" "+combohora.getSelectedItem();
                break;
            case "Septiembre":
                fechaHora=(String) combodia.getSelectedItem()+"/"+0+9+"/"+comboano.getSelectedItem()+" "+combohora.getSelectedItem();
                break;
            case "Octubre":
                fechaHora=(String) combodia.getSelectedItem()+"/"+10+"/"+comboano.getSelectedItem()+" "+combohora.getSelectedItem();
                break;
            case "Noviembre":
                fechaHora=(String) combodia.getSelectedItem()+"/"+11+"/"+comboano.getSelectedItem()+" "+combohora.getSelectedItem();
                break;
            default:
                fechaHora=(String) combodia.getSelectedItem()+"/"+12+"/"+comboano.getSelectedItem()+" "+combohora.getSelectedItem();
                break;
        }

        cita.consultarCitaFecha(fechaHora);
        mostrarTabla();
    }//GEN-LAST:event_bbuscarfechaMouseClicked
    /**
     * Botón búsqueda por matrícula
     *
     * @param evt
     */
    private void bbuscarmatriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbuscarmatriculaMouseClicked

        String matricula=inmatricula.getText();

        //Recibimos la citas encontradas
        cita.consultarCitaMatricula(matricula);
        mostrarTabla();
        inmatricula.setText("");
    }//GEN-LAST:event_bbuscarmatriculaMouseClicked
    /**
     * Combobox para cambiar el estado de una cita seleccionada en la tabla.
     *
     * @param evt
     */
    private void inestadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inestadoMouseClicked

    }//GEN-LAST:event_inestadoMouseClicked
    /**
     * Botón que confirma el cambio de estado de la cita seleccionada por el
     * estado seleccionado en el combobox. Actualiza la tabla.
     *
     * @param evt
     */
    private void botoncomboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoncomboMouseClicked
        int seleccion=tablabusqueda.getSelectedRow();
        if(seleccion>=0){
            String estado=(String) inestado.getSelectedItem();
            String matricula=encontradas.get(seleccion).getMatricula();
            String fechahora=encontradas.get(seleccion).getFechaHora();
            cita.modificarEstado(matricula, fechahora, estado);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una cita", "Error", 0);
        }

        mostrarTabla();
    }//GEN-LAST:event_botoncomboMouseClicked

    private void bbuscarfechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbuscarfechaMouseEntered

            bbuscarfecha.setLocation(bbuscarfecha.getX(),bbuscarfecha.getY()+5);          
    }//GEN-LAST:event_bbuscarfechaMouseEntered

    private void bbuscarfechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbuscarfechaMouseExited

            bbuscarfecha.setLocation(bbuscarfecha.getX(),bbuscarfecha.getY()-5);          
    }//GEN-LAST:event_bbuscarfechaMouseExited

    private void bbuscarmatriculaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbuscarmatriculaMouseEntered

            bbuscarmatricula.setLocation(bbuscarmatricula.getX(),bbuscarmatricula.getY()+5);          
    }//GEN-LAST:event_bbuscarmatriculaMouseEntered

    private void bbuscarmatriculaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbuscarmatriculaMouseExited

            bbuscarmatricula.setLocation(bbuscarmatricula.getX(),bbuscarmatricula.getY()-5);          
    }//GEN-LAST:event_bbuscarmatriculaMouseExited

    private void botoncomboMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoncomboMouseEntered

            botoncombo.setLocation(botoncombo.getX(),botoncombo.getY()+5);          
    }//GEN-LAST:event_botoncomboMouseEntered

    private void botoncomboMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoncomboMouseExited

            botoncombo.setLocation(botoncombo.getX(),botoncombo.getY()-5);          
    }//GEN-LAST:event_botoncomboMouseExited

    private void batrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batrasMouseEntered

            batras.setLocation(batras.getX(),batras.getY()+5);          
    }//GEN-LAST:event_batrasMouseEntered

    private void batrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batrasMouseExited

            batras.setLocation(batras.getX(),batras.getY()-5);          
    }//GEN-LAST:event_batrasMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(VerCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(InstantiationException ex){
            java.util.logging.Logger.getLogger(VerCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(IllegalAccessException ex){
            java.util.logging.Logger.getLogger(VerCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(VerCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display thbbuscarfecha*/
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new VerCitas().setVisible(true);
            }
        });
    }

    /**
     * Método que muestra en la tabla todas las citas pendientes y en proceso.
     */
    private void mostrarTabla(){
        GestionTabla.borrarTabla(tabla);
        encontradas.clear();
        for(Cita elemento : cita.citas){
            if((elemento.getEstado().equalsIgnoreCase("pendiente")||elemento.getEstado().equalsIgnoreCase("en proceso"))){
                String anadir[]=new String[5];
                anadir[0]=elemento.getMatricula();
                anadir[1]=elemento.getFechaHora();
                anadir[2]=elemento.getDescripcion();
                anadir[3]=Float.toString(elemento.getPrecio());
                anadir[4]=elemento.getEstado();
                encontradas.add(new Cita(anadir[0], anadir[1], anadir[2], Float.parseFloat(anadir[3]), anadir[4]));

            }
        }
        
        Collections.sort(encontradas);

        for(Cita elemento : encontradas){
            String anadir[]=new String[5];
            anadir[0]=elemento.getMatricula();
            anadir[1]=elemento.getFechaHora();
            anadir[2]=elemento.getDescripcion();
            anadir[3]=Float.toString(elemento.getPrecio());
            anadir[4]=elemento.getEstado();
            tabla.addRow(anadir);
        }

        this.tablabusqueda.setModel(tabla);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel batras;
    private javax.swing.JLabel bbuscarfecha;
    private javax.swing.JLabel bbuscarmatricula;
    private javax.swing.JLabel botoncombo;
    private javax.swing.JComboBox<String> comboano;
    private javax.swing.JComboBox<String> combodia;
    private javax.swing.JComboBox<String> combohora;
    private javax.swing.JComboBox<String> combomes;
    private javax.swing.JComboBox<String> inestado;
    private javax.swing.JTextField inmatricula;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelfechahora;
    private javax.swing.JPanel pbucita;
    private javax.swing.JTable tablabusqueda;
    private javax.swing.JLabel titulousuarios;
    // End of variables declaration//GEN-END:variables
}
