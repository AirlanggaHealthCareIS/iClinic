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
import javax.swing.table.DefaultTableModel;

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
    private DefaultTableModel tabel_penukaran;

    public FormApoteker(ApotekerService apotekerService) {
        this.apotekerService = apotekerService;
        try {
            tableModelObat_detailResepPO.setData(this.apotekerService.getObat_detailresep(null));
            tableModelObat_detailResepPR.setData(this.apotekerService.getObat_detailResepPembelian(null));
            idResep = apotekerService.getAutoNumberDariResep();
        } catch (RemoteException exception) {
            exception.printStackTrace();
        }

        initComponents();
        setLocationRelativeTo(this);
        setSize(665, 730);
        idResepField.setText(idResep);
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
                    jNamaObatPRTextField2.setText(obat_detailResepPembelian.getNama_Obat());
                    jJumlahPRTextField3.setText(String.valueOf(obat_detailResepPembelian.getJumlah()));
                    jHargaPRTextField4.setText(String.valueOf(obat_detailResepPembelian.getHarga()));
                    jTotalPRTextField1.setText(String.valueOf(obat_detailResepPembelian.getTotal()));

                }
            }
        });
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
        jNextLRButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
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
        jTotalPRLabel = new javax.swing.JLabel();
        jNamaObatPRLabel = new javax.swing.JLabel();
        jlHargaPRLabel = new javax.swing.JLabel();
        jJumlahPRLabel = new javax.swing.JLabel();
        jTotalPRTextField1 = new javax.swing.JTextField();
        jNamaObatPRTextField2 = new javax.swing.JTextField();
        jJumlahPRTextField3 = new javax.swing.JTextField();
        jHargaPRTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1280, 730));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(0, 0));

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel1.setText("ID Resep");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 310, 110, 22);

        jLabel3.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jLabel3.setText("Detail Resep");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 420, 110, 22);

        TextField_IdResep.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jPanel1.add(TextField_IdResep);
        TextField_IdResep.setBounds(120, 310, 190, 22);

        Button_Search.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        Button_Search.setText("Search");
        Button_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SearchActionPerformed(evt);
            }
        });
        jPanel1.add(Button_Search);
        Button_Search.setBounds(330, 310, 120, 27);

        Table_Apotek.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
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
        jScrollPane1.setBounds(60, 470, 610, 100);

        jNextLRButton1.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jNextLRButton1.setText("NEXT");
        jNextLRButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNextLRButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jNextLRButton1);
        jNextLRButton1.setBounds(270, 630, 210, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/3.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 1280, 810);

        jTabbedPane1.addTab("LIHAT RESEP", jPanel1);

        jPanel5.setFont(new java.awt.Font("Caviar Dreams", 1, 11)); // NOI18N
        jPanel5.setLayout(null);

        jTotalHargaPRLabel21.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jTotalHargaPRLabel21.setText("Total Harga");
        jPanel5.add(jTotalHargaPRLabel21);
        jTotalHargaPRLabel21.setBounds(298, 596, 106, 22);

        TotalHargaPRTextField13.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        TotalHargaPRTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalHargaPRTextField13ActionPerformed(evt);
            }
        });
        jPanel5.add(TotalHargaPRTextField13);
        TotalHargaPRTextField13.setBounds(422, 592, 189, 31);

        PenukaranResepTable3.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
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

        jPanel5.add(jScrollPane5);
        jScrollPane5.setBounds(10, 290, 810, 129);

        IDResepPRLabel2.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        IDResepPRLabel2.setText("ID Resep");
        jPanel5.add(IDResepPRLabel2);
        IDResepPRLabel2.setBounds(100, 250, 59, 18);

        SearchIDResepPRButton1.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        SearchIDResepPRButton1.setText("Search");
        SearchIDResepPRButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchIDResepPRButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(SearchIDResepPRButton1);
        SearchIDResepPRButton1.setBounds(450, 250, 81, 27);

        IDResepPRTextField1.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jPanel5.add(IDResepPRTextField1);
        IDResepPRTextField1.setBounds(190, 250, 216, 24);

        DeletePRButton4.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        DeletePRButton4.setText("Delete");
        DeletePRButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePRButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(DeletePRButton4);
        DeletePRButton4.setBounds(850, 340, 80, 39);

        ProsesPRButton3.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        ProsesPRButton3.setText("Proses");
        ProsesPRButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesPRButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(ProsesPRButton3);
        ProsesPRButton3.setBounds(347, 673, 216, 61);

        jTotalPRLabel.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jTotalPRLabel.setText("Total");
        jPanel5.add(jTotalPRLabel);
        jTotalPRLabel.setBounds(453, 520, 106, 22);

        jNamaObatPRLabel.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jNamaObatPRLabel.setText("Nama Obat");
        jPanel5.add(jNamaObatPRLabel);
        jNamaObatPRLabel.setBounds(24, 453, 106, 22);

        jlHargaPRLabel.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jlHargaPRLabel.setText("Harga");
        jPanel5.add(jlHargaPRLabel);
        jlHargaPRLabel.setBounds(24, 520, 106, 22);

        jJumlahPRLabel.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jJumlahPRLabel.setText("Jumlah");
        jPanel5.add(jJumlahPRLabel);
        jJumlahPRLabel.setBounds(453, 453, 106, 22);

        jTotalPRTextField1.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jPanel5.add(jTotalPRTextField1);
        jTotalPRTextField1.setBounds(563, 515, 189, 33);

        jNamaObatPRTextField2.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jNamaObatPRTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNamaObatPRTextField2ActionPerformed(evt);
            }
        });
        jPanel5.add(jNamaObatPRTextField2);
        jNamaObatPRTextField2.setBounds(134, 448, 186, 33);

        jJumlahPRTextField3.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jJumlahPRTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jJumlahPRTextField3KeyReleased(evt);
            }
        });
        jPanel5.add(jJumlahPRTextField3);
        jJumlahPRTextField3.setBounds(563, 448, 186, 33);

        jHargaPRTextField4.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        jPanel5.add(jHargaPRTextField4);
        jHargaPRTextField4.setBounds(134, 515, 186, 33);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/3.jpg"))); // NOI18N
        jPanel5.add(jLabel4);
        jLabel4.setBounds(0, 0, 1280, 800);

        jTabbedPane1.addTab("PENUKARAN RESEP", jPanel5);

        jPanel2.setLayout(null);

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
        noDetailResepField.setEnabled(false);

        namaObatComboBox.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        namaObatComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Nama Obat --" }));
        namaObatComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                namaObatComboBoxPopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
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
                                .addGap(0, 95, Short.MAX_VALUE))
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
        idResepField.setEnabled(false);

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
                        .addGap(0, 0, Short.MAX_VALUE))
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

        jPanel2.add(resepPanel);
        resepPanel.setBounds(0, 270, 1280, 429);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/3.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 800);

        jTabbedPane1.addTab("PEMBELIAN OBAT", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SearchActionPerformed
        if (TextField_IdResep.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Anda Belum menginputkan ID RESEP");
        } else if (!TextField_IdResep.getText().equals("")) {
            try {
                String menemukan = apotekerService.mencocokan_IdResep(TextField_IdResep.getText());
                if (menemukan.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Anda Menginputkan ID RESEP SALAH");
                }
                tableModelObat_detailResep.setData(apotekerService.getObat_detailresep(TextField_IdResep.getText()));
                Table_Apotek.setModel(tableModelObat_detailResep);
            } catch (RemoteException exception) {
                exception.printStackTrace();
            }
        }
    }//GEN-LAST:event_Button_SearchActionPerformed

    private void TotalHargaPRTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalHargaPRTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalHargaPRTextField13ActionPerformed

    private void PenukaranResepTable3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PenukaranResepTable3KeyReleased
        int row = PenukaranResepTable3.getSelectedRow();

        int jumlah = 0;

        String harga = String.valueOf(PenukaranResepTable3.getValueAt(row, 5));
        String qty = String.valueOf(PenukaranResepTable3.getValueAt(row, 4));
        jumlah = Integer.parseInt(harga) * Integer.parseInt(qty);
        tableModelObat_detailResepPR = (TableModelObat_detailResepPembelian) PenukaranResepTable3.getModel();
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
                if (menemukan.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Anda Menginputkan ID RESEP SALAH");
                }
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
            String no_detail = tableModelObat_detailResepPR.get(row).getNo_Detail_Resep();
            apotekerService.deleteObat_detailResep(no_detail);
        } catch (RemoteException ex) {
            Logger.getLogger(FormApoteker.class.getName()).log(Level.SEVERE, null, ex);
        }
        tableModelObat_detailResepPR.delete(row);
    }//GEN-LAST:event_DeletePRButton4ActionPerformed

    private void ProsesPRButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesPRButton3ActionPerformed
        Obat_resep resep = new Obat_resep();
        try {
            apotekerService.updateResep(resep, IDResepPRTextField1.getText(), Integer.parseInt(TotalHargaPRTextField13.getText()));
            //-----Pembayaran-----//
            String idResepPR = IDResepPRTextField1.getText();
            int harga = Integer.parseInt(TotalHargaPRTextField13.getText());
            try {
                String idPasien = apotekerService.mencariIdPasienDariPembayaran(idResepPR);
                String idPembayaran = apotekerService.mencariIdPembayaranDariPembayaran(idPasien);
                if (!idPembayaran.equalsIgnoreCase("")) {
                    Pembayaran pembayaran = apotekerService.getPembayaranDariPembayaran(idPembayaran);
                    apotekerService.updatePembayaranDariPembayaran(pembayaran, idResepPR, harga);
                } else if (idPembayaran.equalsIgnoreCase("")) {
                    idPembayaran = apotekerService.getAutoNumberDariPembayaran();
                    apotekerService.insertPembayaranDariPembayaran(idPembayaran, idPasien, idResepPR, harga);
                }
            } catch (RemoteException ex) {
                Logger.getLogger(FormDokter.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FormApoteker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ProsesPRButton3ActionPerformed

    private void jNamaObatPRTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNamaObatPRTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNamaObatPRTextField2ActionPerformed

    private void jJumlahPRTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jJumlahPRTextField3KeyReleased
        int row = PenukaranResepTable3.getSelectedRow();
        int totalPerObat = 0;

        if (!jJumlahPRTextField3.getText().equals("")) {
            String harga = jHargaPRTextField4.getText();
            String qty = jJumlahPRTextField3.getText();
            totalPerObat = Integer.parseInt(harga) * Integer.parseInt(qty);

            Obat_detailResepPembelian obat_pembelian = tableModelObat_detailResepPR.get(row);
            obat_pembelian.setJumlah(Integer.parseInt(qty));
            obat_pembelian.setTotal(totalPerObat);
            tableModelObat_detailResepPR.update(row, obat_pembelian);

            total = total + totalPerObat;
            jTotalPRTextField1.setText(String.valueOf(totalPerObat));
            TotalHargaPRTextField13.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_jJumlahPRTextField3KeyReleased

    private void jNextLRButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNextLRButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNextLRButton1ActionPerformed

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

    private void namaObatComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaObatComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaObatComboBoxActionPerformed

    private void takaranSatuanWaktuComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takaranSatuanWaktuComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_takaranSatuanWaktuComboBoxActionPerformed

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
                resep.setId_Rekam("REK0000");
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
                detailResep.setJumlah(Integer.parseInt(jumlahSpinner.getValue().toString()));
                detailResep.setKeterangan(keteranganField.getText());

                Obat_detailResep detailResep1 = apotekerService.insertObat_detailResep(detailResep);
                tableModelObat_detailResepPO.insert(detailResep1);
            } catch (RemoteException exception) {
                exception.printStackTrace();
            }
        }
    }//GEN-LAST:event_simpanObatButtonActionPerformed

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
                detailResep.setJumlah(Integer.parseInt(jumlahSpinner.getValue().toString()));
                detailResep.setKeterangan(keteranganField.getText());

                Obat_detailResep detailResep1 = apotekerService.insertObat_detailResep(detailResep);
                tableModelObat_detailResepPO.insert(detailResep1);

            } catch (RemoteException exception) {
                exception.printStackTrace();
            }
        }
    }//GEN-LAST:event_tambahObatButtonActionPerformed

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
        namaObatComboBox.setSelectedItem("");
        takaranSpinner.setValue("");
        hargaField.setText("");
        jumlahSpinner.setValue("");
        keteranganField.setText("");
    }//GEN-LAST:event_prosesButtonActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Search;
    private javax.swing.JButton DeletePRButton4;
    private javax.swing.JLabel IDResepPRLabel2;
    private javax.swing.JTextField IDResepPRTextField1;
    private javax.swing.JTable PenukaranResepTable3;
    private javax.swing.JButton ProsesPRButton3;
    private javax.swing.JButton SearchIDResepPRButton1;
    private javax.swing.JTable TabelDetailResepPO;
    private javax.swing.JTable Table_Apotek;
    private javax.swing.JTextField TextField_IdResep;
    private javax.swing.JTextField TotalHargaPRTextField13;
    private javax.swing.JButton hapusObatDetailResepButton;
    private javax.swing.JTextField hargaField;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JTextField idResepField;
    private javax.swing.JLabel idResepLabel;
    private javax.swing.JTextField jHargaPRTextField4;
    private javax.swing.JLabel jJumlahPRLabel;
    private javax.swing.JTextField jJumlahPRTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jNamaObatPRLabel;
    private javax.swing.JTextField jNamaObatPRTextField2;
    private javax.swing.JButton jNextLRButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jTotalHargaPRLabel21;
    private javax.swing.JLabel jTotalPRLabel;
    private javax.swing.JTextField jTotalPRTextField1;
    private javax.swing.JLabel jlHargaPRLabel;
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
    private javax.swing.JLabel takaranLabel;
    private javax.swing.JComboBox takaranSatuanWaktuComboBox;
    private javax.swing.JSpinner takaranSpinner;
    private javax.swing.JButton tambahObatButton;
    private javax.swing.JTextField totalHargaObatField;
    private javax.swing.JLabel totalHargaObatLabel;
    // End of variables declaration//GEN-END:variables
}
