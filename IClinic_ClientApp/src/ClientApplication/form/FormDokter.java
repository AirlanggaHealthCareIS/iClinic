/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormKategori.java
 *
 * Created on Jun 25, 2010, 9:28:14 PM
 */

package ClientApplication.form;

import ClientApplication.FormLogin;
import ClientApplication.model.TableModelRekam_Medis;
import Database.Entity.Rekam_Medis;
import Database.Service.DokterService;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/**
 *
 * @author piudt + pipeh
 */

public class FormDokter extends javax.swing.JFrame {

//    Registry registry = LocateRegistry.getRegistry("localhost", 6789);
//    
//    final DetailTransaksiBeliService service3 = (DetailTransaksiBeliService) registry.lookup("service3");
//    final PembayaranService service9 = (PembayaranService)registry.lookup("service9");
//    
//    private TransaksiBeliService TransaksiBeliService;
//    private TableModelTransaksiBeli tableModelTransaksiBeli = new TableModelTransaksiBeli();

    public FormDokter(DokterService dokterService) throws RemoteException, NotBoundException {
//        this.TransaksiBeliService = TransaksiBeliService;
//        try{
//            tableModelTransaksiBeli.setData(this.TransaksiBeliService.getTransaksiBeli());
//        }catch(RemoteException exception){
//            exception.printStackTrace();
//        }
        initComponents();
        setLocationRelativeTo(this);
        setSize(1280, 730);
//
//        Table_TransaksiBeli.setModel(tableModelTransaksiBeli);
//        Table_TransaksiBeli.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
//
//            public void valueChanged(ListSelectionEvent e) {
//                int row = Table_TransaksiBeli.getSelectedRow();
//                 if(row != -1){
//                   TransaksiBeli transaksiBeli = tableModelTransaksiBeli.get(row);
//                   idTransaksiBeli.setText(transaksiBeli.getID_TRANSAKSIBELI());
//                   idCustomer.setText(transaksiBeli.getID_CUSTOMER());
//                   idKaryawan.setSelectedItem(transaksiBeli.getID_KARYAWAN());
//                   tglTransaksiBeli.setValue(transaksiBeli.getTGL_TRANSAKSIBELI());
//                   totalHarga.setText(String.valueOf(transaksiBeli.getTOTAL_HARGA()));
//                   diskon.setText(String.valueOf(transaksiBeli.getDISKON()));
//                   totalTagihan.setText(String.valueOf(transaksiBeli.getTOTAL_TAGIHAN()));
//                   status.setText(transaksiBeli.getSTATUS_PEMBAYARAN());
//                 }
//            }
//        });
    }
        public void clear(){
//        idTransaksiBeli.setText("");
//        idCustomer.setText("");
//        idKaryawan.setSelectedItem(0);
//        totalHarga.setText("");
//        diskon.setText("");
//        totalTagihan.setText("");
//        status.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RekamMedis = new javax.swing.JTabbedPane();
        riwayatPasienPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        rekamMedisPanel = new javax.swing.JPanel();
        idRekam = new javax.swing.JLabel();
        idPasien = new javax.swing.JLabel();
        idDiagnosa = new javax.swing.JLabel();
        noDetail = new javax.swing.JLabel();
        tglRekam = new javax.swing.JLabel();
        tinggiBadan = new javax.swing.JLabel();
        beratBadan = new javax.swing.JLabel();
        tekananDarah = new javax.swing.JLabel();
        hasilPemeriksaan = new javax.swing.JLabel();
        alergi = new javax.swing.JLabel();
        totalHarga = new javax.swing.JLabel();
        layananTambahan = new javax.swing.JLabel();
        IDRekam = new javax.swing.JTextField();
        IDPasien = new javax.swing.JTextField();
        IDDiagnosa = new javax.swing.JTextField();
        NoDetail = new javax.swing.JTextField();
        tggBadan = new javax.swing.JTextField();
        brtBadan = new javax.swing.JTextField();
        tknDarah = new javax.swing.JTextField();
        Alergi = new javax.swing.JTextField();
        hasilPeriksa = new javax.swing.JTextField();
        tambahan = new javax.swing.JComboBox();
        submit = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        tglRekamM = new javax.swing.JFormattedTextField();
        totalHarga1 = new javax.swing.JTextField();
        clear1 = new javax.swing.JButton();
        detailTindakan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        resepPanel = new javax.swing.JPanel();
        idResepLabel = new javax.swing.JLabel();
        detailResepPanel = new javax.swing.JPanel();
        tambahObatButton = new javax.swing.JButton();
        pilihObatButton = new javax.swing.JButton();
        noDetailResepLabel = new javax.swing.JLabel();
        namaObatLabel = new javax.swing.JLabel();
        takaranLabel = new javax.swing.JLabel();
        pemakaianLabel = new javax.swing.JLabel();
        keteranganLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hargaLabel = new javax.swing.JLabel();
        noDetailResepField = new javax.swing.JTextField();
        namaObatComboBox = new javax.swing.JComboBox();
        takaranSpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        takaranComboBox = new javax.swing.JComboBox();
        pemakaianComboBox = new javax.swing.JComboBox();
        hargaField = new javax.swing.JTextField();
        jumlahObatSpinner = new javax.swing.JSpinner();
        satuanJumlahComboBox = new javax.swing.JComboBox();
        keteranganField = new javax.swing.JTextField();
        doneButton = new javax.swing.JButton();
        idResepField = new javax.swing.JTextField();
        totalHargaLabel = new javax.swing.JLabel();
        totalHargaObatField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailResepTabel = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dokter");
        setMaximumSize(new java.awt.Dimension(1280, 730));
        setMinimumSize(new java.awt.Dimension(1280, 730));
        setPreferredSize(new java.awt.Dimension(1280, 730));
        setResizable(false);
        getContentPane().setLayout(null);

        RekamMedis.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout riwayatPasienPanelLayout = new javax.swing.GroupLayout(riwayatPasienPanel);
        riwayatPasienPanel.setLayout(riwayatPasienPanelLayout);
        riwayatPasienPanelLayout.setHorizontalGroup(
            riwayatPasienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(riwayatPasienPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1185, Short.MAX_VALUE)
                .addContainerGap())
        );
        riwayatPasienPanelLayout.setVerticalGroup(
            riwayatPasienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(riwayatPasienPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RekamMedis.addTab("Riwayat Pasien", riwayatPasienPanel);

        idRekam.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idRekam.setText("ID Rekam");

        idPasien.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idPasien.setText("ID Pasien");

        idDiagnosa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idDiagnosa.setText("ID Diagnosa ");

        noDetail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        noDetail.setText("Nomor Detail");

        tglRekam.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tglRekam.setText("Tanggal Rekam");

        tinggiBadan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tinggiBadan.setText("Tinggi Badan");

        beratBadan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        beratBadan.setText("Berat Badan");

        tekananDarah.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tekananDarah.setText("Tekanan Darah");

        hasilPemeriksaan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        hasilPemeriksaan.setText("Hasil Pemeriksaan");

        alergi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        alergi.setText("Alergi");

        totalHarga.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        totalHarga.setText("Total Harga");

        layananTambahan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        layananTambahan.setText("Layanan Tambahan");

        IDRekam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDRekamActionPerformed(evt);
            }
        });

        IDPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDPasienActionPerformed(evt);
            }
        });

        NoDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoDetailActionPerformed(evt);
            }
        });

        tknDarah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tknDarahActionPerformed(evt);
            }
        });

        Alergi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlergiActionPerformed(evt);
            }
        });

        hasilPeriksa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilPeriksaActionPerformed(evt);
            }
        });

        tambahan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tambahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahanActionPerformed(evt);
            }
        });

        submit.setText("Simpan Data");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        tglRekamM.setEditable(false);
        tglRekamM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        tglRekamM.setValue(new java.util.Date());
        tglRekamM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglRekamMActionPerformed(evt);
            }
        });

        totalHarga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalHarga1ActionPerformed(evt);
            }
        });

        clear1.setText("Clear");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });

        detailTindakan.setText("Detail Tindakan");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Kondisi Pasien:");

        javax.swing.GroupLayout rekamMedisPanelLayout = new javax.swing.GroupLayout(rekamMedisPanel);
        rekamMedisPanel.setLayout(rekamMedisPanelLayout);
        rekamMedisPanelLayout.setHorizontalGroup(
            rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rekamMedisPanelLayout.createSequentialGroup()
                .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rekamMedisPanelLayout.createSequentialGroup()
                        .addContainerGap()
<<<<<<< HEAD
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(idRekam)
                                            .addComponent(noDetail))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(idPasien)
                                            .addComponent(tglRekam)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(beratBadan)
                                        .addGap(27, 27, 27)
                                        .addComponent(brtBadan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)
                                        .addComponent(tekananDarah)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tknDarah, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IDPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tglRekamM, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hasilPemeriksaan)
                                    .addComponent(idDiagnosa)
                                    .addComponent(alergi)
                                    .addComponent(totalHarga))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalHarga1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Alergi, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(layananTambahan))
                                    .addComponent(hasilPeriksa, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(NoDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(detailTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tggBadan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IDDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IDRekam, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 142, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tinggiBadan)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(516, 516, 516)
                                .addComponent(tambahan, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
=======
                        .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rekamMedisPanelLayout.createSequentialGroup()
                                .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(idRekam, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(rekamMedisPanelLayout.createSequentialGroup()
                                            .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(idDiagnosa)
                                                .addComponent(tinggiBadan))
                                            .addGap(205, 205, 205)
                                            .addComponent(beratBadan)
                                            .addGap(18, 18, 18)
                                            .addComponent(brtBadan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(noDetail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                                .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(rekamMedisPanelLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(detailTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(rekamMedisPanelLayout.createSequentialGroup()
                                        .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(rekamMedisPanelLayout.createSequentialGroup()
                                                .addGap(95, 95, 95)
                                                .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(idPasien)
                                                    .addComponent(tglRekam)))
                                            .addComponent(tekananDarah, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tknDarah, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(IDPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tglRekamM, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(rekamMedisPanelLayout.createSequentialGroup()
                                .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(rekamMedisPanelLayout.createSequentialGroup()
                                        .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(alergi)
                                            .addComponent(totalHarga))
                                        .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(rekamMedisPanelLayout.createSequentialGroup()
                                                .addGap(283, 283, 283)
                                                .addComponent(layananTambahan)
                                                .addGap(18, 18, 18)
                                                .addComponent(tambahan, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(rekamMedisPanelLayout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(totalHarga1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(rekamMedisPanelLayout.createSequentialGroup()
                                        .addComponent(hasilPemeriksaan)
                                        .addGap(18, 18, 18)
                                        .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Alergi, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hasilPeriksa, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(NoDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tggBadan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(IDDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(IDRekam, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(rekamMedisPanelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        rekamMedisPanelLayout.setVerticalGroup(
            rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rekamMedisPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
>>>>>>> origin/master
                    .addComponent(idRekam)
                    .addComponent(IDRekam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idPasien)
                    .addComponent(IDPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tglRekamM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tglRekam)
                    .addComponent(IDDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idDiagnosa))
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
=======
                .addGap(68, 68, 68)
                .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
>>>>>>> origin/master
                    .addComponent(tinggiBadan)
                    .addComponent(tggBadan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beratBadan)
                    .addComponent(brtBadan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tekananDarah)
                    .addComponent(tknDarah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
=======
                .addGap(18, 18, 18)
                .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
>>>>>>> origin/master
                    .addComponent(noDetail)
                    .addComponent(NoDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hasilPemeriksaan)
                    .addComponent(hasilPeriksa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alergi)
                    .addComponent(Alergi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(layananTambahan)
                    .addComponent(tambahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalHarga)
                    .addComponent(totalHarga1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(clear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        RekamMedis.addTab("Rekam Medis", rekamMedisPanel);

        idResepLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        idResepLabel.setText("ID Resep");

        detailResepPanel.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        tambahObatButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        tambahObatButton.setText("Tambah");

        pilihObatButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        pilihObatButton.setText("Pilih Obat");

        noDetailResepLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        noDetailResepLabel.setText("No Detail Resep");

        namaObatLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        namaObatLabel.setText("Nama Obat");

        takaranLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        takaranLabel.setText("Takaran");

        pemakaianLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        pemakaianLabel.setText("Pemakaian");

        keteranganLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        keteranganLabel.setText("Keterangan");

        jLabel3.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel3.setText("Jumlah");

        hargaLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        hargaLabel.setText("Harga");

        noDetailResepField.setEditable(false);
        noDetailResepField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        namaObatComboBox.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        namaObatComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Nama Obat --" }));

        takaranSpinner.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel4.setText("kali");

        takaranComboBox.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        takaranComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "sehari", "seminggu" }));

        pemakaianComboBox.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        pemakaianComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Cara Pemakaian --" }));

        hargaField.setEditable(false);
        hargaField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        jumlahObatSpinner.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        satuanJumlahComboBox.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        satuanJumlahComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Satuan --" }));

        keteranganField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        javax.swing.GroupLayout detailResepPanelLayout = new javax.swing.GroupLayout(detailResepPanel);
        detailResepPanel.setLayout(detailResepPanelLayout);
        detailResepPanelLayout.setHorizontalGroup(
            detailResepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailResepPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailResepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailResepPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pilihObatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tambahObatButton)
                        .addGap(10, 10, 10))
                    .addGroup(detailResepPanelLayout.createSequentialGroup()
                        .addGroup(detailResepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noDetailResepLabel)
                            .addComponent(namaObatLabel)
                            .addComponent(takaranLabel)
                            .addComponent(pemakaianLabel)
                            .addComponent(keteranganLabel)
                            .addComponent(jLabel3)
                            .addComponent(hargaLabel))
                        .addGap(29, 29, 29)
                        .addGroup(detailResepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaObatComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(detailResepPanelLayout.createSequentialGroup()
                                .addGroup(detailResepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(noDetailResepField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(detailResepPanelLayout.createSequentialGroup()
                                        .addComponent(takaranSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(takaranComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pemakaianComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hargaField)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailResepPanelLayout.createSequentialGroup()
                                        .addComponent(jumlahObatSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(satuanJumlahComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 121, Short.MAX_VALUE))
                            .addComponent(keteranganField))
                        .addContainerGap())))
        );
        detailResepPanelLayout.setVerticalGroup(
            detailResepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailResepPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailResepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noDetailResepLabel)
                    .addComponent(noDetailResepField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(detailResepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaObatLabel)
                    .addComponent(namaObatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailResepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(takaranLabel)
                    .addComponent(takaranSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(takaranComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailResepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pemakaianLabel)
                    .addComponent(pemakaianComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailResepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaLabel)
                    .addComponent(hargaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailResepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jumlahObatSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(satuanJumlahComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailResepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keteranganLabel)
                    .addComponent(keteranganField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailResepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahObatButton)
                    .addComponent(pilihObatButton))
                .addContainerGap())
        );

        doneButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        doneButton.setText("Proses");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        idResepField.setEditable(false);
        idResepField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        totalHargaLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        totalHargaLabel.setText("Total Harga Obat");

        totalHargaObatField.setEditable(false);
        totalHargaObatField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        detailResepTabel.setFont(new java.awt.Font("Caviar Dreams", 0, 12)); // NOI18N
        detailResepTabel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(detailResepTabel);

        javax.swing.GroupLayout resepPanelLayout = new javax.swing.GroupLayout(resepPanel);
        resepPanel.setLayout(resepPanelLayout);
        resepPanelLayout.setHorizontalGroup(
            resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resepPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resepPanelLayout.createSequentialGroup()
                        .addGroup(resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(resepPanelLayout.createSequentialGroup()
                                .addComponent(idResepLabel)
                                .addGap(89, 89, 89)
                                .addComponent(idResepField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(resepPanelLayout.createSequentialGroup()
                                .addComponent(detailResepPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(resepPanelLayout.createSequentialGroup()
                        .addComponent(totalHargaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(totalHargaObatField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(doneButton)
                        .addGap(19, 19, 19))))
        );
        resepPanelLayout.setVerticalGroup(
            resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resepPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idResepLabel)
                    .addComponent(idResepField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(detailResepPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(resepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalHargaLabel)
                    .addComponent(totalHargaObatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doneButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RekamMedis.addTab("Resep", resepPanel);

        getContentPane().add(RekamMedis);
<<<<<<< HEAD
        RekamMedis.setBounds(0, 220, 1020, 550);
=======
        RekamMedis.setBounds(30, 200, 1210, 470);
>>>>>>> origin/master
        RekamMedis.getAccessibleContext().setAccessibleName("Rekam Medis");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/4.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
<<<<<<< HEAD
        jLabel1.setBounds(0, -20, 1020, 860);
=======
        jLabel1.setBounds(0, 0, 1280, 750);
>>>>>>> origin/master

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDRekamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDRekamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDRekamActionPerformed

    private void IDPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDPasienActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_IDPasienActionPerformed

    private void NoDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoDetailActionPerformed

    private void tknDarahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tknDarahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tknDarahActionPerformed

    private void hasilPeriksaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilPeriksaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilPeriksaActionPerformed

    private void AlergiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlergiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlergiActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void tglRekamMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglRekamMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglRekamMActionPerformed

    private void totalHarga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalHarga1ActionPerformed
//if(totalTagihan.getText().equalsIgnoreCase("")){
//            JOptionPane.showMessageDialog(null, "Data Yang Anda Inputkan Belum Lengkap");
//        }
//        else if( !totalTagihan.getText().equals("")){
//            int total_harga = Integer.parseInt(totalTagihan.getText());
//            int bayar = Integer.parseInt(jumlahBayar.getText());
//
//            int total = total_harga;
//
//            if(bayar < total){
//                int sisa = total - bayar;
//                sisaTagihan.setText(""+sisa+"");
//                kembali.setText("0");
//                status.setText("HUTANG");
//            }
//            else if (total < bayar){
//                int kembalian = bayar - total;
//                kembali.setText(""+kembalian+"");
//                sisaTagihan.setText("0");
//                status.setText("LUNAS");
//            }
//            else{
//                kembali.setText("0");
//                sisaTagihan.setText("0");
//                status.setText("LUNAS");
//            }
//        }       }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_totalHarga1ActionPerformed

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
    }//GEN-LAST:event_submitActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clear1ActionPerformed

    private void tambahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahanActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doneButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alergi;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField IDDiagnosa;
    private javax.swing.JTextField IDPasien;
    private javax.swing.JTextField IDRekam;
    private javax.swing.JTextField NoDetail;
    private javax.swing.JTabbedPane RekamMedis;
    private javax.swing.JLabel alergi;
    private javax.swing.JLabel beratBadan;
    private javax.swing.JTextField brtBadan;
    private javax.swing.JButton clear1;
    private javax.swing.JPanel detailResepPanel;
    private javax.swing.JTable detailResepTabel;
    private javax.swing.JButton detailTindakan;
    private javax.swing.JButton doneButton;
    private javax.swing.JTextField hargaField;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JLabel hasilPemeriksaan;
    private javax.swing.JTextField hasilPeriksa;
    private javax.swing.JLabel idDiagnosa;
    private javax.swing.JLabel idPasien;
    private javax.swing.JLabel idRekam;
    private javax.swing.JTextField idResepField;
    private javax.swing.JLabel idResepLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner jumlahObatSpinner;
    private javax.swing.JTextField keteranganField;
    private javax.swing.JLabel keteranganLabel;
    private javax.swing.JLabel layananTambahan;
    private javax.swing.JComboBox namaObatComboBox;
    private javax.swing.JLabel namaObatLabel;
    private javax.swing.JLabel noDetail;
    private javax.swing.JTextField noDetailResepField;
    private javax.swing.JLabel noDetailResepLabel;
    private javax.swing.JComboBox pemakaianComboBox;
    private javax.swing.JLabel pemakaianLabel;
    private javax.swing.JButton pilihObatButton;
    private javax.swing.JPanel rekamMedisPanel;
    private javax.swing.JPanel resepPanel;
    private javax.swing.JPanel riwayatPasienPanel;
    private javax.swing.JComboBox satuanJumlahComboBox;
    private javax.swing.JButton submit;
    private javax.swing.JComboBox takaranComboBox;
    private javax.swing.JLabel takaranLabel;
    private javax.swing.JSpinner takaranSpinner;
    private javax.swing.JButton tambahObatButton;
    private javax.swing.JComboBox tambahan;
    private javax.swing.JLabel tekananDarah;
    private javax.swing.JTextField tggBadan;
    private javax.swing.JLabel tglRekam;
    private javax.swing.JFormattedTextField tglRekamM;
    private javax.swing.JLabel tinggiBadan;
    private javax.swing.JTextField tknDarah;
    private javax.swing.JLabel totalHarga;
    private javax.swing.JTextField totalHarga1;
    private javax.swing.JLabel totalHargaLabel;
    private javax.swing.JTextField totalHargaObatField;
    // End of variables declaration//GEN-END:variables

    private void typeOnlyNumber(ActionEvent evt) {
//        char c = evt.getKeyChar();
//        if(!(Character.isDigit(c)||c == KeyEvent.VK_BACK_SPACE)||c == KeyEvent.VK_DELETE){
//            getToolkit().beep();
//            evt.consume();
//        } //To change body of generated methods, choose Tools | Templates.
    }

}
