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

//import ClientApplication.FormLogin;
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
  
    LabService labService;
    private TableModelLab_detailLab tableLabDetailLab = new TableModelLab_detailLab();
    public List<Lab_tabelMaster> listLaboratorium = new ArrayList<Lab_tabelMaster>();
    private List<Lab_detailLab> listDetailLab = new ArrayList<Lab_detailLab>();
    public ArrayList<Object> details = new ArrayList<Object>();
    
    public Boolean pasienExist = false;
    public Antrian antrian = null;
    
    public FormLab(LabService labService) {
        initComponents();
        jTabbedPane1.setEnabledAt(1, false);
        this.labService = labService;
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
        idPasien2 = new javax.swing.JTextField();
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
        Kembali = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        namaPasien2 = new javax.swing.JTextField();
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

        idPasien.setEditable(false);

        namaPasien.setEditable(false);

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

        idPasien2.setEditable(false);
        idPasien2.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N

        idTransaksi.setEditable(false);
        idTransaksi.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N

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

        idDetLab.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        idDetLab.setEnabled(false);

        hargaJenis.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        hargaJenis.setEnabled(false);
        hargaJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaJenisActionPerformed(evt);
            }
        });

        hasilPemeriksaan.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        hasilPemeriksaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilPemeriksaanActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel11.setText("Hasil Pemeriksaan  :");

        Keterangan.setColumns(20);
        Keterangan.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
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
        insertPemeriksaan.setText("Insert Pemeriksaan ke Tabel");
        insertPemeriksaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPemeriksaanActionPerformed(evt);
            }
        });

        deletePemeriksaan.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        deletePemeriksaan.setText("Delete Pemeriksaan pada Tabel");
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(insertPemeriksaan)
                        .addGap(66, 66, 66)
                        .addComponent(deletePemeriksaan)
                        .addGap(68, 68, 68))))
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
        Save.setText("Save ke DataBase");
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

            },
            new String [] {
                "Id_Detail_Lab", "Id_Transaksi_Lab", "Id_Lab", "Hasil", "Keterangan "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableDetLab);

        Kembali.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        Kembali.setText("KEMBALI AWAL");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel6.setText("Nama Pasien :");

        namaPasien2.setEditable(false);
        namaPasien2.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idPasien2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(namaPasien2))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(Clear)
                        .addGap(67, 67, 67)
                        .addComponent(Save))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Proses)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kembali))
                    .addComponent(jScrollPane2))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idPasien2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(idTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(namaPasien2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear)
                    .addComponent(Save)
                    .addComponent(jLabel12)
                    .addComponent(totalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Proses)
                    .addComponent(Kembali))
                .addContainerGap(127, Short.MAX_VALUE))
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
        if(!listDetailLab.isEmpty() && !idTransaksi.getText().equals("")){
            Lab_transaksiLab transaksi = new Lab_transaksiLab();
            try {
                transaksi.setId_Transaksi_Lab(idTransaksi.getText());
                transaksi.setId_Pasien(idPasien2.getText());
                transaksi.setTotal_Harga(checkTotal());
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = new Date();
                String now = dateFormat.format(date);
                transaksi.setTanggal(now);
                boolean berhasil = labService.insertLab_transaksiLab(transaksi);
                if(!berhasil){
                        JOptionPane.showMessageDialog(this,"Insert data gagal !", "Transaksi", JOptionPane.ERROR_MESSAGE);
                    } 
                for(int i=0;i<listDetailLab.size();i++){
                    Lab_detailLab detail = new Lab_detailLab();
                    detail.setId_Detail_Lab(listDetailLab.get(i).getId_Detail_Lab());
                    detail.setId_Transaksi_Lab(listDetailLab.get(i).getId_Transaksi_Lab());
                    detail.setId_Lab(listDetailLab.get(i).getId_Lab());
                    detail.setHasil (listDetailLab.get(i).getHasil());
                    detail.setKeterangan(listDetailLab.get(i).getKeterangan());
                    berhasil = labService.insertLab_detailLab(detail);       
                    if(!berhasil){
                        JOptionPane.showMessageDialog(this,"Insert gagal !", "Transaksi", JOptionPane.ERROR_MESSAGE);
                    }
                }
                if(berhasil) {
                    JOptionPane.showMessageDialog(this,"Berhasil !", "Transaksi", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (RemoteException ex) {
                Logger.getLogger(FormLab.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Ada beberapa field yang belum terisi !", "Transaksi", JOptionPane.WARNING_MESSAGE);
        }
                                   
    }//GEN-LAST:event_SaveActionPerformed

    private void uploadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadFileActionPerformed
        // TODO add your handling code here:
        browseDOC();
    }//GEN-LAST:event_uploadFileActionPerformed

    private void insertPemeriksaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPemeriksaanActionPerformed
        // TODO add your handling code here:
            if (!idTransaksi.getText().equals("") && !hargaJenis.getText().equals("") && !idDetLab.getText().equals("")){
            String idtrans = idTransaksi.getText();
            String iddetail = idDetLab.getText();
            String idjenpem = listLaboratorium.get(comboJenisPem.getSelectedIndex()).getId_Lab();
            String keterangan = Keterangan.getText();
            String hasil = hasilPemeriksaan.getText();
            Lab_detailLab detail = new Lab_detailLab();
            detail.setId_Detail_Lab(iddetail);
            detail.setId_Transaksi_Lab(idtrans);
            detail.setId_Lab(idjenpem);
            detail.setHasil(hasil);
            detail.setKeterangan(keterangan);
            listDetailLab.add(detail);
            tableLabDetailLab.setData(listDetailLab);
            tableDetLab.setModel(tableLabDetailLab);
            totalHarga.setText(Integer.toString(checkTotal()));
            hargaJenis.setText("");
            Keterangan.setText("");
            
            try {
                String iddettrans = getNextNumberDetailTransaksi(listDetailLab.get(listDetailLab.size()-1).getId_Detail_Lab());
                idDetLab.setText(iddettrans);
                idDetLab.setEditable(false);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,"Auto Number ERROR !\nSilahkan tuliskan manual", "Generate gagal", JOptionPane.ERROR_MESSAGE);
                idDetLab.setEditable(true);
                Logger.getLogger(FormLab.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog(this,"Silahkan isi field yang masih kosong", "Ada beberapa field kosong", JOptionPane.INFORMATION_MESSAGE);
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
        if(idTransaksi.isEditable()){
            idTransaksi.setText("");
        }
        hargaJenis.setText("");
        Keterangan.setText("");
        listDetailLab = new ArrayList<Lab_detailLab>();
        tableLabDetailLab.setData(listDetailLab);
        tableDetLab.setModel(tableLabDetailLab);
        totalHarga.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
        // TODO add your handling code here:
        //-----Pembayaran-----//
        String idPasien2 = idPasien.getText();
        String idTransaksiLab2 = idTransaksi.getText();
        int harga = Integer.parseInt(totalHarga.getText());
        try {
            String idPembayaran = labService.mencariIdPembayaranDariPembayaran(idPasien2);
            if(!idPembayaran.equalsIgnoreCase("")){
                Pembayaran pembayaran = labService.getPembayaranDariPembayaran(idPembayaran);
                labService.updatePembayaranDariPembayaran(pembayaran, idTransaksiLab2, harga);
            }
            else if(idPembayaran.equalsIgnoreCase("")){
                idPembayaran = labService.getAutoNumberDariPembayaran();
                labService.insertPembayaranDariPembayaran(idPembayaran, idPasien2, idTransaksiLab2, harga);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FormLab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ProsesActionPerformed

    private void pasinSelanjutnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasinSelanjutnyaActionPerformed
        // TODO add your handling code here:
         try {          
            if(antrian!=null){
                antrian.setKeterangan("SUDAH");
                boolean update = labService.updateAntrian(antrian);
                if(update=false){
                    JOptionPane.showMessageDialog(this,"Status antrian tidak dapat diupdate !", "UPDATE GAGAL", JOptionPane.ERROR_MESSAGE);
                }
            }
            antrian = new Antrian();
            antrian = labService.getPasienSelanjutnya();
            if(antrian != null){
                idPasien.setText(antrian.getId_Pasien());
                String nama = labService.getNamaPasien(antrian.getId_Pasien());
                if (nama != null){
                    namaPasien.setText(nama);
                    namaPasien2.setText(nama);
                }
            else{
                JOptionPane.showMessageDialog(this,"Nama pasien tidak ada !", "Tidak Ada", JOptionPane.ERROR_MESSAGE);
            }
           
            dataTransaksi.setEnabled(true); 
            
        } 
            else{
                dataTransaksi.setEnabled(false);
                idPasien.setText("");
                namaPasien.setText("");
                JOptionPane.showMessageDialog(this,"Tidak ada antrian layanan laboratorium !", "Antrian masih kosong", JOptionPane.ERROR_MESSAGE);
            }          
        } catch (RemoteException ex) {
            Logger.getLogger(FormLab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pasinSelanjutnyaActionPerformed

    private void dataTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTransaksiActionPerformed
        // TODO add your handling code here:
        dataTransaksi.setEnabled(false);
        jTabbedPane1.setSelectedIndex(1);
        jTabbedPane1.setEnabledAt(0, false);
        jTabbedPane1.setEnabledAt(1, true);
        idPasien2.setText(antrian.getId_Pasien());
        try {
            String idtrans = labService.getAutoNumberTransaksi();
            if (idtrans != null){
                idTransaksi.setText(idtrans);              
            }
            else{
                JOptionPane.showMessageDialog(this,"Auto Number Transaksi ERROR !\nSilahkan tuliskan manual", "Generate gagal", JOptionPane.ERROR_MESSAGE);
                idTransaksi.setEditable(true);
            }
        } 
            catch (RemoteException ex) {
            JOptionPane.showMessageDialog(this,"Auto Number Transaksi ERROR !\nSilahkan tuliskan manual", "Generate gagal", JOptionPane.ERROR_MESSAGE);
            idTransaksi.setEditable(true);
            Logger.getLogger(FormLab.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(idDetLab.getText().equals("")){
            try {
                String iddettrans = labService.getAutoNumberDetailTransaksi();
                if (iddettrans != null){
                    idDetLab.setText(iddettrans);
                    idDetLab.setEditable(false);
                }
                else{
                    JOptionPane.showMessageDialog(this,"Auto Number id DetaialTransaksi ERROR !\nSilahkan tuliskan manual", "Generate gagal", JOptionPane.ERROR_MESSAGE);
                    idDetLab.setEditable(true);
                }
            } catch 
                    (RemoteException ex) {
                JOptionPane.showMessageDialog(this,"Auto Number id DetaialTransaksi ERROR!\nSilahkan tuliskan manual", "Generate gagal", JOptionPane.ERROR_MESSAGE);
                idDetLab.setEditable(true);
                Logger.getLogger(FormLab.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_dataTransaksiActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(0, true);
        this.ClearActionPerformed(evt);
    }//GEN-LAST:event_KembaliActionPerformed

      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Kembali;
    private javax.swing.JTextArea Keterangan;
    private javax.swing.JButton Proses;
    private javax.swing.JButton Save;
    private javax.swing.JComboBox comboJenisPem;
    private javax.swing.JButton dataTransaksi;
    private javax.swing.JButton deletePemeriksaan;
    private javax.swing.JTextField hargaJenis;
    private javax.swing.JTextField hasilPemeriksaan;
    private javax.swing.JTextField idDetLab;
    private javax.swing.JTextField idPasien;
    private javax.swing.JTextField idPasien2;
    private javax.swing.JTextField idTransaksi;
    private javax.swing.JButton insertPemeriksaan;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JTextField namaPasien2;
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
        String name = jfc.getSelectedFile().getName();
        hasilPemeriksaan.setText(name);
    }
    
//     private String validatePath(String invalidPath){
//        String validPath;
//        validPath = invalidPath.replace('\\', '/');
//        return validPath;
//    }

    private String getNextNumberDetailTransaksi(String dettrans){
        int numberBaru =0;
        String nomerBaru = "";
        String [] pisah = dettrans.split("(?<=\\G.{1})");
            String numbersebelumnya = pisah[2]+pisah[3]+pisah[4]+pisah[5];
            numberBaru = Integer.parseInt(numbersebelumnya)+1;
            String [] pisah1 = String.valueOf(numberBaru).split("(?<=\\G.{1})");
            String nol= "";
            if(pisah1.length == 1){
                nol = "000";
            }
            else if (pisah1.length == 2){
                nol = "00";
            }
            else if(pisah1.length == 3){
                nol = "0";
            }
            nomerBaru = "DL"+nol+numberBaru;
            System.out.println(nomerBaru);
            return nomerBaru;
    }
}