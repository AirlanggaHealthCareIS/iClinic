/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * 
 *
 * Created on Jun 25, 2010, 9:45:09 PM
 */
package ClientApplication.form;

import ClientApplication.FormLogin;
import ClientApplication.model.TableModelLab_detailLab;
import Database.Entity.Lab_detailLab;
import Database.Entity.Pembayaran;
import Database.Service.LabService;
import java.awt.Color;
import java.io.File;
import java.io.FileFilter;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author erin
 */
public class FormLab extends javax.swing.JFrame {

    public FormLab(LabService service7) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    

   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idPasien = new javax.swing.JTextField();
        idTransaksi = new javax.swing.JTextField();
        idDetLab = new javax.swing.JTextField();
        hargaJenis = new javax.swing.JTextField();
        hasilPemeriksaan = new javax.swing.JTextField();
        totalHarga = new javax.swing.JTextField();
        tanggal = new javax.swing.JTextField();
        comboJenisPem = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        insertLayanan = new javax.swing.JButton();
        deleteLayanan = new javax.swing.JButton();
        Upload = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        insertAll = new javax.swing.JButton();
        proses = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Total Tansaksi                 :");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(2689, 1501, 158, 17);

        jTextField11.setEditable(false);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11);
        jTextField11.setBounds(2851, 1501, 222, 20);

        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(3083, 1539, 67, 23);
        getContentPane().add(jLabel16);
        jLabel16.setBounds(483, 187, 0, 0);

        jLabel1.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel1.setText("ID Pasien      :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 260, 100, 18);

        jLabel2.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel2.setText("ID Transaksi   :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 290, 110, 18);

        jLabel3.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel3.setText("ID Detail Lab :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 360, 110, 18);

        jLabel4.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel4.setText("Jenis Pemeriksaan  :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 390, 140, 18);

        jLabel5.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel5.setText("Harga                  :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 420, 140, 18);

        jLabel6.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel6.setText("Keterangan          :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 450, 140, 18);

        jLabel7.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel7.setText("Hasil Pemeriksaan  :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 580, 140, 18);

        jLabel8.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel8.setText("Total Harga          :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(100, 740, 136, 18);

        jLabel9.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel9.setText("Tanggal Pemeriksaan  :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(830, 240, 170, 18);

        idPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPasienActionPerformed(evt);
            }
        });
        getContentPane().add(idPasien);
        idPasien.setBounds(220, 260, 100, 20);

        idTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTransaksiActionPerformed(evt);
            }
        });
        getContentPane().add(idTransaksi);
        idTransaksi.setBounds(220, 290, 100, 20);
        getContentPane().add(idDetLab);
        idDetLab.setBounds(250, 360, 100, 20);
        getContentPane().add(hargaJenis);
        hargaJenis.setBounds(250, 420, 200, 20);

        hasilPemeriksaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilPemeriksaanActionPerformed(evt);
            }
        });
        getContentPane().add(hasilPemeriksaan);
        hasilPemeriksaan.setBounds(250, 580, 200, 20);
        getContentPane().add(totalHarga);
        totalHarga.setBounds(250, 740, 210, 20);

        tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalActionPerformed(evt);
            }
        });
        getContentPane().add(tanggal);
        tanggal.setBounds(1010, 240, 170, 20);

        comboJenisPem.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        comboJenisPem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Jenis Pemeriksaan" }));
        getContentPane().add(comboJenisPem);
        comboJenisPem.setBounds(250, 390, 200, 24);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 450, 200, 120);

        insertLayanan.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        insertLayanan.setText("INSERT LAYANAN");
        getContentPane().add(insertLayanan);
        insertLayanan.setBounds(180, 630, 150, 20);

        deleteLayanan.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        deleteLayanan.setText("DELETE LAYANAN");
        deleteLayanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLayananActionPerformed(evt);
            }
        });
        getContentPane().add(deleteLayanan);
        deleteLayanan.setBounds(380, 630, 147, 20);

        Upload.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        Upload.setText("BROWSER");
        getContentPane().add(Upload);
        Upload.setBounds(460, 580, 100, 20);

        clear.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        clear.setText("CLEAR");
        getContentPane().add(clear);
        clear.setBounds(250, 680, 80, 20);

        insertAll.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        insertAll.setText("INSERT");
        getContentPane().add(insertAll);
        insertAll.setBounds(380, 680, 80, 20);

        proses.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        proses.setText("PROSES");
        getContentPane().add(proses);
        proses.setBounds(480, 740, 90, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Detail Lab", "ID Transaksi Lab", "ID Lab", "Hasil", "Keterangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(630, 330, 590, 402);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(90, 350, 500, 320);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/7.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.setMaximumSize(new java.awt.Dimension(1280, 800));
        jLabel10.setMinimumSize(new java.awt.Dimension(1280, 800));
        jLabel10.setPreferredSize(new java.awt.Dimension(1280, 800));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 1270, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void idPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPasienActionPerformed

    private void idTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTransaksiActionPerformed

    private void hasilPemeriksaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilPemeriksaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilPemeriksaanActionPerformed

    private void tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalActionPerformed

    private void deleteLayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLayananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteLayananActionPerformed

      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Upload;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox comboJenisPem;
    private javax.swing.JButton deleteLayanan;
    private javax.swing.JTextField hargaJenis;
    private javax.swing.JTextField hasilPemeriksaan;
    private javax.swing.JTextField idDetLab;
    private javax.swing.JTextField idPasien;
    private javax.swing.JTextField idTransaksi;
    private javax.swing.JButton insertAll;
    private javax.swing.JButton insertLayanan;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JButton proses;
    private javax.swing.JTextField tanggal;
    private javax.swing.JTextField totalHarga;
    // End of variables declaration//GEN-END:variables

}
