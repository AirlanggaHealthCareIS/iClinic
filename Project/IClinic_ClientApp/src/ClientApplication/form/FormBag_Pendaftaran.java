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
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    private TableModelPasien tableModelPasien = new TableModelPasien();
    private Bag_PendaftaranService bag_PendaftaranService;
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
        jButton1 = new javax.swing.JButton();
        DateChooser_Tanggal_Lahir = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        No_Hp = new javax.swing.JLabel();
        jTextFieldTelepon = new javax.swing.JTextField();
        TextField_idPasien = new javax.swing.JTextField();
        jTextFieldNama = new javax.swing.JTextField();
        jTextFieldGender = new javax.swing.JTextField();
        jTextFieldUmur = new javax.swing.JTextField();
        Id_Pasien = new javax.swing.JLabel();
        Nama_Pasien = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Jenis_Kelamin = new javax.swing.JLabel();
        Usia = new javax.swing.JLabel();
        Cari = new javax.swing.JButton();
        jTextFieldAlamat = new javax.swing.JTextField();
        Alamat = new javax.swing.JLabel();
        PilihLayanan = new javax.swing.JComboBox();
        Button_search = new javax.swing.JButton();
        PilihLayananLabel = new javax.swing.JLabel();
        JTextFieldTanggal_lahir = new javax.swing.JFormattedTextField();
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
        field_ID_Pasien.setBounds(140, 290, 150, 28);
        jPanel3.add(field_No_Ktp);
        field_No_Ktp.setBounds(140, 320, 150, 28);

        field_Nama_Pasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_Nama_PasienActionPerformed(evt);
            }
        });
        jPanel3.add(field_Nama_Pasien);
        field_Nama_Pasien.setBounds(140, 350, 150, 28);
        jPanel3.add(field_Alamat);
        field_Alamat.setBounds(140, 380, 150, 28);
        jPanel3.add(field_Usia);
        field_Usia.setBounds(140, 470, 150, 28);
        jPanel3.add(field_No_HP);
        field_No_HP.setBounds(140, 500, 150, 28);

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
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                box_Jenis_KelaminPopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        box_Jenis_Kelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_Jenis_KelaminActionPerformed(evt);
            }
        });
        jPanel3.add(box_Jenis_Kelamin);
        box_Jenis_Kelamin.setBounds(140, 530, 150, 27);

        Formatted_Tanggal_Daftar.setEditable(false);
        Formatted_Tanggal_Daftar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat(""))));
        Formatted_Tanggal_Daftar.setValue(new java.util.Date());
        Formatted_Tanggal_Daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Formatted_Tanggal_DaftarActionPerformed(evt);
            }
        });
        jPanel3.add(Formatted_Tanggal_Daftar);
        Formatted_Tanggal_Daftar.setBounds(140, 440, 150, 28);

        jLabel11.setText("Tanggal Lahir");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(40, 410, 80, 16);

        jButton1.setText("Daftar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(140, 563, 150, 50);
        jPanel3.add(DateChooser_Tanggal_Lahir);
        DateChooser_Tanggal_Lahir.setBounds(150, 410, 123, 28);

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

        jTextFieldTelepon.setFont(new java.awt.Font("Caviar Dreams", 0, 13)); // NOI18N
        jTextFieldTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTeleponActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldTelepon);
        jTextFieldTelepon.setBounds(840, 390, 190, 30);

        TextField_idPasien.setFont(new java.awt.Font("Caviar Dreams", 0, 13)); // NOI18N
        TextField_idPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_idPasienActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_idPasien);
        TextField_idPasien.setBounds(120, 310, 190, 30);

        jTextFieldNama.setFont(new java.awt.Font("Caviar Dreams", 0, 13)); // NOI18N
        jTextFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNama);
        jTextFieldNama.setBounds(120, 350, 190, 30);

        jTextFieldGender.setFont(new java.awt.Font("Caviar Dreams", 0, 13)); // NOI18N
        jTextFieldGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGenderActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldGender);
        jTextFieldGender.setBounds(840, 310, 190, 30);

        jTextFieldUmur.setFont(new java.awt.Font("Caviar Dreams", 0, 13)); // NOI18N
        jTextFieldUmur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUmurActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldUmur);
        jTextFieldUmur.setBounds(840, 350, 190, 30);

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
        Cari.setBounds(970, 490, 120, 29);

        jTextFieldAlamat.setFont(new java.awt.Font("Caviar Dreams", 0, 13)); // NOI18N
        jTextFieldAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlamatActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldAlamat);
        jTextFieldAlamat.setBounds(120, 390, 190, 30);

        Alamat.setFont(new java.awt.Font("Caviar Dreams", 1, 13)); // NOI18N
        Alamat.setText("Alamat");
        jPanel1.add(Alamat);
        Alamat.setBounds(40, 390, 80, 20);

        PilihLayanan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PilihLayanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihLayananActionPerformed(evt);
            }
        });
        jPanel1.add(PilihLayanan);
        PilihLayanan.setBounds(840, 430, 96, 27);

        Button_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Search.png"))); // NOI18N
        Button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_searchActionPerformed(evt);
            }
        });
        jPanel1.add(Button_search);
        Button_search.setBounds(320, 310, 40, 36);

        PilihLayananLabel.setFont(new java.awt.Font("Caviar Dreams", 1, 13)); // NOI18N
        PilihLayananLabel.setText("Pilih Layanan");
        jPanel1.add(PilihLayananLabel);
        PilihLayananLabel.setBounds(740, 430, 100, 20);

        JTextFieldTanggal_lahir.setEditable(false);
        JTextFieldTanggal_lahir.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        JTextFieldTanggal_lahir.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        JTextFieldTanggal_lahir.setValue(new java.util.Date());
        JTextFieldTanggal_lahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldTanggal_lahirActionPerformed(evt);
            }
        });
        jPanel1.add(JTextFieldTanggal_lahir);
        JTextFieldTanggal_lahir.setBounds(120, 430, 190, 30);

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

    private void jTextFieldTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTeleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTeleponActionPerformed

    private void TextField_idPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_idPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_idPasienActionPerformed

    private void jTextFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaActionPerformed

    private void jTextFieldGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGenderActionPerformed

    private void jTextFieldUmurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUmurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUmurActionPerformed

    private void CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CariActionPerformed

    private void jTextFieldAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlamatActionPerformed

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

    private void PilihLayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilihLayananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PilihLayananActionPerformed

    private void Button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_searchActionPerformed
       if(TextField_idPasien.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Anda Belum menginputkan ID PASIEN");
        }
       else if( !TextField_idPasien.getText().equals("")){
            try {
               Pasien pasien = bag_PendaftaranService.getPasien(TextField_idPasien.getText());
               jTextFieldNama.setText(pasien.getNama_Pasien());
               jTextFieldAlamat.setText(pasien.getAlamat());
               JTextFieldTanggal_lahir.setValue(pasien.getTanggal_lahir());
               jTextFieldGender.setText(pasien.getJenis_Kelamin());
               jTextFieldUmur.setText(""+pasien.getUsia());
               jTextFieldTelepon.setText(""+pasien.getNo_HP());
            }
            catch (RemoteException ex) {
                Logger.getLogger(FormBag_Pembayaran.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
    }//GEN-LAST:event_Button_searchActionPerformed

    private void JTextFieldTanggal_lahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldTanggal_lahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldTanggal_lahirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alamat;
    private javax.swing.JButton Button_search;
    private javax.swing.JButton Cari;
    private com.toedter.calendar.JDateChooser DateChooser_Tanggal_Lahir;
    private javax.swing.JFormattedTextField Formatted_Tanggal_Daftar;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Id_Pasien;
    private javax.swing.JFormattedTextField JTextFieldTanggal_lahir;
    private javax.swing.JLabel Jenis_Kelamin;
    private javax.swing.JLabel Nama_Pasien;
    private javax.swing.JLabel No_Hp;
    private javax.swing.JTabbedPane PasienBaru;
    private javax.swing.JComboBox PilihLayanan;
    private javax.swing.JLabel PilihLayananLabel;
    private javax.swing.JTextField TextField_idPasien;
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
    private javax.swing.JTextField jTextFieldAlamat;
    private javax.swing.JTextField jTextFieldGender;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldTelepon;
    private javax.swing.JTextField jTextFieldUmur;
    // End of variables declaration//GEN-END:variables
}
