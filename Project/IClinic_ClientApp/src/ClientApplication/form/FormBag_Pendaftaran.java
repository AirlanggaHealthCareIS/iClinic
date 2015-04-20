/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientApplication.form;
import ClientApplication.FormLogin;
import ClientApplication.model.TableModelAntrian;
import ClientApplication.model.TableModelPasien;
import Database.Entity.Antrian;
import Database.Entity.Pasien;
import Database.Service.Bag_PendaftaranService;
import java.awt.Color;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author adammuhammad
 */
public class FormBag_Pendaftaran extends javax.swing.JFrame {
    private FormBag_Pendaftaran f;
    private Bag_PendaftaranService PS;
    /**
     * 
     */
    //java.sql.Date sqlDate;
    public FormBag_Pendaftaran(Bag_PendaftaranService bag_PendaftaranService) throws RemoteException, NotBoundException{
        initComponents();
        PS = bag_PendaftaranService;
    }
    void refresh(){
        field_ID_Pasien.setText("");
        field_No_Ktp.setText("");
        field_Nama_Pasien.setText("");
        field_Alamat.setText("");
        DateChooser_Tanggal_Lahir.setDate(null);
        Formatted_Tanggal_Daftar.setText("");
        field_Usia.setText("");
        field_No_HP.setText("");
        box_Jenis_Kelamin.setBackground(Color.gray);
       
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PasienBaru = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        field_ID_Pasien = new javax.swing.JTextField();
        field_No_Ktp = new javax.swing.JTextField();
        field_Nama_Pasien = new javax.swing.JTextField();
        field_Alamat = new javax.swing.JTextField();
        field_Usia = new javax.swing.JTextField();
        field_No_HP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        box_Jenis_Kelamin = new javax.swing.JComboBox();
        Formatted_Tanggal_Daftar = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        DateChooser_Tanggal_Lahir = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
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

        jLabel3.setText("ID_Pasien");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(40, 290, 70, 20);

        jLabel4.setText("NO KTP");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(40, 320, 70, 20);

        jLabel5.setText("Nama Pasien");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(40, 350, 70, 20);

        jLabel6.setText("Alamat");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(40, 380, 70, 20);

        jLabel7.setText("Tanggal Daftar");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(40, 440, 90, 20);
        jPanel3.add(field_ID_Pasien);
        field_ID_Pasien.setBounds(140, 290, 150, 20);
        jPanel3.add(field_No_Ktp);
        field_No_Ktp.setBounds(140, 320, 150, 20);

        field_Nama_Pasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_Nama_PasienActionPerformed(evt);
            }
        });
        jPanel3.add(field_Nama_Pasien);
        field_Nama_Pasien.setBounds(140, 350, 150, 20);
        jPanel3.add(field_Alamat);
        field_Alamat.setBounds(140, 380, 150, 20);
        jPanel3.add(field_Usia);
        field_Usia.setBounds(140, 470, 150, 20);
        jPanel3.add(field_No_HP);
        field_No_HP.setBounds(140, 500, 150, 20);

        jLabel8.setText("Usia");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(40, 470, 70, 20);

        jLabel9.setText("No HP");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(40, 500, 70, 20);

        jLabel10.setText("Jenis Kelamin");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(40, 530, 70, 20);

        box_Jenis_Kelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "L", "P" }));
        box_Jenis_Kelamin.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                box_Jenis_KelaminPopupMenuWillBecomeVisible(evt);
            }
        });
        box_Jenis_Kelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_Jenis_KelaminActionPerformed(evt);
            }
        });
        jPanel3.add(box_Jenis_Kelamin);
        box_Jenis_Kelamin.setBounds(140, 530, 150, 20);

        Formatted_Tanggal_Daftar.setEditable(false);
        Formatted_Tanggal_Daftar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat(""))));
        Formatted_Tanggal_Daftar.setValue(new java.util.Date());
        Formatted_Tanggal_Daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Formatted_Tanggal_DaftarActionPerformed(evt);
            }
        });
        jPanel3.add(Formatted_Tanggal_Daftar);
        Formatted_Tanggal_Daftar.setBounds(140, 440, 150, 20);

        jLabel11.setText("Tanggal Lahir");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(40, 410, 80, 14);

        DateChooser_Tanggal_Lahir.setDateFormatString("yyyy-MM-dd");
        jPanel3.add(DateChooser_Tanggal_Lahir);
        DateChooser_Tanggal_Lahir.setBounds(141, 410, 150, 20);

        jButton1.setText("Daftar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(140, 563, 150, 50);

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

    private void field_Nama_PasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_Nama_PasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_Nama_PasienActionPerformed

    private void field_Jenis_KelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_Jenis_KelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_Jenis_KelaminActionPerformed

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

    private void box_Jenis_KelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_Jenis_KelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_Jenis_KelaminActionPerformed

    private void box_Jenis_KelaminPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_box_Jenis_KelaminPopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_box_Jenis_KelaminPopupMenuWillBecomeVisible

    private void Formatted_Tanggal_DaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Formatted_Tanggal_DaftarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Formatted_Tanggal_DaftarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if((field_ID_Pasien.getText().equalsIgnoreCase(""))||(field_No_Ktp.getText().equalsIgnoreCase(""))||(field_Nama_Pasien.getText().equalsIgnoreCase(""))||(field_Alamat.getText().equalsIgnoreCase(""))||(field_Usia.getText().equalsIgnoreCase(""))||(field_No_HP.getText().equalsIgnoreCase(""))){
        JOptionPane.showMessageDialog(null, "Terdaftar");
    }
    else{
            //PS.insertPasien(pasien);
        try{
            Pasien pasien = new Pasien();
            pasien.setId_Pasien(field_ID_Pasien.getText());
            pasien.setNo_Ktp(field_No_Ktp.getText());
            pasien.setNama_Pasien(field_Nama_Pasien.getText());
            pasien.setAlamat(field_Alamat.getText());
            pasien.setTanggal_Lahir(DateChooser_Tanggal_Lahir.getDate());
            pasien.setTanggal_Daftar((Date)Formatted_Tanggal_Daftar.getValue());
            pasien.setUsia(Integer.parseInt(field_Usia.getText()));
            pasien.setNo_HP(field_No_HP.getText());
            pasien.setJenis_Kelamin(box_Jenis_Kelamin.getSelectedItem().toString());
        
            System.out.println("cek 1");
            PS.insertPasien(pasien);
            JOptionPane.showMessageDialog(null, "Terdaftar");
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
    }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alamat;
    private javax.swing.JButton Cari;
    private javax.swing.JButton DaftarAntrian;
    private com.toedter.calendar.JDateChooser DateChooser_Tanggal_Lahir;
    private javax.swing.JFormattedTextField Formatted_Tanggal_Daftar;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Id_Pasien;
    private javax.swing.JLabel Jenis_Kelamin;
    private javax.swing.JLabel Nama_Pasien;
    private javax.swing.JLabel No_Hp;
    private javax.swing.JTabbedPane PasienBaru;
    private javax.swing.JLabel Usia;
    private javax.swing.JComboBox box_Jenis_Kelamin;
    private javax.swing.JTextField field_Alamat;
    private javax.swing.JTextField field_ID_Pasien;
    private javax.swing.JTextField field_Nama_Pasien;
    private javax.swing.JTextField field_No_HP;
    private javax.swing.JTextField field_No_Ktp;
    private javax.swing.JTextField field_Usia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
