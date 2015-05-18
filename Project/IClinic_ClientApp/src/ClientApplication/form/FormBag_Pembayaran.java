/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientApplication.form;

import ClientApplication.FormLogin;
import ClientApplication.Splash;
import ClientApplication.model.TableModelObat_detailResep;
import ClientApplication.model.TableModelPembayaran;
import ClientApplication.model.TableModelPembayaranPrint;
import Database.Entity.Pembayaran;
import Database.Service.Bag_PembayaranService;
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
    private TableModelPembayaranPrint tableModelPembayaranPrint = new TableModelPembayaranPrint();
    private TableModelPembayaran tableModelPembayaran = new TableModelPembayaran();
    private TableModelObat_detailResep tableModelObat_detailResep = new TableModelObat_detailResep();
    private Bag_PembayaranService bag_PembayaranService;
    
    public FormBag_Pembayaran(Bag_PembayaranService bag_PembayaranService) {
        this.bag_PembayaranService = bag_PembayaranService;
        try{
            tableModelPembayaran.setData(this.bag_PembayaranService.getPembayaran());
            tableModelObat_detailResep.setData(this.bag_PembayaranService.getObat_detailresep(null));
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
        initComponents();
        setLocationRelativeTo(this);
        setSize(1278, 730);

        Table_Pembayaran.setModel(tableModelPembayaran);
        Table_Pembayaran.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                int row = Table_Pembayaran.getSelectedRow();
                if(row != -1){
                    Pembayaran pembayaran = tableModelPembayaran.get(row);
                    FieldLk_idPembayaran.setText(pembayaran.getID_PEMBAYARAN());
                    FieldLk_tglPembayaran.setValue(pembayaran.getTANGGAL_BAYAR());
                    FieldLk_Usg.setText(String.valueOf(pembayaran.getTOTAL_USG()));
                    FieldLk_Lab.setText(String.valueOf(pembayaran.getTOTAL_LAB()));
                    FieldLk_Resep.setText(String.valueOf(pembayaran.getTOTAL_RESEP()));
                    FieldLk_RekamMedis.setText(String.valueOf(pembayaran.getTOTAL_REKAM()));
                    FieldLk_Kecantikan.setText(String.valueOf(pembayaran.getTOTAL_KECANTIKAN()));
                    FieldLk_totalPembayaran.setText(String.valueOf(pembayaran.getTOTAL_HARGA()));
                    FieldLk_status.setText(String.valueOf(pembayaran.getSTATUS()));
                }
            }
        });
        Table_Resep.setModel(tableModelObat_detailResep);
    }
    
    public void clear(){
        FieldLk_idPasien.setText("");
        FieldLk_namaPasien.setText("");
        FieldLk_idPembayaran.setText("");
        FieldLk_tglPembayaran.setText("");
        FieldLk_Kecantikan.setText("");
        FieldLk_Lab.setText("");
        FieldLk_RekamMedis.setText("");
        FieldLk_Resep.setText("");
        FieldLk_Usg.setText("");
        FieldLk_totalPembayaran.setText("");
        FieldLk_status.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Lk_idPasien = new javax.swing.JLabel();
        Lk_namaPasien = new javax.swing.JLabel();
        FieldLk_namaPasien = new javax.swing.JTextField();
        ButtonLk_search = new javax.swing.JButton();
        FieldLk_idPasien = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Lk_Kecantikan = new javax.swing.JLabel();
        Lk_idPembayaran = new javax.swing.JLabel();
        FieldLk_Lab = new javax.swing.JTextField();
        Lk_Resep = new javax.swing.JLabel();
        FieldLk_RekamMedis = new javax.swing.JTextField();
        FieldLk_tglPembayaran = new javax.swing.JFormattedTextField();
        Lk_status = new javax.swing.JLabel();
        Lk_totalPembayaran = new javax.swing.JLabel();
        Lk_tglPembayaran = new javax.swing.JLabel();
        FieldLk_totalPembayaran = new javax.swing.JTextField();
        FieldLk_idPembayaran = new javax.swing.JTextField();
        Lk_Usg = new javax.swing.JLabel();
        FieldLk_Kecantikan = new javax.swing.JTextField();
        FieldLk_status = new javax.swing.JTextField();
        FieldLk_Resep = new javax.swing.JTextField();
        Lk_Lab = new javax.swing.JLabel();
        Lk_RekamMedis = new javax.swing.JLabel();
        FieldLk_Usg = new javax.swing.JTextField();
        buttonLk_Tunai = new javax.swing.JButton();
        buttonLk_Debit = new javax.swing.JButton();
        buttonLk_Print = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Pembayaran = new javax.swing.JTable();
        buttonLk_Exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Po_idPasien = new javax.swing.JLabel();
        buttonPo_search = new javax.swing.JButton();
        FieldPo_idResep = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        Lk_idPembayaran1 = new javax.swing.JLabel();
        FieldPo_tglPembayaran = new javax.swing.JFormattedTextField();
        Lk_status1 = new javax.swing.JLabel();
        Lk_totalPembayaran1 = new javax.swing.JLabel();
        Lk_tglPembayaran1 = new javax.swing.JLabel();
        FieldPo_totalPembayaran = new javax.swing.JTextField();
        FieldPo_idPembayaran = new javax.swing.JTextField();
        FieldPo_status = new javax.swing.JTextField();
        buttonPo_Tunai = new javax.swing.JButton();
        buttonPo_Debit = new javax.swing.JButton();
        buttonPo_Print = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Resep = new javax.swing.JTable();
        buttonPo_Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORM PEMBAYARAN");
        setMaximumSize(new java.awt.Dimension(1278, 730));
        setMinimumSize(new java.awt.Dimension(1278, 730));
        setResizable(false);
        getContentPane().setLayout(null);

        jTabbedPane1.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        jTabbedPane1.setName(""); // NOI18N

        jPanel1.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        Lk_idPasien.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        Lk_idPasien.setText("ID PASIEN");
        jPanel3.add(Lk_idPasien);
        Lk_idPasien.setBounds(30, 0, 110, 30);

        Lk_namaPasien.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        Lk_namaPasien.setText("NAMA PASIEN");
        jPanel3.add(Lk_namaPasien);
        Lk_namaPasien.setBounds(30, 40, 110, 18);

        FieldLk_namaPasien.setEditable(false);
        FieldLk_namaPasien.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        FieldLk_namaPasien.setMaximumSize(new java.awt.Dimension(20, 175));
        FieldLk_namaPasien.setMinimumSize(new java.awt.Dimension(20, 175));
        jPanel3.add(FieldLk_namaPasien);
        FieldLk_namaPasien.setBounds(140, 40, 175, 20);

        ButtonLk_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Search.png"))); // NOI18N
        ButtonLk_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLk_searchActionPerformed(evt);
            }
        });
        jPanel3.add(ButtonLk_search);
        ButtonLk_search.setBounds(330, 0, 40, 30);
        jPanel3.add(FieldLk_idPasien);
        FieldLk_idPasien.setBounds(140, 0, 170, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 10, 480, 70);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        Lk_Kecantikan.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        Lk_Kecantikan.setText("KECANTIKAN");
        jPanel4.add(Lk_Kecantikan);
        Lk_Kecantikan.setBounds(60, 210, 150, 18);

        Lk_idPembayaran.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        Lk_idPembayaran.setText("ID PEMBAYARAN");
        jPanel4.add(Lk_idPembayaran);
        Lk_idPembayaran.setBounds(30, 20, 175, 18);

        FieldLk_Lab.setEditable(false);
        FieldLk_Lab.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        FieldLk_Lab.setMaximumSize(new java.awt.Dimension(20, 175));
        FieldLk_Lab.setMinimumSize(new java.awt.Dimension(20, 175));
        jPanel4.add(FieldLk_Lab);
        FieldLk_Lab.setBounds(210, 150, 175, 20);

        Lk_Resep.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        Lk_Resep.setText("RESEP");
        jPanel4.add(Lk_Resep);
        Lk_Resep.setBounds(60, 120, 150, 18);

        FieldLk_RekamMedis.setEditable(false);
        FieldLk_RekamMedis.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        FieldLk_RekamMedis.setMaximumSize(new java.awt.Dimension(20, 175));
        FieldLk_RekamMedis.setMinimumSize(new java.awt.Dimension(20, 175));
        jPanel4.add(FieldLk_RekamMedis);
        FieldLk_RekamMedis.setBounds(210, 90, 175, 20);

        FieldLk_tglPembayaran.setEditable(false);
        FieldLk_tglPembayaran.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        FieldLk_tglPembayaran.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        FieldLk_tglPembayaran.setMaximumSize(new java.awt.Dimension(20, 175));
        FieldLk_tglPembayaran.setMinimumSize(new java.awt.Dimension(20, 175));
        FieldLk_tglPembayaran.setValue(new java.util.Date());
        jPanel4.add(FieldLk_tglPembayaran);
        FieldLk_tglPembayaran.setBounds(250, 50, 175, 20);

        Lk_status.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        Lk_status.setText("STATUS");
        jPanel4.add(Lk_status);
        Lk_status.setBounds(30, 280, 175, 18);

        Lk_totalPembayaran.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        Lk_totalPembayaran.setText("TOTAL PEMBAYARAN");
        jPanel4.add(Lk_totalPembayaran);
        Lk_totalPembayaran.setBounds(30, 250, 175, 18);

        Lk_tglPembayaran.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        Lk_tglPembayaran.setText("TGL PEMBAYARAN");
        jPanel4.add(Lk_tglPembayaran);
        Lk_tglPembayaran.setBounds(30, 50, 175, 18);

        FieldLk_totalPembayaran.setEditable(false);
        FieldLk_totalPembayaran.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        FieldLk_totalPembayaran.setMaximumSize(new java.awt.Dimension(20, 175));
        FieldLk_totalPembayaran.setMinimumSize(new java.awt.Dimension(20, 175));
        jPanel4.add(FieldLk_totalPembayaran);
        FieldLk_totalPembayaran.setBounds(250, 250, 175, 20);

        FieldLk_idPembayaran.setEditable(false);
        FieldLk_idPembayaran.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        FieldLk_idPembayaran.setMaximumSize(new java.awt.Dimension(20, 175));
        FieldLk_idPembayaran.setMinimumSize(new java.awt.Dimension(20, 175));
        jPanel4.add(FieldLk_idPembayaran);
        FieldLk_idPembayaran.setBounds(250, 20, 175, 20);

        Lk_Usg.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        Lk_Usg.setText("USG");
        jPanel4.add(Lk_Usg);
        Lk_Usg.setBounds(60, 180, 150, 18);

        FieldLk_Kecantikan.setEditable(false);
        FieldLk_Kecantikan.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        FieldLk_Kecantikan.setMaximumSize(new java.awt.Dimension(20, 175));
        FieldLk_Kecantikan.setMinimumSize(new java.awt.Dimension(20, 175));
        jPanel4.add(FieldLk_Kecantikan);
        FieldLk_Kecantikan.setBounds(210, 210, 175, 20);

        FieldLk_status.setEditable(false);
        FieldLk_status.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        FieldLk_status.setMaximumSize(new java.awt.Dimension(20, 175));
        FieldLk_status.setMinimumSize(new java.awt.Dimension(20, 175));
        jPanel4.add(FieldLk_status);
        FieldLk_status.setBounds(250, 280, 175, 20);

        FieldLk_Resep.setEditable(false);
        FieldLk_Resep.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        FieldLk_Resep.setMaximumSize(new java.awt.Dimension(20, 175));
        FieldLk_Resep.setMinimumSize(new java.awt.Dimension(20, 175));
        jPanel4.add(FieldLk_Resep);
        FieldLk_Resep.setBounds(210, 120, 175, 20);

        Lk_Lab.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        Lk_Lab.setText("LAB");
        jPanel4.add(Lk_Lab);
        Lk_Lab.setBounds(60, 150, 150, 18);

        Lk_RekamMedis.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        Lk_RekamMedis.setText("REKAM MEDIS");
        jPanel4.add(Lk_RekamMedis);
        Lk_RekamMedis.setBounds(60, 90, 150, 18);

        FieldLk_Usg.setEditable(false);
        FieldLk_Usg.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        FieldLk_Usg.setMaximumSize(new java.awt.Dimension(20, 175));
        FieldLk_Usg.setMinimumSize(new java.awt.Dimension(20, 175));
        jPanel4.add(FieldLk_Usg);
        FieldLk_Usg.setBounds(210, 180, 175, 20);

        buttonLk_Tunai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Tunai.png"))); // NOI18N
        buttonLk_Tunai.setEnabled(false);
        buttonLk_Tunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLk_TunaiActionPerformed(evt);
            }
        });
        jPanel4.add(buttonLk_Tunai);
        buttonLk_Tunai.setBounds(30, 310, 65, 65);

        buttonLk_Debit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Debit.png"))); // NOI18N
        buttonLk_Debit.setEnabled(false);
        buttonLk_Debit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLk_DebitActionPerformed(evt);
            }
        });
        jPanel4.add(buttonLk_Debit);
        buttonLk_Debit.setBounds(120, 310, 65, 65);

        buttonLk_Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Printer.png"))); // NOI18N
        buttonLk_Print.setEnabled(false);
        buttonLk_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLk_PrintActionPerformed(evt);
            }
        });
        jPanel4.add(buttonLk_Print);
        buttonLk_Print.setBounds(390, 310, 65, 65);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 100, 480, 390);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        jLabel2.setText("Daftar Pembayaran");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(30, 10, 220, 20);

        Table_Pembayaran.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        Table_Pembayaran.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table_Pembayaran);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(30, 30, 660, 370);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(530, 10, 720, 420);

        buttonLk_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Exit.png"))); // NOI18N
        jPanel1.add(buttonLk_Exit);
        buttonLk_Exit.setBounds(1190, 440, 65, 65);

        jTabbedPane1.addTab("Layanan Kesehatan", jPanel1);

        jPanel2.setLayout(null);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(null);

        Po_idPasien.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        Po_idPasien.setText("ID RESEP");
        jPanel6.add(Po_idPasien);
        Po_idPasien.setBounds(30, 10, 110, 30);

        buttonPo_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Search.png"))); // NOI18N
        buttonPo_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPo_searchActionPerformed(evt);
            }
        });
        jPanel6.add(buttonPo_search);
        buttonPo_search.setBounds(330, 10, 40, 30);

        FieldPo_idResep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPo_idResepActionPerformed(evt);
            }
        });
        jPanel6.add(FieldPo_idResep);
        FieldPo_idResep.setBounds(130, 10, 175, 30);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(20, 0, 480, 50);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(null);

        Lk_idPembayaran1.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        Lk_idPembayaran1.setText("ID PEMBAYARAN");
        jPanel7.add(Lk_idPembayaran1);
        Lk_idPembayaran1.setBounds(30, 10, 175, 18);

        FieldPo_tglPembayaran.setEditable(false);
        FieldPo_tglPembayaran.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        FieldPo_tglPembayaran.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        FieldPo_tglPembayaran.setMaximumSize(new java.awt.Dimension(20, 175));
        FieldPo_tglPembayaran.setMinimumSize(new java.awt.Dimension(20, 175));
        FieldPo_tglPembayaran.setValue(new java.util.Date());
        jPanel7.add(FieldPo_tglPembayaran);
        FieldPo_tglPembayaran.setBounds(250, 40, 175, 20);

        Lk_status1.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        Lk_status1.setText("STATUS");
        jPanel7.add(Lk_status1);
        Lk_status1.setBounds(30, 320, 175, 18);

        Lk_totalPembayaran1.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        Lk_totalPembayaran1.setText("TOTAL HARGA OBAT");
        jPanel7.add(Lk_totalPembayaran1);
        Lk_totalPembayaran1.setBounds(30, 290, 175, 18);

        Lk_tglPembayaran1.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        Lk_tglPembayaran1.setText("TGL PEMBAYARAN");
        jPanel7.add(Lk_tglPembayaran1);
        Lk_tglPembayaran1.setBounds(30, 40, 175, 18);

        FieldPo_totalPembayaran.setEditable(false);
        FieldPo_totalPembayaran.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        FieldPo_totalPembayaran.setMaximumSize(new java.awt.Dimension(20, 175));
        FieldPo_totalPembayaran.setMinimumSize(new java.awt.Dimension(20, 175));
        jPanel7.add(FieldPo_totalPembayaran);
        FieldPo_totalPembayaran.setBounds(250, 290, 175, 20);

        FieldPo_idPembayaran.setEditable(false);
        FieldPo_idPembayaran.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        FieldPo_idPembayaran.setMaximumSize(new java.awt.Dimension(20, 175));
        FieldPo_idPembayaran.setMinimumSize(new java.awt.Dimension(20, 175));
        jPanel7.add(FieldPo_idPembayaran);
        FieldPo_idPembayaran.setBounds(250, 10, 175, 20);

        FieldPo_status.setEditable(false);
        FieldPo_status.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        FieldPo_status.setMaximumSize(new java.awt.Dimension(20, 175));
        FieldPo_status.setMinimumSize(new java.awt.Dimension(20, 175));
        jPanel7.add(FieldPo_status);
        FieldPo_status.setBounds(250, 320, 175, 20);

        buttonPo_Tunai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Tunai.png"))); // NOI18N
        buttonPo_Tunai.setEnabled(false);
        buttonPo_Tunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPo_TunaiActionPerformed(evt);
            }
        });
        jPanel7.add(buttonPo_Tunai);
        buttonPo_Tunai.setBounds(30, 350, 65, 65);

        buttonPo_Debit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Debit.png"))); // NOI18N
        buttonPo_Debit.setEnabled(false);
        buttonPo_Debit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPo_DebitActionPerformed(evt);
            }
        });
        jPanel7.add(buttonPo_Debit);
        buttonPo_Debit.setBounds(120, 350, 65, 65);

        buttonPo_Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Printer.png"))); // NOI18N
        buttonPo_Print.setEnabled(false);
        buttonPo_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPo_PrintActionPerformed(evt);
            }
        });
        jPanel7.add(buttonPo_Print);
        buttonPo_Print.setBounds(390, 350, 65, 65);

        Table_Resep.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        Table_Resep.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(Table_Resep);

        jPanel7.add(jScrollPane2);
        jScrollPane2.setBounds(30, 70, 1110, 210);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(20, 60, 1150, 430);

        buttonPo_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Exit.png"))); // NOI18N
        jPanel2.add(buttonPo_Exit);
        buttonPo_Exit.setBounds(1190, 440, 65, 65);

        jTabbedPane1.addTab("Pembelian Obat", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 160, 1280, 570);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/10.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 730));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 730));
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 730));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1610, 730);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLk_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLk_searchActionPerformed
        if(FieldLk_idPasien.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Anda Belum menginputkan ID PASIEN");
        }
        else if( !FieldLk_idPasien.getText().equals("")){
            try {
                Date tanggal = (Date)FieldLk_tglPembayaran.getValue();
                Pembayaran pembayaran = bag_PembayaranService.MeihatTotalTagihanPembayaran(FieldLk_idPasien.getText(), tanggal);
                if(pembayaran != null){
                    FieldLk_namaPasien.setText(pembayaran.getNAMA_PASIEN());
                    FieldLk_idPembayaran.setText(pembayaran.getID_PEMBAYARAN());
                    FieldLk_Usg.setText(String.valueOf(pembayaran.getTOTAL_USG()));
                    FieldLk_Lab.setText(String.valueOf(pembayaran.getTOTAL_LAB()));
                    FieldLk_Resep.setText(String.valueOf(pembayaran.getTOTAL_RESEP()));
                    FieldLk_RekamMedis.setText(String.valueOf(pembayaran.getTOTAL_REKAM()));
                    FieldLk_Kecantikan.setText(String.valueOf(pembayaran.getTOTAL_KECANTIKAN()));
                    FieldLk_totalPembayaran.setText(String.valueOf(pembayaran.getTOTAL_HARGA()));
                    FieldLk_status.setText(String.valueOf(pembayaran.getSTATUS()));
                    buttonLk_Tunai.setEnabled(true);
                    buttonLk_Debit.setEnabled(true);
                }
                else if(pembayaran == null){
                    JOptionPane.showMessageDialog(null, "Pasien tidak memiliki tagihan pembayaran");
                }
            } catch (RemoteException ex) {
                Logger.getLogger(FormBag_Pembayaran.class.getName()).log(Level.ALL, null, ex);
            }
        }
    }//GEN-LAST:event_ButtonLk_searchActionPerformed

    private void buttonLk_TunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLk_TunaiActionPerformed
        if(FieldLk_idPembayaran.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Anda Harus mencari ID PASIEN terlebih dahulu");
        }
        else if(!FieldLk_idPembayaran.getText().equals("")){
            String Status = "LUNAS TUNAI";
            try {
                String statusBaru = bag_PembayaranService.updateStatusPembayaran(FieldLk_idPembayaran.getText(), Status);
                String newStatus = bag_PembayaranService.getStatus(FieldLk_idPembayaran.getText());
                if(newStatus.equals("LUNAS TUNAI")){
                    JOptionPane.showMessageDialog(null, "Transaksi Pembayaran dengan Tunai Berhasil");
                    FieldLk_status.setText(newStatus);
                    buttonLk_Print.setEnabled(true);
                    buttonLk_Tunai.setEnabled(false);
                    buttonLk_Debit.setEnabled(false);
                }
                else if(newStatus.equals("HUTANG")){
                    JOptionPane.showMessageDialog(null, "Maaf, Transaksi Pembayaran dengan Tunai Tidak Berhasil");
                }
            } catch (RemoteException ex) {
                Logger.getLogger(FormBag_Pembayaran.class.getName()).log(Level.ALL, null, ex);
            }
        }
    }//GEN-LAST:event_buttonLk_TunaiActionPerformed

    private void buttonLk_DebitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLk_DebitActionPerformed
        if(FieldLk_idPembayaran.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Anda Harus mencari ID PASIEN terlebih dahulu");
        }
        else if(!FieldLk_idPembayaran.getText().equals("")){
            String Status = "LUNAS DEBIT";
            try {
                bag_PembayaranService.updateStatusPembayaran(FieldLk_idPembayaran.getText(), Status);
                String newStatus = bag_PembayaranService.getStatus(FieldLk_idPembayaran.getText());
                if(newStatus.equals("LUNAS DEBIT")){
                    JOptionPane.showMessageDialog(null, "Transaksi Pembayaran dengan Debit Berhasil");
                    FieldLk_status.setText(newStatus);
                    buttonLk_Print.setEnabled(true);
                    buttonLk_Tunai.setEnabled(false);
                    buttonLk_Debit.setEnabled(false);
                }
                else if(newStatus.equals("HUTANG")){
                    JOptionPane.showMessageDialog(null, "Maaf, Transaksi Pembayaran dengan Debit Tidak Berhasil");
                }
            } catch (RemoteException ex) {
                Logger.getLogger(FormBag_Pembayaran.class.getName()).log(Level.ALL, null, ex);
            }
        }
    }//GEN-LAST:event_buttonLk_DebitActionPerformed

    private void buttonLk_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLk_PrintActionPerformed
        JasperPrint jasperPrint = null;
        try {
            JasperCompileManager.compileReportToFile("src/Report/buktiPembayaran.jrxml");
            HashMap hash = new HashMap();
            //            hash.put("ID_PEMBAYARAN",FieldLk_idPembayaran.getText());
            //            System.out.println(FieldLk_idPembayaran.getText());
            jasperPrint = JasperFillManager.fillReport("src/Report/buktiPembayaran.jasper", hash,
                new JRTableModelDataSource(tableModelPembayaranPrint));
            JasperViewer jasperViewer = new JasperViewer(jasperPrint);
            jasperViewer.setVisible(true);
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_buttonLk_PrintActionPerformed

    private void buttonPo_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPo_searchActionPerformed
        if(FieldPo_idResep.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Anda Belum menginputkan ID RESEP");
        }
        else if( !FieldPo_idResep.getText().equals("")){
            List simpan = new ArrayList();
            try {
                Pembayaran pembayaran = bag_PembayaranService.MeihatTotalTagihanPembelianObat(FieldPo_idResep.getText());
                simpan =  bag_PembayaranService.getObat_detailresep(FieldPo_idResep.getText());
                tableModelObat_detailResep.setData(simpan);
                if(pembayaran != null){
                    FieldPo_idPembayaran.setText(pembayaran.getID_PEMBAYARAN());
                    FieldPo_tglPembayaran.setValue(pembayaran.getTANGGAL_BAYAR());
                    FieldPo_totalPembayaran.setText(String.valueOf(pembayaran.getTOTAL_HARGA()));
                    FieldPo_status.setText(pembayaran.getSTATUS());
                    buttonPo_Tunai.setEnabled(true);
                    buttonPo_Debit.setEnabled(true);
                }
                else if(pembayaran == null){
                    JOptionPane.showMessageDialog(null, "Pasien tidak memiliki tagihan pembayaran");
                }
            } catch (RemoteException ex) {
                Logger.getLogger(FormBag_Pembayaran.class.getName()).log(Level.ALL, null, ex);
            }
        }
    }//GEN-LAST:event_buttonPo_searchActionPerformed

    private void FieldPo_idResepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPo_idResepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPo_idResepActionPerformed

    private void buttonPo_TunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPo_TunaiActionPerformed
        if(FieldPo_idPembayaran.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Anda Harus mencari ID PASIEN terlebih dahulu");
        }
        else if(!FieldPo_idPembayaran.getText().equals("")){
            String Status = "LUNAS TUNAI";
            try {
                String statusBaru = bag_PembayaranService.updateStatusPembayaran(FieldPo_idPembayaran.getText(), Status);
                String newStatus = bag_PembayaranService.getStatus(FieldPo_idPembayaran.getText());
                if(newStatus.equals("LUNAS TUNAI")){
                    JOptionPane.showMessageDialog(null, "Transaksi Pembayaran dengan Tunai Berhasil");
                    FieldPo_status.setText(newStatus);
                    buttonPo_Print.setEnabled(true);
                    buttonPo_Tunai.setEnabled(false);
                    buttonPo_Debit.setEnabled(false);
                }
                else if(newStatus.equals("HUTANG")){
                    JOptionPane.showMessageDialog(null, "Maaf, Transaksi Pembayaran dengan Tunai Tidak Berhasil");
                }
            } catch (RemoteException ex) {
                Logger.getLogger(FormBag_Pembayaran.class.getName()).log(Level.ALL, null, ex);
            }
        }
    }//GEN-LAST:event_buttonPo_TunaiActionPerformed

    private void buttonPo_DebitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPo_DebitActionPerformed
        if(FieldPo_idPembayaran.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Anda Harus mencari ID PASIEN terlebih dahulu");
        }
        else if(!FieldPo_idPembayaran.getText().equals("")){
            String Status = "LUNAS DEBIT";
            try {
                bag_PembayaranService.updateStatusPembayaran(FieldPo_idPembayaran.getText(), Status);
                String newStatus = bag_PembayaranService.getStatus(FieldPo_idPembayaran.getText());
                if(newStatus.equals("LUNAS DEBIT")){
                    JOptionPane.showMessageDialog(null, "Transaksi Pembayaran dengan Debit Berhasil");
                    FieldPo_status.setText(newStatus);
                    buttonPo_Print.setEnabled(true);
                    buttonPo_Tunai.setEnabled(false);
                    buttonPo_Debit.setEnabled(false);
                }
                else if(newStatus.equals("HUTANG")){
                    JOptionPane.showMessageDialog(null, "Maaf, Transaksi Pembayaran dengan Debit Tidak Berhasil");
                }
            } catch (RemoteException ex) {
                Logger.getLogger(FormBag_Pembayaran.class.getName()).log(Level.ALL, null, ex);
            }
        }
    }//GEN-LAST:event_buttonPo_DebitActionPerformed

    private void buttonPo_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPo_PrintActionPerformed
        JasperPrint jasperPrint = null;
        try {
            JasperCompileManager.compileReportToFile("src/Report/buktiPembayaran.jrxml");
            HashMap hash = new HashMap();
            //            hash.put("ID_PEMBAYARAN",FieldLk_idPembayaran.getText());
            //            System.out.println(FieldLk_idPembayaran.getText());
            jasperPrint = JasperFillManager.fillReport("src/Report/buktiPembayaran.jasper", hash,
                new JRTableModelDataSource(tableModelPembayaranPrint));
            JasperViewer jasperViewer = new JasperViewer(jasperPrint);
            jasperViewer.setVisible(true);
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_buttonPo_PrintActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLk_search;
    private javax.swing.JTextField FieldLk_Kecantikan;
    private javax.swing.JTextField FieldLk_Lab;
    private javax.swing.JTextField FieldLk_RekamMedis;
    private javax.swing.JTextField FieldLk_Resep;
    private javax.swing.JTextField FieldLk_Usg;
    private javax.swing.JTextField FieldLk_idPasien;
    private javax.swing.JTextField FieldLk_idPembayaran;
    private javax.swing.JTextField FieldLk_namaPasien;
    private javax.swing.JTextField FieldLk_status;
    private javax.swing.JFormattedTextField FieldLk_tglPembayaran;
    private javax.swing.JTextField FieldLk_totalPembayaran;
    private javax.swing.JTextField FieldPo_idPembayaran;
    private javax.swing.JTextField FieldPo_idResep;
    private javax.swing.JTextField FieldPo_status;
    private javax.swing.JFormattedTextField FieldPo_tglPembayaran;
    private javax.swing.JTextField FieldPo_totalPembayaran;
    private javax.swing.JLabel Lk_Kecantikan;
    private javax.swing.JLabel Lk_Lab;
    private javax.swing.JLabel Lk_RekamMedis;
    private javax.swing.JLabel Lk_Resep;
    private javax.swing.JLabel Lk_Usg;
    private javax.swing.JLabel Lk_idPasien;
    private javax.swing.JLabel Lk_idPembayaran;
    private javax.swing.JLabel Lk_idPembayaran1;
    private javax.swing.JLabel Lk_namaPasien;
    private javax.swing.JLabel Lk_status;
    private javax.swing.JLabel Lk_status1;
    private javax.swing.JLabel Lk_tglPembayaran;
    private javax.swing.JLabel Lk_tglPembayaran1;
    private javax.swing.JLabel Lk_totalPembayaran;
    private javax.swing.JLabel Lk_totalPembayaran1;
    private javax.swing.JLabel Po_idPasien;
    public javax.swing.JTable Table_Pembayaran;
    private javax.swing.JTable Table_Resep;
    private javax.swing.JButton buttonLk_Debit;
    private javax.swing.JButton buttonLk_Exit;
    private javax.swing.JButton buttonLk_Print;
    private javax.swing.JButton buttonLk_Tunai;
    private javax.swing.JButton buttonPo_Debit;
    private javax.swing.JButton buttonPo_Exit;
    private javax.swing.JButton buttonPo_Print;
    private javax.swing.JButton buttonPo_Tunai;
    private javax.swing.JButton buttonPo_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
