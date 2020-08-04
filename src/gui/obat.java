/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import kontrol.kontrol_obat;

/**
 *
 * @author Hendra Rusdiyanto
 */
public class obat extends javax.swing.JInternalFrame {
    kontrol_obat k;
    String idobat,namaobat,kategori, komposisi, dosis, aturanpakai, qty, harga;
            
    /**
     * Creates new form user
     */
    public obat() {
        initComponents();
        k = new kontrol_obat();
        tampildata();
        setobjek(false);
        baru.setEnabled(true);
        update.setEnabled(false);
        simpan.setEnabled(false);
        hapus.setEnabled(false);
        edit.setEnabled(false);
        canceledit.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtidobat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnamaobat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbobat = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        baru = new javax.swing.JButton();
        update = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        canceledit = new javax.swing.JButton();
        peringatan = new javax.swing.JLabel();
        txtkomposisi = new javax.swing.JTextField();
        txtdosis = new javax.swing.JTextField();
        txtaturanpakai = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtkategori = new javax.swing.JTextField();
        hapus = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Input Data Obat");

        jLabel2.setText("ID Obat          ");

        jLabel3.setText("Nama Obat      ");

        jLabel4.setText("Kategori          ");

        tbobat.setBackground(new java.awt.Color(204, 204, 204));
        tbobat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Obat", "Nama Obat", "Kategori", "Komposisi", "Dosis", "Aturan Pakai", "Harga"
            }
        ));
        tbobat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbobatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbobat);

        jLabel7.setText("| List Obat");

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        baru.setText("Baru");
        baru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baruActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        canceledit.setText("Cancel Edit");
        canceledit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceleditActionPerformed(evt);
            }
        });

        txtkomposisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkomposisiActionPerformed(evt);
            }
        });
        txtkomposisi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtkomposisiKeyTyped(evt);
            }
        });

        txtdosis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdosisKeyTyped(evt);
            }
        });

        txtaturanpakai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtaturanpakaiKeyTyped(evt);
            }
        });

        txtharga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthargaKeyTyped(evt);
            }
        });

        jLabel5.setText("Komposisi        ");

        jLabel6.setText("Dosis               ");

        jLabel8.setText("Aturan Pakai   ");

        jLabel10.setText("Harga              ");

        txtkategori.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtkategoriKeyTyped(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnamaobat, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidobat, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(284, 284, 284))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(canceledit))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(baru)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(update)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(simpan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(hapus)))
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(337, 337, 337)
                                        .addComponent(peringatan))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtkomposisi, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtdosis, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtaturanpakai, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnamaobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(peringatan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtkomposisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaturanpakai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baru)
                    .addComponent(update)
                    .addComponent(simpan)
                    .addComponent(hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit)
                    .addComponent(canceledit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        hapusdata();
        baru.setEnabled(true);
        simpan.setEnabled(false);
        hapus.setEnabled(false);
        update.setEnabled(false);
        edit.setEnabled(false);
        canceledit.setVisible(false);
    }//GEN-LAST:event_hapusActionPerformed

    private void txtkategoriKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkategoriKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkategoriKeyTyped

    private void txthargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthargaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaKeyTyped

    private void txtaturanpakaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaturanpakaiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaturanpakaiKeyTyped

    private void txtdosisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdosisKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdosisKeyTyped

    private void txtkomposisiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkomposisiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkomposisiKeyTyped

    private void txtkomposisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkomposisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkomposisiActionPerformed

    private void canceleditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceleditActionPerformed
        // TODO add your handling code here:
        baru();
        baru.setEnabled(true);
        update.setEnabled(false);
        simpan.setEnabled(false);
        hapus.setEnabled(false);
        edit.setEnabled(false);
    }//GEN-LAST:event_canceleditActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        setobjek(true);
        edit.setVisible(true);
        update.setEnabled(true);
        simpan.setEnabled(false);
        hapus.setEnabled(false);
        baru.setEnabled(false);
        canceledit.setVisible(true);
        txtidobat.setEnabled(false);
    }//GEN-LAST:event_editActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        updatedata();
        update.setEnabled(true);
        edit.setEnabled(false);
        simpan.setEnabled(false);
        hapus.setEnabled(false);
        baru.setEnabled(true);
        canceledit.setVisible(false);
    }//GEN-LAST:event_updateActionPerformed

    private void baruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baruActionPerformed
        // TODO add your handling code here:
        setobjek(true);
        baru();
        txtidobat.requestFocus();
        simpan.setEnabled(true);
        update.setEnabled(false);
        edit.setEnabled(false);
        hapus.setEnabled(false);
        update.setEnabled(false);
        canceledit.setVisible(false);
    }//GEN-LAST:event_baruActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        simpandata();
        baru.setEnabled(true);
        simpan.setEnabled(true);
        hapus.setEnabled(false);
        update.setEnabled(false);
        edit.setEnabled(false);
        canceledit.setVisible(false);
    }//GEN-LAST:event_simpanActionPerformed

    private void tbobatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbobatMouseClicked
        // TODO add your handling code here:
        setformtable();
        baru.setEnabled(true);
        edit.setEnabled(true);
        hapus.setEnabled(true);
        update.setEnabled(false);
        simpan.setEnabled(false);
        canceledit.setVisible(false);
    }//GEN-LAST:event_tbobatMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baru;
    private javax.swing.JButton canceledit;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel peringatan;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tbobat;
    private javax.swing.JTextField txtaturanpakai;
    private javax.swing.JTextField txtdosis;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtidobat;
    private javax.swing.JTextField txtkategori;
    private javax.swing.JTextField txtkomposisi;
    private javax.swing.JTextField txtnamaobat;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
