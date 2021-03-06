/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientApplication.form;

import ClientApplication.FormLogin;
import ClientApplication.model.TableModelLaporanResepPasien;
import ClientApplication.model.TableModelObat_detailResep;
import ClientApplication.model.TableModelObat_resep;
import ClientApplication.model.TableModelRekam_Medis;
import ClientApplication.model.TableModelPasien;
import ClientApplication.model.TableModelTindakan_detailTindakan;
import Database.Entity.Antrian;
import Database.Entity.Obat_detailResep;
import Database.Entity.Obat_resep;
import Database.Entity.Penyakit_diagnosa;
import Database.Entity.Rekam_Medis;
import Database.Entity.Pasien;
import Database.Entity.Pembayaran;
import Database.Entity.Tindakan_detailTindakan;
import Database.Service.DokterService;
import Database.Service.Bag_PendaftaranService;
import java.awt.event.KeyEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.Date;
import java.util.HashMap;
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

/**
 *
 * @author Afifah + piudt + ayundhapus + erin + lynnarlin
 */
public class FormDokter extends javax.swing.JFrame {

    private TableModelRekam_Medis tableModelRekamMedis = new TableModelRekam_Medis();
    private DokterService dokterService;
    private TableModelTindakan_detailTindakan tableModelTindakan = new TableModelTindakan_detailTindakan();
    private TableModelObat_detailResep tabelModelDetailResep = new TableModelObat_detailResep();
    private TableModelLaporanResepPasien tableModelLaporanResepPasien = new TableModelLaporanResepPasien();
    private TableModelObat_resep tabelModelResep = new TableModelObat_resep();
    private Pasien pasien;
    private Antrian antrian = new Antrian();
    int totalHargaRM = 0;
    int hargaRM = 0;
    int totalHargaObat = 0;
    int hargaObat = 0;
    String id_Rekam = "";
    String idResep = "";
    String idAntrianSaatIni = "";
    String id_Diagnosa = "";

