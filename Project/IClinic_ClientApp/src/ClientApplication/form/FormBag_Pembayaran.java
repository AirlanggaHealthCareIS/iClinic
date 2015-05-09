/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientApplication.form;

import ClientApplication.FormLogin;
import ClientApplication.Splash;
import ClientApplication.model.TableModelPembayaran;
import Database.Entity.Pembayaran;
import Database.Service.Bag_PembayaranService;
import com.mysql.jdbc.DatabaseMetaDataUsingInfoSchema;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


/**
 *
 * @author Tiara Ratna Sari
 */
public class FormBag_Pembayaran extends javax.swing.JFrame {
    
    private TableModelPembayaran tableModelPembayaran = new TableModelPembayaran();
    private Bag_PembayaranService bag_PembayaranService;
    
    public FormBag_Pembayaran(Bag_PembayaranService bag_PembayaranService) {
        this.bag_PembayaranService = bag_PembayaranService;
        try{
            tableModelPembayaran.setData(this.bag_PembayaranService.getPembayaran());
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
        initComponents();
        setLocationRelativeTo(this);
        setSize(1278, 730);

        Table_Bahan.setModel(tableModelPembayaran);
        Table_Bahan.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                int row = Table_Bahan.getSelectedRow();
                if(row != -1){
                    Pembayaran pembayaran = tableModelPembayaran.get(row);
                    TextField_idPembayaran.setText(pembayaran.getID_PEMBAYARAN());
                    TextField_tglPembayaran.setValue(pembayaran.getTANGGAL_BAYAR());
                    TextField_Usg.setText(String.valueOf(pembayaran.getTOTAL_USG()));
                    TextField_Lab.setText(String.valueOf(pembayaran.getTOTAL_LAB()));
                    TextField_Resep.setText(String.valueOf(pembayaran.getTOTAL_RESEP()));
                    TextField_RekamMedis.setText(String.valueOf(pembayaran.getTOTAL_REKAM()));
                    TextField_Kecantikan.setText(String.valueOf(pembayaran.getTOTAL_KECANTIKAN()));
                    TextField_totalPembayaran.setText(String.valueOf(pembayaran.getTOTAL_HARGA()));
                    TextField_status.setText(String.valueOf(pembayaran.getSTATUS()));
                }
            }
        });
    }
    
    public void clear(){
        TextField_idPasien.setText("");
        TextField_namaPasien.setText("");
        TextField_idPembayaran.setText("");
        TextField_tglPembayaran.setText("");
        TextField_Kecantikan.setText("");
        TextField_Lab.setText("");
        TextField_RekamMedis.setText("");
        TextField_Resep.setText("");
        TextField_Usg.setText("");
        TextField_totalPembayaran.setText("");
        TextField_status.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_Tunai = new javax.swing.JButton();
        button_Debit = new javax.swing.JButton();
        button_Print = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        button_Delete = new javax.swing.JButton();
        button_Update = new javax.swing.JButton();
        button_Exit = new javax.swing.JButton();
        Label_Resep = new javax.swing.JLabel();
        TextField_Resep = new javax.swing.JTextField();
        Label_Lab = new javax.swing.JLabel();
        TextField_Lab = new javax.swing.JTextField();
        Label_Usg = new javax.swing.JLabel();
        TextField_Usg = new javax.swing.JTextField();
        Label_Kecantikan = new javax.swing.JLabel();
        TextField_Kecantikan = new javax.swing.JTextField();
        Label_totalPembayaran = new javax.swing.JLabel();
        TextField_totalPembayaran = new javax.swing.JTextField();
        Button_search = new javax.swing.JButton();
        Label_idPasien = new javax.swing.JLabel();
        TextField_idPasien = new javax.swing.JTextField();
        Label_namaPasien = new javax.swing.JLabel();
        TextField_namaPasien = new javax.swing.JTextField();
        Label_idPembayaran = new javax.swing.JLabel();
        TextField_idPembayaran = new javax.swing.JTextField();
        Label_tglPembayaran = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Bahan = new javax.swing.JTable();
        TextField_tglPembayaran = new javax.swing.JFormattedTextField();
        Label_RekamMedis = new javax.swing.JLabel();
        TextField_RekamMedis = new javax.swing.JTextField();
        Label_status = new javax.swing.JLabel();
        TextField_status = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORM PEMBAYARAN");
        setMaximumSize(new java.awt.Dimension(1278, 730));
        setMinimumSize(new java.awt.Dimension(1278, 730));
        setResizable(false);
        getContentPane().setLayout(null);

        button_Tunai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Tunai.png"))); // NOI18N
        button_Tunai.setEnabled(false);
        button_Tunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_TunaiActionPerformed(evt);
            }
        });
        getContentPane().add(button_Tunai);
        button_Tunai.setBounds(40, 620, 65, 65);

        button_Debit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Debit.png"))); // NOI18N
        button_Debit.setEnabled(false);
        button_Debit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DebitActionPerformed(evt);
            }
        });
        getContentPane().add(button_Debit);
        button_Debit.setBounds(150, 620, 65, 65);

        button_Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Printer.png"))); // NOI18N
        button_Print.setEnabled(false);
        button_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_PrintActionPerformed(evt);
            }
        });
        getContentPane().add(button_Print);
        button_Print.setBounds(450, 620, 65, 65);

        jLabel2.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        jLabel2.setText("Daftar Pembayaran");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(590, 180, 220, 24);

        button_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Delete.png"))); // NOI18N
        getContentPane().add(button_Delete);
        button_Delete.setBounds(1150, 340, 65, 65);

        button_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Update.png"))); // NOI18N
        getContentPane().add(button_Update);
        button_Update.setBounds(1150, 230, 65, 65);

        button_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Exit.png"))); // NOI18N
        getContentPane().add(button_Exit);
        button_Exit.setBounds(1150, 570, 65, 65);

        Label_Resep.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        Label_Resep.setText("RESEP");
        getContentPane().add(Label_Resep);
        Label_Resep.setBounds(40, 380, 230, 24);

        TextField_Resep.setEditable(false);
        TextField_Resep.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        getContentPane().add(TextField_Resep);
        TextField_Resep.setBounds(280, 380, 250, 30);

        Label_Lab.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        Label_Lab.setText("LAB");
        getContentPane().add(Label_Lab);
        Label_Lab.setBounds(40, 420, 230, 24);

        TextField_Lab.setEditable(false);
        TextField_Lab.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        getContentPane().add(TextField_Lab);
        TextField_Lab.setBounds(280, 420, 250, 30);

        Label_Usg.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        Label_Usg.setText("USG");
        getContentPane().add(Label_Usg);
        Label_Usg.setBounds(40, 460, 230, 24);

        TextField_Usg.setEditable(false);
        TextField_Usg.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        getContentPane().add(TextField_Usg);
        TextField_Usg.setBounds(280, 460, 250, 30);

        Label_Kecantikan.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        Label_Kecantikan.setText("KECANTIKAN");
        getContentPane().add(Label_Kecantikan);
        Label_Kecantikan.setBounds(40, 500, 230, 24);

        TextField_Kecantikan.setEditable(false);
        TextField_Kecantikan.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        getContentPane().add(TextField_Kecantikan);
        TextField_Kecantikan.setBounds(280, 500, 250, 30);

        Label_totalPembayaran.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        Label_totalPembayaran.setText("TOTAL PEMBAYARAN");
        getContentPane().add(Label_totalPembayaran);
        Label_totalPembayaran.setBounds(40, 540, 230, 24);

        TextField_totalPembayaran.setEditable(false);
        TextField_totalPembayaran.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        getContentPane().add(TextField_totalPembayaran);
        TextField_totalPembayaran.setBounds(280, 540, 250, 30);

        Button_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Search.png"))); // NOI18N
        Button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_searchActionPerformed(evt);
            }
        });
        getContentPane().add(Button_search);
        Button_search.setBounds(460, 170, 40, 33);

        Label_idPasien.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        Label_idPasien.setText("ID PASIEN");
        getContentPane().add(Label_idPasien);
        Label_idPasien.setBounds(40, 170, 150, 24);

        TextField_idPasien.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        getContentPane().add(TextField_idPasien);
        TextField_idPasien.setBounds(200, 170, 250, 30);

        Label_namaPasien.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        Label_namaPasien.setText("NAMA PASIEN");
        getContentPane().add(Label_namaPasien);
        Label_namaPasien.setBounds(40, 210, 150, 24);

        TextField_namaPasien.setEditable(false);
        TextField_namaPasien.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        getContentPane().add(TextField_namaPasien);
        TextField_namaPasien.setBounds(200, 210, 250, 30);

        Label_idPembayaran.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        Label_idPembayaran.setText("ID PEMBAYARAN");
        getContentPane().add(Label_idPembayaran);
        Label_idPembayaran.setBounds(40, 260, 230, 24);

        TextField_idPembayaran.setEditable(false);
        TextField_idPembayaran.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        getContentPane().add(TextField_idPembayaran);
        TextField_idPembayaran.setBounds(280, 260, 250, 30);

        Label_tglPembayaran.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        Label_tglPembayaran.setText("TGL PEMBAYARAN");
        getContentPane().add(Label_tglPembayaran);
        Label_tglPembayaran.setBounds(40, 300, 230, 24);

        Table_Bahan.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        Table_Bahan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Table_Bahan);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(590, 230, 550, 430);

        TextField_tglPembayaran.setEditable(false);
        TextField_tglPembayaran.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        TextField_tglPembayaran.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        TextField_tglPembayaran.setValue(new java.util.Date());
        getContentPane().add(TextField_tglPembayaran);
        TextField_tglPembayaran.setBounds(280, 300, 250, 30);

        Label_RekamMedis.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        Label_RekamMedis.setText("REKAM MEDIS");
        getContentPane().add(Label_RekamMedis);
        Label_RekamMedis.setBounds(40, 340, 230, 24);

        TextField_RekamMedis.setEditable(false);
        TextField_RekamMedis.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        getContentPane().add(TextField_RekamMedis);
        TextField_RekamMedis.setBounds(280, 340, 250, 30);

        Label_status.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        Label_status.setText("STATUS");
        getContentPane().add(Label_status);
        Label_status.setBounds(40, 580, 230, 24);

        TextField_status.setEditable(false);
        TextField_status.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        getContentPane().add(TextField_status);
        TextField_status.setBounds(280, 580, 250, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/10.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setMaximumSize(new java.awt.Dimension(1370, 730));
        jLabel1.setMinimumSize(new java.awt.Dimension(1370, 730));
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1370, 730));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 730);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_searchActionPerformed
        if(TextField_idPasien.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Anda Belum menginputkan ID PASIEN");
        }
        else if( !TextField_idPasien.getText().equals("")){
            try {
                Date tanggal = (Date)TextField_tglPembayaran.getValue();
                Pembayaran pembayaran = bag_PembayaranService.MeihatTotalTagihanPembayaran(TextField_idPasien.getText(), tanggal);
                if(pembayaran != null){
                    TextField_namaPasien.setText(pembayaran.getNAMA_PASIEN());
                    TextField_idPembayaran.setText(pembayaran.getID_PEMBAYARAN());
                    TextField_Usg.setText(String.valueOf(pembayaran.getTOTAL_USG()));
                    TextField_Lab.setText(String.valueOf(pembayaran.getTOTAL_LAB()));
                    TextField_Resep.setText(String.valueOf(pembayaran.getTOTAL_RESEP()));
                    TextField_RekamMedis.setText(String.valueOf(pembayaran.getTOTAL_REKAM()));
                    TextField_Kecantikan.setText(String.valueOf(pembayaran.getTOTAL_KECANTIKAN()));
                    TextField_totalPembayaran.setText(String.valueOf(pembayaran.getTOTAL_HARGA()));
                    TextField_status.setText(String.valueOf(pembayaran.getSTATUS()));
                    button_Tunai.setEnabled(true);
                    button_Debit.setEnabled(true);
                }
                else if(pembayaran == null){
                    JOptionPane.showMessageDialog(null, "Pasien tidak memiliki tagihan pembayaran");
                }
            } catch (RemoteException ex) {
                Logger.getLogger(FormBag_Pembayaran.class.getName()).log(Level.ALL, null, ex);
            }
        }
    }//GEN-LAST:event_Button_searchActionPerformed

    private void button_TunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_TunaiActionPerformed
        if(TextField_idPembayaran.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Anda Harus mencari ID PASIEN terlebih dahulu");
        }
        else if(!TextField_idPembayaran.getText().equals("")){
            String Status = "LUNAS TUNAI";
            try {
                String statusBaru = bag_PembayaranService.updateStatusPembayaran(TextField_idPembayaran.getText(), Status);
                String newStatus = bag_PembayaranService.getStatus(TextField_idPembayaran.getText());
                if(newStatus.equals("LUNAS TUNAI")){
                    JOptionPane.showMessageDialog(null, "Transaksi Pembayaran dengan Tunai Berhasil");
                    TextField_status.setText(newStatus);
                    button_Print.setEnabled(true);
                    button_Tunai.setEnabled(false);
                    button_Debit.setEnabled(false);
                }
                else if(newStatus.equals("HUTANG")){
                    JOptionPane.showMessageDialog(null, "Maaf, Transaksi Pembayaran dengan Tunai Tidak Berhasil");
                }
            } catch (RemoteException ex) {
                Logger.getLogger(FormBag_Pembayaran.class.getName()).log(Level.ALL, null, ex);
            }
        }
    }//GEN-LAST:event_button_TunaiActionPerformed

    private void button_DebitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_DebitActionPerformed
        if(TextField_idPembayaran.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Anda Harus mencari ID PASIEN terlebih dahulu");
        }
        else if(!TextField_idPembayaran.getText().equals("")){
            String Status = "LUNAS DEBIT";
            try {
                bag_PembayaranService.updateStatusPembayaran(TextField_idPembayaran.getText(), Status);
                String newStatus = bag_PembayaranService.getStatus(TextField_idPembayaran.getText());
                if(newStatus.equals("LUNAS DEBIT")){
                    JOptionPane.showMessageDialog(null, "Transaksi Pembayaran dengan Debit Berhasil");
                    TextField_status.setText(newStatus);
                    button_Print.setEnabled(true);
                    button_Tunai.setEnabled(false);
                    button_Debit.setEnabled(false);
                }
                else if(newStatus.equals("HUTANG")){
                    JOptionPane.showMessageDialog(null, "Maaf, Transaksi Pembayaran dengan Debit Tidak Berhasil");
                }
            } catch (RemoteException ex) {
                Logger.getLogger(FormBag_Pembayaran.class.getName()).log(Level.ALL, null, ex);
            }
        }

    }//GEN-LAST:event_button_DebitActionPerformed

    private void button_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_PrintActionPerformed
        JasperPrint jasperPrint = null;
        try {
            JasperCompileManager.compileReportToFile("src/Report/buktiPembayaran.jrxml");
            HashMap hash = new HashMap();
//            hash.put("ID_PEMBAYARAN",TextField_idPembayaran.getText());
//            System.out.println(TextField_idPembayaran.getText());
            jasperPrint = JasperFillManager.fillReport("src/Report/buktiPembayaran.jasper", hash,
                    new JRTableModelDataSource(tableModelPembayaran));
            JasperViewer jasperViewer = new JasperViewer(jasperPrint);
            jasperViewer.setVisible(true);
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_button_PrintActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_search;
    private javax.swing.JLabel Label_Kecantikan;
    private javax.swing.JLabel Label_Lab;
    private javax.swing.JLabel Label_RekamMedis;
    private javax.swing.JLabel Label_Resep;
    private javax.swing.JLabel Label_Usg;
    private javax.swing.JLabel Label_idPasien;
    private javax.swing.JLabel Label_idPembayaran;
    private javax.swing.JLabel Label_namaPasien;
    private javax.swing.JLabel Label_status;
    private javax.swing.JLabel Label_tglPembayaran;
    private javax.swing.JLabel Label_totalPembayaran;
    private javax.swing.JTable Table_Bahan;
    private javax.swing.JTextField TextField_Kecantikan;
    private javax.swing.JTextField TextField_Lab;
    private javax.swing.JTextField TextField_RekamMedis;
    private javax.swing.JTextField TextField_Resep;
    private javax.swing.JTextField TextField_Usg;
    private javax.swing.JTextField TextField_idPasien;
    private javax.swing.JTextField TextField_idPembayaran;
    private javax.swing.JTextField TextField_namaPasien;
    private javax.swing.JTextField TextField_status;
    private javax.swing.JFormattedTextField TextField_tglPembayaran;
    private javax.swing.JTextField TextField_totalPembayaran;
    private javax.swing.JButton button_Debit;
    private javax.swing.JButton button_Delete;
    private javax.swing.JButton button_Exit;
    private javax.swing.JButton button_Print;
    private javax.swing.JButton button_Tunai;
    private javax.swing.JButton button_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
