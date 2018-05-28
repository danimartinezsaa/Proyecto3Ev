package com.tallerplus.interfaz;

import com.tallerplus.gestion.GestionUsuarios;
import com.tallerplus.gestion.Login;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 * Clase que gestiona la ventana para introducir el usuario y la contraseña,
 * contiene un formulario. Cierra el programa al presionar el botón cerrar.
 *
 * @author dani_
 */
public class LoginUsers extends javax.swing.JFrame {

    /**
     * Constructor que inicializa componentes, centra la ventana, evita
     * redimensionarla y la hace visible. Se activa la escucha activa en los
     * campos de texto y el botón para enviar el formulario si se pulsa la tecla
     * ENTER.
     */
    public LoginUsers() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        entrar.addKeyListener(new PresionarTecla()); // escuchador en el boton entrar para poder utilizar el enter indistantemente del mouse click, cuando estemos sobre el boton
        inusuario.addKeyListener(new PresionarTecla());// escuchador para que funcione el boton intro cuando estemos dentro de insertar usuario
        incontrasena.addKeyListener(new PresionarTecla()); // escuchador para cuando estemos ubicados en insertar contraseña
        //Cambiamos icono
        ImageIcon ImageIcon = new ImageIcon(getClass().getResource("/com/tallerplus/icon/LogoT+.png"));
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panellogin = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        inusuario = new javax.swing.JTextField();
        incontrasena = new javax.swing.JPasswordField();
        entrar = new javax.swing.JButton();
        fusuario = new javax.swing.JLabel();
        labelusuario = new javax.swing.JLabel();
        labelcontraseña = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setIconImage(getIconImage());

        panellogin.setBackground(new java.awt.Color(109, 132, 180));

        jPanel2.setBackground(new java.awt.Color(109, 132, 180));

        inusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inusuarioActionPerformed(evt);
            }
        });

        entrar.setText("Enviar");
        entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarMouseClicked(evt);
            }
        });
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });

        fusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/social.png"))); // NOI18N

        labelusuario.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario.setText("Usuario:");

        labelcontraseña.setForeground(new java.awt.Color(255, 255, 255));
        labelcontraseña.setText("Contraseña:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(entrar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelusuario)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(incontrasena)
                            .addComponent(inusuario)
                            .addComponent(fusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(labelcontraseña)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fusuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(labelusuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(labelcontraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(incontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(entrar)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout panelloginLayout = new javax.swing.GroupLayout(panellogin);
        panellogin.setLayout(panelloginLayout);
        panelloginLayout.setHorizontalGroup(
            panelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelloginLayout.setVerticalGroup(
            panelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panellogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panellogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Campo de texto para introducir el usuario.
     *
     * @param evt
     */
    private void inusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inusuarioActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrarActionPerformed

    /**
     * Botón que recoge la información del formulario de Login y cierra la
     * ventana si los datos son correctos..
     *
     * @param evt
     */
    private void entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseClicked

        //Guardo usuario y contraseña
        String contrasena = new String(incontrasena.getPassword());
        String usuario = new String(inusuario.getText());
        //Lo mando al método que lo gestiona en la clase Login.
        boolean correcto = Login.comprobarUsuario(usuario, contrasena, GestionUsuarios.usuarios);
        if (correcto == true) //Si el usuario y la contraseña son correctos cierro ventana login.
        {
            dispose();
        }
    }//GEN-LAST:event_entrarMouseClicked
    /**
     * InnerClass para que lanze la función entrarMouseClicked si se presiona la
     * tecla Enter.
     */
    public class PresionarTecla extends KeyAdapter { // inner class para poder usar el enter en el boton enviar

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                entrarMouseClicked(null);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(LoginUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrar;
    private javax.swing.JLabel fusuario;
    private javax.swing.JPasswordField incontrasena;
    private javax.swing.JTextField inusuario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelcontraseña;
    private javax.swing.JLabel labelusuario;
    private javax.swing.JPanel panellogin;
    // End of variables declaration//GEN-END:variables
}
