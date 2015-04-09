/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormDetail_Penjualan.java
 *
 * Created on Jun 25, 2010, 10:04:18 PM
 */

package ClientApplication.form;

import com.mysql.jdbc.Statement;
import ClientApplication.FormLogin;
import ClientApplication.model.TableModelPasien;
import Database.Entity.Pasien;
import ClientApplication.model.TableModelAntrian;
import Database.Entity.Antrian;
import Database.Service.Bag_PendaftaranService;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Tiara Ratna Sari
 */
public class FormBag_Pendaftaran extends javax.swing.JFrame {

    public FormBag_Pendaftaran(Bag_PendaftaranService bag_PendaftaranService) {
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PasienBaru = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField15 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        No_Hp = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        Id_Pasien = new javax.swing.JLabel();
        Nama_Pasien = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Jenis_Kelamin = new javax.swing.JLabel();
        Usia = new javax.swing.JLabel();
        Cari = new javax.swing.JButton();
        DaftarAntrian = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        Alamat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        PasienBaru.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jPanel3.setLayout(null);

        jTextField8.setText("ID_Pasien");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField8);
        jTextField8.setBounds(40, 290, 70, 20);

        jTextField9.setText("NO KTP");
        jPanel3.add(jTextField9);
        jTextField9.setBounds(40, 320, 70, 20);

        jTextField10.setText("Nama Pasien");
        jPanel3.add(jTextField10);
        jTextField10.setBounds(40, 350, 70, 20);

        jTextField11.setText("Alamat");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField11);
        jTextField11.setBounds(40, 380, 70, 20);

        jTextField12.setText("TTL");
        jPanel3.add(jTextField12);
        jTextField12.setBounds(40, 410, 70, 20);

        jTextField13.setText("Usia");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField13);
        jTextField13.setBounds(40, 440, 70, 20);

        jTextField14.setText("No HP");
        jPanel3.add(jTextField14);
        jTextField14.setBounds(40, 470, 70, 20);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jPanel2);
        jPanel2.setBounds(140, 500, 160, 20);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jPanel4);
        jPanel4.setBounds(140, 290, 160, 20);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jPanel5);
        jPanel5.setBounds(140, 320, 160, 20);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jPanel6);
        jPanel6.setBounds(140, 350, 160, 20);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jPanel7);
        jPanel7.setBounds(140, 380, 160, 20);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jPanel8);
        jPanel8.setBounds(140, 410, 160, 20);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jPanel9);
        jPanel9.setBounds(140, 440, 160, 20);

        jButton1.setText("Daftar");
        jPanel3.add(jButton1);
        jButton1.setBounds(60, 550, 230, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_Pasien", "Nama_Pasien", "Tanggal Daftar", "Biaya"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(330, 290, 452, 90);

        jTextField15.setText("Jenis Kelamin");
        jPanel3.add(jTextField15);
        jTextField15.setBounds(40, 500, 70, 20);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jPanel10);
        jPanel10.setBounds(140, 470, 160, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(0, -10, 1280, 820);

        PasienBaru.addTab("Pasien Baru", jPanel3);

        jPanel1.setLayout(null);

        No_Hp.setFont(new java.awt.Font("Caviar Dreams", 1, 13)); // NOI18N
        No_Hp.setText("Telepon");
        jPanel1.add(No_Hp);
        No_Hp.setBounds(740, 390, 80, 20);

        jTextField1.setFont(new java.awt.Font("Caviar Dreams", 0, 13)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(840, 390, 190, 30);

        jTextField2.setFont(new java.awt.Font("Caviar Dreams", 0, 13)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(120, 310, 190, 30);

        jTextField3.setFont(new java.awt.Font("Caviar Dreams", 0, 13)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(120, 350, 190, 30);

        jTextField4.setFont(new java.awt.Font("Caviar Dreams", 0, 13)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(120, 430, 190, 30);

        jTextField5.setFont(new java.awt.Font("Caviar Dreams", 0, 13)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(840, 310, 190, 30);

        jTextField6.setFont(new java.awt.Font("Caviar Dreams", 0, 13)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(840, 350, 190, 30);

        Id_Pasien.setFont(new java.awt.Font("Caviar Dreams", 1, 13)); // NOI18N
        Id_Pasien.setText("ID Pasien");
        jPanel1.add(Id_Pasien);
        Id_Pasien.setBounds(40, 310, 80, 20);

        Nama_Pasien.setFont(new java.awt.Font("Caviar Dreams", 1, 13)); // NOI18N
        Nama_Pasien.setText("Nama");
        jPanel1.add(Nama_Pasien);
        Nama_Pasien.setBounds(40, 350, 80, 20);

        Gender.setFont(new java.awt.Font("Caviar Dreams", 1, 13)); // NOI18N
        Gender.setText("TTL");
        jPanel1.add(Gender);
        Gender.setBounds(40, 430, 80, 20);

        Jenis_Kelamin.setFont(new java.awt.Font("Caviar Dreams", 1, 13)); // NOI18N
        Jenis_Kelamin.setText("Gender");
        jPanel1.add(Jenis_Kelamin);
        Jenis_Kelamin.setBounds(740, 310, 80, 20);

        Usia.setFont(new java.awt.Font("Caviar Dreams", 1, 13)); // NOI18N
        Usia.setText("Umur");
        jPanel1.add(Usia);
        Usia.setBounds(740, 350, 80, 20);

        Cari.setFont(new java.awt.Font("Caviar Dreams", 0, 13)); // NOI18N
        Cari.setText("DaftarAntrian");
        Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariActionPerformed(evt);
            }
        });
        jPanel1.add(Cari);
        Cari.setBounds(970, 490, 120, 27);

        DaftarAntrian.setFont(new java.awt.Font("Caviar Dreams", 0, 13)); // NOI18N
        DaftarAntrian.setText("Cari");
        DaftarAntrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarAntrianActionPerformed(evt);
            }
        });
        jPanel1.add(DaftarAntrian);
        DaftarAntrian.setBounds(320, 310, 97, 27);

        jTextField7.setFont(new java.awt.Font("Caviar Dreams", 0, 13)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7);
        jTextField7.setBounds(120, 390, 190, 30);

        Alamat.setFont(new java.awt.Font("Caviar Dreams", 1, 13)); // NOI18N
        Alamat.setText("Alamat");
        jPanel1.add(Alamat);
        Alamat.setBounds(40, 390, 80, 20);

        jLabel1.setFont(new java.awt.Font("Caviar Dreams", 0, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/2.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 800);

        PasienBaru.addTab("Pasien Lama", jPanel1);

        getContentPane().add(PasienBaru);
        PasienBaru.setBounds(0, 0, 1300, 770);
        PasienBaru.getAccessibleContext().setAccessibleName("Pasien Baru");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CariActionPerformed

    private void DaftarAntrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarAntrianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DaftarAntrianActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alamat;
    private javax.swing.JButton Cari;
    private javax.swing.JButton DaftarAntrian;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Id_Pasien;
    private javax.swing.JLabel Jenis_Kelamin;
    private javax.swing.JLabel Nama_Pasien;
    private javax.swing.JLabel No_Hp;
    private javax.swing.JTabbedPane PasienBaru;
    private javax.swing.JLabel Usia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
