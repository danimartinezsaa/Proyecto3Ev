package com.tallerplus.interfaz;

import VentanasEmergentes.Mensajes;
import com.tallerplus.gestion.GestionTabla;
import com.tallerplus.gestion.GestionUsuarios;
import com.tallerplus.objetos.Usuario;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que gestiona la ventana de Usuarios, contiene un formulario para
 * añadir, editar o borrar usuarios y una tabla que muestra el contenido del
 * ArrayList Ficheros.usuarios. Cierra el programa al presionar el botón cerrar.
 *
 * @author dani_
 */
public class Usuarios extends javax.swing.JFrame{

    DefaultTableModel tabla=new DefaultTableModel();
    boolean edicion=false;
    String usuario_editar;
    GestionUsuarios us=new GestionUsuarios();

    /**
     * Constructor que inicializa los componentes, centra la ventana, evita
     * redimensionarla y la hace visible. Inicializa el contenido de la tabla.
     */
    public Usuarios(){
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        edicion=false;
        //Cambiamos icono
        ImageIcon ImageIcon=new ImageIcon(getClass().getResource("/com/tallerplus/icon/LogoT+.png"));
        Image Image=ImageIcon.getImage();
        this.setIconImage(Image);
        //Columnas de la tabla
        tabla.addColumn("Usuario");
        tabla.addColumn("Contraseña");
        tabla.addColumn("Tipo");
        //Filas de la tabla
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablausuarios = new javax.swing.JTable();
        titulousuarios = new javax.swing.JLabel();
        bborrarusuario = new javax.swing.JLabel();
        beditarusuario = new javax.swing.JLabel();
        banadirusuario = new javax.swing.JLabel();
        inusuario = new javax.swing.JTextField();
        incontrasena = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combotipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuarios");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));

        jPanel1.setBackground(new java.awt.Color(109, 132, 180));

        batras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/flecha-hacia-la-izquierda.png"))); // NOI18N
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

        tablausuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablausuarios.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tablausuarios);
        tablausuarios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        titulousuarios.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulousuarios.setForeground(new java.awt.Color(255, 255, 255));
        titulousuarios.setText("Usuarios");

        bborrarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/002-usuario-1.png"))); // NOI18N
        bborrarusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bborrarusuarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bborrarusuarioMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bborrarusuarioMouseEntered(evt);
            }
        });

        beditarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/001-usuario-2.png"))); // NOI18N
        beditarusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                beditarusuarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                beditarusuarioMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                beditarusuarioMouseEntered(evt);
            }
        });

        banadirusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/003-usuario.png"))); // NOI18N
        banadirusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                banadirusuarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                banadirusuarioMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                banadirusuarioMouseEntered(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");

        combotipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mecanico", "recepcion", "admin" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulousuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(batras))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(banadirusuario)
                                .addGap(18, 18, 18)
                                .addComponent(beditarusuario)
                                .addGap(18, 18, 18)
                                .addComponent(bborrarusuario))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(combotipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 131, Short.MAX_VALUE)
                                .addComponent(incontrasena, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titulousuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batras))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(incontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(beditarusuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bborrarusuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(banadirusuario, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Botón que devuelve al usuario a la ventana principal.
     *
     * @param evt
     */
    private void batrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batrasMouseClicked
        VentanaPrincipal venanaprincipal=new VentanaPrincipal();
        dispose();
    }//GEN-LAST:event_batrasMouseClicked
    /**
     * Botón añadir usuario. Añade un nuevo usuario y confirma la acción de
     * editar un usuario existente. Refresca la tabla.
     *
     * @param evt
     */
    private void banadirusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banadirusuarioMouseClicked
        if(edicion==false){
            if(!inusuario.getText().equals("")||!incontrasena.getText().equals("")){
                String anadir[]=new String[3];
                anadir[0]=inusuario.getText();
                anadir[1]=incontrasena.getText();
                anadir[2]=(String) combotipo.getSelectedItem();
                boolean repetido=us.anadirUsuario(anadir[0], anadir[1], anadir[2]);
                if(repetido==false){
                    mostrarTabla();
                }
            }else{
                Mensajes.ventanaError("Debes cubrir todos los campos.", "Error.");
            }
        }else{
            if(usuario_editar.equalsIgnoreCase("admin")){
                us.editarUsuario(usuario_editar, "admin", incontrasena.getText(), "admin");
                JOptionPane.showMessageDialog(null, "Al usuario Admin sólo se le puede cambiar la contraseña, contraseña cambiada", "Información", 1);
            }else{
                us.editarUsuario(usuario_editar, inusuario.getText(), incontrasena.getText(), (String) combotipo.getSelectedItem());
            }

            edicion=false;
        }
        inusuario.setText("");
        incontrasena.setText("");

        //Filas de la tabla
        mostrarTabla();
    }//GEN-LAST:event_banadirusuarioMouseClicked
    /**
     * Botón para eliminar un usuario.
     *
     * @param evt
     */
    private void bborrarusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bborrarusuarioMouseClicked
        if(edicion==false){
            int eliminart=tablausuarios.getSelectedRow();
            int eliminarc=tablausuarios.getSelectedColumn();
            String usuario=String.valueOf(tabla.getValueAt(tablausuarios.getSelectedRow(), 0));
            if(eliminart>=0){

                int confirmado=JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar este usuario?");
                if(confirmado==YES_OPTION){
                    boolean correcto=us.borrarUsuario(usuario);
                    if(correcto!=false){
                        mostrarTabla();
                    }
                }
            }else{
                Mensajes.ventanaError("No hay usuarios para eliminar.", "Error.");
            }
        }else{
            Mensajes.ventanaError("No puedes borrar a un usuario mientras editas.", "Usuarios.");
        }
    }//GEN-LAST:event_bborrarusuarioMouseClicked
    /**
     * Botón editar usuario, saca los datos al formulario para añadirlo con los
     * nuevos.
     *
     * @param evt
     */
    private void beditarusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beditarusuarioMouseClicked
        int editar=tablausuarios.getSelectedRow();
        if(editar>=0){
            inusuario.setText(tablausuarios.getValueAt(editar, 0).toString());
            incontrasena.setText(tablausuarios.getValueAt(editar, 1).toString());
            if(tablausuarios.getValueAt(editar, 2).equals("admin")){
                combotipo.setSelectedIndex(2);
            }else if(tablausuarios.getValueAt(editar, 2).equals("recepcion")){
                combotipo.setSelectedIndex(1);
            }else{
                combotipo.setSelectedIndex(0);
            }
            usuario_editar=tablausuarios.getValueAt(editar, 0).toString();
            edicion=true;
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un usuario", "Error", 1);
        }
    }//GEN-LAST:event_beditarusuarioMouseClicked

    private void banadirusuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banadirusuarioMouseEntered
        for(int i=0;i<=5;i++){
            banadirusuario.setLocation(banadirusuario.getX(),banadirusuario.getY()+1);          
        }
    }//GEN-LAST:event_banadirusuarioMouseEntered

    private void banadirusuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banadirusuarioMouseExited
        for(int i=0;i<=5;i++){
            banadirusuario.setLocation(banadirusuario.getX(),banadirusuario.getY()-1);          
        }
    }//GEN-LAST:event_banadirusuarioMouseExited

    private void beditarusuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beditarusuarioMouseEntered
        for(int i=0;i<=5;i++){
            beditarusuario.setLocation(beditarusuario.getX(),beditarusuario.getY()+1);          
        }
    }//GEN-LAST:event_beditarusuarioMouseEntered

    private void beditarusuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beditarusuarioMouseExited
        for(int i=0;i<=5;i++){
            beditarusuario.setLocation(beditarusuario.getX(),beditarusuario.getY()-1);          
        }
    }//GEN-LAST:event_beditarusuarioMouseExited

    private void bborrarusuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bborrarusuarioMouseEntered
        for(int i=0;i<=5;i++){
            bborrarusuario.setLocation(bborrarusuario.getX(),bborrarusuario.getY()+1);          
        }
    }//GEN-LAST:event_bborrarusuarioMouseEntered

    private void bborrarusuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bborrarusuarioMouseExited
        for(int i=0;i<=5;i++){
            bborrarusuario.setLocation(bborrarusuario.getX(),bborrarusuario.getY()-1);          
        }
    }//GEN-LAST:event_bborrarusuarioMouseExited

    private void batrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batrasMouseEntered
        for(int i=0;i<=5;i++){
            batras.setLocation(batras.getX(),batras.getY()+1);          
        }
    }//GEN-LAST:event_batrasMouseEntered

    private void batrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batrasMouseExited
        for(int i=0;i<=5;i++){
            batras.setLocation(batras.getX(),batras.getY()-1);          
        }
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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(InstantiationException ex){
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(IllegalAccessException ex){
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Usuarios().setVisible(true);
            }
        });
    }

    /**
     * Clase que muestra el contenido de la tabla actualizado.
     */
    private void mostrarTabla(){
        GestionTabla.borrarTabla(tabla);
        for(Usuario elemento : us.usuarios){
            String anadir[]=new String[3];
            anadir[0]=elemento.getUsuario();
            anadir[1]=elemento.getContrasena();
            anadir[2]=elemento.getTipo();
            tabla.addRow(anadir);
        }
        this.tablausuarios.setModel(tabla);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banadirusuario;
    private javax.swing.JLabel batras;
    private javax.swing.JLabel bborrarusuario;
    private javax.swing.JLabel beditarusuario;
    private javax.swing.JComboBox<String> combotipo;
    private javax.swing.JTextField incontrasena;
    private javax.swing.JTextField inusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablausuarios;
    private javax.swing.JLabel titulousuarios;
    // End of variables declaration//GEN-END:variables
}
