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
import Database.Entity.Antrian;
import Database.Entity.Lab_detailLab;
import Database.Entity.Lab_tabelMaster;
import Database.Entity.Lab_transaksiLab;
import Database.Entity.Pembayaran;
import Database.Service.LabService;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

    private static final long serialVersionUID = 1L;
    private Antrian antrian= new Antrian();
    private String idLabisi = "";
    private String tggl = "";
    
    
 LabService labService;
    private TableModelLab_detailLab tableLabDetailLab = new TableModelLab_detailLab();
    public List<Lab_tabelMaster> listLaboratorium = new ArrayList<Lab_tabelMaster>();
    private List<Lab_detailLab> listDetailLab = new ArrayList<Lab_detailLab>();
    public ArrayList<Object> details = new ArrayList<Object>();
    
    public Boolean pasienExist = false;
    public int number = 1;
    
    public FormLab(LabService labService) {
        this.labService = labService;
        initComponents();
        
        try {
            listLaboratorium = labService.getLaboratorium();
        } catch (RemoteException ex) {
            Logger.getLogger(FormLab.class.getName()).log(Level.SEVERE, null, ex);
        }
        setComboboxJenisPemeriksaan();
        comboJenisPem.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent event) {
                
                String harga = Integer.toString(listLaboratorium.get(comboJenisPem.getSelectedIndex()).getHarga());
                hargaJenis.setText(harga);
            }
        });   
    }
    @SuppressWarnings("unchecked")
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idPasien = new javax.swing.JTextField();
        namaPasien = new javax.swing.JTextField();
        pasinSelanjutnya = new javax.swing.JButton();
        dataTransaksi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idPasein = new javax.swing.JTextField();
        idTransaksi = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboJenisPem = new javax.swing.JComboBox();
        idDetLab = new javax.swing.JTextField();
        hargaJenis = new javax.swing.JTextField();
        hasilPemeriksaan = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Keterangan = new javax.swing.JTextArea();
        uploadFile = new javax.swing.JButton();
        insertPemeriksaan = new javax.swing.JButton();
        deletePemeriksaan = new javax.swing.JButton();
        Proses = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        totalHarga = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDetLab = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        jTabbedPane1.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel3.setText("ID Pasien         :");

        jLabel2.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel2.setText("Nama Pasien    :");

        pasinSelanjutnya.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        pasinSelanjutnya.setText("Pasien Selanjutnya");
        pasinSelanjutnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasinSelanjutnyaActionPerformed(evt);
            }
        });

        dataTransaksi.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        dataTransaksi.setText("Data Transaksi");
        dataTransaksi.setEnabled(false);
        dataTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataTransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(607, 607, 607)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(52, 52, 52)
                                .addComponent(idPasien))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pasinSelanjutnya)
                                    .addComponent(jLabel2))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(namaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dataTransaksi))))))
                .addGap(608, 608, 608))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(idPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pasinSelanjutnya)
                    .addComponent(dataTransaksi))
                .addGap(337, 337, 337))
        );

        jTabbedPane1.addTab("PASIEN", jPanel1);

        jLabel4.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel4.setText("ID Pasien      :");

        jLabel5.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel5.setText("ID Transaksi   : ");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel7.setText("ID Detail Lab        :");

        jLabel8.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel8.setText("Jenis Pemeriksaan  :");

        jLabel9.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel9.setText("Harga                  :");

        jLabel10.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel10.setText("Keterangan          :");

        comboJenisPem.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        comboJenisPem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilihan Jenis Pemeriksaan" }));

        idDetLab.setEnabled(false);

        hargaJenis.setEnabled(false);
        hargaJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaJenisActionPerformed(evt);
            }
        });

        hasilPemeriksaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilPemeriksaanActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel11.setText("Hasil Pemeriksaan  :");

        Keterangan.setColumns(20);
        Keterangan.setRows(5);
        jScrollPane1.setViewportView(Keterangan);

        uploadFile.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        uploadFile.setText("Browser");
        uploadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadFileActionPerformed(evt);
            }
        });

        insertPemeriksaan.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        insertPemeriksaan.setText("Insert Pemeriksaan");
        insertPemeriksaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPemeriksaanActionPerformed(evt);
            }
        });

        deletePemeriksaan.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        deletePemeriksaan.setText("Delete Pemeriksaan");
        deletePemeriksaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePemeriksaanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hasilPemeriksaan, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idDetLab, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboJenisPem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hargaJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uploadFile)
                        .addContainerGap(83, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(insertPemeriksaan)
                        .addGap(18, 18, 18)
                        .addComponent(deletePemeriksaan)
                        .addGap(116, 116, 116))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(idDetLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboJenisPem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(hargaJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(hasilPemeriksaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uploadFile))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertPemeriksaan)
                    .addComponent(deletePemeriksaan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Proses.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        Proses.setText("Proses");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });

        Save.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel12.setText("Total Harga          :");

        tableDetLab.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        tableDetLab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Detail Lab", "ID Transaksi", "ID Jenis Pemeriksaan", "Hasil Pemeriksaan", "Keterangan "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDetLab.setMaximumSize(new java.awt.Dimension(2147483647, 0));
        tableDetLab.setMinimumSize(new java.awt.Dimension(75, 0));
        tableDetLab.setPreferredSize(new java.awt.Dimension(375, 0));
        jScrollPane2.setViewportView(tableDetLab);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Search.png"))); // NOI18N

        jButton3.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jButton3.setText("KEMBALI AWAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idPasein)
                                    .addComponent(idTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 15, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(Clear)
                        .addGap(71, 71, 71)
                        .addComponent(Save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Proses)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane2))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(idPasein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(idTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Clear)
                        .addComponent(Save))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(totalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Proses)
                        .addComponent(jButton3)))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DATA TRANSAKSI", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 130, 1230, 680);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/7.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 800));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 800));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 800));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed

    }//GEN-LAST:event_jTextField11ActionPerformed

    private void hargaJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaJenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaJenisActionPerformed

    private void hasilPemeriksaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilPemeriksaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilPemeriksaanActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        if(pasienExist = true && !listDetailLab.isEmpty() && !idTransaksi.getText().equals("")){
            Lab_transaksiLab transaksi = new Lab_transaksiLab();
            try {
                transaksi.setId_Transaksi_Lab(idTransaksi.getText());
                transaksi.setId_Pasien(idPasien.getText());
                transaksi.setTotal_Harga(checkTotal());
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = new Date();
                
                String now = dateFormat.format(date);
                
                transaksi.setTanggal(now);
                labService.insertLab_transaksiLab(transaksi);
                
                for(int i=0;i<listDetailLab.size();i++){
                    Lab_detailLab detail = new Lab_detailLab();
                    detail.setId_Detail_Lab(listDetailLab.get(i).getId_Detail_Lab());
                    detail.setId_Transaksi_Lab(listDetailLab.get(i).getId_Transaksi_Lab());
                    detail.setId_Lab(listDetailLab.get(i).getId_Lab());
                    detail.setHasil(listDetailLab.get(i).getHasil());
                    detail.setKeterangan(listDetailLab.get(i).getKeterangan());
                    labService.insertLab_transaksiLab(transaksi);
                }
            } catch (RemoteException ex) {
                Logger.getLogger(FormLab.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(pasienExist = false){
            System.out.println("Silakan Mengisi ID Pasien terlebih dahulu");
        }
        else{
            System.out.println("Beberapa Field Masih Kosong..");
        }       

    }//GEN-LAST:event_SaveActionPerformed

    private void uploadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadFileActionPerformed
        // TODO add your handling code here:
        browseDOC();
    }//GEN-LAST:event_uploadFileActionPerformed

    private void insertPemeriksaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPemeriksaanActionPerformed
        // TODO add your handling code here:
          if (!idTransaksi.getText().equals("")){
            String idtransaksi = idTransaksi.getText();
            String iddetail = idtransaksi +"-"+ number;
            number++;
            String idjenispemeriksaan = listLaboratorium.get( comboJenisPem.getSelectedIndex()).getId_Lab();
            String keterangan = Keterangan.getText();
            Lab_detailLab detail = new Lab_detailLab();
            detail.setId_Detail_Lab(iddetail);
            detail.setId_Transaksi_Lab(idtransaksi);
            detail.setId_Lab(idjenispemeriksaan);
            detail.setKeterangan(keterangan);
           
            listDetailLab.add(detail);
            tableLabDetailLab.setData(listDetailLab);
            tableDetLab.setModel(tableLabDetailLab);
            totalHarga.setText(Integer.toString(checkTotal()));
        }
    }//GEN-LAST:event_insertPemeriksaanActionPerformed

    private void deletePemeriksaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePemeriksaanActionPerformed
        // TODO add your handling code here:
         if(tableDetLab.getSelectedRow() > -1){
            listDetailLab.remove(tableDetLab.getSelectedRow());
            tableLabDetailLab.setData(listDetailLab);
            tableDetLab.setModel(tableLabDetailLab);
            totalHarga.setText(Integer.toString(checkTotal()));
        }
    }//GEN-LAST:event_deletePemeriksaanActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        number = 1;
       
        idPasien.setEditable(false);
        idTransaksi.setText("");
        idDetLab.setText("");
        hargaJenis.setText("");   
        Keterangan.setText("");
        hasilPemeriksaan.setText("");
        listDetailLab = new ArrayList<Lab_detailLab>();
        tableLabDetailLab.setData(listDetailLab);
        tableDetLab.setModel(tableLabDetailLab);
        totalHarga.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
        // TODO add your handling code here:
        //-----Pembayaran-----//
        String idPasien2 = idPasien.getText();
        String idDetailLab2 = idDetLab.getText();
        int harga = Integer.parseInt(totalHarga.getText());
        try {
            String idPembayaran = labService.mencariIdPembayaranDariPembayaran(idPasien2);
            if(!idPembayaran.equalsIgnoreCase("")){
                Pembayaran pembayaran = labService.getPembayaranDariPembayaran(idPembayaran);
                labService.updatePembayaranDariPembayaran(pembayaran, idDetailLab2, harga);
            }
            else if(idPembayaran.equalsIgnoreCase("")){
                idPembayaran = labService.getAutoNumberDariPembayaran();
                labService.insertPembayaranDariPembayaran(idPembayaran, idPasien2, idDetailLab2, harga);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FormLab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ProsesActionPerformed

    private void pasinSelanjutnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasinSelanjutnyaActionPerformed
        // TODO add your handling code here:
         try {          
            if(antrian!=null){
                antrian.setKeterangan("sudah dilayani");
                boolean update = labService.updateAntrian(antrian);
                if(update=false){
                    JOptionPane.showMessageDialog(this,"Status antrian tidak dapat diupdate !", "UPDATE GAGAL", JOptionPane.ERROR_MESSAGE);
                }
            }
            antrian = new Antrian();
            antrian = labService.getPasienSelanjutnya();
            if(antrian != null){
                idPasien.setText(antrian.getId_Pasien());
            }
            else{
                JOptionPane.showMessageDialog(this,"Tidak ada antrian di layanan Laboratorium !", "ANTRIAN KOSONG", JOptionPane.ERROR_MESSAGE);
            }
            String nama = labService.getNamaPasien(antrian.getId_Pasien());
            if (nama != null){
                namaPasien.setText(nama);
            }
            else{
               // JOptionPane.showMessageDialog(this, "Nama pasien tidak ada", " Tidak Ada" JOptionPane.ERROR_MESSAGE);
            }
            dataTransaksi.setEnabled(true); 
            
        } catch (RemoteException ex) {
            Logger.getLogger(FormLab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pasinSelanjutnyaActionPerformed

    private void dataTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataTransaksiActionPerformed

      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JTextArea Keterangan;
    private javax.swing.JButton Proses;
    private javax.swing.JButton Save;
    private javax.swing.JComboBox comboJenisPem;
    private javax.swing.JButton dataTransaksi;
    private javax.swing.JButton deletePemeriksaan;
    private javax.swing.JTextField hargaJenis;
    private javax.swing.JTextField hasilPemeriksaan;
    private javax.swing.JTextField idDetLab;
    private javax.swing.JTextField idPasein;
    private javax.swing.JTextField idPasien;
    private javax.swing.JTextField idTransaksi;
    private javax.swing.JButton insertPemeriksaan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField namaPasien;
    private javax.swing.JButton pasinSelanjutnya;
    private javax.swing.JTable tableDetLab;
    private javax.swing.JTextField totalHarga;
    private javax.swing.JButton uploadFile;
    // End of variables declaration//GEN-END:variables

     private void setComboboxJenisPemeriksaan() {
       comboJenisPem.removeAllItems();
        try {
            listLaboratorium = labService.getLaboratorium();
            for (int i = 0; i < listLaboratorium.size(); i++) {
                comboJenisPem.addItem(listLaboratorium.get(i).getJenis_Pemeriksaan());
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FormLab.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    private int checkTotal() {
        int total = 0;
        if(listDetailLab.size()>0){
            for(int i=0;i<listDetailLab.size();i++){
                int harga = 0;
                for (int j=0;j<listLaboratorium.size();j++){
                    if(listDetailLab.get(i).getId_Lab() == listLaboratorium.get(j).getId_Lab()){
                        harga = listLaboratorium.get(j).getHarga();
                    }
                }
                total = total + harga;
            } 
        }
        return total;
    }

    private void browseDOC() {
        JFileChooser jfc = new JFileChooser();
        javax.swing.filechooser.FileFilter fileFilter = new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(File f) {
                if(f.getName().toLowerCase().endsWith(".doc") || f.isDirectory() ){
                    return true;
                }else{
                    return false;
                }
            }
            @Override
            public String getDescription() {
                return "*.doc";
            }
        };

        jfc.addChoosableFileFilter(fileFilter);
        jfc.setMultiSelectionEnabled(false);
        jfc.showOpenDialog(this);
        //mengambil path file
        String path = jfc.getSelectedFile().getAbsolutePath();
        hasilPemeriksaan.setText(path);
    }
    
     private String validatePath(String invalidPath){
        String validPath;
        validPath = invalidPath.replace('\\', '/');
        return validPath;
    }

    
}
