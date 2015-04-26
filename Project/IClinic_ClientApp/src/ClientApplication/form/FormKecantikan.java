/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormSuplier.java
 *
 * Created on Jun 25, 2010, 9:35:19 PM
 */
package ClientApplication.form;

import ClientApplication.FormLogin;
import ClientApplication.model.TableModelKecantikan_detailLayanan;
import ClientApplication.model.TableModelKecantikan_tabelMaster;
import Database.Entity.Kecantikan_detailLayanan;
import Database.Entity.Kecantikan_tabelMaster;
import Database.Entity.Kecantikan_transaksiLayanan;
import Database.Entity.Pembayaran;
import Database.Service.KecantikanService;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ayundhapus
 */
public class FormKecantikan extends javax.swing.JFrame {

    KecantikanService kecantikanService;
    private TableModelKecantikan_detailLayanan tableKecantikanDetailLayanan = new TableModelKecantikan_detailLayanan();
    public List<Kecantikan_tabelMaster> listLayananKecantikan = new ArrayList<Kecantikan_tabelMaster>();
    private List<Kecantikan_detailLayanan> listDetail = new ArrayList<Kecantikan_detailLayanan>();
    public ArrayList<Object> details = new ArrayList<Object>();
    //public DefaultTableModel model = new DefaultTableModel();
    public Boolean pasienExist = false;
    public FormKecantikan(KecantikanService kecantikanService) {
        this.kecantikanService = kecantikanService;
        //model = (DefaultTableModel) tabelLayanan.getModel();
        try {
            listLayananKecantikan = kecantikanService.getLayananKecantikan();
        } catch (RemoteException ex) {
            Logger.getLogger(FormKecantikan.class.getName()).log(Level.SEVERE, null, ex);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fieldIDTransaksi = new javax.swing.JTextField();
        fieldTotalHarga = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fieldIDPasien = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelLayanan = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        comboLayanan = new javax.swing.JComboBox();
        buttonTambahLayanan = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        fieldHarga = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fieldNoDetailLayanan = new javax.swing.JTextField();
        fieldKeterangan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        buttonHapusLayanan = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        buttonPrint = new javax.swing.JButton();
        buttonProcess = new javax.swing.JButton();
        buttonSearch = new javax.swing.JButton();
        buttonInsert = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Caviar Dreams", 1, 16)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 693));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 575));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ID Pasien : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nama Pasien :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Alamat :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("TTL :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Usia :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Jenis Kelamin :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("No. HP :");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addComponent(jTextField2)
                        .addComponent(jTextField3)
                        .addComponent(jTextField4)
                        .addComponent(jTextField5)
                        .addComponent(jTextField6)
                        .addComponent(jTextField7)))
                .addContainerGap(939, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jButton1)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pasien", jPanel1);

        jPanel2.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel9.setText("ID Transaksi");

        jLabel12.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel12.setText("Total Harga");

        fieldIDTransaksi.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        fieldTotalHarga.setText("0");

        jLabel13.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel13.setText("ID Pasien");

        fieldIDPasien.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N

