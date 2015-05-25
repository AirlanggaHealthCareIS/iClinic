/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientApplication.form;

import ClientApplication.FormLogin;
import ClientApplication.model.TableModelObat_detailResep;
import ClientApplication.model.TableModelObat_detailResepPembelian;
import Database.Entity.Obat_detailResep;
import ClientApplication.model.TableModelObat_resep;
import Database.Entity.Obat_resep;
import ClientApplication.model.TableModelObat_tabelMaster;
import Database.Entity.Obat_detailResepPembelian;
import Database.Entity.Obat_tabelMaster;
import Database.Entity.Pembayaran;
import Database.Service.ApotekerService;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author RinduPW
 */
public class FormApoteker extends javax.swing.JFrame {

      private TableModelObat_detailResep tableModelObat_detailResep = new TableModelObat_detailResep();
    private TableModelObat_detailResep tableModelObat_detailResepPO = new TableModelObat_detailResep();
    private TableModelObat_detailResepPembelian tableModelObat_detailResepPR = new TableModelObat_detailResepPembelian();
    private ApotekerService apotekerService;
    int total = 0;
    String idResep;
    
    public FormApoteker(ApotekerService apotekerService) {
        this.apotekerService = apotekerService;
        try {
            tableModelObat_detailResepPO.setData(this.apotekerService.getObat_detailresep(null));
            idResep = apotekerService.getAutoNumberDariResep();
        } catch (RemoteException exception) {
            exception.printStackTrace();
        }
        
//        this.apotekerService = apotekerService;
//        try {
//            tableModelObat_detailResepPR.setData(this.apotekerService.getObat_detailResepPembelian(null));
//            idResep = apotekerService.getAutoNumberDariResep();
//        } catch (RemoteException exception) {
//            exception.printStackTrace();
//        }
        
        initComponents();
        setLocationRelativeTo(this);
        setSize(665, 730);

        Table_Apotek.setModel(tableModelObat_detailResep);
        Table_Apotek.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                int row = Table_Apotek.getSelectedRow();
                if (row != -1) {
                    Obat_detailResep obat_detailResep = new Obat_detailResep();
                }
            }
        });
        
        TabelDetailResepPO.setModel(tableModelObat_detailResepPO);
        TabelDetailResepPO.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                int row = TabelDetailResepPO.getSelectedRow();
                if (row != -1) {
                    Obat_detailResep obat_detailResep = tableModelObat_detailResepPO.get(row);
                    idResepField.setText(obat_detailResep.getId_Resep());
                    noDetailResepField.setText(obat_detailResep.getNo_Detail_Resep());
                    
               }
            }
        });
        PenukaranResepTable3.setModel(tableModelObat_detailResepPR);
        PenukaranResepTable3.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                int row = PenukaranResepTable3.getSelectedRow();
                if (row != -1) {
                    Obat_detailResepPembelian obat_detailResepPembelian = tableModelObat_detailResepPR.get(row);
               }
            }
        });
        