private void simpandata() {
        idobat = txtidobat.getText();
        namaobat = txtnamaobat.getText();
        kategori = txtkategori.getText();
        komposisi = txtkomposisi.getText();
        dosis = txtdosis.getText();
        aturanpakai = txtaturanpakai.getText();
        harga = txtharga.getText();
        
        if (txtidobat.getText().isEmpty() || txtnamaobat.getText().isEmpty() || txtkategori.getText().isEmpty()) {
          JOptionPane.showMessageDialog(rootPane,"data harus diisi","informasi",JOptionPane.INFORMATION_MESSAGE);
        } else {
        k.simpandata(idobat,namaobat,kategori,komposisi,dosis,aturanpakai,harga);
        JOptionPane.showMessageDialog(rootPane,"Data berhasil disimpan","Informasi",JOptionPane.INFORMATION_MESSAGE);
        tampildata();
        baru();
        setobjek(false);
        }
        
}

private void tampildata () {
    DefaultTableModel dtm = (DefaultTableModel) tbobat.getModel();
    dtm.setRowCount(0);
    k.tampildata(dtm);
    tbobat.setModel(dtm);
}

private void setformtable() {
     txtidobat.setText(tbobat.getValueAt(tbobat.getSelectedRow(), 0).toString());
     txtnamaobat.setText(tbobat.getValueAt(tbobat.getSelectedRow(), 1).toString());
     txtkategori.setText(tbobat.getValueAt(tbobat.getSelectedRow(), 2).toString());
     txtkomposisi.setText(tbobat.getValueAt(tbobat.getSelectedRow(), 3).toString());
     txtdosis.setText(tbobat.getValueAt(tbobat.getSelectedRow(), 4).toString());
     txtaturanpakai.setText(tbobat.getValueAt(tbobat.getSelectedRow(), 5).toString());
     txtharga.setText(tbobat.getValueAt(tbobat.getSelectedRow(), 6).toString());
     
}

private void hapusdata() {
    idobat = txtidobat.getText();
    
    int conf = JOptionPane.showConfirmDialog(rootPane,"Apakah anda yakin akan menghapus data ini ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
    if (conf == 0) {
        k.hapusdata(idobat);
    JOptionPane.showMessageDialog(rootPane,"Data berhasil dihapus","Informasi",JOptionPane.INFORMATION_MESSAGE);
    tampildata();
    baru();
    setobjek(false);
    }
    
} 

private void updatedata() {
        idobat = txtidobat.getText();
        namaobat = txtnamaobat.getText();
        kategori = txtkategori.getText();
        komposisi = txtkomposisi.getText();
        dosis = txtdosis.getText();
        aturanpakai = txtaturanpakai.getText();
        harga = txtharga.getText();
        
        int conf = JOptionPane.showConfirmDialog(rootPane,"Apakah anda yakin akan mengubah data ini ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (conf == 0) {
            k.updatedata(idobat,namaobat,kategori,komposisi,dosis,aturanpakai,harga);
            tampildata();
            baru();
            setobjek(false);
        }
    }

private void baru() {
    txtidobat.setText(null);
    txtnamaobat.setText(null);
    txtkategori.setText(null);
    txtkomposisi.setText(null);
    txtdosis.setText(null);
    txtaturanpakai.setText(null);
    txtharga.setText(null);
}

private void setobjek(boolean b) {
    txtidobat.setEnabled(b);
    txtnamaobat.setEnabled(b);
    txtkategori.setEnabled(b);
    txtkomposisi.setEnabled(b);
    txtdosis.setEnabled(b);
    txtaturanpakai.setEnabled(b);
    txtharga.setEnabled(b);
}
    


}

    