        tabelLayanan.setFont(new java.awt.Font("Caviar Dreams", 0, 12)); // NOI18N
        tabelLayanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No Detail Kecantikan", "ID Transaksi Layanan", "ID Jenis Layana", "Keterangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelLayanan);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comboLayanan.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        comboLayanan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Jenis Layanan" }));
        comboLayanan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboLayananItemStateChanged(evt);
            }
        });
        comboLayanan.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                comboLayananPopupMenuWillBecomeVisible(evt);
            }
        });

        buttonTambahLayanan.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        buttonTambahLayanan.setText("Tambah Layanan");
        buttonTambahLayanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahLayananActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel11.setText("Keterangan");

        fieldHarga.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        fieldHarga.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel14.setText("No Detail Layanan");

        fieldNoDetailLayanan.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        fieldNoDetailLayanan.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel10.setText("Jenis Layanan");

        buttonHapusLayanan.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        buttonHapusLayanan.setText("Hapus Layanan");
        buttonHapusLayanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusLayananActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Caviar Dreams", 0, 14)); // NOI18N
        jLabel15.setText("Harga");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel15))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldNoDetailLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonTambahLayanan)
                        .addGap(28, 28, 28)
                        .addComponent(buttonHapusLayanan)
                        .addGap(25, 25, 25))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(fieldNoDetailLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonHapusLayanan)
                    .addComponent(buttonTambahLayanan))
                .addContainerGap())
        );

        buttonPrint.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        buttonPrint.setText("Print");

        buttonProcess.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        buttonProcess.setText("Process");
        buttonProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcessActionPerformed(evt);
            }
        });

        buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon_Search.png"))); // NOI18N
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        buttonInsert.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        buttonInsert.setText("Insert");
        buttonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertActionPerformed(evt);
            }
        });

        buttonClear.setFont(new java.awt.Font("Caviar Dreams", 1, 14)); // NOI18N
        buttonClear.setText("Clear");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addComponent(fieldIDTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldIDPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonPrint)
                                    .addComponent(buttonClear))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonProcess)
                                    .addComponent(buttonInsert))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(fieldIDTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(fieldIDPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInsert)
                    .addComponent(buttonClear))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(fieldTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPrint)
                    .addComponent(buttonProcess))
                .addGap(87, 87, 87))
        );

        jTabbedPane1.addTab("Transaksi", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1260, 610));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/8.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboLayananPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboLayananPopupMenuWillBecomeVisible
        comboLayanan.removeAllItems();
        try {
            listLayananKecantikan = kecantikanService.getLayananKecantikan();
            for (int i = 0; i < listLayananKecantikan.size(); i++) {
                comboLayanan.addItem(listLayananKecantikan.get(i).getJenis_Layanan());
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FormKecantikan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboLayananPopupMenuWillBecomeVisible

    private void comboLayananItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboLayananItemStateChanged
        String harga = Integer.toString(listLayananKecantikan.get(comboLayanan.getSelectedIndex()).getTarif());
        fieldHarga.setText(harga);
    }//GEN-LAST:event_comboLayananItemStateChanged

    private void buttonTambahLayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahLayananActionPerformed
        String idtrans = fieldIDTransaksi.getText();
        String iddetail = idtrans + listDetail.size();
        String idjenislayanan = listLayananKecantikan.get(comboLayanan.getSelectedIndex()).getId_Kecantikan();
        String keterangan = fieldKeterangan.getText();
        Kecantikan_detailLayanan detail = new Kecantikan_detailLayanan();
        detail.setId_Det_Kesehatan(iddetail);
        detail.setId_Trans_Layanan(idtrans);
        detail.setId_Kecantikan(idjenislayanan);
        detail.setKeterangan(keterangan);
        //tableKecantikanDetailLayanan.insert(detail);
        listDetail.add(detail);
        tableKecantikanDetailLayanan.setData(listDetail);
        tabelLayanan.setModel(tableKecantikanDetailLayanan);
        fieldTotalHarga.setText(Integer.toString(checkTotalHarga()));
    }//GEN-LAST:event_buttonTambahLayananActionPerformed

    private void buttonHapusLayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusLayananActionPerformed
        if(tabelLayanan.getSelectedRow() > -1){
            //tableKecantikanDetailLayanan.delete(tabelLayanan.getSelectedRow());
            listDetail.remove(tabelLayanan.getSelectedRow());
            tabelLayanan.setModel(tableKecantikanDetailLayanan);
            fieldTotalHarga.setText(Integer.toString(checkTotalHarga()));
        }
    }//GEN-LAST:event_buttonHapusLayananActionPerformed

    private void buttonProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProcessActionPerformed
        //-----Pembayaran-----//
        String idPasien = fieldIDPasien.getText();
        String idTransaksiLayananKecantikan = fieldIDTransaksi.getText();
        int harga = Integer.parseInt(fieldHarga.getText());
        try {
            String idPembayaran = kecantikanService.mencariIdPembayaranDariPembayaran(idPasien);
            if (!idPembayaran.equalsIgnoreCase("")) {
                Pembayaran pembayaran = kecantikanService.getPembayaranDariPembayaran(idPembayaran);
                kecantikanService.updatePembayaranDariPembayaran(pembayaran, idTransaksiLayananKecantikan, harga);
            }
            else if(idPembayaran.equalsIgnoreCase("")){
                idPembayaran = kecantikanService.getAutoNumberDariPembayaran();
                kecantikanService.insertPembayaranDariPembayaran(idPembayaran, idPasien, idTransaksiLayananKecantikan, harga);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FormKecantikan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonProcessActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        if(!fieldIDPasien.equals("")){
            String idpasien = fieldIDPasien.getText();
            try {
                pasienExist = kecantikanService.getPasienbyId(idpasien);
                if(pasienExist == false){
                    fieldIDPasien.setText("");
                }
            } catch (RemoteException ex) {
                Logger.getLogger(FormKecantikan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertActionPerformed
        if(pasienExist = true && !listDetail.isEmpty() && !fieldIDTransaksi.getText().equals("")){
            Kecantikan_transaksiLayanan transaksi = new Kecantikan_transaksiLayanan();
            try {
                transaksi.setId_Transaksi_Layanan(fieldIDTransaksi.getText());
                transaksi.setId_Pasien(fieldIDPasien.getText());
                transaksi.setTotal_Harga(checkTotalHarga());
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = new Date();
                //String now = dateFormat.format(date);
                transaksi.setTanggal(date);
                kecantikanService.insertKecantikan_transaksiLayanan(transaksi);
                for(int i=0;i<listDetail.size();i++){
                    Kecantikan_detailLayanan detail = new Kecantikan_detailLayanan();
                    detail.setId_Det_Kesehatan(listDetail.get(i).getId_Det_Kesehatan());
                    detail.setId_Trans_Layanan(listDetail.get(i).getId_Trans_Layanan());
                    detail.setId_Kecantikan(listDetail.get(i).getId_Kecantikan());
                    detail.setKeterangan(listDetail.get(i).getKeterangan());
                    kecantikanService.insertKecantikan_detailLayanan(detail);
                }
            } catch (RemoteException ex) {
                Logger.getLogger(FormKecantikan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(pasienExist = false){
            System.out.println("Belum mencari atau mengisi idPasien");
        }
        else{
            System.out.println("Ada data yang belom terisi");
        }
    }//GEN-LAST:event_buttonInsertActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        fieldIDTransaksi.setText("");
        fieldIDPasien.setText("");
        fieldHarga.setText("");
        fieldNoDetailLayanan.setText("");
        fieldKeterangan.setText("");
        listDetail = new ArrayList<Kecantikan_detailLayanan>();
    }//GEN-LAST:event_buttonClearActionPerformed
    
    private void isPasienExist(){
        
    }
    
    private int checkTotalHarga(){
        int total = 0;
        if(listDetail.size()<-1){
            for(int i=0;i<listDetail.size();i++){
                int harga = 0;
                for (int j=0;j<listLayananKecantikan.size();j++){
                    if(listDetail.get(i).getId_Kecantikan() == listLayananKecantikan.get(j).getId_Kecantikan()){
                        harga = listLayananKecantikan.get(j).getTarif();
                    }
                }
                total = total + harga;
            } 
        }
        return total;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonHapusLayanan;
    private javax.swing.JButton buttonInsert;
    private javax.swing.JButton buttonPrint;
    private javax.swing.JButton buttonProcess;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonTambahLayanan;
    private javax.swing.JComboBox comboLayanan;
    private javax.swing.JTextField fieldHarga;
    private javax.swing.JTextField fieldIDPasien;
    private javax.swing.JTextField fieldIDTransaksi;
    private javax.swing.JTextField fieldKeterangan;
    private javax.swing.JTextField fieldNoDetailLayanan;
    private javax.swing.JTextField fieldTotalHarga;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable tabelLayanan;
    // End of variables declaration//GEN-END:variables

}