//        PenukaranResepTable3.getModel().addTableModelListener(new TableModelListener() {
//
//            public void tableChanged(TableModelEvent e) {
//                System.out.println(e);
//            }
//        });
    }

    public void clear() {
        TextField_IdResep.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextField_IdResep = new javax.swing.JTextField();
        Button_Search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Apotek = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        clear1 = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        resepPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        noDetailResepLabel = new javax.swing.JLabel();
        namaObatLabel = new javax.swing.JLabel();
        takaranLabel = new javax.swing.JLabel();
        pemakaianLabel = new javax.swing.JLabel();
        hargaLabel = new javax.swing.JLabel();
        jumlahLabel = new javax.swing.JLabel();
        keteranganLabel = new javax.swing.JLabel();
        noDetailResepField = new javax.swing.JTextField();
        namaObatComboBox = new javax.swing.JComboBox();
        takaranSpinner = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        takaranSatuanWaktuComboBox = new javax.swing.JComboBox();
        pemakaianComboBox = new javax.swing.JComboBox();
        hargaField = new javax.swing.JTextField();
        jumlahSpinner = new javax.swing.JSpinner();
        satuanComboBox = new javax.swing.JComboBox();
        keteranganField = new javax.swing.JTextField();
        simpanObatButton = new javax.swing.JButton();
        tambahObatButton = new javax.swing.JButton();
        hapusObatDetailResepButton = new javax.swing.JButton();
        idResepLabel = new javax.swing.JLabel();
        totalHargaObatLabel = new javax.swing.JLabel();
        idResepField = new javax.swing.JTextField();
        totalHargaObatField = new javax.swing.JTextField();
        prosesButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabelDetailResepPO = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jTotalHargaPRLabel21 = new javax.swing.JLabel();
        TotalHargaPRTextField13 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        PenukaranResepTable3 = new javax.swing.JTable();
        IDResepPRLabel2 = new javax.swing.JLabel();
        SearchIDResepPRButton1 = new javax.swing.JButton();
        IDResepPRTextField1 = new javax.swing.JTextField();
        DeletePRButton4 = new javax.swing.JButton();
        ProsesPRButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jPanel1.setLayout(null);

        jLabel1.setText("ID Resep");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 310, 106, 22);

        jLabel3.setText("Detail Resep");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 460, 106, 22);
        jPanel1.add(TextField_IdResep);
        TextField_IdResep.setBounds(120, 310, 183, 22);

        Button_Search.setText("Search");
        Button_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SearchActionPerformed(evt);
            }
        });
        jPanel1.add(Button_Search);
        Button_Search.setBounds(330, 310, 65, 23);

        Table_Apotek.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        Table_Apotek.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table_Apotek);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 500, 610, 100);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/3.jpg"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 0, 1280, 800);

        jTabbedPane1.addTab("LIHAT RESEP", jPanel1);

        jPanel2.setLayout(null);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(100, 330, 183, 22);

        jLabel4.setText("ID Resep");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 290, 106, 22);

        jLabel5.setText("ID Obat");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 330, 106, 22);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(100, 250, 183, 22);

        jLabel8.setText("No. Detail Resep");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 250, 106, 22);
        jPanel2.add(jTextField7);
        jTextField7.setBounds(100, 290, 183, 22);

        jLabel9.setText("Kuantitas");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 410, 106, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(100, 370, 183, 22);

        jLabel10.setText("Nama Obat");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 370, 106, 22);
        jPanel2.add(jTextField8);
        jTextField8.setBounds(100, 410, 50, 22);

        jLabel11.setText("Detail Resep");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 460, 106, 22);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Obat", "Jenis Obat", "Kuantitas", "Harga"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 510, 999, 101);

        clear1.setText("Clear");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });
        jPanel2.add(clear1);
        clear1.setBounds(550, 690, 168, 58);

        submit.setText("Simpan Data");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel2.add(submit);
        submit.setBounds(330, 690, 178, 54);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel2.add(Exit);
        Exit.setBounds(770, 690, 168, 58);

        jLabel20.setText("Total Harga");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(10, 640, 106, 22);
        jPanel2.add(jTextField12);
        jTextField12.setBounds(100, 640, 183, 22);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/3.jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 1280, 810);

        jTabbedPane1.addTab("PENUKARAN RESEP", jPanel2);

        jPanel3.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        noDetailResepLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        noDetailResepLabel.setText("No Detail Resep");

        namaObatLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        namaObatLabel.setText("Nama Obat");

        takaranLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        takaranLabel.setText("Takaran");

        pemakaianLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        pemakaianLabel.setText("Pemakaian");

        hargaLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        hargaLabel.setText("Harga");

        jumlahLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jumlahLabel.setText("Jumlah");

        keteranganLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        keteranganLabel.setText("Keterangan");

        noDetailResepField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        namaObatComboBox.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        namaObatComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Nama Obat --" }));
        namaObatComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                namaObatComboBoxPopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        namaObatComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                namaObatComboBoxItemStateChanged(evt);
            }
        });
        namaObatComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaObatComboBoxActionPerformed(evt);
            }
        });

        takaranSpinner.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel23.setText("kali");

        takaranSatuanWaktuComboBox.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        takaranSatuanWaktuComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "sehari", "seminggu" }));
        takaranSatuanWaktuComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takaranSatuanWaktuComboBoxActionPerformed(evt);
            }
        });

        pemakaianComboBox.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        pemakaianComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Setelah Makan", "Sebelum Makan" }));
        pemakaianComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pemakaianComboBoxActionPerformed(evt);
            }
        });

        hargaField.setEditable(false);
        hargaField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        jumlahSpinner.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        satuanComboBox.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        satuanComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pack", "Botol", "Tablet", "Kapsul", "Sachet", "dus" }));

        keteranganField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        simpanObatButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        simpanObatButton.setText("Simpan Obat");
        simpanObatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanObatButtonActionPerformed(evt);
            }
        });

        tambahObatButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        tambahObatButton.setText("Tambah Obat");
        tambahObatButton.setEnabled(false);
        tambahObatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahObatButtonActionPerformed(evt);
            }
        });

        hapusObatDetailResepButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        hapusObatDetailResepButton.setText("Hapus Obat");
        hapusObatDetailResepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusObatDetailResepButtonActionPerformed(evt);
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
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noDetailResepLabel)
                            .addComponent(namaObatLabel)
                            .addComponent(takaranLabel)
                            .addComponent(pemakaianLabel)
                            .addComponent(hargaLabel)
                            .addComponent(jumlahLabel)
                            .addComponent(keteranganLabel))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jumlahSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(satuanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(takaranSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(takaranSatuanWaktuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(noDetailResepField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namaObatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pemakaianComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hargaField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 113, Short.MAX_VALUE))
                            .addComponent(keteranganField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(hapusObatDetailResepButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tambahObatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(simpanObatButton)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(noDetailResepLabel)
                            .addComponent(noDetailResepField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(namaObatLabel))
                    .addComponent(namaObatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(takaranLabel)
                    .addComponent(takaranSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(takaranSatuanWaktuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pemakaianLabel)
                    .addComponent(pemakaianComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaLabel)
                    .addComponent(hargaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahLabel)
                    .addComponent(jumlahSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(satuanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keteranganLabel)
                    .addComponent(keteranganField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanObatButton)
                    .addComponent(tambahObatButton)
                    .addComponent(hapusObatDetailResepButton))
                .addContainerGap())
        );

        idResepLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        idResepLabel.setText("ID Resep");

        totalHargaObatLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        totalHargaObatLabel.setText("Total Harga Obat");

        idResepField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        totalHargaObatField.setEditable(false);
        totalHargaObatField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        prosesButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        prosesButton.setText("Proses");
        prosesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesButtonActionPerformed(evt);
            }
        });

        TabelDetailResepPO.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        TabelDetailResepPO.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(TabelDetailResepPO);

        javax.swing.GroupLayout resepPanelLayout = new javax.swing.GroupLayout(resepPanel);
        resepPanel.setLayout(resepPanelLayout);
        resepPanelLayout.setHorizontalGroup(
            resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resepPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resepPanelLayout.createSequentialGroup()
                        .addGroup(resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(resepPanelLayout.createSequentialGroup()
                                .addComponent(idResepLabel)
                                .addGap(98, 98, 98)
                                .addComponent(idResepField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(resepPanelLayout.createSequentialGroup()
                                .addComponent(totalHargaObatLabel)
                                .addGap(32, 32, 32)
                                .addComponent(totalHargaObatField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 258, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resepPanelLayout.createSequentialGroup()
                        .addGap(621, 621, 621)
                        .addComponent(prosesButton))
                    .addGroup(resepPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        resepPanelLayout.setVerticalGroup(
            resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resepPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idResepLabel)
                    .addComponent(idResepField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalHargaObatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalHargaObatLabel)
                    .addComponent(prosesButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(resepPanel);
        resepPanel.setBounds(0, 0, 1293, 438);

        jTabbedPane1.addTab("PEMBELIAN OBAT", jPanel3);

        jTotalHargaPRLabel21.setText("Total Harga");

        TotalHargaPRTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalHargaPRTextField13ActionPerformed(evt);
            }
        });

        PenukaranResepTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        PenukaranResepTable3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PenukaranResepTable3KeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(PenukaranResepTable3);

        IDResepPRLabel2.setText("ID Resep");

        SearchIDResepPRButton1.setText("Search");
        SearchIDResepPRButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchIDResepPRButton1ActionPerformed(evt);
            }
        });

        DeletePRButton4.setText("Delete");
        DeletePRButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePRButton4ActionPerformed(evt);
            }
        });

        ProsesPRButton3.setText("Proses");
        ProsesPRButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesPRButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(IDResepPRLabel2)
                        .addGap(55, 55, 55)
                        .addComponent(IDResepPRTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(SearchIDResepPRButton1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DeletePRButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProsesPRButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                    .addComponent(jTotalHargaPRLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(TotalHargaPRTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(336, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDResepPRLabel2)
                    .addComponent(IDResepPRTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchIDResepPRButton1))
                .addGap(95, 95, 95)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(DeletePRButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ProsesPRButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTotalHargaPRLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalHargaPRTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(432, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PENUKARAN RESEP 2", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clear1ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        //if(tglTransaksiBeli.getText().equals("")||idCustomer.getText().equalsIgnoreCase("")
        //                ||idKaryawan.getSelectedItem().equals("")||totalHarga.getText().equals("")||diskon.getText().equals("")){
        //            JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");
        //        }
        //        else{
        //            try{
        //                TransaksiBeli transaksiBeli = new TransaksiBeli();
        //                transaksiBeli.setID_TRANSAKSIBELI(idTransaksiBeli.getText());
        //                transaksiBeli.setID_CUSTOMER(idCustomer.getText());
        //                transaksiBeli.setID_KARYAWAN(idKaryawan.getSelectedItem().toString());
        //                transaksiBeli.setTGL_TRANSAKSIBELI((Date)tglTransaksiBeli.getValue());
        //                transaksiBeli.setTOTAL_HARGA(Integer.parseInt(totalHarga.getText()));
        //                transaksiBeli.setDISKON(Integer.parseInt(diskon.getText()));
        //                transaksiBeli.setTOTAL_TAGIHAN(Integer.parseInt(totalTagihan.getText()));
        //                transaksiBeli.setSTATUS_PEMBAYARAN(status.getText());
        //
        //                TransaksiBeliService.updateTransaksiBeli(transaksiBeli);
        //                tableModelTransaksiBeli.insert(transaksiBeli);
        //
        //                TransaksiBeliService.insertPembayaran(transaksiBeli, idPembayaran.getText(), Integer.parseInt(jumlahBayar.getText()), Integer.parseInt(sisaTagihan.getText()));
        //
        //                String idPemasukan = TransaksiBeliService.getAutoNumberPemasukan();
        //                TransaksiBeliService.insertPemasukan(transaksiBeli, idPemasukan, idPembayaran.getText(), Integer.parseInt(jumlahBayar.getText()));
        //                TransaksiBeliService.insertBukuBesar(transaksiBeli, idPemasukan, Integer.parseInt(jumlahBayar.getText()));
        //
        //                int jumlah_transaksi = TransaksiBeliService.hitungMember(idCustomer.getText());
        //                if(jumlah_transaksi == 3){
        //                    TransaksiBeliService.insertMember(idCustomer.getText());
        //                }
        //                clear();
        //            }
        //            catch(RemoteException exception){
        //                exception.printStackTrace();
        //            }
        //        }
        // TODO add your handling code here:

        //-----Pembayaran-----//
        String idResep = jTextField7.getText();
        int harga = Integer.parseInt(jTextField12.getText());
        try {
            String idPasien = apotekerService.mencariIdPasienDariPembayaran(idResep);
            String idPembayaran = apotekerService.mencariIdPembayaranDariPembayaran(idPasien);
            if (!idPembayaran.equalsIgnoreCase("")) {
                Pembayaran pembayaran = apotekerService.getPembayaranDariPembayaran(idPembayaran);
                apotekerService.updatePembayaranDariPembayaran(pembayaran, idResep, harga);
            }
            else if(idPembayaran.equalsIgnoreCase("")){
                idPembayaran = apotekerService.getAutoNumberDariPembayaran();
                apotekerService.insertPembayaranDariPembayaran(idPembayaran, idPasien, idResep, harga);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FormApoteker.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_submitActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void Button_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SearchActionPerformed
        if (TextField_IdResep.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Anda Belum menginputkan ID RESEP");
        } else if (!TextField_IdResep.getText().equals("")) {
            try {
                String menemukan = apotekerService.mencocokan_IdResep(TextField_IdResep.getText());
            if(menemukan.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Anda Menginputkan ID RESEP SALAH");
            }
                tableModelObat_detailResep.setData(apotekerService.getObat_detailresep(TextField_IdResep.getText()));
                Table_Apotek.setModel(tableModelObat_detailResep);
            } catch (RemoteException exception) {
                exception.printStackTrace();
            }
        }
    }//GEN-LAST:event_Button_SearchActionPerformed

    private void namaObatComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaObatComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaObatComboBoxActionPerformed

    private void takaranSatuanWaktuComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takaranSatuanWaktuComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_takaranSatuanWaktuComboBoxActionPerformed

    private void tambahObatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahObatButtonActionPerformed
        if (namaObatComboBox.getSelectedItem().equals("") || takaranSpinner.getValue().equals("")
                || takaranSatuanWaktuComboBox.getSelectedItem().equals("") || pemakaianComboBox.getSelectedItem().equals("") || hargaField.getText().equals("") || jumlahSpinner.getValue().equals("")
                || satuanComboBox.getSelectedItem().equals("") || keteranganField.getText().equals("") || totalHargaObatField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");
        } else {
            try {
                Obat_detailResep detailResep = new Obat_detailResep();
                String idDetResep = apotekerService.getAutoNumberDariObat_detailResep();
                
                detailResep.setId_Resep(idResep);
                detailResep.setNo_Detail_Resep(idDetResep);
                
                String id_obat = apotekerService.getIdObat(namaObatComboBox.getSelectedItem().toString());
                
                detailResep.setId_Obat(id_obat);
                detailResep.setTakaran((String) (takaranSpinner.getValue() + " kali " + takaranSatuanWaktuComboBox.getSelectedItem()));
                detailResep.setPemakaian(pemakaianComboBox.getSelectedItem().toString());
                detailResep.setJumlah(jumlahSpinner.getValue().toString());
                detailResep.setKeterangan(keteranganField.getText());

                Obat_detailResep detailResep1 = apotekerService.insertObat_detailResep(detailResep);
                tableModelObat_detailResepPO.insert(detailResep1);
                
            } catch (RemoteException exception) {
                exception.printStackTrace();
            }
//            try {
//                tableModelObat_detailResepPO.setData(apotekerService.getObat_detailresep(TextField_IdResep.getText()));
//                TabelDetailResepPO.setModel(tableModelObat_detailResepPO);
//            } catch (RemoteException exception) {
//                exception.printStackTrace();
//            }
        }
    }//GEN-LAST:event_tambahObatButtonActionPerformed

    private void namaObatComboBoxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_namaObatComboBoxPopupMenuWillBecomeVisible

        namaObatComboBox.removeAllItems();
        List namaobat = new ArrayList();
        try {
            namaobat = apotekerService.getNamaObat();
            for (int i = 0; i < namaobat.size(); i++) {
                namaObatComboBox.addItem(namaobat.get(i));
            }

        } catch (RemoteException ex) {
            Logger.getLogger(FormApoteker.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_namaObatComboBoxPopupMenuWillBecomeVisible

    private void namaObatComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_namaObatComboBoxItemStateChanged
        try {
            int harga = apotekerService.getHargaObat(namaObatComboBox.getSelectedItem().toString());
            hargaField.setText(String.valueOf(harga));
            total = total + harga;
            totalHargaObatField.setText("" + total);
        } catch (RemoteException ex) {
            Logger.getLogger(FormApoteker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_namaObatComboBoxItemStateChanged

    private void pemakaianComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pemakaianComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pemakaianComboBoxActionPerformed

    private void simpanObatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanObatButtonActionPerformed
if ((namaObatComboBox.getSelectedItem().toString().equalsIgnoreCase("")) || (takaranSpinner.getValue().equals(""))
    || (hargaField.getText().equals("")) || (jumlahSpinner.getValue().equals(""))
    || (keteranganField.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");
        } else {
            try {
                Obat_resep resep = new Obat_resep();
                resep.setId_Resep(idResep);
                resep.setId_Rekam("REK9999");
                resep.setTotal_Harga(0);
                apotekerService.insertObat_resep(resep);
                simpanObatButton.setEnabled(false);
                tambahObatButton.setEnabled(true);
            } catch (RemoteException exception) {
                exception.printStackTrace();
            }
            
            try {
                Obat_detailResep detailResep = new Obat_detailResep();
                String idDetResep = apotekerService.getAutoNumberDariObat_detailResep();
                
                detailResep.setId_Resep(idResep);
                detailResep.setNo_Detail_Resep(idDetResep);
                
                String id_obat = apotekerService.getIdObat(namaObatComboBox.getSelectedItem().toString());
                
                detailResep.setId_Obat(id_obat);
                detailResep.setTakaran((String) (takaranSpinner.getValue() + " kali " + takaranSatuanWaktuComboBox.getSelectedItem()));
                detailResep.setPemakaian(pemakaianComboBox.getSelectedItem().toString());
                detailResep.setJumlah(jumlahSpinner.getValue().toString());
                detailResep.setKeterangan(keteranganField.getText());

                Obat_detailResep detailResep1 = apotekerService.insertObat_detailResep(detailResep);
                tableModelObat_detailResepPO.insert(detailResep1);
            } catch (RemoteException exception) {
                exception.printStackTrace();
            }
        }
//        }        // TODO add your handling code here:
    }//GEN-LAST:event_simpanObatButtonActionPerformed

    private void hapusObatDetailResepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusObatDetailResepButtonActionPerformed
        int row = TabelDetailResepPO.getSelectedRow();
        if (row == -1) {
            return;
        }
        try {
            apotekerService.deleteObat_detailResep(tableModelObat_detailResepPO.get(row).getNo_Detail_Resep());
        } catch (RemoteException ex) {
            Logger.getLogger(FormApoteker.class.getName()).log(Level.SEVERE, null, ex);
        }
        tableModelObat_detailResepPO.delete(row);
    }//GEN-LAST:event_hapusObatDetailResepButtonActionPerformed

    private void prosesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesButtonActionPerformed
     Obat_resep resep = new Obat_resep();
        try {
            apotekerService.updateResep(resep, idResepField.getText(), Integer.parseInt(totalHargaObatField.getText()));
         //-----Pembayaran-----//
            String idPembayaran = apotekerService.getAutoNumberDariPembayaran();
            apotekerService.insertPembayaranDariPembayaran(idPembayaran, null, idResepField.getText(), Integer.parseInt(totalHargaObatField.getText()));
        } catch (RemoteException ex) {
            Logger.getLogger(FormDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_prosesButtonActionPerformed

    private void TotalHargaPRTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalHargaPRTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalHargaPRTextField13ActionPerformed

    private void PenukaranResepTable3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PenukaranResepTable3KeyReleased
        int row = PenukaranResepTable3.getSelectedRow();
    
    int jumlah = 0;
    
    String harga = String.valueOf(PenukaranResepTable3.getValueAt(row, 5));
    String qty = String.valueOf(PenukaranResepTable3.getValueAt(row, 4));
    jumlah = Integer.parseInt(harga) * Integer.parseInt(qty);
    tableModelObat_detailResepPR = (TableModelObat_detailResepPembelian)PenukaranResepTable3.getModel();
    tableModelObat_detailResepPR.setValueAt(jumlah, row, 6);
    PenukaranResepTable3.setModel(tableModelObat_detailResepPR);
    total = total + jumlah;
    TotalHargaPRTextField13.setText(String.valueOf(total));

    }//GEN-LAST:event_PenukaranResepTable3KeyReleased

    private void SearchIDResepPRButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchIDResepPRButton1ActionPerformed
        if (IDResepPRTextField1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Anda Belum menginputkan ID RESEP");
        } else if (!IDResepPRTextField1.getText().equals("")) {
            try {
                String Id_Resep = IDResepPRTextField1.getText();
                String menemukan = apotekerService.mencocokan_IdResep(Id_Resep);
                if(menemukan.equalsIgnoreCase("")){
                    JOptionPane.showMessageDialog(null, "Anda Menginputkan ID RESEP SALAH");
                }
                //                List<Obat_detailResepPembelian> resep_pembelian = apotekerService.getObat_detailResepPembelian(Id_Resep);
                //                System.out.println(resep_pembelian.get(0));
                //              tableModelObat_detailResepPR.setData(resep_pembelian);
                tableModelObat_detailResepPR.setData(apotekerService.getObat_detailResepPembelian(Id_Resep));
                PenukaranResepTable3.setModel(tableModelObat_detailResepPR);
            } catch (RemoteException exception) {
                exception.printStackTrace();
            }
        }
    }//GEN-LAST:event_SearchIDResepPRButton1ActionPerformed

    private void DeletePRButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePRButton4ActionPerformed
        int row = PenukaranResepTable3.getSelectedRow();
        if (row == -1) {
            return;
        }
        try {
            apotekerService.deleteObat_detailResep(tableModelObat_detailResep.get(row).getNo_Detail_Resep());
        } catch (RemoteException ex) {
            Logger.getLogger(FormApoteker.class.getName()).log(Level.SEVERE, null, ex);
        }
        tableModelObat_detailResep.delete(row);
    }//GEN-LAST:event_DeletePRButton4ActionPerformed

    private void ProsesPRButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesPRButton3ActionPerformed
        Obat_resep resep = new Obat_resep();
        try {
            apotekerService.updateResep(resep, IDResepPRTextField1.getText(), Integer.parseInt(TotalHargaPRTextField13.getText()));
            //-----Pembayaran-----//
            String idPembayaran = apotekerService.getAutoNumberDariPembayaran();
            apotekerService.insertPembayaranDariPembayaran(idPembayaran, null, IDResepPRTextField1.getText(), Integer.parseInt(TotalHargaPRTextField13.getText()));
        } catch (RemoteException ex) {
            Logger.getLogger(FormApoteker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ProsesPRButton3ActionPerformed

    /**
     * @param args the command line arguments
     */

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Search;
    private javax.swing.JButton DeletePRButton4;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel IDResepPRLabel2;
    private javax.swing.JTextField IDResepPRTextField1;
    private javax.swing.JTable PenukaranResepTable3;
    private javax.swing.JButton ProsesPRButton3;
    private javax.swing.JButton SearchIDResepPRButton1;
    private javax.swing.JTable TabelDetailResepPO;
    private javax.swing.JTable Table_Apotek;
    private javax.swing.JTextField TextField_IdResep;
    private javax.swing.JTextField TotalHargaPRTextField13;
    private javax.swing.JButton clear1;
    private javax.swing.JButton hapusObatDetailResepButton;
    private javax.swing.JTextField hargaField;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JTextField idResepField;
    private javax.swing.JLabel idResepLabel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel jTotalHargaPRLabel21;
    private javax.swing.JLabel jumlahLabel;
    private javax.swing.JSpinner jumlahSpinner;
    private javax.swing.JTextField keteranganField;
    private javax.swing.JLabel keteranganLabel;
    private javax.swing.JComboBox namaObatComboBox;
    private javax.swing.JLabel namaObatLabel;
    private javax.swing.JTextField noDetailResepField;
    private javax.swing.JLabel noDetailResepLabel;
    private javax.swing.JComboBox pemakaianComboBox;
    private javax.swing.JLabel pemakaianLabel;
    private javax.swing.JButton prosesButton;
    private javax.swing.JPanel resepPanel;
    private javax.swing.JComboBox satuanComboBox;
    private javax.swing.JButton simpanObatButton;
    private javax.swing.JButton submit;
    private javax.swing.JLabel takaranLabel;
    private javax.swing.JComboBox takaranSatuanWaktuComboBox;
    private javax.swing.JSpinner takaranSpinner;
    private javax.swing.JButton tambahObatButton;
    private javax.swing.JTextField totalHargaObatField;
    private javax.swing.JLabel totalHargaObatLabel;
    // End of variables declaration//GEN-END:variables
}
