/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Point;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kontrol.kontrol_user;


/**
 *
 * @author Hendra Rusdiyanto
 */
public class login extends javax.swing.JFrame {
    kontrol_user k;
    int x,y;
    Point point = new Point();
    
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        k = new kontrol_user();
       
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        target = new javax.swing.JLabel();
        keluar = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Sistem");
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        target.setBackground(new java.awt.Color(0, 0, 0));
        target.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        target.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        target.setText("Login");
        panel.add(target, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 460, -1));

        keluar.setBackground(new java.awt.Color(255, 255, 255));
        keluar.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        keluar.setText("X");
        keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keluarMouseClicked(evt);
            }
        });
        panel.add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 30, 10));

        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtuserKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtuserKeyReleased(evt);
            }
        });
        panel.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 320, 30));

        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpassKeyReleased(evt);
            }
        });
        panel.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 320, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("Username :");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("Password :");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        lblLogin.setBackground(new java.awt.Color(0, 0, 255));
        lblLogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("Masuk");
        lblLogin.setOpaque(true);
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLoginMouseExited(evt);
            }
        });
        lblLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblLoginKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(289, Short.MAX_VALUE)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void keluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_keluarMouseClicked

    private void txtuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserKeyPressed

    private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassKeyPressed

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_lblLoginMouseClicked

    private void lblLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblLoginKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_lblLoginKeyPressed

    private void txtuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyReleased
        // TODO add your handling code here:
        if(!txtuser.getText().equalsIgnoreCase("")){
            target.setText(txtuser.getText());
        } else {
            target.setText("LOGIN");
        }
    }//GEN-LAST:event_txtuserKeyReleased

    private void txtpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassKeyReleased

    private void lblLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseEntered
        // TODO add your handling code here:
        lblLogin.setBackground(new java.awt.Color(0,153,255));
    }//GEN-LAST:event_lblLoginMouseEntered

    private void lblLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseExited
        // TODO add your handling code here:
        lblLogin.setBackground(new java.awt.Color(0,102,153));
    }//GEN-LAST:event_lblLoginMouseExited

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel keluar;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel target;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables

private void login () {

    Utama u = new Utama();
    ResultSet rs;
    
    if(txtuser.getText().isEmpty() || txtpass.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane,"Username / Password harus diisi !","Peringatan",JOptionPane.WARNING_MESSAGE);
        txtuser.requestFocus();
    } else {
        
        String username = txtuser.getText();
        String password = txtpass.getText();
        
        try {
            rs = k.setlogin(username, password);
            if (rs.next()) {
                u.setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(rootPane,"Username / Password tidak terdaftar","Peringatan",JOptionPane.WARNING_MESSAGE);
                txtuser.setText(null);
                txtpass.setText(null);
                txtuser.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

}



}

