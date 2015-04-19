package ClientApplication.form;

import ClientApplication.model.TableModelKecantikan_tabelMaster;
import Database.Entity.Kecantikan_tabelMaster;
import ClientApplication.model.TableModelLab_tabelMaster;
import Database.Entity.Lab_tabelMaster;
import ClientApplication.model.TableModelObat_tabelMaster;
import Database.Entity.Obat_tabelMaster;
import ClientApplication.model.TableModelPenyakit_tabelMaster;
import Database.Entity.Penyakit_tabelMaster;
import ClientApplication.model.TableModelTindakan_tabelMaster;
import ClientApplication.model.TableModelUser;
import Database.Entity.Tindakan_tabelMaster;
import Database.Entity.User;
import Database.Service.AdministratorService;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class FormAdministrator extends javax.swing.JFrame {
    
    private TableModelUser tableMasterUser = new TableModelUser();
    private TableModelPenyakit_tabelMaster tableMasterPenyakit = new TableModelPenyakit_tabelMaster();
    private TableModelTindakan_tabelMaster tableMasterTindakan = new TableModelTindakan_tabelMaster();
    private TableModelObat_tabelMaster tableMasterObat = new TableModelObat_tabelMaster();
    private TableModelLab_tabelMaster tableMasterLab = new TableModelLab_tabelMaster();
    private TableModelKecantikan_tabelMaster tableMasterKecantikan = new TableModelKecantikan_tabelMaster();
    
    private AdministratorService serviceAdmin;
            
    public FormAdministrator(AdministratorService administratorService){
        serviceAdmin = administratorService;
        try{
            tableMasterUser.setData(serviceAdmin.getUser());
            tableMasterPenyakit.setData(serviceAdmin.getPenyakit_tabelMaster());
            tableMasterTindakan.setData(serviceAdmin.getTindakan_tabelMaster());
            tableMasterObat.setData(serviceAdmin.getObat_tabelMaster());
            tableMasterLab.setData(serviceAdmin.getLab_tabelMaster());
            tableMasterKecantikan.setData(serviceAdmin.getKecantikan_tabelMaster());
        } catch(RemoteException exception){
            exception.printStackTrace();
        }
        initComponents();
        setLocationRelativeTo(this);
        
        userTabel.setModel(tableMasterUser);
        userTabel.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse) {
                int row = userTabel.getSelectedRow();
                if(row != -1){
                    User user = tableMasterUser.get(row);
                    idUserField.setText(user.getId_User());
                    namaUserField.setText(user.getNama_User());
                    jabatanComboBox.setSelectedItem(user.getJabatan());
                    usernameField.setText(user.getUsername());
                    passwordUserPasswordField.setText(user.getPassword());
                }
            }
        });
        
        penyakitTabel.setModel(tableMasterPenyakit);
        penyakitTabel.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse) {
                int row = penyakitTabel.getSelectedRow();
                if(row != -1){
                    Penyakit_tabelMaster penyakit = tableMasterPenyakit.get(row);
                    idPenyakitField.setText(penyakit.getId_Penyakit());
                    namaPenyakitField.setText(penyakit.getPenyakit());
                    gejalaField.setText(penyakit.getGejala());
                }
            }
        });
        
        tindakanTabel.setModel(tableMasterTindakan);
        tindakanTabel.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse) {
                int row = tindakanTabel.getSelectedRow();
                if(row != -1){
                    Tindakan_tabelMaster tindakan = tableMasterTindakan.get(row);
                    idTindakanField.setText(tindakan.getId_Tindakan());
                    namaTindakanField.setText(tindakan.getNama_Tindakan());
                    spesialisasiComboBox.setSelectedItem(tindakan.getSpesialisasi());
                    tarifField.setText(String.valueOf(tindakan.getTarif()));
                    keteranganField.setText(tindakan.getKeterangan());
                }
            }
        });
        
        layananLabTabel.setModel(tableMasterLab);
        layananLabTabel.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse) {
                int row = layananLabTabel.getSelectedRow();
                if(row != -1){
                    Lab_tabelMaster lab = tableMasterLab.get(row);
                    idLayananLabField.setText(lab.getId_Lab());
                    jenisPemeriksaanLabField.setText(lab.getJenis_Pemeriksaan());
                    deskripsiLabField.setText(lab.getDeskripsi());
                    hargaLabField.setText(String.valueOf(lab.getHarga()));
                }
            }
        });
        
        layananKecantikanTabel.setModel(tableMasterKecantikan);
        layananKecantikanTabel.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse) {
                int row = layananKecantikanTabel.getSelectedRow();
                if(row != -1){
                    Kecantikan_tabelMaster kecantikan = tableMasterKecantikan.get(row);
                    idLayananKecantikanField.setText(kecantikan.getId_Kecantikan());
                    jenisLayananKecantikanField.setText(kecantikan.getJenis_Layanan());
                    deskripsiKecantikanField.setText(kecantikan.getDeskripsi());
                    tarifKecantikanField.setText(String.valueOf(kecantikan.getTarif()));
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminTabPane = new javax.swing.JTabbedPane();
        userPanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        userTabel = new javax.swing.JTable();
        idUserLabel = new javax.swing.JLabel();
        namaUserLabel = new javax.swing.JLabel();
        jabatanLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        idUserField = new javax.swing.JTextField();
        namaUserField = new javax.swing.JTextField();
        jabatanComboBox = new javax.swing.JComboBox();
        usernameField = new javax.swing.JTextField();
        simpanUserButton = new javax.swing.JButton();
        ubahUserButton = new javax.swing.JButton();
        hapusUserButton = new javax.swing.JButton();
        clearUserButton = new javax.swing.JButton();
        passwordUserPasswordField = new javax.swing.JPasswordField();
        penyakitPanel = new javax.swing.JPanel();
        idPenyakitLabel = new javax.swing.JLabel();
        penyakitLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        penyakitTabel = new javax.swing.JTable();
        simpanPenyakitButton = new javax.swing.JButton();
        clearPenyakitButton = new javax.swing.JButton();
        idPenyakitField = new javax.swing.JTextField();
        namaPenyakitField = new javax.swing.JTextField();
        gejalaField = new javax.swing.JTextField();
        hapusPenyakitButton = new javax.swing.JButton();
        ubahPenyakitButton = new javax.swing.JButton();
        tindakanPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tindakanTabel = new javax.swing.JTable();
        idTindakanLabel = new javax.swing.JLabel();
        namaTindakanLabel = new javax.swing.JLabel();
        spesialisasiLabel = new javax.swing.JLabel();
        tarifLabel = new javax.swing.JLabel();
        keteranganLabel = new javax.swing.JLabel();
        idTindakanField = new javax.swing.JTextField();
        namaTindakanField = new javax.swing.JTextField();
        tarifField = new javax.swing.JTextField();
        spesialisasiComboBox = new javax.swing.JComboBox();
        keteranganField = new javax.swing.JTextField();
        simpanTindakanButton = new javax.swing.JButton();
        hapusTindakanButton = new javax.swing.JButton();
        ubahTindakanButton = new javax.swing.JButton();
        clearTindakanButton = new javax.swing.JButton();
        obatPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        obatTabel = new javax.swing.JTable();
        simpanObatButton = new javax.swing.JButton();
        clearObatButton = new javax.swing.JButton();
        ubahObatButton = new javax.swing.JButton();
        hapusObatButton = new javax.swing.JButton();
        idObatLabel = new javax.swing.JLabel();
        namaObatLabel = new javax.swing.JLabel();
        jenisObatLabel = new javax.swing.JLabel();
        hargaObatLabel = new javax.swing.JLabel();
        satuanLabel = new javax.swing.JLabel();
        idObatField = new javax.swing.JTextField();
        namaObatField = new javax.swing.JTextField();
        jenisObatField = new javax.swing.JTextField();
        hargaObatField = new javax.swing.JTextField();
        satuanComboBox = new javax.swing.JComboBox();
        labPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        layananLabTabel = new javax.swing.JTable();
        simpanLabButton = new javax.swing.JButton();
        clearLabButton = new javax.swing.JButton();
        ubahLabButton = new javax.swing.JButton();
        hapusLabButton = new javax.swing.JButton();
        idLayananLabLabel = new javax.swing.JLabel();
        jenisPemeriksaanLabel = new javax.swing.JLabel();
        hargaLabel = new javax.swing.JLabel();
        idLayananLabField = new javax.swing.JTextField();
        jenisPemeriksaanLabField = new javax.swing.JTextField();
        hargaLabField = new javax.swing.JTextField();
        deskripsiLabField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        kecantikanPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        layananKecantikanTabel = new javax.swing.JTable();
        simpanKecantikanButton = new javax.swing.JButton();
        clearKecantikanButton = new javax.swing.JButton();
        ubahKecantikanButton = new javax.swing.JButton();
        hapusKecantikanButton = new javax.swing.JButton();
        idLayananKecantikanLabel = new javax.swing.JLabel();
        jenisLayananLabel = new javax.swing.JLabel();
        hargaKecantikanLabel = new javax.swing.JLabel();
        idLayananKecantikanField = new javax.swing.JTextField();
        jenisLayananKecantikanField = new javax.swing.JTextField();
        tarifKecantikanField = new javax.swing.JTextField();
        deskripsiKecantikanField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrator");
        setMinimumSize(new java.awt.Dimension(1280, 730));
        setResizable(false);
        getContentPane().setLayout(null);

        adminTabPane.setFont(new java.awt.Font("Caviar Dreams", 0, 18)); // NOI18N

        userTabel.setFont(new java.awt.Font("Caviar Dreams", 0, 12)); // NOI18N
        userTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID User", "Nama User", "Jabatan", "Username", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(userTabel);

        idUserLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        idUserLabel.setText("ID User");

        namaUserLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        namaUserLabel.setText("Nama User");

        jabatanLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jabatanLabel.setText("Jabatan");

        usernameLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        usernameLabel.setText("Username");

        passwordLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        passwordLabel.setText("Password");

        idUserField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        namaUserField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        jabatanComboBox.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jabatanComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Jabatan --", "ADMINISTRATOR", "PENDAFTARAN", "DOKTER", "APOTEKER", "LAB", "USG", "KECANTIKAN", "PEMBAYARAN", "KEP.KLINIK" }));

        usernameField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        simpanUserButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        simpanUserButton.setText("Simpan");
        simpanUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanUserButtonActionPerformed(evt);
            }
        });

        ubahUserButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        ubahUserButton.setText("Ubah");
        ubahUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahUserButtonActionPerformed(evt);
            }
        });

        hapusUserButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        hapusUserButton.setText("Hapus");

        clearUserButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        clearUserButton.setText("Clear");
        clearUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearUserButtonActionPerformed(evt);
            }
        });

        passwordUserPasswordField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanelLayout.createSequentialGroup()
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idUserLabel)
                            .addComponent(namaUserLabel)
                            .addComponent(jabatanLabel)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel))
                        .addGap(22, 22, 22)
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idUserField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaUserField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jabatanComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(passwordUserPasswordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                .addComponent(usernameField, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(simpanUserButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubahUserButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapusUserButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearUserButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idUserLabel)
                    .addComponent(idUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaUserLabel)
                    .addComponent(namaUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jabatanLabel)
                    .addComponent(jabatanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordUserPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanUserButton)
                    .addComponent(ubahUserButton)
                    .addComponent(hapusUserButton)
                    .addComponent(clearUserButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adminTabPane.addTab("User", userPanel);

        idPenyakitLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        idPenyakitLabel.setText("ID Penyakit");

        penyakitLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        penyakitLabel.setText("Nama Penyakit");

        jLabel1.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel1.setText("Gejala");

        penyakitTabel.setFont(new java.awt.Font("Caviar Dreams", 0, 12)); // NOI18N
        penyakitTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Penyakit", "Nama Penyakit", "Gejala"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(penyakitTabel);

        simpanPenyakitButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        simpanPenyakitButton.setText("Simpan");
        simpanPenyakitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanPenyakitButtonActionPerformed(evt);
            }
        });

        clearPenyakitButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        clearPenyakitButton.setText("Clear");
        clearPenyakitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearPenyakitButtonActionPerformed(evt);
            }
        });

        idPenyakitField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        namaPenyakitField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        gejalaField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        hapusPenyakitButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        hapusPenyakitButton.setText("Hapus");

        ubahPenyakitButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        ubahPenyakitButton.setText("Ubah");
        ubahPenyakitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahPenyakitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout penyakitPanelLayout = new javax.swing.GroupLayout(penyakitPanel);
        penyakitPanel.setLayout(penyakitPanelLayout);
        penyakitPanelLayout.setHorizontalGroup(
            penyakitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penyakitPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(penyakitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(penyakitPanelLayout.createSequentialGroup()
                        .addGroup(penyakitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idPenyakitLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(penyakitLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(34, 34, 34)
                        .addGroup(penyakitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(penyakitPanelLayout.createSequentialGroup()
                                .addComponent(idPenyakitField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(penyakitPanelLayout.createSequentialGroup()
                                .addComponent(namaPenyakitField)
                                .addGap(105, 105, 105))
                            .addComponent(gejalaField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penyakitPanelLayout.createSequentialGroup()
                        .addGap(0, 54, Short.MAX_VALUE)
                        .addComponent(simpanPenyakitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubahPenyakitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapusPenyakitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearPenyakitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        penyakitPanelLayout.setVerticalGroup(
            penyakitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penyakitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penyakitPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(penyakitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idPenyakitLabel)
                    .addComponent(idPenyakitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(penyakitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penyakitLabel)
                    .addComponent(namaPenyakitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(penyakitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(penyakitPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(penyakitPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gejalaField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(penyakitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ubahPenyakitButton)
                    .addComponent(hapusPenyakitButton)
                    .addComponent(clearPenyakitButton)
                    .addComponent(simpanPenyakitButton))
                .addGap(128, 128, 128))
        );

        adminTabPane.addTab("Penyakit", penyakitPanel);

        tindakanTabel.setFont(new java.awt.Font("Caviar Dreams", 0, 12)); // NOI18N
        tindakanTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Tindakan", "Nama Tindakan", "Spesialisasi", "Tarif", "Keterangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tindakanTabel);

        idTindakanLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        idTindakanLabel.setText("ID Tindakan");

        namaTindakanLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        namaTindakanLabel.setText("Nama Tindakan");

        spesialisasiLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        spesialisasiLabel.setText("Spesialisasi");

        tarifLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        tarifLabel.setText("Tarif");

        keteranganLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        keteranganLabel.setText("Keterangan");

        idTindakanField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        namaTindakanField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        tarifField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        spesialisasiComboBox.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        spesialisasiComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Spesialisasi --", "UMUM", "GIGI", "KANDUNGAN", "KULIT", "PENYAKIT DALAM", "ANAK" }));

        simpanTindakanButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        simpanTindakanButton.setText("Simpan");
        simpanTindakanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanTindakanButtonActionPerformed(evt);
            }
        });

        hapusTindakanButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        hapusTindakanButton.setText("Hapus");
        hapusTindakanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusTindakanButtonActionPerformed(evt);
            }
        });

        ubahTindakanButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        ubahTindakanButton.setText("Ubah");

        clearTindakanButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        clearTindakanButton.setText("Clear");
        clearTindakanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTindakanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tindakanPanelLayout = new javax.swing.GroupLayout(tindakanPanel);
        tindakanPanel.setLayout(tindakanPanelLayout);
        tindakanPanelLayout.setHorizontalGroup(
            tindakanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tindakanPanelLayout.createSequentialGroup()
                .addGroup(tindakanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tindakanPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tindakanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaTindakanLabel)
                            .addComponent(idTindakanLabel)
                            .addComponent(spesialisasiLabel)
                            .addComponent(tarifLabel)
                            .addComponent(keteranganLabel))
                        .addGap(18, 18, 18)
                        .addGroup(tindakanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tindakanPanelLayout.createSequentialGroup()
                                .addGroup(tindakanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spesialisasiComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tarifField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tindakanPanelLayout.createSequentialGroup()
                                .addGroup(tindakanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(keteranganField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tindakanPanelLayout.createSequentialGroup()
                                        .addComponent(idTindakanField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(namaTindakanField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18))))
                    .addGroup(tindakanPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(simpanTindakanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapusTindakanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubahTindakanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearTindakanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tindakanPanelLayout.setVerticalGroup(
            tindakanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tindakanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(tindakanPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(tindakanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTindakanLabel)
                    .addComponent(idTindakanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tindakanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaTindakanLabel)
                    .addComponent(namaTindakanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tindakanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spesialisasiLabel)
                    .addComponent(spesialisasiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tindakanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tarifLabel)
                    .addComponent(tarifField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tindakanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keteranganLabel)
                    .addComponent(keteranganField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tindakanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanTindakanButton)
                    .addComponent(hapusTindakanButton)
                    .addComponent(ubahTindakanButton)
                    .addComponent(clearTindakanButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adminTabPane.addTab("Tindakan", tindakanPanel);

        obatTabel.setFont(new java.awt.Font("Caviar Dreams", 0, 12)); // NOI18N
        obatTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Obat", "Nama Obat", "Jenis Obat", "Harga Obat", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(obatTabel);

        simpanObatButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        simpanObatButton.setText("Simpan");
        simpanObatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanObatButtonActionPerformed(evt);
            }
        });

        clearObatButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        clearObatButton.setText("Clear");
        clearObatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearObatButtonActionPerformed(evt);
            }
        });

        ubahObatButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        ubahObatButton.setText("Ubah");

        hapusObatButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        hapusObatButton.setText("Hapus");

        idObatLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        idObatLabel.setText("ID Obat");

        namaObatLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        namaObatLabel.setText("Nama Obat");

        jenisObatLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jenisObatLabel.setText("Jenis Obat");

        hargaObatLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        hargaObatLabel.setText("Harga Obat");

        satuanLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        satuanLabel.setText("Satuan ");

        idObatField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        namaObatField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        jenisObatField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        hargaObatField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        satuanComboBox.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        satuanComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Satuan --", "PIL", "KAPSUL", "TABLET", "AMPUL" }));

        javax.swing.GroupLayout obatPanelLayout = new javax.swing.GroupLayout(obatPanel);
        obatPanel.setLayout(obatPanelLayout);
        obatPanelLayout.setHorizontalGroup(
            obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, obatPanelLayout.createSequentialGroup()
                .addGroup(obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(obatPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(simpanObatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapusObatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubahObatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearObatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(obatPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(obatPanelLayout.createSequentialGroup()
                                .addGroup(obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hargaObatLabel)
                                    .addComponent(satuanLabel))
                                .addGap(18, 18, 18)
                                .addGroup(obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(satuanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hargaObatField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(obatPanelLayout.createSequentialGroup()
                                .addGroup(obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idObatLabel)
                                    .addComponent(namaObatLabel)
                                    .addComponent(jenisObatLabel))
                                .addGap(22, 22, 22)
                                .addGroup(obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namaObatField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jenisObatField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idObatField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        obatPanelLayout.setVerticalGroup(
            obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, obatPanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idObatLabel)
                    .addComponent(idObatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaObatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaObatLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jenisObatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jenisObatLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaObatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargaObatLabel))
                .addGap(13, 13, 13)
                .addGroup(obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(satuanLabel)
                    .addComponent(satuanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanObatButton)
                    .addComponent(hapusObatButton)
                    .addComponent(ubahObatButton)
                    .addComponent(clearObatButton))
                .addGap(134, 134, 134))
        );

        adminTabPane.addTab("Obat", obatPanel);

        layananLabTabel.setFont(new java.awt.Font("Caviar Dreams", 0, 12)); // NOI18N
        layananLabTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Layanan Lab", "Jenis Pemeriksaan", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(layananLabTabel);

        simpanLabButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        simpanLabButton.setText("Simpan");
        simpanLabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanLabButtonActionPerformed(evt);
            }
        });

        clearLabButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        clearLabButton.setText("Clear");
        clearLabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearLabButtonActionPerformed(evt);
            }
        });

        ubahLabButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        ubahLabButton.setText("Ubah");

        hapusLabButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        hapusLabButton.setText("Hapus");

        idLayananLabLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        idLayananLabLabel.setText("ID Layanan Lab");

        jenisPemeriksaanLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jenisPemeriksaanLabel.setText("Jenis Pemeriksaan");

        hargaLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        hargaLabel.setText("Harga");

        idLayananLabField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        jenisPemeriksaanLabField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        hargaLabField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        deskripsiLabField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel2.setText("Deskripsi");

        javax.swing.GroupLayout labPanelLayout = new javax.swing.GroupLayout(labPanel);
        labPanel.setLayout(labPanelLayout);
        labPanelLayout.setHorizontalGroup(
            labPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(labPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(labPanelLayout.createSequentialGroup()
                        .addGroup(labPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(labPanelLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(simpanLabButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hargaLabel))
                        .addGroup(labPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(labPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hapusLabButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ubahLabButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearLabButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(labPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(hargaLabField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56))
                    .addGroup(labPanelLayout.createSequentialGroup()
                        .addGroup(labPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jenisPemeriksaanLabel)
                            .addComponent(jLabel2)
                            .addComponent(idLayananLabLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(labPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deskripsiLabField)
                            .addComponent(idLayananLabField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jenisPemeriksaanLabField, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        labPanelLayout.setVerticalGroup(
            labPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(labPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLayananLabLabel)
                    .addComponent(idLayananLabField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jenisPemeriksaanLabel)
                    .addComponent(jenisPemeriksaanLabField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deskripsiLabField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaLabel)
                    .addComponent(hargaLabField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(labPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanLabButton)
                    .addComponent(hapusLabButton)
                    .addComponent(ubahLabButton)
                    .addComponent(clearLabButton))
                .addGap(170, 170, 170))
        );

        adminTabPane.addTab("Layanan Lab", labPanel);

        jScrollPane5.setFont(new java.awt.Font("Caviar Dreams", 0, 12)); // NOI18N

        layananKecantikanTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Layanan Kecantikan", "Jenis Layanan", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(layananKecantikanTabel);

        simpanKecantikanButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        simpanKecantikanButton.setText("Simpan");
        simpanKecantikanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanKecantikanButtonActionPerformed(evt);
            }
        });

        clearKecantikanButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        clearKecantikanButton.setText("Clear");
        clearKecantikanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearKecantikanButtonActionPerformed(evt);
            }
        });

        ubahKecantikanButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        ubahKecantikanButton.setText("Ubah");

        hapusKecantikanButton.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        hapusKecantikanButton.setText("Hapus");

        idLayananKecantikanLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        idLayananKecantikanLabel.setText("ID Layanan Kecantikan");

        jenisLayananLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jenisLayananLabel.setText("Jenis Layanan");

        hargaKecantikanLabel.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        hargaKecantikanLabel.setText("Harga");

        idLayananKecantikanField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        jenisLayananKecantikanField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        tarifKecantikanField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        deskripsiKecantikanField.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel3.setText("Deskripsi");

        javax.swing.GroupLayout kecantikanPanelLayout = new javax.swing.GroupLayout(kecantikanPanel);
        kecantikanPanel.setLayout(kecantikanPanelLayout);
        kecantikanPanelLayout.setHorizontalGroup(
            kecantikanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kecantikanPanelLayout.createSequentialGroup()
                .addGroup(kecantikanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kecantikanPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(kecantikanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLayananKecantikanLabel)
                            .addComponent(jenisLayananLabel)
                            .addComponent(hargaKecantikanLabel)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(kecantikanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kecantikanPanelLayout.createSequentialGroup()
                                .addComponent(idLayananKecantikanField)
                                .addGap(159, 159, 159))
                            .addGroup(kecantikanPanelLayout.createSequentialGroup()
                                .addGroup(kecantikanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jenisLayananKecantikanField, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tarifKecantikanField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deskripsiKecantikanField, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE))))
                    .addGroup(kecantikanPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(simpanKecantikanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapusKecantikanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubahKecantikanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearKecantikanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kecantikanPanelLayout.setVerticalGroup(
            kecantikanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kecantikanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kecantikanPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(kecantikanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLayananKecantikanLabel)
                    .addComponent(idLayananKecantikanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kecantikanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenisLayananLabel)
                    .addComponent(jenisLayananKecantikanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kecantikanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deskripsiKecantikanField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kecantikanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaKecantikanLabel)
                    .addComponent(tarifKecantikanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kecantikanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanKecantikanButton)
                    .addComponent(hapusKecantikanButton)
                    .addComponent(ubahKecantikanButton)
                    .addComponent(clearKecantikanButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adminTabPane.addTab("Layanan Kecantikan", kecantikanPanel);

        getContentPane().add(adminTabPane);
        adminTabPane.setBounds(10, 140, 1250, 540);
        adminTabPane.getAccessibleContext().setAccessibleName("Laboratorium");

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/5.jpg"))); // NOI18N
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 1550, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearPenyakitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearPenyakitButtonActionPerformed
        clearPenyakit();
    }//GEN-LAST:event_clearPenyakitButtonActionPerformed

    private void simpanPenyakitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanPenyakitButtonActionPerformed
        if((idPenyakitField.getText().equalsIgnoreCase(""))||(namaPenyakitField.getText().equalsIgnoreCase(""))||(gejalaField.getText().equalsIgnoreCase(""))){
           JOptionPane.showMessageDialog(null, "Silakan lengkapi seluruh field!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            try{
            Penyakit_tabelMaster penyakit = new Penyakit_tabelMaster();
            penyakit.setId_Penyakit(idPenyakitField.getText());
            penyakit.setPenyakit(namaPenyakitField.getText());
            penyakit.setGejala(gejalaField.getText());
            
            Penyakit_tabelMaster penyakit1 = serviceAdmin.insertPenyakit_tabelMaster(penyakit);
            tableMasterPenyakit.insert(penyakit1);
            clearPenyakit();
            }catch(RemoteException exception){
                exception.printStackTrace();
                JOptionPane.showMessageDialog(null, "Gagal meng-input data karena kesalahan sistem!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_simpanPenyakitButtonActionPerformed

    private void simpanTindakanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanTindakanButtonActionPerformed
        if((idTindakanField.getText().equalsIgnoreCase(""))||(namaTindakanField.getText().equalsIgnoreCase(""))||(spesialisasiComboBox.getSelectedIndex()==0)||(tarifField.getText().equalsIgnoreCase(""))||(keteranganField.getText().equalsIgnoreCase(""))){
            JOptionPane.showMessageDialog(null, "Silakan lengkapi seluruh field!", "Error", JOptionPane.ERROR);
        }
        else{
            try{
            Tindakan_tabelMaster tindakan = new Tindakan_tabelMaster();
            tindakan.setId_Tindakan(idTindakanField.getText());
            tindakan.setNama_Tindakan(namaTindakanField.getText());
            tindakan.setSpesialisasi(spesialisasiComboBox.getSelectedItem().toString());
            tindakan.setTarif(Integer.parseInt(tarifField.getText()));
            tindakan.setKeterangan(keteranganField.getText());
            
            Tindakan_tabelMaster tindakan1 = serviceAdmin.insertTindakan_tabelMaster(tindakan);
            tableMasterTindakan.insert(tindakan1);
            clearTindakan();
            }catch(RemoteException exception){
                exception.printStackTrace();
                JOptionPane.showMessageDialog(null, "Gagal meng-input data karena kesalahan sistem!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_simpanTindakanButtonActionPerformed

    private void clearTindakanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTindakanButtonActionPerformed
        clearTindakan();
    }//GEN-LAST:event_clearTindakanButtonActionPerformed

    private void simpanObatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanObatButtonActionPerformed
        if((idObatField.getText().equalsIgnoreCase(""))||(namaObatField.getText().equalsIgnoreCase(""))||(jenisObatField.getText().equalsIgnoreCase(""))||(hargaObatField.getText().equalsIgnoreCase(""))||(satuanComboBox.getSelectedIndex()==0)){
           JOptionPane.showMessageDialog(null, "Silakan lengkapi seluruh field!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
            Obat_tabelMaster obat = new Obat_tabelMaster();
            obat.setId_Obat(idObatField.getText());
            obat.setNama_Obat(namaObatField.getText());
            obat.setJenis_Obat(jenisObatField.getText());
            obat.setHarga_Obat(Integer.parseInt(hargaObatField.getText()));
            obat.setSatuan(satuanComboBox.getSelectedItem().toString());
            
            Obat_tabelMaster obat1 = serviceAdmin.insertObat_tabelMaster(obat);
            tableMasterObat.insert(obat1);
            clearObat();
            }catch(RemoteException exception){
                exception.printStackTrace();
                JOptionPane.showMessageDialog(null, "Gagal meng-input data karena kesalahan sistem!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_simpanObatButtonActionPerformed

    private void clearObatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearObatButtonActionPerformed
        clearObat();
    }//GEN-LAST:event_clearObatButtonActionPerformed

    private void simpanUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanUserButtonActionPerformed
        if((idUserField.getText().equalsIgnoreCase(""))||(namaUserField.getText().equalsIgnoreCase(""))||(jabatanComboBox.getSelectedIndex()==0)||(usernameField.getText().equalsIgnoreCase(""))||(passwordUserPasswordField.getPassword().equals(""))){
           JOptionPane.showMessageDialog(null, "Silakan lengkapi seluruh field!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
            User user = new User();
            user.setId_User(idUserField.getText());
            user.setNama_User(namaUserField.getText());
            user.setJabatan(jabatanComboBox.getSelectedItem().toString());
            user.setUsername(usernameField.getText());
            user.setPassword(String.valueOf(passwordUserPasswordField.getPassword()));
            
            User user1 = serviceAdmin.insertUser(user);
            tableMasterUser.insert(user1);
            clearUser();
            }catch(RemoteException exception){
                exception.printStackTrace();
                JOptionPane.showMessageDialog(null, "Gagal meng-input data karena kesalahan sistem!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_simpanUserButtonActionPerformed

    private void clearUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearUserButtonActionPerformed
        clearUser();
    }//GEN-LAST:event_clearUserButtonActionPerformed

    private void simpanLabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanLabButtonActionPerformed
        if((idLayananLabField.getText().equalsIgnoreCase(""))||(jenisPemeriksaanLabField.getText().equalsIgnoreCase(""))||(deskripsiLabField.getText().equalsIgnoreCase(""))||(hargaObatField.getText().equalsIgnoreCase(""))){
            JOptionPane.showMessageDialog(null, "Silakan lengkapi seluruh field!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
            Lab_tabelMaster lab = new Lab_tabelMaster();
            lab.setId_Lab(idLayananLabField.getText());
            lab.setJenis_Pemeriksaan(jenisPemeriksaanLabField.getText());
            lab.setDeskripsi(deskripsiLabField.getText());
            lab.setHarga(Integer.parseInt(hargaLabField.getText()));
            
            Lab_tabelMaster lab1 = serviceAdmin.insertLab_tabelMaster(lab);
            tableMasterLab.insert(lab1);
            clearLab();
            }catch(RemoteException exception){
                exception.printStackTrace();
                JOptionPane.showMessageDialog(null, "Gagal meng-input data karena kesalahan sistem!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_simpanLabButtonActionPerformed

    private void clearLabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearLabButtonActionPerformed
        clearLab();
    }//GEN-LAST:event_clearLabButtonActionPerformed

    private void simpanKecantikanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanKecantikanButtonActionPerformed
        if((idLayananKecantikanField.getText().equalsIgnoreCase(""))||(jenisLayananKecantikanField.getText().equalsIgnoreCase(""))||(deskripsiKecantikanField.getText().equalsIgnoreCase(""))||(tarifField.getText().equalsIgnoreCase(""))){
            JOptionPane.showMessageDialog(null, "Silakan lengkapi seluruh field!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
            Kecantikan_tabelMaster kecantikan = new Kecantikan_tabelMaster();
            kecantikan.setId_Kecantikan(idLayananKecantikanField.getText());
            kecantikan.setJenis_Layanan(jenisLayananKecantikanField.getText());
            kecantikan.setDeskripsi(deskripsiKecantikanField.getText());
            kecantikan.setTarif(Integer.parseInt(tarifKecantikanField.getText()));
            
            Kecantikan_tabelMaster kecantikan1 =serviceAdmin.insertKecantikan_tabelMaster(kecantikan);
            tableMasterKecantikan.insert(kecantikan1);
            clearKecantikan();
            }catch(RemoteException exception){
                exception.printStackTrace();
                JOptionPane.showMessageDialog(null, "Gagal meng-input data karena kesalahan sistem!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_simpanKecantikanButtonActionPerformed

    private void clearKecantikanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearKecantikanButtonActionPerformed
        clearKecantikan();
    }//GEN-LAST:event_clearKecantikanButtonActionPerformed

    private void ubahUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahUserButtonActionPerformed
        try{
            int row = userTabel.getSelectedRow();
            if(row == -1){
                return;
            }
            
            User user = tableMasterUser.get(row);
            user.setId_User(idUserField.getText());
            user.setNama_User(namaUserField.getText());
            user.setJabatan(jabatanComboBox.getSelectedItem().toString());
            user.setUsername(usernameField.getText());
            user.setPassword(passwordUserPasswordField.getPassword().toString());
            
            serviceAdmin.updateUser(user);
            tableMasterUser.update(row, user);
            clearUser();
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
    }//GEN-LAST:event_ubahUserButtonActionPerformed

    private void ubahPenyakitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahPenyakitButtonActionPerformed
        try{
            int row = penyakitTabel.getSelectedRow();
            if(row == -1){
                return;
            }
            
            Penyakit_tabelMaster penyakit = tableMasterPenyakit.get(row);
            penyakit.setId_Penyakit(idPenyakitField.getText());
            penyakit.setPenyakit(namaPenyakitField.getText());
            penyakit.setGejala(gejalaField.getText());
            
            serviceAdmin.updatePenyakit_tabelMaster(penyakit);
            tableMasterPenyakit.update(row, penyakit);
            clearPenyakit();
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
    }//GEN-LAST:event_ubahPenyakitButtonActionPerformed

    private void hapusTindakanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusTindakanButtonActionPerformed
        try{
            int row = tindakanTabel.getSelectedRow();
            if(row == -1){
                return;
            }
            
            Tindakan_tabelMaster tindakan = tableMasterTindakan.get(row);
            tindakan.setId_Tindakan(idTindakanField.getText());
            tindakan.setNama_Tindakan(namaTindakanField.getText());
            tindakan.setSpesialisasi(spesialisasiComboBox.getSelectedItem().toString());
            tindakan.setTarif(Integer.parseInt(tarifField.getText()));
            tindakan.setKeterangan(keteranganField.getText());
            
            serviceAdmin.updateTindakan_tabelMaster(tindakan);
            tableMasterTindakan.update(row, tindakan);
            clearTindakan();
        }catch(RemoteException exception){
            exception.printStackTrace();
        }
    }//GEN-LAST:event_hapusTindakanButtonActionPerformed

    private void clearUser(){
        idUserField.setText("");
        namaUserField.setText("");
        jabatanComboBox.setSelectedIndex(0);
        usernameField.setText("");
        passwordUserPasswordField.setText("");
        idUserField.getFocusListeners();
    }
    
    private void clearPenyakit() {
        idPenyakitField.setText("");
        namaPenyakitField.setText("");
        gejalaField.setText("");
        idPenyakitField.getFocusListeners();
    }
    
    private void clearTindakan(){
        idTindakanField.setText("");
        namaTindakanField.setText("");
        spesialisasiComboBox.setSelectedIndex(0);
        tarifField.setText("");
        keteranganField.setText("");
        idTindakanField.getFocusListeners();
    }
    
    private void clearObat(){
        idObatField.setText("");
        namaObatField.setText("");
        jenisObatField.setText("");
        hargaLabField.setText("");
        satuanComboBox.setSelectedIndex(0);
        idObatField.getFocusListeners();
    }
    
    private void clearLab(){
        idLayananLabField.setText("");
        jenisPemeriksaanLabField.setText("");
        deskripsiLabField.setText("");
        hargaLabField.setText("");
        idLayananLabField.getFocusListeners();
    }
    
    private void clearKecantikan(){
        idLayananKecantikanField.setText("");
        jenisLayananKecantikanField.setText("");
        deskripsiKecantikanField.setText("");
        tarifKecantikanField.setText("");
        idLayananKecantikanField.getFocusListeners();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane adminTabPane;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton clearKecantikanButton;
    private javax.swing.JButton clearLabButton;
    private javax.swing.JButton clearObatButton;
    private javax.swing.JButton clearPenyakitButton;
    private javax.swing.JButton clearTindakanButton;
    private javax.swing.JButton clearUserButton;
    private javax.swing.JTextField deskripsiKecantikanField;
    private javax.swing.JTextField deskripsiLabField;
    private javax.swing.JTextField gejalaField;
    private javax.swing.JButton hapusKecantikanButton;
    private javax.swing.JButton hapusLabButton;
    private javax.swing.JButton hapusObatButton;
    private javax.swing.JButton hapusPenyakitButton;
    private javax.swing.JButton hapusTindakanButton;
    private javax.swing.JButton hapusUserButton;
    private javax.swing.JLabel hargaKecantikanLabel;
    private javax.swing.JTextField hargaLabField;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JTextField hargaObatField;
    private javax.swing.JLabel hargaObatLabel;
    private javax.swing.JTextField idLayananKecantikanField;
    private javax.swing.JLabel idLayananKecantikanLabel;
    private javax.swing.JTextField idLayananLabField;
    private javax.swing.JLabel idLayananLabLabel;
    private javax.swing.JTextField idObatField;
    private javax.swing.JLabel idObatLabel;
    private javax.swing.JTextField idPenyakitField;
    private javax.swing.JLabel idPenyakitLabel;
    private javax.swing.JTextField idTindakanField;
    private javax.swing.JLabel idTindakanLabel;
    private javax.swing.JTextField idUserField;
    private javax.swing.JLabel idUserLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox jabatanComboBox;
    private javax.swing.JLabel jabatanLabel;
    private javax.swing.JTextField jenisLayananKecantikanField;
    private javax.swing.JLabel jenisLayananLabel;
    private javax.swing.JTextField jenisObatField;
    private javax.swing.JLabel jenisObatLabel;
    private javax.swing.JTextField jenisPemeriksaanLabField;
    private javax.swing.JLabel jenisPemeriksaanLabel;
    private javax.swing.JPanel kecantikanPanel;
    private javax.swing.JTextField keteranganField;
    private javax.swing.JLabel keteranganLabel;
    private javax.swing.JPanel labPanel;
    private javax.swing.JTable layananKecantikanTabel;
    private javax.swing.JTable layananLabTabel;
    private javax.swing.JTextField namaObatField;
    private javax.swing.JLabel namaObatLabel;
    private javax.swing.JTextField namaPenyakitField;
    private javax.swing.JTextField namaTindakanField;
    private javax.swing.JLabel namaTindakanLabel;
    private javax.swing.JTextField namaUserField;
    private javax.swing.JLabel namaUserLabel;
    private javax.swing.JPanel obatPanel;
    private javax.swing.JTable obatTabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordUserPasswordField;
    private javax.swing.JLabel penyakitLabel;
    private javax.swing.JPanel penyakitPanel;
    private javax.swing.JTable penyakitTabel;
    private javax.swing.JComboBox satuanComboBox;
    private javax.swing.JLabel satuanLabel;
    private javax.swing.JButton simpanKecantikanButton;
    private javax.swing.JButton simpanLabButton;
    private javax.swing.JButton simpanObatButton;
    private javax.swing.JButton simpanPenyakitButton;
    private javax.swing.JButton simpanTindakanButton;
    private javax.swing.JButton simpanUserButton;
    private javax.swing.JComboBox spesialisasiComboBox;
    private javax.swing.JLabel spesialisasiLabel;
    private javax.swing.JTextField tarifField;
    private javax.swing.JTextField tarifKecantikanField;
    private javax.swing.JLabel tarifLabel;
    private javax.swing.JPanel tindakanPanel;
    private javax.swing.JTable tindakanTabel;
    private javax.swing.JButton ubahKecantikanButton;
    private javax.swing.JButton ubahLabButton;
    private javax.swing.JButton ubahObatButton;
    private javax.swing.JButton ubahPenyakitButton;
    private javax.swing.JButton ubahTindakanButton;
    private javax.swing.JButton ubahUserButton;
    private javax.swing.JPanel userPanel;
    private javax.swing.JTable userTabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

}