    public FormDokter(DokterService dokterService) throws RemoteException {
        this.dokterService = dokterService;
        try {
            tabelModelDetailResep.setData(dokterService.getAllDetailResepByIDResep(null));
            tableModelLaporanResepPasien.setData(this.dokterService.getLaporanResepPasien());
            tableModelTindakan.setData(dokterService.getDetailTindakanById(null));
            id_Rekam = dokterService.getAutoNumberIdRekam();
            idResep = dokterService.getAutoNumberResep();
            id_Diagnosa = dokterService.getAutoNumberIdDiagnosa();
        } catch (RemoteException exception) {
            exception.printStackTrace();
        }

        initComponents();
        setLocationRelativeTo(this);
        setSize(1278, 730);

        dokterTabPane.setEnabledAt(1, false);
        idRekamField.setText(id_Rekam);
        tableTindakan.setModel(tableModelTindakan);
        tableTindakan.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                int row = tableTindakan.getSelectedRow();
                if (row != -1) {
                    Tindakan_detailTindakan detail_tindakan = tableModelTindakan.get(row);
                    fieldNoDetail.setText(detail_tindakan.getNo_Detail());
                    comboTindakan.setSelectedItem(detail_tindakan.getId_Tindakan());
                    fieldKeterangan.setText(detail_tindakan.getKeterangan());
                }
            }
        });

        tabelDetailResep.setModel(tabelModelDetailResep);
        tabelDetailResep.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent lse) {
                int row = tabelDetailResep.getSelectedRow();
                if (row != -1) {
                    Obat_detailResep detailResep = tabelModelDetailResep.get(row);
                    idResepField.setText(detailResep.getId_Resep());
                    noDetailResepField.setText(detailResep.getNo_Detail_Resep());
//                    namaObatComboBox.setSelectedItem(); //bikin method di service server untuk menampilkan nama obat berdasarkan id obat
//                    takaranSpinner.setValue(detailResep.getTakaran().charAt(0));
//                    pemakaianComboBox.setSelectedItem(detailResep.getPemakaian());
//                    hargaField.setText(String.valueOf(dokterService.getHargaObat(namaObatComboBox.getSelectedItem().toString()))); //bikin method di service server untuk menampilkan harga obat berdasarkan id obat
//                    jumlahSpinner.setValue(detailResep.getJumlah().charAt(0));
//                    keteranganField.setText(detailResep.getKeterangan());
                }
            }
        });
    }

    private void clearUser() {
        idRekamField.setText("");
        Field_idPasien.setText("");
        fieldNamaPasien.setText("");
        comboPenyakitPas.setSelectedItem("");
        tinggiBadan.setText("");
        BeratBadan.setText("");
        TekananDarah.setText("");
        alergi.setText("");
        hasilPemeriksaan.setText("");
        comboTambahan.setSelectedItem("");
        fieldNoDetail.setText("");
        comboTindakan.setSelectedItem("");
        fieldHarga.setText("");
        fieldKeterangan.setText("");
        totalHargaTindakan.setText("0");
//        jabatanComboBox.setSelectedIndex(0);
//        usernameField.setText("");
//        passwordUserPasswordField.setText("");
//        idUserField.getFocusListeners();
    }

    private void clearTindakan() {
        fieldNoDetail.setText("");
        fieldHarga.setText("");
        fieldKeterangan.setText("");
    }

    private void typeonlynumber(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE) {
            getToolkit().beep();
            evt.consume();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dokterTabPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelRiwayat = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        fieldIdPasien = new javax.swing.JTextField();
        cariRMbyIdPasien = new javax.swing.JButton();
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
        hargaObatField = new javax.swing.JTextField();
        jumlahSpinner = new javax.swing.JSpinner();
        satuanComboBox = new javax.swing.JComboBox();
        keteranganField = new javax.swing.JTextField();
        simpanDetailResepButton = new javax.swing.JButton();
        tambahObatDetailResepButton = new javax.swing.JButton();
        hapusObatDetailResepButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelDetailResep = new javax.swing.JTable();
        idResepLabel = new javax.swing.JLabel();
        totalHargaObatLabel = new javax.swing.JLabel();
        idResepField = new javax.swing.JTextField();
        totalHargaObatField = new javax.swing.JTextField();
        backToRekamMedis = new javax.swing.JButton();
        printResepButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tinggiBadan = new javax.swing.JTextField();
        BeratBadan = new javax.swing.JTextField();
        TekananDarah = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        hasilPemeriksaan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        alergi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        totalHargaTindakan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        idRekamField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        simpanRekamMedis = new javax.swing.JButton();
        tglRekam = new javax.swing.JFormattedTextField();
        comboTambahan = new javax.swing.JComboBox();
        Field_idPasien = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TambahTindakan = new javax.swing.JButton();
        comboTindakan = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        fieldHarga = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        fieldKeterangan = new javax.swing.JTextField();
        fieldNoDetail = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableTindakan = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        fieldNamaPasien = new javax.swing.JTextField();
        nextButton = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        goToResepButton = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        comboPenyakitPas = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dokter");
        setMinimumSize(new java.awt.Dimension(1280, 730));
        setResizable(false);
        getContentPane().setLayout(null);

        dokterTabPane.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        dokterTabPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dokterTabPaneMouseClicked(evt);
            }
        });

        tabelRiwayat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Rekam", "Id_Penyakit", "Id_Pasien", "No_Detail", "Tgl_Rekam", "Tinggi", "Berat", "Tekanan_Darah", "Hasil_Pemeriksaan", "Alergi", "Total Harga", "Layanan_Tambahan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelRiwayat);

        jLabel22.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N
        jLabel22.setText("Id Pasien");

        fieldIdPasien.setFont(new java.awt.Font("Caviar Dreams", 1, 18)); // NOI18N

        cariRMbyIdPasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Search.png"))); // NOI18N
        cariRMbyIdPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariRMbyIdPasienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1225, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(fieldIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cariRMbyIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cariRMbyIdPasien, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(fieldIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        dokterTabPane.addTab("Riwayat", jPanel1);

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

        noDetailResepField.setEditable(false);
        noDetailResepField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        namaObatComboBox.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        namaObatComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Nama Obat --" }));
        namaObatComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                namaObatComboBoxItemStateChanged(evt);
            }
        });
        namaObatComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                namaObatComboBoxPopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        takaranSpinner.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel23.setText("kali");

        takaranSatuanWaktuComboBox.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        takaranSatuanWaktuComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "sehari", "seminggu" }));

        pemakaianComboBox.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        pemakaianComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Cara Pemakaian --", "Diminum", "Dioleskan", "Disuntikkan" }));

        hargaObatField.setEditable(false);
        hargaObatField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        jumlahSpinner.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        satuanComboBox.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        satuanComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Satuan --", "PIL", "KAPSUL", "TABLET", "AMPUL", "BOTOL", "BUNGKUS" }));

        keteranganField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        simpanDetailResepButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        simpanDetailResepButton.setText("Simpan Obat");
        simpanDetailResepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanDetailResepButtonActionPerformed(evt);
            }
        });

        tambahObatDetailResepButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        tambahObatDetailResepButton.setText("Tambah Obat");
        tambahObatDetailResepButton.setEnabled(false);
        tambahObatDetailResepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahObatDetailResepButtonActionPerformed(evt);
            }
        });

        hapusObatDetailResepButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        hapusObatDetailResepButton.setText("Hapus Obat");
        hapusObatDetailResepButton.setEnabled(false);
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
                                    .addComponent(hargaObatField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 66, Short.MAX_VALUE))
                            .addComponent(keteranganField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(hapusObatDetailResepButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tambahObatDetailResepButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(simpanDetailResepButton)))
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
                    .addComponent(hargaObatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(simpanDetailResepButton)
                    .addComponent(tambahObatDetailResepButton)
                    .addComponent(hapusObatDetailResepButton))
                .addContainerGap())
        );

        tabelDetailResep.setFont(new java.awt.Font("Caviar Dreams", 0, 12)); // NOI18N
        tabelDetailResep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No Detail", "Nama Obat", "Takaran", "Pemakaian", "Jumlah", "Keterangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelDetailResep);

        idResepLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        idResepLabel.setText("ID Resep");

        totalHargaObatLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        totalHargaObatLabel.setText("Total Harga Obat");

        idResepField.setEditable(false);
        idResepField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        totalHargaObatField.setEditable(false);
        totalHargaObatField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        backToRekamMedis.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        backToRekamMedis.setText("Kembali ke Rekam Medis");
        backToRekamMedis.setEnabled(false);
        backToRekamMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToRekamMedisActionPerformed(evt);
            }
        });

        printResepButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        printResepButton.setText("Print");
        printResepButton.setEnabled(false);
        printResepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printResepButtonActionPerformed(evt);
            }
        });

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
                        .addGap(0, 209, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(resepPanelLayout.createSequentialGroup()
                        .addComponent(printResepButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backToRekamMedis)))
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
                .addGroup(resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalHargaObatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalHargaObatLabel)
                    .addComponent(backToRekamMedis)
                    .addComponent(printResepButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dokterTabPane.addTab("Resep", resepPanel);

        jLabel1.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel1.setText("ID Pasien");

        jLabel5.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel5.setText("Tinggi Badan");

        jLabel6.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel6.setText("Berat Badan");

        jLabel7.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel7.setText("Tekanan Darah");

        tinggiBadan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tinggiBadanKeyTyped(evt);
            }
        });

        BeratBadan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BeratBadanKeyTyped(evt);
            }
        });

        TekananDarah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TekananDarahKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel9.setText("Hasil Pemeriksaan");

        jLabel10.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel10.setText("Alergi");

        jLabel11.setFont(new java.awt.Font("Caviar Dreams", 0, 12)); // NOI18N
        jLabel11.setText("Layanan Tambahan");

        jLabel12.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel12.setText("Total Harga");

        totalHargaTindakan.setEditable(false);
        totalHargaTindakan.setText("0");

        jLabel13.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel13.setText("ID Rekam");

        idRekamField.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel14.setText("Tanggal");

        simpanRekamMedis.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        simpanRekamMedis.setText("SIMPAN REKAM MEDIS");
        simpanRekamMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanRekamMedisActionPerformed(evt);
            }
        });

        tglRekam.setEditable(false);
        tglRekam.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG))));
        tglRekam.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        tglRekam.setValue(new java.util.Date());

        comboTambahan.setFont(new java.awt.Font("Caviar Dreams", 0, 12)); // NOI18N
        comboTambahan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TIDAK ADA", "LABORATORIUM", "USG", "KECANTIKAN" }));
        comboTambahan.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                comboTambahanPopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        Field_idPasien.setEditable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setFont(new java.awt.Font("Caviar Dreams", 0, 11)); // NOI18N
        jLabel15.setText("No Detail");

        jLabel16.setFont(new java.awt.Font("Caviar Dreams", 0, 11)); // NOI18N
        jLabel16.setText("Tindakan");

        TambahTindakan.setFont(new java.awt.Font("Caviar Dreams", 0, 11)); // NOI18N
        TambahTindakan.setText("Tambah");
        TambahTindakan.setEnabled(false);
        TambahTindakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahTindakanActionPerformed(evt);
            }
        });

        comboTindakan.setFont(new java.awt.Font("Caviar Dreams", 0, 11)); // NOI18N
        comboTindakan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Tindakan" }));
        comboTindakan.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                comboTindakanPopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        comboTindakan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTindakanItemStateChanged(evt);
            }
        });
        comboTindakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTindakanActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Caviar Dreams", 0, 11)); // NOI18N
        jLabel18.setText("Harga");

        fieldHarga.setEditable(false);
        fieldHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldHargaActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Caviar Dreams", 0, 11)); // NOI18N
        jLabel19.setText("Keterangan");

        fieldNoDetail.setEditable(false);
        fieldNoDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNoDetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TambahTindakan))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboTindakan, 0, 158, Short.MAX_VALUE)
                            .addComponent(fieldHarga)
                            .addComponent(fieldKeterangan)
                            .addComponent(fieldNoDetail))))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(fieldNoDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(comboTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(fieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(fieldKeterangan, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TambahTindakan)
                .addContainerGap())
        );

        tableTindakan.setFont(new java.awt.Font("Caviar Dreams", 0, 12)); // NOI18N
        tableTindakan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No Detail", "Tindakan", "Keterangann"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableTindakan);

        jLabel8.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel8.setText("Nama Pasien");

        fieldNamaPasien.setEditable(false);

        nextButton.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        nextButton.setText("NEXT");
        nextButton.setEnabled(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N
        jLabel20.setText("Tindakan Dokter");

        goToResepButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        goToResepButton.setText("BERI RESEP");
        goToResepButton.setEnabled(false);
        goToResepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToResepButtonActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel21.setText("Penyakit");

        comboPenyakitPas.setFont(new java.awt.Font("Caviar Dreams", 0, 11)); // NOI18N
        comboPenyakitPas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Penyakit" }));
        comboPenyakitPas.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                comboPenyakitPasPopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel13)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TekananDarah, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Field_idPasien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(tinggiBadan, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldNamaPasien, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(BeratBadan)
                                    .addComponent(alergi)))
                            .addComponent(idRekamField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboPenyakitPas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hasilPemeriksaan, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(comboTambahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(simpanRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goToResepButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalHargaTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(tglRekam, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(612, Short.MAX_VALUE)
                    .addComponent(jLabel20)
                    .addGap(507, 507, 507)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(idRekamField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tglRekam, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(totalHargaTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Field_idPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(fieldNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tinggiBadan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BeratBadan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TekananDarah, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(alergi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(comboPenyakitPas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(hasilPemeriksaan, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(comboTambahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(simpanRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goToResepButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel20)
                    .addContainerGap(381, Short.MAX_VALUE)))
        );

        dokterTabPane.addTab("Rekam Medis", jPanel3);

        getContentPane().add(dokterTabPane);
        dokterTabPane.setBounds(10, 230, 1250, 460);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/4.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -10, 1300, 820);
    }// </editor-fold>//GEN-END:initComponents

    private void simpanRekamMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanRekamMedisActionPerformed
        if (comboPenyakitPas.getSelectedItem().equals("") || Field_idPasien.getText().equals("")
                || tglRekam.getText().equals("") || tinggiBadan.getText().equals("") || BeratBadan.getText().equals("") || TekananDarah.getText().equals("")
                || hasilPemeriksaan.getText().equals("") || alergi.getText().equals("") || comboTambahan.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");
        } else {
            try {
                Rekam_Medis rekam_medis = new Rekam_Medis();
                rekam_medis.setId_Rekam(id_Rekam);
                System.out.println(id_Rekam);
                String Id_Penyakit = dokterService.getIDPenyakit(comboPenyakitPas.getSelectedItem().toString());
                rekam_medis.setId_Penyakit(Id_Penyakit);
                System.out.println(comboPenyakitPas.getSelectedItem().toString());
                rekam_medis.setId_Pasien(Field_idPasien.getText());
                System.out.println(Field_idPasien.getText());
                rekam_medis.setTgl_Rekam((Date) tglRekam.getValue());
                System.out.println(tglRekam.getValue());
                rekam_medis.setTinggi(Integer.parseInt(tinggiBadan.getText()));
                System.out.println(tinggiBadan.getText());
                rekam_medis.setBerat(Integer.parseInt(BeratBadan.getText()));
                System.out.println(BeratBadan.getText());
                rekam_medis.setTekanan_Darah(Integer.parseInt(TekananDarah.getText()));
                System.out.println(TekananDarah.getText());
                rekam_medis.setHasil_Pemerikasaan(hasilPemeriksaan.getText());
                System.out.println(hasilPemeriksaan.getText());
                rekam_medis.setAlergi(alergi.getText());
                System.out.println(alergi.getText());
                rekam_medis.setTotal_Harga(Integer.parseInt(totalHargaTindakan.getText()));
                System.out.println(totalHargaTindakan.getText());
                rekam_medis.setLayanan_Tambahan(comboTambahan.getSelectedItem().toString());
                System.out.println(comboTambahan.getSelectedItem().toString());

                dokterService.insertRekam_Medis(rekam_medis);
                dokterService.updateAntrian(idAntrianSaatIni);

                JOptionPane.showMessageDialog(null, "Data rekam medis berhasil disimpan");
//                String nama = dokterService.getNamaPasien(Field_idPasien.getText());
//                fieldNamaPasien.setText("" + nama);
//           tableModelDetailTransaksiBeli.insert(order1);
//           clear();
            } catch (RemoteException exception) {
                exception.printStackTrace();
            }
            try {
                Antrian antrian = new Antrian();
                antrian.setId_Antrian(dokterService.getAutoNumberAntrian());
//                antrian.setId_Pasien(fieldIdPasien.getText());
                antrian.setId_Pasien(Field_idPasien.getText());
                antrian.setJenis_Antrian(comboTambahan.getSelectedItem().toString());
                dokterService.insertAntrian(antrian);
                totalHargaRM = 0;
                //   idRekam.setText(antrian.getId_Antrian());
            } catch (RemoteException exception) {
                exception.printStackTrace();
            }

//            try {
//                dokterService.updateAntrian(idAntrianSaatIni);
//            } catch (RemoteException ex) {
//                Logger.getLogger(FormDokter.class.getName()).log(Level.SEVERE, null, ex);
//            }
            nextButton.setEnabled(true);
            goToResepButton.setEnabled(true);
            TambahTindakan.setEnabled(true);
            simpanRekamMedis.setEnabled(false);
        }

//   try{
//           List<Rekam_Medis> list = dokterService.getRekam_Medis(idRekam.getText());
//           tableModelRekamMedis.setData(list);
//           System.out.println(list);
//        }catch(RemoteException exception){
//            exception.printStackTrace();
//        }
        //        statement.setString(2, rekam_medis.getId_Diagnosa());
//           statement.setString(3, rekam_medis.getId_Pasien());
//           statement.setString(4, rekam_medis.getNo_Detail());
//           statement.setString(5, rekam_medis.getId_Resep());
//           statement.setDate(6, (java.sql.Date) rekam_medis.getTgl_Rekam());
//           statement.setInt(7, rekam_medis.getTinggi());
//           statement.setInt(8, rekam_medis.getBerat());
//           statement.setInt(9, rekam_medis.getTekanan_Darah());
//           statement.setLong(10, rekam_medis.getHasil_Pemerikasaan());
//           statement.setString(11, rekam_medis.getAlergi());
//           statement.setInt(11, rekam_medis.getTotal_Harga());
//           statement.setString(11, rekam_medis.getLayanan_Tambahan());

    }//GEN-LAST:event_simpanRekamMedisActionPerformed

    private void cariRMbyIdPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariRMbyIdPasienActionPerformed
        if (!fieldIdPasien.getText().equalsIgnoreCase("")) {
            String idPasien = fieldIdPasien.getText();
            System.out.println(idPasien);
            try {
                List<Rekam_Medis> listRM = this.dokterService.GetRekam_MedisbyPasien(idPasien);
                if (!listRM.isEmpty()) {
                    tableModelRekamMedis.setData(listRM);
                } else {
                    tableModelRekamMedis.setData(listRM);
                    JOptionPane.showMessageDialog(this, "Gagal mencari rekam medis pasien !", "Rekam Medis", JOptionPane.ERROR_MESSAGE);
                }
            } catch (RemoteException exception) {
                exception.printStackTrace();
            }
            tabelRiwayat.setModel(tableModelRekamMedis);
        } else {
            List<Rekam_Medis> rms = new ArrayList<Rekam_Medis>();
            tableModelRekamMedis.setData(rms);
            tabelRiwayat.setModel(tableModelRekamMedis);
            JOptionPane.showMessageDialog(this, "Isi id pasien !", "Rekam Medis", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_cariRMbyIdPasienActionPerformed

    private void comboPenyakitPasPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboPenyakitPasPopupMenuWillBecomeVisible
        comboPenyakitPas.removeAllItems();
        List simpan = new ArrayList();
        try {
            simpan = dokterService.getNamaPenyakit();
            for (int i = 0; i < simpan.size(); i++) {
                comboPenyakitPas.addItem(simpan.get(i));
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FormDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_comboPenyakitPasPopupMenuWillBecomeVisible

    private void comboTambahanPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboTambahanPopupMenuWillBecomeVisible
    }//GEN-LAST:event_comboTambahanPopupMenuWillBecomeVisible

    private void clearFormResep() {
        idResepField.setText("");
        noDetailResepField.setText("");
        namaObatComboBox.setSelectedIndex(0);
        takaranSpinner.setValue(0);
        pemakaianComboBox.setSelectedIndex(0);
        hargaObatField.setText("");
        jumlahSpinner.setValue(0);
        satuanComboBox.setSelectedIndex(0);
        keteranganField.setText("");
        namaObatComboBox.getFocusListeners();
    }

    private void tambahObatDetailResepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahObatDetailResepButtonActionPerformed
        if ((namaObatComboBox.getSelectedItem().toString().equalsIgnoreCase("")) || (takaranSpinner.getValue().equals(""))
                || (hargaObatField.getText().equals("")) || (jumlahSpinner.getValue().equals(""))
                || (satuanComboBox.getSelectedIndex() == 0) || (keteranganField.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");
        } else {
            try {
                Obat_detailResep detailResep = new Obat_detailResep();
                detailResep.setId_Resep(idResep);
                detailResep.setNo_Detail_Resep(dokterService.getAutoNumberDetailResep());
                String id_obat = dokterService.getIDObat(namaObatComboBox.getSelectedItem().toString());
                detailResep.setId_Obat(id_obat);
                detailResep.setTakaran((String) (takaranSpinner.getValue() + " kali " + takaranSatuanWaktuComboBox.getSelectedItem()));
                detailResep.setPemakaian(pemakaianComboBox.getSelectedItem().toString());
                detailResep.setJumlah(Integer.parseInt(jumlahSpinner.getValue().toString()));
                detailResep.setKeterangan(keteranganField.getText());

                Obat_detailResep detailResep1 = dokterService.insertDetailResep(detailResep);
                tabelModelDetailResep.insert(detailResep1);
                hitungTotalHargaObat();
                clearFormResep();
            } catch (RemoteException exception) {
                exception.printStackTrace();
                JOptionPane.showMessageDialog(null, "Gagal meng-input data karena kesalahan sistem!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_tambahObatDetailResepButtonActionPerformed

    private void comboTindakanPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboTindakanPopupMenuWillBecomeVisible
        comboTindakan.removeAllItems();
        List simpan = new ArrayList();
        try {
            simpan = dokterService.getNamaTindakan();
            for (int i = 0; i < simpan.size(); i++) {
                comboTindakan.addItem(simpan.get(i));
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FormDokter.class.getName()).log(Level.SEVERE, null, ex);

        }
// TODO add your handling code here:
    }//GEN-LAST:event_comboTindakanPopupMenuWillBecomeVisible

    private void TambahTindakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahTindakanActionPerformed
        
        if (idRekamField.getText().equals("") || comboTindakan.getSelectedItem().equals("") || fieldHarga.getText().equals("")
                || comboTambahan.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");
        } else {
            try {

                Tindakan_detailTindakan detail_tindakan = new Tindakan_detailTindakan();
                Rekam_Medis rekam_medis = new Rekam_Medis();
                detail_tindakan.setNo_Detail(dokterService.getAutoNumberNoDetail());
                String id_tindakan = dokterService.getIdTindakan(comboTindakan.getSelectedItem().toString());
                detail_tindakan.setId_Tindakan(id_tindakan);
                detail_tindakan.setId_Rekam(idRekamField.getText());
                detail_tindakan.setKeterangan(fieldKeterangan.getText());
                totalHargaRM = totalHargaRM + hargaRM;
                totalHargaTindakan.setText("" + totalHargaRM);

                Tindakan_detailTindakan detail_tindakan1 = dokterService.insertDetailTindakan(detail_tindakan);
                tableModelTindakan.insert(detail_tindakan1);
                //dokterService.updateRekam_Medis(rekam_medis);
                clearTindakan();
                JOptionPane.showMessageDialog(null, "Tindakan berhasil ditambahkan");

                try {
                    tableModelTindakan.setData(this.dokterService.getDetailTindakanById(idRekamField.getText()));
                } catch (RemoteException exception) {
                    exception.printStackTrace();
                }

            } catch (RemoteException exception) {
                exception.printStackTrace();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_TambahTindakanActionPerformed

    private void comboTindakanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTindakanItemStateChanged
        try {
            hargaRM = dokterService.getTarif(comboTindakan.getSelectedItem().toString());
            fieldHarga.setText("" + hargaRM);

        } catch (RemoteException ex) {
            Logger.getLogger(FormDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTindakanItemStateChanged

    private void simpanDetailResepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanDetailResepButtonActionPerformed
        if ((namaObatComboBox.getSelectedItem().toString().equalsIgnoreCase("")) || (takaranSpinner.getValue().equals(""))
                || (hargaObatField.getText().equals("")) || (jumlahSpinner.getValue().equals(""))
                || (satuanComboBox.getSelectedIndex() == 0) || (keteranganField.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");
        } else {
            try {
                Obat_resep resep = new Obat_resep();
                resep.setId_Resep(idResep);
                resep.setId_Rekam(id_Rekam);
                resep.setTotal_Harga(0);
                dokterService.insertResep(resep);
                simpanDetailResepButton.setEnabled(false);
                tambahObatDetailResepButton.setEnabled(true);
                hapusObatDetailResepButton.setEnabled(true);
            } catch (RemoteException exception) {
                exception.printStackTrace();
            }

            try {
                Obat_detailResep detailResep = new Obat_detailResep();
                detailResep.setId_Resep(idResep);
                detailResep.setNo_Detail_Resep(dokterService.getAutoNumberDetailResep());
                String id_obat = dokterService.getIDObat(namaObatComboBox.getSelectedItem().toString());
                detailResep.setId_Obat(id_obat);
                detailResep.setTakaran((String) (takaranSpinner.getValue() + " kali " + takaranSatuanWaktuComboBox.getSelectedItem()));
                detailResep.setPemakaian(pemakaianComboBox.getSelectedItem().toString());
                detailResep.setJumlah(Integer.parseInt(jumlahSpinner.getValue().toString()));
                detailResep.setKeterangan(keteranganField.getText());

                Obat_detailResep detailResep1 = dokterService.insertDetailResep(detailResep);
                tabelModelDetailResep.insert(detailResep1);
            } catch (RemoteException exception) {
                exception.printStackTrace();
            }
            hitungTotalHargaObat();
            clearFormResep();
            printResepButton.setEnabled(true);
            backToRekamMedis.setEnabled(true);
        }
    }//GEN-LAST:event_simpanDetailResepButtonActionPerformed

    public void hitungTotalHargaObat() {
        totalHargaObat = (Integer.parseInt(jumlahSpinner.getValue().toString()) * hargaObat) + totalHargaObat;
        totalHargaObatField.setText(String.valueOf(totalHargaObat));
    }

    private void namaObatComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_namaObatComboBoxItemStateChanged
        try {
            hargaObat = dokterService.getHargaObat(namaObatComboBox.getSelectedItem().toString());
            hargaObatField.setText(String.valueOf(hargaObat));
        } catch (RemoteException ex) {
            Logger.getLogger(FormDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_namaObatComboBoxItemStateChanged

    private void namaObatComboBoxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_namaObatComboBoxPopupMenuWillBecomeVisible
        namaObatComboBox.removeAllItems();
        List namaobat = new ArrayList();
        try {
            namaobat = dokterService.getNamaObat();
            for (int i = 0; i < namaobat.size(); i++) {
                namaObatComboBox.addItem(namaobat.get(i));
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FormDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_namaObatComboBoxPopupMenuWillBecomeVisible

    private void hapusObatDetailResepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusObatDetailResepButtonActionPerformed
        int row = tabelDetailResep.getSelectedRow();
        if (row == -1) {
            return;
        }
        try {
            dokterService.deleteDetailResep(tabelModelDetailResep.get(row).getNo_Detail_Resep());
        } catch (RemoteException ex) {
            Logger.getLogger(FormDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
        tabelModelDetailResep.delete(row);
    }//GEN-LAST:event_hapusObatDetailResepButtonActionPerformed

    private void backToRekamMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToRekamMedisActionPerformed
        Obat_resep resep = new Obat_resep();
        try {
            dokterService.updateResep(resep, idResep, Integer.parseInt(totalHargaObatField.getText()));
            JOptionPane.showMessageDialog(null, "Proses Pemberian Resep Berhasil!\nAnda akan kembali ke form Rekam Medis", "Proses Pemberian Resep Berhasil", JOptionPane.INFORMATION_MESSAGE);
            totalHargaObat = 0;
            totalHargaObatField.setText("");
            dokterService.updateAntrian(antrian.getId_Antrian());
            id_Rekam = dokterService.getAutoNumberIdRekam();
            idRekamField.setText(id_Rekam);
            dokterTabPane.setSelectedIndex(2);
            dokterTabPane.setEnabledAt(1, false);
            cekdaftar();
        } catch (RemoteException ex) {
            Logger.getLogger(FormDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backToRekamMedisActionPerformed

    private void printResepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printResepButtonActionPerformed
        // TODO add your handling code here:
        JasperPrint jasperPrint = null;
        try {
            JasperCompileManager.compileReportToFile("src/Report/resepPasien_1.jrxml");
            HashMap hash = new HashMap();
            jasperPrint = JasperFillManager.fillReport("src/Report/resepPasien_1.jasper", hash,
                    new JRTableModelDataSource(tableModelLaporanResepPasien));
            JasperViewer jasperViewer = new JasperViewer(jasperPrint);
            jasperViewer.setVisible(true);
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_printResepButtonActionPerformed

    private void dokterTabPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dokterTabPaneMouseClicked
        if (dokterTabPane.getSelectedIndex() == 2) {
            cekdaftar();
        }// TODO add your handling code here:
    }//GEN-LAST:event_dokterTabPaneMouseClicked

    private void fieldHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldHargaActionPerformed

    private void comboTindakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTindakanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTindakanActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
    try {
            Rekam_Medis rekam_medis = new Rekam_Medis();
            dokterService.updateRekam_Medis(rekam_medis, id_Rekam, Integer.parseInt(totalHargaTindakan.getText()));

            //-----Pembayaran-----//
            String idPasien = Field_idPasien.getText();
            int hargaRM = Integer.parseInt(totalHargaTindakan.getText());
            try {
                String idPembayaran = dokterService.mencariIdPembayaranDariPembayaran(idPasien);
                if (!idPembayaran.equalsIgnoreCase("")) {
                    Pembayaran pembayaran = dokterService.getPembayaranDariPembayaran(idPembayaran);
                    dokterService.updatePembayaranDariPembayaran(pembayaran, id_Rekam, hargaRM);
                } else if (idPembayaran.equalsIgnoreCase("")) {
                    idPembayaran = dokterService.getAutoNumberDariPembayaran();
                    dokterService.insertPembayaranDariPembayaran(idPembayaran, idPasien, id_Rekam, hargaRM);
                    System.out.println(idPembayaran);
                    System.out.println(idPasien);
                    System.out.println(id_Rekam);
                    System.out.println(hargaRM);
                }
            } catch (RemoteException ex) {
                Logger.getLogger(FormDokter.class.getName()).log(Level.SEVERE, null, ex);
            }

            hargaRM = 0;
            totalHargaTindakan.setText("");
            clearUser();
            dokterService.updateAntrian(antrian.getId_Antrian());
            id_Rekam = dokterService.getAutoNumberIdRekam();
            idRekamField.setText(id_Rekam);
        } catch (RemoteException ex) {
            Logger.getLogger(FormDokter.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Tidak Tersimpan karena gagal koneksi ke database");
        }
        cekdaftar();
        goToResepButton.setEnabled(false);
        simpanRekamMedis.setEnabled(true);
        nextButton.setEnabled(true);
        // TODO add your handling code here:
    
    }//GEN-LAST:event_nextButtonActionPerformed

    private void fieldNoDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNoDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNoDetailActionPerformed

    private void tinggiBadanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tinggiBadanKeyTyped
        typeonlynumber(evt);
        if (tinggiBadan.getText().length() > 3) {
            evt.setKeyChar((char) 0);
            getToolkit().beep();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_tinggiBadanKeyTyped

    private void TekananDarahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TekananDarahKeyTyped
        typeonlynumber(evt);
        if (TekananDarah.getText().length() > 3) {
            evt.setKeyChar((char) 0);
            getToolkit().beep();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_TekananDarahKeyTyped

    private void BeratBadanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BeratBadanKeyTyped
        typeonlynumber(evt);
        if (BeratBadan.getText().length() > 3) {
            evt.setKeyChar((char) 0);
            getToolkit().beep();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_BeratBadanKeyTyped

    private void goToResepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToResepButtonActionPerformed
        dokterTabPane.setEnabledAt(1, true);
        dokterTabPane.setSelectedIndex(1);
    }//GEN-LAST:event_goToResepButtonActionPerformed

    private void cekdaftar() {
        try {
            antrian = dokterService.Id_pasien(antrian);
            if ("kosong".equals(antrian.getId_Pasien())) {
                int reply = JOptionPane.showConfirmDialog(null, "Tidak ada antrian. Apakah ingin memproses kembali ?", "konfirmasi", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    cekdaftar();
                } else {
                    JOptionPane.showMessageDialog(null, "Silahkan klik rekam medis lagi jika ingin memulai kembali");
                    //semua field di-disable
                }
            } else if ("salah".equals(antrian.getId_Pasien())) {
                JOptionPane.showMessageDialog(null, "Tidak terkoneksi ke database");
                cekdaftar();
            } else {
                Field_idPasien.setText(antrian.getId_Pasien());
                fieldNamaPasien.setText(dokterService.Nama_pasien(Field_idPasien.getText()));
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FormDokter.class.getName()).log(Level.ALL, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BeratBadan;
    private javax.swing.JTextField Field_idPasien;
    private javax.swing.JButton TambahTindakan;
    private javax.swing.JTextField TekananDarah;
    private javax.swing.JTextField alergi;
    private javax.swing.JButton backToRekamMedis;
    private javax.swing.JButton cariRMbyIdPasien;
    private javax.swing.JComboBox comboPenyakitPas;
    private javax.swing.JComboBox comboTambahan;
    private javax.swing.JComboBox comboTindakan;
    private javax.swing.JTabbedPane dokterTabPane;
    private javax.swing.JTextField fieldHarga;
    private javax.swing.JTextField fieldIdPasien;
    private javax.swing.JTextField fieldKeterangan;
    private javax.swing.JTextField fieldNamaPasien;
    private javax.swing.JTextField fieldNoDetail;
    private javax.swing.JButton goToResepButton;
    private javax.swing.JButton hapusObatDetailResepButton;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JTextField hargaObatField;
    private javax.swing.JTextField hasilPemeriksaan;
    private javax.swing.JTextField idRekamField;
    private javax.swing.JTextField idResepField;
    private javax.swing.JLabel idResepLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel jumlahLabel;
    private javax.swing.JSpinner jumlahSpinner;
    private javax.swing.JTextField keteranganField;
    private javax.swing.JLabel keteranganLabel;
    private javax.swing.JComboBox namaObatComboBox;
    private javax.swing.JLabel namaObatLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextField noDetailResepField;
    private javax.swing.JLabel noDetailResepLabel;
    private javax.swing.JComboBox pemakaianComboBox;
    private javax.swing.JLabel pemakaianLabel;
    private javax.swing.JButton printResepButton;
    private javax.swing.JPanel resepPanel;
    private javax.swing.JComboBox satuanComboBox;
    private javax.swing.JButton simpanDetailResepButton;
    private javax.swing.JButton simpanRekamMedis;
    private javax.swing.JTable tabelDetailResep;
    private javax.swing.JTable tabelRiwayat;
    private javax.swing.JTable tableTindakan;
    private javax.swing.JLabel takaranLabel;
    private javax.swing.JComboBox takaranSatuanWaktuComboBox;
    private javax.swing.JSpinner takaranSpinner;
    private javax.swing.JButton tambahObatDetailResepButton;
    private javax.swing.JFormattedTextField tglRekam;
    private javax.swing.JTextField tinggiBadan;
    private javax.swing.JTextField totalHargaObatField;
    private javax.swing.JLabel totalHargaObatLabel;
    private javax.swing.JTextField totalHargaTindakan;
    // End of variables declaration//GEN-END:variables
}
